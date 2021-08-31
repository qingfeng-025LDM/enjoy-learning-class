package com.qingfeng.test;

import com.qingfeng.test.entity.Sfx;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test7 {

    public static void main(String[] args) {
        List<Sfx> sfxList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            sfxList.add(new Sfx(0d, "000"+i));
        }
        double sum = sfxList.stream().filter(a -> a.getYse().doubleValue() > 0).mapToDouble(a -> a.getYse().doubleValue()).sum();
        System.out.println(sum);

        sfxList = sfxList.stream().map(jkmmxBo -> {jkmmxBo.setYwh(jkmmxBo.getYwh() + "03"); return jkmmxBo;}).collect(Collectors.toList());
        for (Sfx sfx : sfxList) {
            System.out.println(sfx.getYwh());
        }

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.toString());
        System.out.println(StringUtils.isBlank(stringBuilder));

        sfxList.forEach(sfx -> {
            Double yse = sfx.getYse();
        });
    }

}
