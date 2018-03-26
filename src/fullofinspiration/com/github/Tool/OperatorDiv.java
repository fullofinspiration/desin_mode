package fullofinspiration.com.github.Tool;

public class OperatorDiv implements Operator {
    @Override
    public double makeCalcutor(double numberA, double numberB) throws Exception {
        if (numberB == 0) {
            throw new Exception("number not be 0");
        }
        return numberA / numberB;
    }
}
