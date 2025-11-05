import java.util.Scanner;

public class Main {
    void main() {
//        5.По введенным трем коэффициентам, вывести решение квадратного уравнения вида ax^2+bx+c=0
// Использовать класс Scanner для ввода значений с клавиатуры.

        double a;
        double b;
        double c;
        double x1 = 0.0;
        double x2 = 0.0;
        double x = 0.0;
        double D;

        Scanner scanerabc = new Scanner(System.in);
        System.out.println("Введите число a");
        a = scanerabc.nextDouble();
        System.out.println("Введите число b");
        b = scanerabc.nextDouble();
        System.out.println("Введите число c");
        c = scanerabc.nextDouble();

        D = (b * b) - (4 * a * c);//находим дискриминант квадратного уравнения

        if (D > 0) {
            //Находим корни квадратного уравнения
            x1 = (-b + Math.sqrt(D)) / 2 * a;
            x2 = (-b - Math.sqrt(D)) / 2 * a;
            System.out.println("x1=" + String.format("%.2f", x1));
            System.out.printf("x2=" + String.format("%.2f", x2));
        } else if (D == 0) {
            x = -b / 2 * a;
            System.out.println("x=" + String.format("%.2f", x));
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
