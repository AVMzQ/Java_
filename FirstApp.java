package firstapp;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class FirstApp {
    public static void main(String[] args) {
        try
        {
            Scanner reed = new Scanner(System.in); //library that collects what the user is typing
        
            System.out.print("Enter your name. "); //Message sent by the terminal. 
            String Name = reed.nextLine(); //Name collection. 

            System.out.print("And how menny years do yo have? "); //Message sent by he terminal
            int age = reed.nextInt(); //Age collection.

            System.out.println("So your name is "+ Name+ " and you have "+age+" years!"
                    + "\nNice to meet you! :)" ); //Greetings
            System.out.println();
            
            System.out.printf("So your name is %s and you have %s years! \nNice to meet you! :D\n", Name, age);
            //this is other methot to print a text whit variables.
        }
        catch(Exception x)
        {
           System.out.println("Error> the age has to be a number." + x.getMessage()); 
        }
        
    }
    
}
