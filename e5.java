import java.util.Scanner;

public class e5 {
    public static int sub(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sub=sub(a, b);
        System.out.println(sub);
    }
}
