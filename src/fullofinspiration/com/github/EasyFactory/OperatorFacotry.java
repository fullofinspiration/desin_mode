package fullofinspiration.com.github.EasyFactory;

public class OperatorFacotry {
    private Operator operator;

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public OperatorFacotry(String operator_) throws Exception{
        switch (operator_) {
            case ("+"):{
                operator = new OperatorPlus();
                break;
            }
            case ("-"): {
                operator = new OperatorMinus();
                break;
            }
            case ("*"): {
                operator = new OperatorMulti();
                break;
            }
            case ("/"): {
                operator = new OperatorDiv();
                break;
            }
        }
    }
}
