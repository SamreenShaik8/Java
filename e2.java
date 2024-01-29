import java.util.*;
public class e2 {
    public static int sum(int a,int b){
        return a+b;

    }
    public static void main(String[] args) {
        // scanner class is used to take the user input
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=sum(a,b);
        System.out.println(sum);
    }
}
