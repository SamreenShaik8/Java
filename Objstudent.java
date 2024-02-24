public class Objstudent {
    String name;
    int age;
   
    public void getinfo(){
        System.out.println("The name of student is:"+name);
        System.out.println("The age of student is:"+age);
    }
    
}
class Hello {
    public static void main(String[] args) {
        Objstudent s1=new Objstudent();
        s1.name="samreen";
        s1.age=21;
        s1.getinfo();


    }
}
