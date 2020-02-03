package c_operational.interpreter_demo;

public class IntToHexExpression implements Expression {

    private int i;

    public IntToHexExpression(int c) {
        this.i = c;
    }

    @Override
    public String interpret(InterpreterContext it) {
        return it.getHexaDecimalFormat(i);
    }
}
