package exercise;



public class HugeInteger {
    private  int[] store;
    int count = 0;

    public HugeInteger() {
        store = new int[40];
    }


    public void parse(String values) {

        int start = store.length - values.length();

        for (int index = 0; index < values.length(); index++) {

            char character = values.charAt(index);
            int value = character - '0';

            store[start + index] = value;
            count++;
        }


    }

    public String toString() {
        String result = "";

        int start = store.length - count;
        for (int index = start; index < store.length; index++) {

            result += store[index];
        }
        return result;

    }

    public static int max(int firstNumber, int secondNumber) {

        int max = firstNumber;
        if (secondNumber > max) {
            max = secondNumber;
        }
        return max;
    }

    public HugeInteger add(HugeInteger object) {

        HugeInteger result = new HugeInteger();
        int remainder=0;
            for(int index=store.length-1; index>=0; index--){
                int number=store[index]+object.store[index] + remainder;
                 if (number>9){
                     int temp= number%10;
                     result.store[index]=temp;
                     remainder= number/10;


                 }else {

                     result.store[index] = number;
                     remainder=0;
                 }
            }


            result.count=(max(object.count, this.count));

 return result;

    }





}








