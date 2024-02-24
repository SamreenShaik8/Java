import java.util.*;
public class RemoveWhiteSpaces {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your String: ");
       
       String inputString = sc.nextLine();

       String stringWithoutSpaces = RemoveWhiteSpaces(inputString);

       System.out.println(stringWithoutSpaces);



       
    }
}
