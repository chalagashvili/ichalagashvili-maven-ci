/**
 * Created by GM on 5/5/2016.
 */
public class ZeroChecker {

    private ValidChecker validator;

    public ZeroChecker(ValidChecker validator){
        this.validator = validator;
    }


    public boolean checkIfZero(int value){
        return value == 0;
    }

    public boolean checkIfZeroWithMockito(int value){
        return validator.dumbChecker() && value == 0;
    }
}
