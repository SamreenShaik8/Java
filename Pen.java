class Sam {
    String color;
    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
    }
}
public class Pen {
    public static void main(String args[]) {
        Sam p1 = new Sam();
        p1.color = "blue";
        Sam p2 = new Sam();
        p2.color = "black";
        Sam p3 = new Sam();
        p3.color = "red";
        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}