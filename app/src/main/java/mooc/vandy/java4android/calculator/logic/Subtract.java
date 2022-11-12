package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements Calc {


    private Integer sub;
    private int num1, num2;

    public Subtract(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void operate() {
        sub = num1-num2;
    }

    public String toString() {
        return sub.toString();
    }
}
