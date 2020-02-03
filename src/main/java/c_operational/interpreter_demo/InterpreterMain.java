package c_operational.interpreter_demo;

public class InterpreterMain{

    private InterpreterContext ic;
    private InterpreterMain(InterpreterContext i) {this.ic = i;}

    private String interpret(String str) {

        Expression exp; //teraz null

        if(str.toLowerCase().contains("Hexadecimal".toLowerCase())){
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }else if(str.toLowerCase().contains("Binary".toLowerCase())){
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }else return str;

        return exp.interpret(ic);
    }

    public static void main(String[] args) {

        String str1 = "2870234 in binary";
        String str2 = "2870234 in hexadecimal";

        InterpreterMain interpreterMain = new InterpreterMain(new InterpreterContext());
        System.out.println(str1+" = "+interpreterMain.interpret(str1));
        System.out.println(str2+" = "+interpreterMain.interpret(str2));


    }
}
