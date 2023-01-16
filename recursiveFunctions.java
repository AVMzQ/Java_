package javacourse;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class recursiveFunctions {
    public static void main(String[] args) {
        Scanner reed = new Scanner(System.in);
        System.out.println("Type the number you what multiply");
        int number = reed.nextInt();
        System.out.println("Type the n times you what tu multiply it.");
        int count = reed.nextInt();
        Multiply(number,count);
        System.out.println("====================================");
        System.out.println("The factorial of "+ number+" is: "+Factorial(number));
    }
    static void Multiply(int number,int count){
        count--;
        if(count>0){
            System.out.printf("%s times %s is: ", number, count);
            System.out.println(number*count);
            Multiply(number,count);
        }
    }
    static int Factorial(int number){
        if(number > 1)
            number *= Factorial(number-1);
        return number;
    }
}
