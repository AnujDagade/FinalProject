package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements Calc{

    private Integer sum;

    public void operate(int num1, int num2) {
        sum = num1+num2;
    }

    public String toString() {
        return sum.toString();
    }

}
