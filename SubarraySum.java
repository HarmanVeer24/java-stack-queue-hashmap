import java.util.*;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, -5, 6, -1, -3, 4, 2, -2, -4};
        findZeroSumSubarrays(arr);
    }
    public static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        // Initialize with sum 0 at index -1
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum has been seen before, it means there are zero-sum subarrays
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            // Add the current index to the map for future reference
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        // Print all zero-sum subarrays
        if (result.isEmpty()) {
            System.out.println("No such subarrays found.");
        } else {
            System.out.println("Zero-sum subarrays found at indices:");
            for (int[] subarray : result) {
                System.out.println(Arrays.toString(subarray));
            }
        }
    }
}

//output
// Zero-sum subarrays found at indices:
//[1, 3]
//[3, 5]
//[2, 6]
//[5, 7]
//[5, 9]
//[8, 9]
//[2, 10]
//[7, 10]