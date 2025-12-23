///*import java.util.*;
//public class Array2D {
//    public static void main(String[] args){
//        int[] arr={1,2,3,4};
//        int[] res=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            res[i]=arr[arr.length-1-i];
//        }
//        System.out.println(Arrays.toString(res));
//    }
//}
//*/
//
///*import java.util.*;
//public class Array2D {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int[][] arr2D=new int[3][3];
//        for(int i=0;i<arr2D.length;i++){
//            for(int j=0;j<arr2D[i].length;j++){
//                arr2D[i][j]=sc.nextInt();
//            }
//        }
//        for(int[] num:arr2D){
//            reversearr(num);
//        }
//
//    }
//    static int[] reversearr(int[] num) {
//        int[] res = new int[num.length];
//        for (int i = 0; i < num.length; i++) {
//            res[i] = num[num.length - i - 1];
//        }
//        for (int i = 0; i < res.length; i++) {
//            if(res[i]==1){
//                res[i]=0;
//            }
//            else if(res[i]==0){
//                res[i]=1;
//            }
//        }
//       return res;
//    }*/
////    static void fliparr(int[][] res){
////        for(int i=0;i<res.length;i++){
////            for(int j=0;j<res[i].length;j++){
////                if(res[i][j]==1){
////                    res[i][j]=0;
////                }
////                else if(res[i][j]==0){
////                    res[i][j]=1;
////                }
////            }
////        }
////        for(int i=0;i<res.length;i++){
////            for(int j=0;j<res[i].length;j++){
////                System.out.print(res[i][j]+" ");
////            }
////            System.out.println();
////        }
////
//
//import java.util.*;
//public class Array2D{
//    public static void main(String[] args){
//        String a=new String("Hello");
//        String b=a.concat("World");//concatenate two string
//        System.out.println(a.length());//return length of the string
//        System.out.println(a.charAt(1));//return the character present at which index position
//        String c=a.toUpperCase();
//        System.out.println(c);//cannot modify while store it another pool and change it
//        String d=a.toLowerCase();
//        System.out.println(d);//same return all in lower case
//        String h=" Santhosh";
//        System.out.println(h);
//        String e=h.trim();//remove whitespace
//        System.out.println(e);
//        System.out.println(a.contains("hell"));//return ture if there
//        System.out.println(a.substring(1,4));//from that startindex to end index -1
//        System.out.println(a.startsWith("he"));//return true if  start with the given string
//        System.out.println(a.endsWith("llo"));//return true of end with that string
//        System.out.println(a.indexOf("l"));//return the integer value of the index of the character
//        System.out.println(a.lastIndexOf("l"));//return the if the value has more than one character
//        //return last position
//
//    }
//}

//import java.util.*;
//public class Array2D{
//    public static void main(String[] args){
       //1 String a=new String("HEllO");
       // System.out.println(a.length());

       //2 String a=new String("JAva PRogramming");
        //System.out.println(a.charAt(5));

        //3String a=new String("JAva");
        //String b=new String("java");
        //System.out.println(a.equals(b));
        //System.out.println(a.equalsIgnoreCase(b));

       //4 String a=new String("Hello Welcome");
//        String b=a.toUpperCase();
//        String c=b.toLowerCase();
//        System.out.println(b);
//        System.out.println(c);

        //5String a=new String("Hello World");
        //System.out.println(a.indexOf('o'));

//       6 String a=new String("Hello World");
//        System.out.println(a.substring(6,a.length()));
//

//      7  String a=new String("I love Python");
//        String b=a.replace("Python","Java");
//        System.out.println(b);
  //  }
//}

//import java.util.*;
//public class Array2D{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
//        String[] sym={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//        StringBuilder Roman=new StringBuilder();
//        for(int i=0;i<values.length && n>0;i++){
//            while(n>values[i]){
//                Roman.append(sym[i]);
//                n=n-values[i];
//            }
//        }
//        System.out.println(Roman);
//    }
//}

//import java.util.*;
//public class Array2D {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
//        String[] sym={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//        StringBuilder Roman =new StringBuilder();
//        for(int i=0;i<values.length&& n>0;i++){
//            while(n>=values[i]){
//                Roman.append(sym[i]);
//                n=n-values[i];
//            }
//        }
//        System.out.println(Roman);
//    }
//}

//import java.util.*;
//public class Array2D{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String a=sc.nextLine();
//        String[] arr=a.trim().split("\\s+");
//        System.out.println(Arrays.toString(arr));
//        String last=arr[arr.length-1];
//        System.out.println(last);
//    }
//}

//

//Spiral Matrix
/*import java.util.*;
public class Array2D{
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
        spiralmat(arr);
    }
    static void spiralmat(int[][] arr){
        int top=0;
        int bot=arr.length-1;
        int left=0;
        int right=arr[0].length-1;
        while(top<=bot && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bot;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(top<=bot){
                for(int i=right;i>=left;i--){
                    System.out.print(arr[bot][i]+" ");
                }
                bot--;
            }
            if(left<=right){
                for(int i=bot;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }
}*/

//import java.util.*;
//public class Array2D {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[][] arr=new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//
//        for(int[] num:arr){
//            int sum=takemed(num);
//            System.out.println("The median of arr : "+sum);
//        }
//
//    }
//    static int takemed(int[] arr){
//        if((arr.length%2)!=0){
//            int mid=(0+arr.length-1)/2;
//            return arr[mid];
//        }
//        else{
//            int sum=0;
//            int avg=0;
//            for(int i=0;i<arr.length;i++){
//                sum=sum+arr[i];
//            }
//            avg=sum/arr.length;
//            return avg;
//        }
//
//    }
//}

//import java.util.*;
//public class Array2D {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        long x=sc.nextLong();
//        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE){
//            System.out.println("0");
//        }
//        else{
//            if(x<0){
//                long temp=-1*x;
//                long rev=0;
//                while(temp>0){
//                    long digit=temp%10;
//                    rev=rev*0+digit;
//                    temp=temp/10;
//                }
//                System.out.println(-1*rev);
//            }
//            else if(x>0){
//                long temp=x;
//                long rev=0;
//                while(temp>0){
//                    long digit=temp%10;
//                    rev=rev*0+digit;
//                    temp=temp/10;
//                }
//                System.out.println(rev);
//            }
//        }
//    }
//}