package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements Calc {


    private String result;
    private int num1, num2;

    public Subtract(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String operate() {
        return result = String.valueOf(num1-num2);
    }


}
