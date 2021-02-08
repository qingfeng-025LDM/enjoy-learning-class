package com.qingfeng.designpattern.service.impl;

import com.qingfeng.designpattern.model.Person;
import com.qingfeng.designpattern.service.PersonService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonServiceImpl implements PersonService {
    private static List<Person> list = new ArrayList<Person>();
    private static Map<String, Object> map = new HashMap<String, Object>();

    public Person add(String name, Integer age) {
        Person person = new Person(name, age);
        list.add(person);
        map.put(name, person);
        return person;
    }

    public Person get(String name) {
        Person person = new Person();
        Object o = map.get(name);
        if (o instanceof Person){
            person = (Person)o;
        }
        return person;
    }
}
