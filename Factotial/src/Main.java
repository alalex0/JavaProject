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

        int multiplication = 1;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        number = readNumber(scanner);
        if (number < 0) {
            throw new IllegalArgumentException("Только для положительных чисел");
        }
        for (int i = 1; i < number + 1; i++) {
            multiplication *= i;
        }
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


