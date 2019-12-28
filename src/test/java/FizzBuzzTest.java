import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_Fizz_given_number_divisible_by_3(){
        int number =3;
        String result = FizzBuzz.of(number);
        assertThat(result).isEqualTo("Fizz");
    }


}
