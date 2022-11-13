package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements Calc{
    private String result;
    private int num1, num2;


    public Divide(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String operate() {

        /***
         * <b>This handles divide by zero exception</b>
         */

        try {
            return result = String.valueOf(num1/num2)+" R: "+ String.valueOf(num1%num2);

        }
        catch (ArithmeticException e) {
          return  result = "Infinity";

        }
    }


}
