import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsBasics {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(2);
        al.add(4);
        al.add(1);
        al.add(1);

        // Print list
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // Frequency count using HashMap
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (Integer num : al) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency: " + hm);
    }
}