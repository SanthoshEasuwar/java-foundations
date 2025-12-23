//import java.util.*;
//public class Bubblesort{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        int[] ans=bubblesort(arr);
//        System.out.println(Arrays.toString(ans));
//    }
//    static int[] bubblesort(int[] arr){
//        boolean swapped;
//        for(int i=0;i<arr.length;i++) {
//            swapped = false;
//            for (int j = 1; j < arr.length - i ; j++) {
//                if (arr[j] < arr[j - 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                    swapped = true;
//                }
//            }
//            if (!swapped) {
//                break;
//            }
//        }
//        return arr;
//    }
//}

