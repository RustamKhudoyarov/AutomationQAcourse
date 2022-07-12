package lesson13qa;

import lesson7.SortArray;

public class AppWrapperClassCollectionArrayLists {
    public static void main(String[] args) {
        System.out.println("Lesson 13 - Wrapper Classes, Collections, ArrayLists,Reference type vs Primitives");

        int a =5;
        Integer b=5;
        double d =4.5;
        Double d1 =4.5;
        char c ='a';
        Character ch = 'a';
        boolean bool = true;
        Boolean bool1 = true;
     //   Boolean x = new Boolean(true);
        Person p1 = new Person("Anna", "Ginner", 1967);
        Person p2 = p1;
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        p1.setName("Petya");
        System.out.println(p2.getName());
         int [] arr ={1,2,3};
         int [] brr = arr;
         arr[0] =100;
        System.out.println(brr[0]);




    }
}
