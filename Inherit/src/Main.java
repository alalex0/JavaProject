
/*
8.Наследие
Создать базовый абстрактный класс.
Создать два интерфейса, которые являются носителями свойств (по одному свойству каждый).
Реализовать конкретные классы вида:
1) наследник базового абастрактного класса и реализатор первого интерфейса.
2) наследник базового абастрактного класса и реализатор второго интерфейса.
3) наследник базового абастрактного класса и реализатор и первого и второго интерфейсов.
Затем создать класс Main, в котором создать экземпляры трех классов и продемонстрировать
 их работу посредством вызова всех их методов."

 */
public class Main {
    public void main() {
        Inherit_1 inherit_1 = new Inherit_1("Name_1");
        System.out.println(inherit_1.getName());
        inherit_1.fly();
        inherit_1.tolk();

        Inherit_2 inherit_2 = new Inherit_2("Name_2");
        System.out.println(inherit_2.getName());
        inherit_2.fly();
        inherit_2.sleep();

        Inherit_3 inherit_3 = new Inherit_3("Name_3");
        System.out.println(inherit_3.getName());
        inherit_3.fly();
        inherit_3.tolk();
        inherit_3.sleep();


    }

}