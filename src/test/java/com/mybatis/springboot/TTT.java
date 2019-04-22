package com.mybatis.springboot;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.List;

public class TTT {

    public static void main(String args[]) {


        LinkedList<String> zxc = new LinkedList<String>();
        HashMap<String,Integer> hs = new HashMap<>(255);
        zxc.add("qwed");
        hs.put("asd",1);
        hs.put("asd",2);
        System.out.println( hs.hashCode() );
        System.out.printf(" %s ",hs.isEmpty());
        for (String k : hs.keySet()) {
            System.out.println(hs.get(k));
        }
        Class cz = hs.getClass();


    }
}
