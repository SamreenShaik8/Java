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

public class single_inheritance {

    public static void main (String[] args){
        Triangle triangle = new Triangle();
        triangle.area(10,5);
    
}
}