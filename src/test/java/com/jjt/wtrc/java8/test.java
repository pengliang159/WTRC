package com.jjt.wtrc.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pengrl on 2015/8/8.
 */
public class test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("aa", "bb");
        map.put("aa1", "bb1");
        map.put("aa2", "bb2");
        List<String> lst = new ArrayList<>();
        map.keySet().forEach(k -> lst.add(k));
        System.out.println(lst);
    }
}
