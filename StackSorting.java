import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class StackSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of stack");
        int size = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<size;i++){
            st.push(sc.nextInt());
        }
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = st.pop();
        }
        Arrays.sort(arr);
        System.out.println("Output stack");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }
    }
}
//input & output
// Input the size of stack
//5
//5 7 2 9 1
//Output stack
//1 2 5 7 9