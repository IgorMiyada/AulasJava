package academy.devdojo.javacore.Pwrappers.test;

public class WrappersTest {
    public static void main(String[] args) {

        Byte byteW = 127;
        Short shortW = 1;
        Integer integerW = 1; //autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW =  true;


        int i = integerW; //unboxing
        int i2 = Integer.parseInt("1");
    }
}
