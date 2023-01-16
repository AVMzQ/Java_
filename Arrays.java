package javacourse;
import java.util.Scanner;
/**
 *
 * @author angel
 */
public class Arrays {
    public static void main(String[] args) {
        Scanner Reed = new Scanner(System.in);
        String[] Names;
        System.out.println("How long do you need you're array?");
        int a = Reed.nextInt();
        String b = Reed.nextLine();
        System.out.println(b);
        if (a>0)
             Names=new String[a];
        else{
            System.out.println("The size of the array is to small, the size of the array will be 1");
            Names = new String[1];
        }
        System.out.printf("Pleas enter %s names \n", Names.length);
        for (int i = 0; i < Names.length; i++) {
            System.out.printf("Name [%s]\n",i+1);
            Names[i] = Reed.nextLine();
        }
        System.out.println("The names you enter is;");
        for (int i = 0; i < Names.length; i++) {
            System.out.printf("Name [%s]: %s\n",i,Names[i].toString());
        }
    }
}
