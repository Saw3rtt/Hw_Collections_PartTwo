import java.sql.SQLOutput;
import java.util.*;

public class Homework {
    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + ", ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 16, 8));
        Set<Integer> nums2 = new HashSet<>();
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) % 2 == 0) {
                nums2.add(nums1.get(i));
            }
        }
        System.out.print(new TreeSet(nums2));
        System.out.println();
    }

    public static void task3() {
        List<String> cities = Arrays.asList("Moscow", "Moscow", "Moscow", "Tula", "Tula", "Voronezh", "Paris", "London", "Vologda");
        Map<String, Integer> cit = new HashMap();

        for (String c : cities) {
            if (!cit.containsKey(c)) {
                cit.put(c, 1);
            } else {
                cit.put(c, cit.get(c) + 1);
            }
        }
        System.out.println(cit);
    }
}








