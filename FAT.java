//import java.io.*;
//import java.util.*;
//public class FAT{
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        ArrayList<String> a=new ArrayList<>();
//        for(int i=0;i<n;i++){
//            a.add(sc.nextLine().trim());
//        }
//        String inputfile=sc.next();
//        String OutputFile=sc.next();
//        try(PrintWriter pw= new PrintWriter(new BufferedOutputStream(new FileOutputStream(inputfile)))){
//            for(String list:a) {
//                pw.println(list);
//            }
//        }catch(IOException e){
//            System.out.println("Error: "+e.getMessage());
//        }
//        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(inputfile));
//            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(OutputFile))){
//            int line;
//            while((line=bis.read())!=-1){
//                bos.write(line);
//            }
//           bos.flush();
//        }
//        catch(IOException e){
//            System.out.println("Error: "+e.getMessage());
//        }
//        int tot=0;
//        try(BufferedReader br=new BufferedReader(new FileReader(OutputFile))){
//            String line;
//            while((line=br.readLine())!=null){
//                System.out.println(line);
//                tot++;
//            }
//        } catch (IOException e) {
//            System.out.println("Error: "+e.getMessage());
//        }
//        System.out.println(tot);
//    }
//}