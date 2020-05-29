import java.lang.Math;
public class CalculatorPrgm {
    static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2);
    }
    static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);
    }
    public static void main(String[] args) {
        System.out.println(Calculator.powerInt(2, 3));
        System.out.println(Calculator.powerDouble(3.0, 4.0));
    }
}
