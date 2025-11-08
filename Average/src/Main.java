
/*
"Средний по больнице
Разработать функцию, в которую передается в качестве аргументов массив типа float.
Функция должна возвращать среднее арифметическое элементов массива.
Если размер массива - нуль, то среднее арифметическое должно быть также нуль."

 */

void main() {

    float[] arr = new float[]{1.0F, 2.2F};
//    float[] arr = new float[0];

    System.out.println(String.format("%.3f", average(arr)));
}

public float average(float[] arr) {
    float averageelem = 0;
    if (arr ==null || arr.length == 0) {
        return averageelem;
    }
    for (int i = 0; i < arr.length; i++) {
        averageelem += arr[i];
    }
    return averageelem / arr.length;
}
