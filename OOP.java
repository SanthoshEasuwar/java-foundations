/*import java.util.*;
class Car{
    String carcol;
    int cap;
    float mil;
    public void carper(){
        double result=this.cap * this.mil;
        System.out.println(result);
        System.out.println(this.cap);
        System.out.println(this.mil);
        System.out.println(this.carcol);
    }
}
public class OOP{
    public static void main(String[] args){
        Car car1=new Car();
        Scanner sc=new Scanner(System.in);
        car1.carcol=sc.nextLine();
        car1.cap=sc.nextInt();
        car1.mil=sc.nextFloat();
        car1.carper();
    }
}*/

//Constructor
//import java.util.*;
//class Student{
//    int Roll;
//    double marks;
//    String grade;
//    public void DisplayDetails(){
//        System.out.println("Student Rollno: "+Roll);
//        System.out.println("Student marks: "+marks);
//        System.out.println("Student grade: "+grade);
//    }
//    Student(int rollno,double marks,String grade){
//        this.Roll=rollno;
//        this.marks=marks;
//        this.grade=grade;
//    }
//}
//public class OOP{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int Roll=sc.nextInt();
//        double marks=sc.nextDouble();
//        String grade=sc.next();
//        Student S1=new Student(Roll,marks,grade);
//        S1.DisplayDetails();
//    }
//
//}

//Array of objects
//import java.util.*;
//class Student{
//    String name;
//    int marks;
//    public void display(){
//        System.out.println("Student name: "+this.name+" "+"Marks obtained: "+this.marks);
//    }
//}
//public class OOP{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        Student[] arr=new Student[n];
//        for(int i=0;i<n;i++) {
//            arr[i] = new Student();
//            arr[i].name = sc.nextLine();
//            arr[i].marks = sc.nextInt();
//            sc.nextLine();
//        }
//        for(int i=0;i<n;i++){
//            for(int j=1;j<n-i;j++){
//                if(arr[j].marks<arr[j-1].marks){
//                    Student temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//            }
//        }
//        for(int i=0;i<n;i++){
//            arr[i].display();
//        }
//    }
//}

//import java.util.*;
//class Employee{
//    String name;
//    double salary;
//    void displaydetails(){
//        System.out.println("Name of the person in employee class is: "+name);
//        System.out.println("Salary of the person in employee class is: "+salary);
//    }
//}
//class Manager extends Employee{
//    String department;
//    Manager(String name,double salary,String department){
//        this.name=name;
//        this.salary=salary;
//        this.department=department;
//    }
//    void displaydepartment(){
//        System.out.println("The department of the "+name+" with salary "+salary+" is "+department);
//    }
//}
//public class OOP{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String name=sc.nextLine();
//        double sal=sc.nextDouble();
//        sc.nextLine();
//        String dep=sc.nextLine();
//        Manager M1=new Manager(name,sal,dep);
//        M1.displaydepartment();
//        M1.displaydetails();
//    }
//}

/*import java.util.*;
class Vechile{
    void showDetails(){
        System.out.println("This is a vechile");
    }
}
class Car extends Vechile{
    void showDetails(){
        super.showDetails();
        System.out.println("This is a Car");

    }
}
public class OOP{
    public static void main(String[] args){
        Car C1=new Car();
        C1.showDetails();
    }
}*/

/*import java.util.*;
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
    void displayPerson(){
        System.out.println("The name of person is "+name);
    }
}
class Employee extends Person{
    double Sal;
    Employee(String name,double sal){
        super(name);
        this.Sal=sal;
    }
    void displayemployee(double sal){
        System.out.println("The person name is "+name);
        System.out.println("The Salary of the Person "+Sal);
    }
}
class Manager extends Employee{
    String Dep;
    Manager(String name,double sal,String dep){
        super(name,sal);
        this.Dep=dep;
    }
    void displayDep(){
        System.out.println("The Department of the "+name +" With salary "+Sal+" is "+Dep);
    }
}
public class OOP {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double sal=sc.nextDouble();
        sc.nextLine();
        String dep=sc.nextLine();
        Manager M=new Manager(name,sal,dep);
        M.displayDep();
    }
}*/

//import java.util.*;
//interface Matrix{
//    void maxele(int[][] arr);
//    void minele(int[][] arr);
//}
//class Matrixanalyzer implements Matrix{
//    public void maxele(int[][] arr){
//        ArrayList<Integer> list1=new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            list1.add(arr[i][i]);
//        }
//        int max=list1.get(0);
//        int min=list1.get(0);
//        for(int i=0;i<list1.size();i++){
//            if(list1.get(i)>max){
//                max=list1.get(i);
//            }
//        }
//        for(int j=0;j<list1.size();j++){
//            if(list1.get(j)<min){
//                min=list1.get(j);
//            }
//        }
//        System.out.println("Smallest element - "+"1: "+min);
//        System.out.println("Largest element - "+"1: "+max);
//
//    }
//    public void minele(int[][] arr){
//        ArrayList<Integer> list2=new ArrayList<>();
//        for(int i=0;i<arr.length;i++){
//            list2.add(arr[i][arr.length-i-1]);
//        }
//        int max=list2.get(0);
//        int min=list2.get(0);
//        for(int i=0;i<list2.size();i++){
//            if(list2.get(i)>max){
//                max=list2.get(i);
//            }
//        }
//        for(int j=0;j<list2.size();j++){
//            if(list2.get(j)<min){
//                min=list2.get(j);
//            }
//        }
//        System.out.println("Smallest element - "+"2: "+min);
//        System.out.println("Largest element - "+"2: "+max);
//    }
//}
//public class OOP{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[][] arr=new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        Matrixanalyzer analyzer=new Matrixanalyzer();
//        analyzer.maxele(arr);
//        analyzer.minele(arr);
//    }
//}

