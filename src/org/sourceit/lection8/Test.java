package org.sourceit.lection8;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("dfdf");
        list.add("fdggefef");
        list.add("fdggefef");
        list.add("fdggefef");

        for (String t : list) {
            System.out.println(t);
        }

        Set<String> set = new HashSet<>();

        set.add("dfdf");
        set.add("fdggefef");
        set.add("fdggefef");
        set.add("fdggefef");

        System.out.println();

        for (String t : set) {
            System.out.println(t);
        }

        Iterator<String> iterator = list.iterator();

        System.out.println();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(list);


        Map<String, List<Integer>> marks = new HashMap<>();

        List<Integer> marksList = new ArrayList<>();

        marksList.add(3);
        marksList.add(3);
        marksList.add(3);
        marksList.add(3);
        marksList.add(4);

        marks.put("Shestakov", marksList);

        List<Integer> integers = new ArrayList<>(marksList);
        integers.add(6);

        marks.put("Ivanov", integers);

        System.out.println(marks);


    }

}
