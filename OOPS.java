abstract class Animal{
    public void walk(){

    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
    public void hen(){
        System.out.println("walks on 2 legs");
    }
}
public class OOPS {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
        
    }
    
}
