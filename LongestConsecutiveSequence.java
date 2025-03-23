import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = {0,3,7,2,5,1};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        int maxConsec = 0;

        for(int i=0;i<arr.length;i++){
            int cons=0;
            int currentEle = arr[i];
            while(set.contains(currentEle)){
                currentEle+=1;
                cons++;
            }
            maxConsec = Math.max(cons,maxConsec);
        }

        System.out.println(maxConsec);
    }
}
//output 4