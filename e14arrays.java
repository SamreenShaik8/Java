import javax.sound.midi.Soundbank;

public class e14arrays {
    public static void main (String[] args){

        /*Arrays in Java are like a list of elements of the same type i.e. a list of integers, a
        list of booleans etc. */
        // arrays
        // creating an array method 1
        int[] marks=new int[4];
        marks[0]=81;
        marks[1]=85;
        marks[2]=87;
        marks[3]=92;

        System.out.println(marks[1]);
        System.out.println(marks.length);

        // creating an array method 2
        // 1d array
        int[] books={23,25,22};
        System.out.println(books[0]);

        // 2d array
        int[][] finalmarks={{97,95,90},{87,93,82}};
        System.out.println(finalmarks[0][2]);
        


        
        
    }
}
