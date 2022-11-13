package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;




/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    public static final int DIVISION = 4;

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here

       switch(operation) {
           case ADDITION:
               Add add = new Add(argumentOne, argumentTwo);
               mOut.print(add.operate());
               break;
           case SUBTRACTION:
               Subtract sub = new Subtract(argumentOne, argumentTwo);
               mOut.print(sub.operate());
               break;
           case MULTIPLICATION:
               Multiply mul = new Multiply(argumentOne, argumentTwo);
               mOut.print(mul.operate());
               break;
           case DIVISION:
               Divide div = new Divide(argumentOne, argumentTwo);
               mOut.print(div.operate());

       }

    }
}
