// Hirarcle inheritance
import java.util.*;
import bank;
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}


public class hirarcle_inheri {
    public static void main(String[] args) {
        // Triangle triangle=new Triangle();
        // triangle.area(10,5);

        // Circle circle=new Circle();
        // circle.area(5);
        bank.Account account1=new bank.Account;
        account1.name="customer1";

        
    }
    
}

