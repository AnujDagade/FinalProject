package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    private Double div;
    private int num1, num2;
    Integer excepFlag = 0;

    public Divide(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void operate() {
        try {
            //div = (double)num1/num2;
        }
        catch (ArithmeticException e) {
            excepFlag = 1;
        }
    }

    public String toString() {
            return excepFlag.toString();
    }
}
