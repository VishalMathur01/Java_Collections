import java.util.Map;
import java.util.HashMap;
public class start_map {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);

        if(!numbers.containsKey("two"))
            numbers.put("Two", 2);

        //or 

        numbers.putIfAbsent("Two", 23);

        //Iteration in the map
        for (Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        
        for( String key: numbers.keySet()){
            System.out.println(key);
        }
        for( Integer value: numbers.values()){
            System.out.println(value);
        }

         
        System.out.println(numbers);

    }
}
