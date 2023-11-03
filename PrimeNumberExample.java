import java.util.*;
import java.util.stream.IntStream;

public class PrimeNumberExample {

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 50");
        IntStream.rangeClosed(1,50)
        .filter(PrimeNumberExample::isPrime)
                .forEach(System.out::print);

        System.out.println("Numbers from 1 to 50");
        IntStream.rangeClosed(1,50).forEach(System.out::print);

    }
    private static boolean isPrime(int num){
        if(num <=1){
            return false;
        }
        return IntStream.rangeClosed(2,(int) Math.sqrt(num)).noneMatch((i-> num%i == 0));
    }
}
