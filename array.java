
/*public class array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
//        for(int i=0;i<5;i++){
//            System.out.println(arr[i]);
//        }
//        for(int num:arr){
//            System.out.println(num);
//        }
//

        System.out.println(Arrays.toString(arr));

    }
}*/
/*public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[2]=8;
    }
}*/
/*public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr2D=new int[3][3];
        //input
        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr2D[i].length;j++){
                arr2D[i][j]=sc.nextInt();
            }
        }
        //output
        for(int row=0;row<arr2D.length;row++){
            for(int col=0;col<arr2D[row].length;col++){
                System.out.print(arr2D[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int row=0;row<arr2D.length;row++){
            System.out.println(Arrays.toString(arr2D[row]));
        }
        System.out.println();
        for(int[] num:arr2D){
            System.out.println(Arrays.toString(num));
        }
    }
}*/
/*import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum number in the array"+max);
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("Minimum number in the array:"+min);
    }
}
*/
/*import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] sum=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            sum[i]=sc.nextInt();
            temp=temp+sum[i];
        }
        System.out.println(temp);
    }
}*/
/*import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int countEven=0;
        int countOdd=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                countEven=countEven+1;
            }
            else{
                countOdd=countOdd+1;
            }
        }
        System.out.println("Even count: "+countEven);
        System.out.println("Odd count: "+countOdd);
    }
}*/
/*import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}*/

//Array list
 /*public class array{
     public static void main(String[] args){
         ArrayList<Integer> list= new ArrayList<>();
         list.add(5);
         list.add(10);
         list.add(15);
         list.add(20);
         list.add(25);
         System.out.println(list);
     }
}*/
/*import java.util.*;
public class array{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int num=sc.nextInt();
            list.add(num);
        }
        System.out.println(list);
    }
}*/
/*import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        //Initialisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        //Add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());

            }
        }
        System.out.println(list);
    }
}*/

//import java.util.*;
//public class array{
//    public static void main(string[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int indexpos1=sc.nextInt();
//        int indexpos2=sc.nextInt();
//        int[] arr=new int[n];
//        initial(arr,n);
//        displayarr(arr,n);
//        swap(arr,indexpos1,indexpos2);
//    }
//    static void initial(int[] arr,int n){
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<n;i++) {
//            arr[i] = sc.nextInt();
//        }
//    }
//    static void displayarr(int[]arr,int n){
//        System.out.println(Arrays.toString(arr));
//    }
//    static void swap(int[] arr,int index1,int index2){
//        int temp=arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]=temp;
//        System.out.println(Arrays.toString(arr));
//    }
//
//}

//1) Linear search of target
/*import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int index=-1;
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==target) {
                index = i;
            }
        }
        System.out.println(index);
    }
}*/

/*import java.util.*;
public class array {
    public static void main(String[] args){
        int[] arr={1,2,2,3,4,5,4,5,5,5,9,12,5,44,43,2,22,22,2,22,22,2,2,2};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}*/

/*import java.util.*;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,2,3,4,2};
        int target=sc.nextInt();
        System.out.println(Arrays.toString(findfandl(arr,target)));
    }
    static int[] findfandl(int[] arr,int target){
        int[] ans={-1,-1};
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
                if (ans[0] == -1) {
                    ans[0] = i;
                }
                ans[1] = i;
            }
        }
        return ans;
    }
}*/

//import java.util.*;
//public class array {
//    public static void main(String[] args){
//        int[] arr={1,2,3,2,4,2};
//        int index=0;
//        ArrayList<Integer> list=new ArrayList<>();
//        Scanner sc=new Scanner(System.in);
//        int target=sc.nextInt();
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==target){
//                list.add(i);
//            }
//        }
//        System.out.println(list);
//    }
//}

//import java.util.*;
//public class array {
//    public static void main(String[] args){
//        int[] arr={1,2,2,4,5};
//        boolean ans=true;
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                ans=false;
//                break;
//            }
//        }
//        System.out.println(ans);
//    }
//}

//import java.util.*;
//public class array {
//    public static void main(String[] args) {
//        int[] arr = {1,3,4,5,5,6,6,7,7,4};
//        ArrayList<Integer> list=new ArrayList<>();
//        int max=arr[0];
//        int max2=arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        for(int i=0;i<arr.length;i++) {
//            if (arr[i] == max) {
//                arr[i] = 0;
//            }
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]>max2){
//                    max2=arr[i];
//                }
//            }
//        }
//        System.out.println(max2);
//    }
//}

//3 3
//1 2 3
//4 5 6
//7 8 9
//0 1
//10 11 12
//1 2

//import java.util.*;
//public class array {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int row=sc.nextInt();
//        int col=sc.nextInt();
//        int[][] arr=new int[row][col];
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//
//        int rc=sc.nextInt();
//        int index=sc.nextInt();
//        if(rc==0) {
//            int[] newrow = new int[col];
//            for (int k = 0; k < col; k++) {
//                newrow[k] = sc.nextInt();
//            }
//            int[][] mod = new int[row + 1][col];
//            for (int i = 0, ni = 0; i < mod.length; i++) {
//                if (index == i) {
//                    mod[i] = newrow;
//                } else {
//                    mod[i] = arr[ni++];
//                }
//                System.out.println();
//            }
//
//            for(int i=0;i<mod.length;i++){
//                for(int j=0;j<mod[i].length;j++){
//                    System.out.print(mod[i][j]+" ");
//                }
//                System.out.println();
//            }
//
//        }
//        else if(rc==1){
//            int[] newrow=new int[row];
//            for(int i=0;i<row;i++){
//                newrow[i]=sc.nextInt();
//            }
//            int[][] mod1=new int[row][col+1];
//            for(int i=0;i<mod1.length;i++){
//                for(int j=0,nj=0;j<mod1[i].length;j++){
//                    if(j==index){
//                        mod1[i][j]=newrow[i];
//                    }
//                    else{
//                        mod1[i][j]=arr[i][nj++];
//                    }
//                }
//            }
//            for(int i=0;i<mod1.length;i++){
//                for(int j=0;j<mod1[i].length;j++){
//                    System.out.print(mod1[i][j]);
//                }
//                System.out.println();
//            }
//        }
//    }
//}

//import java.util.*;
//public class array{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int row=sc.nextInt();
//        int col=sc.nextInt();
//        int[][] arr=new int[row][col];
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        int target=sc.nextInt();
//        int[] ans=binary(arr,target,row,col);
//        System.out.println(Arrays.toString(ans));
//    }
//    static int[] binary(int[][] arr,int target,int n,int m){
//        int start=0;
//        int end=n*m-1;
//        int row=0;
//        int col=0;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            row=mid/m;
//            col=mid%m;
//            if(arr[row][col]>target){
//                end=mid-1;
//            }
//            else if(arr[row][col]<target){
//                start=mid+1;
//            }
//            else {
//                return new int[] {row, col} ;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//}

//import java.util.*;
//public class array {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int k=sc.nextInt();
//        int[] ans=rotate(arr,k);
//        System.out.println(Arrays.toString(ans));
//    }
//    static int[] rotate(int[] arr,int k){
//        for(int i=0;i<k;i++){
//            int temp=arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[i+1]=temp;
//        }
//        return arr;
//    }
//}

//import java.util.*;
//public class array{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(HappyNumber(n));
//    }
//    static boolean HappyNumber(int n){
//        int temp=n;
//            while(temp>0 && temp!=1){
//                int sum=0;
//                int digit=temp%10;
//                sum=(digit*digit)+sum;
//                temp=temp/10;
//                temp=sum;
//        }
//            if(temp==1){
//                return true;
//            }
//        System.out.println(temp);
//        return false;
//    }
//}