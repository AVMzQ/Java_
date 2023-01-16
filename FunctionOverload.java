
package javacourse;
/**
 *
 * @author angel
 */
public class FunctionOverload {
    public static void main(String[] args) {
        //in this terminal app i use function overload to do different things whit a functions that has the same name.
        Hello();
        System.out.println(Hello(1));
        System.out.println("The plus of 23 and 12 is> "+plus(23,12));
        System.out.println("The plus of 154.23 and 12 is> "+plus(154.23,12));
    }
    //Plus function.
    static int plus(int a, int b){
        return a + b;
    }
    static double plus(double a, double b){
        return a+b;
    }
    //Message function
    static String Hello(int a){
        return "Hello! this is a return massage.";
    }
    static void Hello(){
        System.out.println("Hello! this message shows the differences from a normal function and a function overload");
    }
}
