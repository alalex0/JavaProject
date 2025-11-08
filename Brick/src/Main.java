import java.util.Scanner;

/*
11.Незадачливый строитель.
Напишите программу, которая должна определить, пройдет ли кирпич в отверстие.
Размеры отверстия (длина и высота) вводит пользователь.
Тоже самое касается габаритов кирпича, пользователь вводит в программу
значения длины, ширины и высоты кирпича.
Умный строитель умеет вращать кирпич и может пытаться пропихнуть кирпич в
 отверстие разными сторонами."

 */
public  class  Main {
    void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину отверстия");
        int a = scanner.nextInt();
        System.out.println("Введите высоту отверстия");
        int b = scanner.nextInt();

        System.out.println("Введите длину кирпича");
        int l = scanner.nextInt();
        System.out.println("Введите высоту кирпича");
        int h = scanner.nextInt();
        System.out.println("Введите ширину кирпича");
        int c = scanner.nextInt();

        Hole hole=new Hole(a,b);
        Brick brick = new Brick(l,h,c);
        //попытка пропихнуть кирпич
        brick.TryPassBrick(hole);


    }
}