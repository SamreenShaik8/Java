interface Animal{
    // there is no constrocter in interfaces
    int eyes=2;
    void walk();
}
// Herbivore eats only plants
interface Herbivore{

}
// implements
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class Animal_abstr {
    public static void main(String[] args){
        Horse horse=new Horse();
        horse.walk();
        
    }
}
