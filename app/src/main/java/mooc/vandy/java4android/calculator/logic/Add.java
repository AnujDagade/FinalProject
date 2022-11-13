package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements Calc{

    private String result;
    private int num1, num2;

    public Add(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String operate() {
       return result = String.valueOf(num1+num2);
    }




}
