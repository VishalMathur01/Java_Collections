import java.util.Set;
import java.util.HashSet;

public class Hash_set {
    public static void main(String[] args) {
        
        Set<Integer> seter = new HashSet<>();
        
        seter.add(52);
        seter.add(43);
        seter.add(54);
        seter.add(21);
        seter.add(67);
        seter.add(52);
        
        System.out.println(seter);
        
        seter.remove(54);

        System.out.println(seter);
        
        System.out.println(seter.contains(52));

        System.out.println(seter.isEmpty());

        System.out.println(seter.size());

        seter.clear();

        System.out.println(seter);
        
    }
     
}
