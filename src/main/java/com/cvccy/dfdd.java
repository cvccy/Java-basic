package com.cvccy;

import java.util.HashMap;
import java.util.Map;

public class dfdd {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        for(Integer i = 100;i>=0;i--){
            map.put(i,"kewei"+i);
        }

        System.out.println(map.size()+"-----"+map.isEmpty());
        System.out.println(map.toString());
    }
}
