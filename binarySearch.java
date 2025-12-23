//import java.util.*;
//public class binarySearch{
//    public static void main(String[] args){
//        int[] arr={2,3,4,5,6,7,36,39};
//        int target=36;
//        System.out.println(binsearch(arr,target));
//    }
//    static int binsearch(int[] arr,int target){
//        int start=0;
//        int end=arr.length-1;
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(arr[mid]>target){
//                end=mid-1;
//            }
//            else if(arr[mid]<target){
//                start=mid+1;
//            }
//            else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//}

/*import java.util.*;
public class binarySearch{
    public static void main(String[] args){
        int[] arr={2,4,6,8,10};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ans=binsea(arr,target);
        System.out.println(ans);
    }
    static int binsea(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAc=arr[start] < arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isAc){
                if(arr[mid]>target){
                    end=mid-1;
                }
                else if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
            else{
                if (arr[mid] > target) {
                    start=mid+1;
                }
                else if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}*/

/*import java.util.*;
public class binarySearch{
    public static void main(String[] args){
        int[] arr={1, 2, 2, 2, 3, 4};
        binsea(arr);
    }
    static int binsea(int[] arr){
        int start=0;
        int end=arr.length-1;
        int index=0;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]==arr[mid-1]){
                index=mid-1;
            }
            else
        }
    }

}*/

/*import java.util.*;
public class binarySearch{
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target) {
                end = mid - 1;
            }
            else{
                return arr[mid];
            }

        }
        return arr[end];
    }
}*/

/*import java.util.*;
public class AQ1 {
    public static void main(String[] args){
        char[] letters={'x','x','y','y'};
        Scanner sc=new Scanner(System.in);
        char target=sc.next().charAt(0);
        char ans=binsearch(letters,target);
        System.out.println(ans);
    }
    static char binsearch(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(letters[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}*/

/*import java.util.*;
public class binarySearch{
    public static void main(String[] args){
        char[] letters={'c','f','j'};
        Scanner sc=new Scanner(System.in);
        char target=sc.next().charAt(0);
        System.out.println(binsearch(letters,target));
    }
    static char binsearch(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start%letters.length];
    }
}*/

/*import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,8,8,9};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(Arrays.toString(binsearch(arr,target)));
    }
    static int[] binsearch(int[] arr,int target){
        int[] ans={-1,-1};
        int start= check(arr,target,true);
        int end=check(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int check(int[] arr,int target,boolean findsearch){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findsearch){
                    end=mid-1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}*/

/*import java.util.*;
public class binarySearch{
    public static void main(String[] args){
        int[] arr={5,7,7,7,8,8,10};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(Arrays.toString(binsearch(arr,target)));
    }
    static int[] binsearch(int[] arr,int target){
        int[] ans={-1,-1};
        int start=check(arr,target,true);
        int end=check(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;

    }
    static int check(int[] arr,int target,boolean findsearch){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findsearch){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}*/

/*import java.util.*;
public class binarySearch{
    public static void main(String[] args){
        int[] arr={1,0,6,1};
        System.out.println(binsea(arr));
    }
    static int binsea(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) {
                end=mid-1;
            }
            else if(arr[mid]<arr[mid-1]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return 0;
    }
}*/

/*import java.util.*;
public class binarySearch{
    public static void main(String[] args){
        int[][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/

//import java.util.*;
//public class binarySearch{
//    public static void main(String[] args){
//        int[][] arr=new int[3][3];
//        int[] res={-1,-1};
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        int target=sc.nextInt();
//        for(int i=0;i<arr.length;i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == target) {
//                    res[0]=i;
//                    res[1]=j;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(res));
//    }
//}

//import java.util.*;
//public class binarySearch{
//    public static void main(String[] args){
//        int[][] arr=new int[3][3];
//        int[][] transpose=new int[3][3];
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                transpose[i][j]=arr[j][i];
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                System.out.print(transpose[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}

/*import java.util.*;
public class binarySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans1=primatsum(arr,n);
        int ans2=secondarysum(arr,n);
        int res=ans1+ans2;
        System.out.println(res);


    }
    static int primatsum(int[][] arr,int n){
        int sum=0;
        for(int i=0;i<arr.length;i++){
                if(i!=(n-1)/2 || i%2==0){
                    sum=sum+arr[i][i];
                }
            }
        return sum;
    }
    static int secondarysum(int[][] arr,int n){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][n-i-1];
            }
        }
        return sum;
    }
}*/

// Find position of element in a sorted array of Infinite elements
/*import java.util.*;
public class binarySearch {
    public static void main(String[] args){
        int[] arr={2,3,5,6,7,8,10,11,12,15,20,23,30};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(findrange(arr,target));
    }
    static int findrange(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2-1;
            start=temp;
        }
        return binarysearch(start,end,arr,target);
    }
    static int binarysearch(int start,int end,int[] arr,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return 0;
    }
}*/

/*import java.util.*;
public class binarySearch {
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,4,3,2,1};
        System.out.println(checkrange(arr));
    }
    static int checkrange(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+(end-start)/2);
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}*/

//import java.util.*;
//public class binarySearch {
//    public static void main(string[] args){
//        int sum=1;
//        int resint=0;
//        int start=0;
//        int[] arr={9,9,9,9,9,9,9,9,9};
//        for(int i=0;i<arr.length-1;i++){
//            sum=sum*10;
//        }
//        while(start<arr.length){
//            resint=sum*arr[start]+resint;
//            sum=sum/10;
//            start++;
//        }
//        System.out.println(resint);
//        int result=resint+1;
//        int temp=result;
//        int temp2=result;
//        int[] newres=new int[arr.length];
//        int i=0;
//        while(temp>0){
//            int digit=temp%10;
//            i++;
//            temp=temp/10;
//        }
//        if(i>arr.length){
//            int[] res3=new int[arr.length+1];
//            int count=res3.length-1;
//            while(temp2>0){
//                int digit=temp2%10;
//                res3[count]=digit;
//                temp2=temp2/10;
//                count--;
//            }
//            System.out.println(Arrays.toString(res3));
//        }
//        else {
//            int count1=arr.length-1;
//            while (result > 0) {
//                int digit = result % 10;
//                newres[count1] = digit;
//                result = result / 10;
//                count1--;
//            }
//            System.out.println(Arrays.toString(newres));
//        }
//    }
//}

//Binary search in 2D array

/*import java.util.*;
public class binarySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        System.out.println(Arrays.toString(binsearch(arr,target)));
    }
    static int[] binsearch(int[][] arr,int target){
        int row=0;
        int col=arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[] {row,col};
            }
            else if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}*/

