package fullofinspiration.com.github.EasyFactory;

import java.util.Scanner;

public class CalculatorToolMain {
    public static void main(String[] args) {
        double numberA;
        double numberB;
        System.out.println("请输入numberA");
        Scanner scanner = new Scanner(System.in);
        numberA = scanner.nextDouble();
        System.out.println("请输入NumberB");
        scanner = new Scanner(System.in);
        numberB = scanner.nextDouble();
        String c;
        System.out.println("请输入操作符");
        scanner = new Scanner(System.in);
        c = scanner.next();
        try {
            Operator operator = new OperatorFacotry(c).getOperator();
            System.out.println(operator.makeCalcutor(numberA, numberB));
        } catch (Exception e) {
            System.out.println("您输入的有错");
        }
    }
}
