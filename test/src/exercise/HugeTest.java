package exercise;


import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class HugeTest {

     @Test
    public void  testThatItCanParseAndReturnsToString(){

        HugeInteger  hugeInteger = new HugeInteger();
        hugeInteger.parse("1234");

        assertEquals("1234",hugeInteger.toString());


    }


    @Test public void shouldAddTwoHugeIntegers() {
         HugeInteger first = new HugeInteger();
         HugeInteger second = new HugeInteger();
         first.parse("123");
         second.parse("456");
         HugeInteger result = first.add(second);
         assertEquals("579", result.toString());
     }
}
