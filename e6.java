import java.util.*;
public class e6 {
    public static int mod(int a,int b){
        return a%b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mod=mod(a, b);
        System.out.println(mod);
        
    }
}
