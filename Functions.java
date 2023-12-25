import java.util.*;

public class Functions{
    public static void printMyName(String name){
        System.out.println(name);
        return;

    }
    public static void main(String[] args){
        // take input
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        // calling function
        printMyName(name);


    }
}