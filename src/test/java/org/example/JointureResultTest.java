package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class JointureResultTest {

    @Test
    public void should_return_the_Sum_of_all_figures_of_number() {
        //arrange
        Jointure jointure = new Jointure();
        //act
        int result = jointure.sum(451);
        //assert
        assertThat(result).isEqualTo(461);
    }

    @ParameterizedTest
    @CsvSource({"451,461", "16,23", "50,55"})
    public void _Should_generate_the_expected_sum(int input, int expected) {
        //arrange
        Jointure jointure = new Jointure();
        //act
        int actualValue = jointure.sum(input);
        //assert
        assertThat(actualValue).isEqualTo(expected);
    }

    @Test
    public void should_return_secondNumber_as_the_sum_of_all_figures_of_the_first_number() {
        //arrange
        Jointure jointure = new Jointure();
        //act
        int result = jointure.findJointure(11, 17);
        //assert
        assertThat(result).isEqualTo(17);
    }

    @ParameterizedTest
    @CsvSource({"498,507, 519", "11,17,17", "534,483, 534"})
    public void _Should_generate_the_expected_jointure_Value(int input1, int input2, int expected) {
        //arrange
        Jointure jointure = new Jointure();
        //act
        int actualValue = jointure.findJointure(input1, input2);
        //assert
        assertThat(actualValue).isEqualTo(expected);
    }

}
