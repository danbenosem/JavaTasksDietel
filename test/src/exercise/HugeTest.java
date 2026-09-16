package exercise;


import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HugeTest {

     @Test
    public void  testThatItCanParseAndReturnsToString(){

        HugeInteger  hugeInteger = new HugeInteger();
        hugeInteger.parse("1234");


        assertEquals("1234",hugeInteger.toString());


    }


    @Test public void testShouldAddTwoHugeIntegers() {
         HugeInteger first = new HugeInteger();
         HugeInteger second = new HugeInteger();
         first.parse("123");
         second.parse("456");
         HugeInteger result = first.add(second);
         assertEquals("579", result.toString());
     }

    @Test
    public void testIsEqualTo() {
        HugeInteger first = new HugeInteger();
        HugeInteger second = new HugeInteger();

        first.parse("12345");
        second.parse("12345");

        assertTrue(first.isEqualTo(second));
    }

    @Test
    public  void testIsNotEqualTo() {
        HugeInteger first = new HugeInteger();
        HugeInteger second = new HugeInteger();

        first.parse("12345");
        second.parse("12346");

        assertTrue(first.isNotEqualTo(second));
    }

    @Test
   public void testIsGreaterThan() {
        HugeInteger first = new HugeInteger();
        HugeInteger second = new HugeInteger();

        first.parse("12346");
        second.parse("12345");

        assertTrue(first.isGreaterThan(second));
    }

    @Test
    public void testThatItIsLessThanMethodWorks(){

         HugeInteger first = new HugeInteger();
         HugeInteger second = new HugeInteger();

        first.parse("12345");
        second.parse("12346");

        assertTrue(first.isLessThan(second));
    }


}
