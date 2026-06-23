import java.util.*;

public class FindDuplicateElements {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 4, 5, 2, 5, 3, 1);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (int num : list) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}