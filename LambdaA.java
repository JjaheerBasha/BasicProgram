import java.util.function.Function;

public class LambdaA {

    public static void main(String args[]) {

        Greeting greetingMessage = () -> System.out.println("Hello World Jaheer");
        greetingMessage.foo();

        sum sum=(a,b)->a+b;

        System.out.println(sum.sumof(2,3));

        }

}

