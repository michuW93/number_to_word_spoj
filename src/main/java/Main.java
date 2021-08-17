import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int lastNumber = in.nextInt();
        //System.out.println(firstNumber + " " + lastNumber);
        IntStream.rangeClosed(firstNumber, lastNumber)
                .mapToObj(number -> produceStringFromNumber.apply(number))
                .forEach(System.out::print);
    }

    private static Function<Integer, String> produceStringFromNumber = number ->
    {
        if (number % 2 == 0 && number % 3 != 0) {
            return "a";
        }
        if (number % 3 == 0 && number % 2 != 0) {
            return "b";
        } else if (number % 6 == 0) {
            return "ab";
        }
        return "";
    };

}
