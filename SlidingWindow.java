public class SlidingWindow {
    public static void main(String[] args){
        int[] arr = {1,2,3,6,7,4};
        int windowSize = 3;
        int[] result = new int[arr.length-windowSize+1];
        result = helper(arr,windowSize);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] helper(int[] arr,int windowSize){
        int[] result = new int[arr.length-windowSize+1];
        int z = 0;
        for(int i=0;i<=arr.length-windowSize;i++){
            int maxi = Integer.MIN_VALUE;
            for(int j=i+1;j<windowSize+i;j++){
                maxi =  Math.max(maxi,Math.max(arr[j-1],arr[j]));
            }
            result[z++] = maxi;
        }
       return result;
    }
}
//output
// 3 6 7 7