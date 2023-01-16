package javacourse;
public class FirstFunction {
    public static void main(String[] args) {
        //On this project i will creat and use my first methot in Java
        gritting();
        System.out.println(gritting2());
        System.out.println("The sum of 254 and 150 is> "+sum(254,150));
    }
    public static void gritting()
    {
        //Methot that greet the user.
        System.out.println("Hello ther! how is your day?");
    }
    public static String gritting2(){
        return "Hello, this time i'm sending you this message whit a return";
    }
    public static int sum(int a, int b){
        return a + b;
    }
}
