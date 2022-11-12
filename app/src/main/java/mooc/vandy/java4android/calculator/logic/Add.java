package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements Calc{

    private Integer sum;
    private int num1, num2;

    public Add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void operate() {
        sum = num1+num2;
    }

    public String toString() {
        return sum.toString();

    }


}
