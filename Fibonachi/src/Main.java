//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
12.Код Да Винчи
Вывести на экран N чисел Фибоначчи.
Числа Фибоначчи - это ряд таких чисел, который начинается с 1 и 1 и
затем каждое следующее число равно сумме двух предыдущих.
Начало последовательности выглядит так: 1, 1, 2, 3, 5, 8, 13, 21, 34,
Число N вводится пользователем с клавиатуры.
Программа должна достаточно быстро работать для подсчета 500 чисел Фибоначчи.
Алгоритм не должен использовать рекурсию."

 */
void main() {


    Scanner scanner= new Scanner(System.in);
    System.out.println("Введите N чисел Фибоначчи");
    int N=scanner.nextInt();
    BigInteger n1 = BigInteger.valueOf(0);
    BigInteger n2 = BigInteger.valueOf(1);
    BigInteger n = BigInteger.valueOf(1);
    System.out.println(n);
    for (int i = 0; i < N; i++) {
        n = n1.add(n2);
        System.out.println(n);
        n1 = n2;
        n2 = n;
    }
}
