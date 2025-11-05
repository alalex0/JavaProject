
/*
7.Драконий мир
Создать класс Dragon, добавить в него два свойства (поля) name и tooth.
Создать два метода getter-а getName() getTooth()
Добавить метод для удара огнем fire(). Этот метод принимает в качестве значения
другого дракона Dragon и описывает в виде строки в консоли, что один дракон ударил другого."

 */
public class Main {
    public void main() {

        Dragon d = new Dragon("Dragon_1");
        Dragon d2 = new Dragon("Dragon_2");
        d.fire(d2);


    }
}
