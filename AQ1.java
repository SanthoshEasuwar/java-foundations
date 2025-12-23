//Q1)Linear Search
/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.println(Linear(arr,n,m));
    }
    static int Linear(int[] arr,int size,int m){
        for(int element:arr){
            if(element==m){
                return m;
            }
        }
        return -1;
    }
}*/
//Q2)character search in String using for each

/*import java.util.*;
public class AQ1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char target = sc.next().charAt(0);
        System.out.println(search(a, target));
    }
        static boolean search(String a,char target){
            for(char ch:a.toCharArray()){
                if(ch==target){
                    return true;
                }
        }
            return false;
    }
}*/

//Q2)character search in String using for loop
/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char target=sc.next().charAt(0);
        System.out.println(Search(a,target));
    }
    static boolean Search(String a,char target){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==target) {
                return true;
            }
        }
        return false;
    }
}*/

//Q3)Search in Range between the values
/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[a];
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Search(arr,target,start,end));
    }
    static int Search(int[] arr,int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i]== target){
                return i;
            }
        }
        return -1;
    }
}*/

//q3)Minimum number in the array
/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Findmin(arr,n));
    }
    static int Findmin(int[] arr,int n) {
        int temp=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<temp){
                temp=arr[i];
            }
        }
        return temp;
    }
}*/

//Q4)Search in 2D array
/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr2D=new int[n][m];
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2D[i][j]=sc.nextInt();
            }
        }
        int[] ans=binsearch(arr2D,n,m,target);
        System.out.println(Arrays.toString(ans));
        printarr2d(arr2D,n,m);
    }
    static int[] binsearch(int[][] arr2D,int n,int m,int target){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr2D[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }return new int[]{-1,-1};
    }
    static void printarr2d(int[][] arr,int n,int m){
        for(int[] num:arr){
            System.out.println(Arrays.toString(num));
        }
    }
}*/

//Q5)max and minimum value in 2D array
/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr2D=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2D[i][j]=sc.nextInt();
            }
        }
        int ans=Findmax(arr2D,n,m);
        int[] pos=Findpos(arr2D,n,m);
        System.out.println(ans);
        System.out.println(Arrays.toString(pos));
        for(int[] num:arr2D){
                System.out.println(Arrays.toString(num));
        }
    }
    static int Findmax(int[][] arr2D,int n,int m){
        int max=arr2D[0][0];
        for(int[] row:arr2D){
            for(int element:row){
                if(element>max){
                    max=element;
                }
            }
        }return max;
    }
    static int[] Findpos(int[][] arr2D,int n,int m){
        int max=arr2D[0][0];
        int[] pos={0,0};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr2D[i][j]>max){
                    max=arr2D[i][j];
                    pos[0]=i;
                    pos[1]=j;
                }
            }
        }return pos;
    }
}
 */

/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[] arr={18,124,9,1764,98,1};
        System.out.println(check_even(arr));
    }
    static int check_even(int[] arr){
        int count=0;
        for(int ele:arr){
            int digits=pass_ele(ele);
            if(digits%2==0){
                count=count+1;
            }
        }
        return count;
    }
    static int pass_ele(int ele){
        int count=0;
        while(ele>0){
            count=count+1;
            ele=ele/10;
        }
        return count;
    }
}*/

/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[][] arr={{12,12},{21,1}};
        int max=Integer.MIN_VALUE ;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}*/
/*public class AQ1 {
    public static void main(String[] args){
        int[] arr={0,1,2,3,4};
        int target=3;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}*/

/*import java.util.Arrays;

public class AQ1 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2};
        int[] result=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count=count+1;
                }
            }
            result[i]=count;
        }
        System.out.println(Arrays.toString(result));
    }
}
*/

/*import java.util.*;
public class AQ1{
    public static void main(String[] args) {
        int[] arr = {12, 10, 13, 14};
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=10) {
                while (arr[i] > 0) {
                    int digit = arr[i] % 10;
                    temp[i] = temp[i] + digit;
                    arr[i] = arr[i] / 10;
                }
            }
            else{
                arr[i]=temp[i];
            }
        }
        System.out.println(Arrays.toString(temp));
        int min=temp[0];
        for(int i=0;i<temp.length;i++){
            if(min>temp[i]){
                min=temp[i];
            }
        }
        System.out.println(min);
    }
}*/

/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[] nums={1,2,1};
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++) {
            arr[i]=nums[i];
        }
        int[] res=new int[2*nums.length];
        int size=res.length;
        for(int i=0;i<nums.length;i++){
            res[i]=arr[i];
            res[i+nums.length]=nums[i];
        }
        System.out.println(Arrays.toString(res));
    }
}*/

/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[] arr={0,1,1,0};
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    res[i]=arr[i];
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}*/

/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[] arr={1,5,34,1};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp=temp+arr[i];
        }
        System.out.println(temp);
        digitsum(arr);
    }
    static void digitsum(int[] nums){
        int[] temp1=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10){
                while(nums[i]>0){
                    int digit=nums[i]%10;
                    temp1[i]=temp1[i]+digit;
                    nums[i]=nums[i]/10;
                }
            }
            else{
                temp1[i]=nums[i];
            }
        }
        int temp2=0;
        for(int i=0;i<temp1.length;i++){
            temp2=temp2+temp1[i];
        }
        System.out.println(temp2);
        System.out.println(Arrays.toString(temp1));
    }
}*/

/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[] arr={1,10,11};
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=10){
                while(arr[i]>0){
                    int digit=arr[i]%10;
                    temp[i]=temp[i]+digit;
                    arr[i]=arr[i]/10;
                }
            }
            else{
                temp[i]=arr[i];
            }
        }
        int c;
        for(int i=0;i<temp.length;i++) {
            if (i == temp[i]) {
                c=i;
            } else {
                c=-1;
            }
        }
        System.out.println(c);
    }
}*/

import org.w3c.dom.ls.LSOutput;

/*import java.util.*;
public class AQ1{
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2};
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i] - 1;
        }
        System.out.println(Arrays.toString(res));
        int max=res[0]*res[1];
        for(int i=0;i<res.length;i++) {
            for (int j = 0; j < res.length; j++) {
                if (i!=j & res[i] * res[j] > max) {
                    max = res[i] * res[j];
                }
            }
        }
        System.out.println(max);
    }
}*/
/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int[] res=new int[arr.length];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max>arr[i]){
                max=arr[i];
                res[i]=max;
            }
        }
        System.out.println(max);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(arr));
    }
}*/

/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[] arr={-4,1,5,0,3};
        int[] res=new int[arr.length];
        for(int i=0;i<res.length;i++){
            res[i]=arr[i]*arr[i];
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}*/

/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[] arr={1};
        int target=1;
        int[] ans=binsearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] binsearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return new int[]{start,mid};
            }
        }
        return new int[]{-1,-1};
    }
}*/

/*import java.util.*;
public class AQ1 {
    public static void main(String[] args){
        int[] arr={2};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[] ans=binarysearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target) {
                start = mid + 1;
            }
            else if(arr.length==0){
                return new int[]{0,0};
            }
            else{
                return new int[]{start,mid};
            }
        }
        return new int[]{-1,-1};
    }
}*/

/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] Matrix=new int[3][3];
        int[][] transpose=new int[3][3];
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix.length;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
        Transpose(Matrix,transpose);
        printMatrix(transpose);
    }
    static int[][] Transpose(int[][] Matrix,int[][] transpose){
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix.length;j++){
                if(i==j){
                    transpose[i][j]=Matrix[i][j];
                }
                else{
                    transpose[i][j]=Matrix[j][i];
                }
            }
        }
        return Matrix;
    }
    static void printMatrix(int[][] transpose){
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose.length;j++){
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }
    }
}*/
/*import java.util.*;
public class AQ1{
    public static void main(String[] args) {
        int count = 0;
        int[] height = {1, 1, 4, 2, 1, 3};
        int[] expected = new int[height.length];
        for(int i=0;i<height.length;i++){
            expected[i]=height[i];
        }
        Arrays.sort(expected);
        System.out.println(Arrays.toString(expected));
        for (int i = 0; i < height.length; i++) {
            if(height[i]!=expected[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}*/
/*import java.util.*;
public class AQ1 {
    public static void main(String[] args){
        int[] heights={1, 1, 4, 2, 1, 3};
        int count=0;
        int[] expected=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            expected[i]=heights[i];
        }
        Arrays.sort(expected);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}*/

/*import java.util.*;
public class AQ1 {
    public static void main(String[] args){
        int sum=0;
        int[] nums={2,7,1,19,18,3};
        int size=nums.length;
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        for(int i=0;i<nums.length;i++){
            if(size%(i+1)==0){
                sum=sum+nums[i]*nums[i];
            }
        }
        System.out.println(sum);
    }
}*/

/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[] arr={0,1,1,0};
        int[] res=new int[2];

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=arr.length-1-i;j>=0;j--) {
                if (i != j && arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

}*/
/*import java.util.*;
public class AQ1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>max){
                end=mid-1;
            }
            else if(arr[mid]<max){
                start=mid+1;
            }
        }
        System.out.println(arr[start]);
    }
}*/
/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        List<Integer> prime= new ArrayList<>();
        for(int i=0;i<=100;i++){
            if(i != 2 && isPrime(i)){
                prime.add(i);
            }
        }
        System.out.println(prime);

    }
    static boolean isPrime(int i){
        if(i<=1){
            return false;
        }
        for(int j=2;j<Math.sqrt(i);j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}*/

/*import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[] arr={0,1};
        int c=0;
        int size=arr.length;
        System.out.println(size);
        for(int i=0;i<size;i++){
            if(arr[i]!=i){
               c=i ;
            }
        }
        System.out.println(c);
        System.out.println((0+7)/2);

    }
}*/

/*import java.util.*;
public class AQ1 {
    public static void main(String[] args){
        int[] arr={5,5,5,25};
        int sum=0;
        int left=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<10){
                sum=sum+arr[i];
            }
            else if(arr[i]>=10){
                left=left+arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(left);
    }
}*/

//ceiling of a number
/* import java.util.*;
public class AQ1{
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ans=binsearch(arr,target);
        System.out.println(ans);
    }
    static int binsearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return arr[start];
    }
}*/
