class Stu{
    String name;
    // static same school name for every student
    static String school;

    // if school name changes 
    // public static void changeSchool(){
    //     school="newschool";
    // }
}
public class staticc {
    public static void main(String[] args) {
        Stu.school="ZPH";
        Stu student1=new Stu();
        student1.name="sam";
        System.out.println(student1.school);
    }

    
}
