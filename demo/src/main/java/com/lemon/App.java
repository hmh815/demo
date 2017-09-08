package com.lemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.lemon.polymorphic.Animal;
import com.lemon.polymorphic.Brid;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Animal animal = new Brid();
        animal.action();
      
        List<String> list2 = new ArrayList<>();
        list2.add("str");
        list2.add("str");
        list2.add("str3");
        System.out.println(list2);
        
        Map<Integer, String > map = new HashMap<>();
        map.put(1, "hello1");
        map.put(3, "hello3");
        map.put(7, "hello7");
        for (Entry<Integer, String> str : map.entrySet()) {
			System.out.println(str.getKey() + "/t" + str.getValue());
		}
        
        for (Integer i : map.keySet()) {
			System.out.println(i + "/t" +map.get(i));
		}
    }
    
}
