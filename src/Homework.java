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

        for (String total : cities) {
            if (!cit.containsKey(total)) {
                cit.put(total, 1);
            } else {
                cit.put(total, cit.get(total) + 1);
            }
        }
        System.out.println(cit);
    }
    public static void task4(){
        List<String> strings = Arrays.asList("один", "два","два", "три", "три", "три");
        Map<String, Integer> number = new HashMap();

        for (String total : strings) {
            if (!number.containsKey(total)) {
                number.put(total, 1);
            } else {
                number.put(total, number.get(total) + 1);
            }
        }
        System.out.println(number);
    }
}








