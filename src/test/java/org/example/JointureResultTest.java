package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class JointureResultTest {

    @Test
    public void todo(){
        //arrange
      Jointure jointure = new Jointure();
        //act
      int result = jointure.sum(451);
        //assert
      assertThat(result).isEqualTo(461);
    }
    @ParameterizedTest
    @CsvSource({"451,461", "16,23", "50,55"})
    public void _Should_generate_the_expected_int_Value(int input, int expected) {
        Jointure jointure = new Jointure();
        //act
       int actualValue = jointure.sum( input);
        //assert
        assertThat(actualValue).isEqualTo(expected);
    }

}
