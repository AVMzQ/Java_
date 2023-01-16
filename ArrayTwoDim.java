package javacourse;
import java.util.Scanner;
public class ArrayTwoDim {
    public static void main(String[] args) {
        int [][] x = new int[2][3]; //declaration of the two dimension array.
        System.out.println("This is a two dimension array.");
        int count = 1; //variable that is use to fill the array.
        //filling the two dimension array whit data.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                x[i][j] = count;
                count++;
            }
        }
        //Showing the data of the two dimension.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" ");
                System.out.print(x[i][j]);
            }
            System.out.println(" ");
        }
    }
}
