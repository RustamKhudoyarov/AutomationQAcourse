package homework14map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AppUsingMap {
    public static void main(String[] args) {

        System.out.println("Use hash map");

        Map<String, String> capitalState = new HashMap<>();
        capitalState.put("TX", "Austin");
        capitalState.put("CA","LA");
        capitalState.put("AZ", "Phoenix");
        capitalState.put("NV", "Las Vegas");
      capitalState.put("Nevada", "Las Vegas");
        capitalState.put("OG", "Portman");
        System.out.println(capitalState);
        capitalState.replace("AZ", "Fenso");
        System.out.println(capitalState);
        // iterations by key, value, key-value
      for (String key: capitalState.keySet()){
          System.out.println(key);
      }
      for (String value: capitalState.values()) {
          System.out.println(value);
      }
      for (Map.Entry<String, String> val : capitalState.entrySet()){
          System.out.println(val.getKey() + "  " + val.getValue());
      }


        System.out.println("_____________");
        System.out.println(capitalState.get("TX"));
        int count = 0;
        Set<String> mySet = new HashSet<>();
        mySet.add("red"); mySet.add("green"); mySet.add("red"); mySet.add("blue");
        for (String color : mySet){
            if(mySet.contains("red")){

                count++;
            }
            System.out.println(color);

        }
        System.out.println(count);

    }
}
