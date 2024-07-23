package dev.oscar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void testGetFizzBuzzValue() {
        assertEquals("Fizz", FizzBuzz.getFizzBuzzValue(3));
        assertEquals("Buzz", FizzBuzz.getFizzBuzzValue(5));
        assertEquals("FizzBuzz", FizzBuzz.getFizzBuzzValue(15));
        assertEquals("1", FizzBuzz.getFizzBuzzValue(1));
    }
 
}
