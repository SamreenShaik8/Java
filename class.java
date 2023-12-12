// class example
class Dog{
    String name;
    String color;
    int cost;
    // constructer
    public Dog(String name, String color, int cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;
    }
    void eat(){
    System.out.println("The dog is eating");
}
void sleep(){
    System.out.println("The dog is sleeping");
}
void bark(){
    System.out.println("The dog is barking");
}
public static void main(String[] args) {
    Dog d1=new Dog("jimmy","black",70000);
    System.out.println(d1.name);
    System.out.println(d1.color);
    System.out.println(d1.cost);
     
    // calling
    d1.eat();
    d1.sleep();
    d1.bark();
    
    
}
}






