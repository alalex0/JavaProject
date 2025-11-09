//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
"Вычисление Функции Высшего Порядка.
Посчитать факториал числа, вводимого с клавиатуры пользователем.
Пользователь может ввести отрицательное число или буквенные символы.
Алгоритм не должен использовать рекурсию."

 */
void main() {

    try {


        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        number = readNumber(scanner);
        Function<Integer,Integer> lambda =n->{
            int multiplication = 1;
            if (n < 0) {
                throw new IllegalArgumentException("Только для положительных чисел");
            }
            for (int i = 1; i < n + 1; i++) {
                multiplication *= i;
            }
            return multiplication;
        };
        int multiplication=applyOperation(number,lambda);
        System.out.println(multiplication);
    } catch (IllegalArgumentException e) {
        System.err.println(e.getMessage());
    }

}

public static int readNumber(Scanner scanner) {
    String s = scanner.nextLine();
    if (s.isEmpty()) {
        throw new NumberFormatException("Пустая строка");
    }
    try {
        return Integer.parseInt(s);
    } catch (NumberFormatException e) {
        throw new NumberFormatException("Введено не число");
    }
}
public static int applyOperation(int number,Function<Integer,Integer> operation)
{
return operation.apply(number);
}


