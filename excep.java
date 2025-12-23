//import java.util.*;
//public class excep {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        HashMap<Integer,String> Map=new HashMap<>();
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            int rollno=sc.nextInt();
//            String name=sc.next();
//            Map.put(rollno,name);
//        }
//        for(Integer key:Map.keySet()){
//            System.out.println(key+"="+Map.get(key));
//        }
//        System.out.println(Map.values());
//        System.out.println(Map.remove(1));
//    }
//}
//import java.util.*;
//class Container<T>{
//    public T value;
//    void setItem(T value){
//        this.value=value;
//    }
//    T getValue(){
//        return value;
//    }
//}
//public class excep {
//    public static void main(String[] args){
//        Container<Integer> con=new Container<>();
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        con.setItem(n);
//        System.out.println("the item is: "+con.getValue());
//    }
//}