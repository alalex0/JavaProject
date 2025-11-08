
/*
14."След матрицы
Найти след матрицы, след матрицы — сумма элементов главной диагонали.
Размер матрицы вводит пользователь, матрицу заполнять случайными числами.
----------------
Пример работы программы:
Введите количество строк матрицы: 5

61 16 39 79 99
66 42 71 5 68
80 64 34 12 44
63 64 40 21 3
17 31 99 41 72

След матрицы: 230
Замечание: если в итоге для подсчета вы используете два вложенных цикла,
 проходящих по всем элементам двумерного массива, то вам нужно изменить
 алгоритм так, чтобы там был только один цикл. "

 */
void main() {
    int N;
    int strmatrix;
    int I;
    int summatrix = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите Размер матрицы");
    N = scanner.nextInt();
    strmatrix = N * N;

    Random random = new Random();
    // Создание массива
    int[] array = new int[strmatrix];
    // Заполнение массива случайными числами
    fillArrayWithRandom(array, 2, 100, random);

    I = N + 1;
    printArray(array, N);

    for (int i = 0; i < array.length; i = i + I) {
        summatrix += array[i];
    }

    System.out.println("След матрицы: " + summatrix);

}

// Метод для заполнения массива случайными целыми числами
public static void fillArrayWithRandom(int[] array, int min, int max, Random random) {
    for (int i = 0; i < array.length; i++) {
        // Генерация случайного числа в диапазоне [min, max]
        // random.nextInt(max - min + 1) возвращает число от 0 до (max - min)
        // Затем добавляем min, чтобы получить число от min до max
        array[i] = random.nextInt(max - min + 1) + min;
    }
}

// Метод для вывода массива в консоль построчно, по N элементов в строке
public static void printArray(int[] array, int elementsPerLine) {
    for (int i = 0; i < array.length; i++) {
        // Выводим элемент
        System.out.print(array[i]);

        // Если это не последний элемент
        if (i < array.length - 1) {
            // Если достигли N элементов в строке, переходим на новую строку
            if ((i + 1) % elementsPerLine == 0) {
                System.out.println();
            } else {
                // Иначе выводим разделитель (запятая и пробел)
                System.out.print(" ");
            }
        }
    }
    System.out.println();
}