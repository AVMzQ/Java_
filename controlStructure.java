
package curso.modulo.pkg3;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class CursoModulo3 {
    public static void main(String[] args) {
        Scanner Reed = new Scanner(System.in);
        int b;
        do
        {
            System.out.println("please type youre age");
            int age = Reed.nextInt();
            //if condition
            if(age>=21)
                System.out.printf("Your age is above or equal 21 so your an adult. You have %s years.\n",age);
            else//else condition
                System.out.printf("You're age is %s. you're not an adult.\n", age);

            //switch condition
            switch(age){
                case 21:
                    System.out.println("Wow your is 21, wlecome to the adoult world.");
                    break;
                case 25:
                    System.out.println("How is it going?");
                    break;
                case 50:
                    System.out.println("You have a greate story, you should tell it.");
            }

            //while condition
            var a = true;
            while(a)
            {
                System.out.println("keep going! you havent done yet.");
                a = false;
            }
            
            
            System.out.println("Do you want to add other age? 1 = yes / 2 = no");
            b = Reed.nextInt();
        }while(b == 1);
    }
    
}
