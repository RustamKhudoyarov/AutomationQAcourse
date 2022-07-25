package homework14map;

import java.util.ArrayList;
import java.util.List;

public class AppMatrix {
    public static void main(String[] args) {

        List<List<String>> matrix = new ArrayList<>();
        List<String> internalMatrix = new ArrayList<>();
        matrix.add(internalMatrix);
        matrix.get(0).add("YY");
        matrix.get(0).add("XX");
        matrix.get(0).add("ZZ");
        System.out.println(matrix);
    }
}
