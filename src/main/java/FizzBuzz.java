import org.junit.jupiter.api.Test;

public class FizzBuzz {
    public static String of(int number) {

        if (number % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(number);
    }
}
