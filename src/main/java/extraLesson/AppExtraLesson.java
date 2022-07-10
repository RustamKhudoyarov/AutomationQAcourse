package extraLesson;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Date;
import java.util.SortedMap;

public class AppExtraLesson {
    public static void main(String[] args) {

        final int DAY =5;
        int x;
        char y;
        boolean z;
        char[] ch = new char[2];
        System.out.println(ch[0]);
        String s ; //null
        Person anna = new Person("Anna", "Herison", 1987);
        System.out.println(anna);
        int[] arr = {1,3,4,5};
        System.out.println(arr);
        for(int i : arr){
            System.out.println(i);
        }

        Size[] chart = {Size.L,Size.S,Size.M};
        System.out.println(chart);

        System.out.println(Arrays.toString(chart));

        for(Size sz : chart){
            System.out.println(sz);
        }
        Person alan = new Student("Alan", "Parker",1987, "MATH");
        System.out.println(alan.toString());
        alan.hello();

    }

}
