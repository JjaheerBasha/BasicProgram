import java.util.Random;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class Lambdas {

    public static void main(String args[])
    {
       //function take input and produce out put

        Function<String,Integer> length=n->n.length()*10;
        System.out.println(length.apply("jaheer"));


        //predicate take input and don't produce out put

        IntPredicate isDivisibleByFive=n->n%5==0;
        System.out.println(isDivisibleByFive.test(11));

        //suppliers don't take input but generate out put

        Supplier<Double> randomNum=()-> Math.random()*100;

        System.out.println(randomNum.get());
    }
}
