import java.util.*;
import java.lang.*;
public class Exceptioncatch {
    public static void main(String args[]){
        int h;
        Scanner sc=new Scanner(System.in);
        int ar[];  String g=null;
        System.out.print("Enter value from -3 3 4 to get different type of exception");
        int k=sc.nextInt();
        try{
            ar=new int[k];
            Test t=new Test();
            t=null;
            h=ar[3];
            t.toString();
        }
        catch(NullPointerException|IndexOutOfBoundsException|NegativeArraySizeException ex){
            System.out.println(ex.toString());
        }
        catch(Exception e){
            System.out.println("different from given three exception");
        }



    }

}
