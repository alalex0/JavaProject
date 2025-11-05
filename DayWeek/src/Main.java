import java.util.Scanner;

public  class Main {
    void main() {
//4.По введенному номеру дня недели вывести название дня недели, используя
// оператор множественного
        //выбора switch
        //Нумирация дней недели начинается с 1-понедельник, 2-вторник и т.д.

    Scanner scaner=new Scanner(System.in);
    System.out.println("Введите номер дня недели");
    int day;
    day=scaner.nextInt();

    String dayString;
    switch(day){
        case 1:
                dayString="Понедельник";
                break;
        case 2:
            dayString="Вторник";
            break;
        case 3:
            dayString="Среда";
            break;
        case 4:
            dayString="Четверг";
            break;
        case 5:
            dayString="Пятница";
            break;
        case 6:
            dayString="Суббота";
            break;
        case 7:
            dayString="Воскресенье";
            break;
        default:
            dayString="нет такого дня";
    }
        System.out.println(dayString);

    }
}