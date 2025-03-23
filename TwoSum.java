import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {5,7,3,6};
        int target = 10;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        int ans[] = new int[2];

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i]) &&  map.get(target-arr[i])!= i){
                ans[0] = arr[i];
                ans[1] = target-arr[i];
                break;
            }
        }

        System.out.println(ans[0] +" " + ans[1]);

    }
}
//output
// 7 3