// Multi level inheritance
// there are two levels
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
// level 1
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
// level 2
class EquilatralTraiangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }

}


public class multi_level_inheritance {
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.area(10,5);

        EquilatralTraiangle triangle2=new EquilatralTraiangle();
        triangle2.area(20,42);

        
    }
    
}
