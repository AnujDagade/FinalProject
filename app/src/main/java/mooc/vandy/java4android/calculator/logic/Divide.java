package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements Calc{
    private String result;
    private int num1, num2;
    public Integer excepFlag = 0;

    public Divide(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String operate() {
        try {
            return result = String.valueOf((double)num1/num2);

        }
        catch (Exception e) {
          return   result = "Infinity";

        }
    }


}
