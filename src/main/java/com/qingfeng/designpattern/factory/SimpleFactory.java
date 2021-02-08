package com.qingfeng.designpattern.factory;

import com.qingfeng.designpattern.service.PersonService;

import java.io.InputStream;
import java.util.Properties;

public class SimpleFactory {

    private SimpleFactory(PersonService personService){
        createPerson();
    }

    public  static PersonService createPerson(){
        return getPersonService();
    }


    public static PersonService getPersonService(){
        Properties properties = new Properties();
        InputStream in = null;

        try {
            in = SimpleFactory.class.getResourceAsStream("FactoryTest.properties");
            properties.load(in);
        }catch (Exception e){

        }finally {
            try {
                in.close();
            }catch (Exception e){

            }
        }
        PersonService personService = null;
        try {
            personService = (PersonService) Class.forName(properties.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return personService;
    }

    public static void main(String[] args) {

    }

}
