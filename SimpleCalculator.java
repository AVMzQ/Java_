
package javacourse;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        //This is a terminal app that returns the results of different operation if two numbers
        Scanner Reed = new Scanner(System.in);
        System.out.print("Type the first number> ");
        double a = Reed.nextDouble();
        System.out.print("Type the second number> ");
        Double b = Reed.nextDouble();
        
        System.out.printf("The plus of the two numbers is: %s\nThe Minus of the two numbers is: %s\nThe times of the two numbers is: %s\n"
                + "The divided of the two numbers is: %s\n",plus(a,b),minus(a,b),times(a,b),divided(a,b));
    }
    public static double plus(double a, double b){
        return a + b;
    }
    public static double minus(double a, double b){
        return a - b;
    }
    public static double times(double a, double b){
        return a * b;
    }
    public static double divided(double a, double b){
        try{
            return a / b;
        }
        catch(Exception x)
        {
            System.out.printf("Error> %s",x.getMessage());
            return 0;
        }
    }
}
