import java.util.Scanner;

//3. Вывести в консоль все буквы от А до Z  с помощью цикла. Использовать тип данных char.
public class Main {

    public static void main(String[] args) {


        char[] arralfavit = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < arralfavit.length; i++)
            System.out.println("i= " + arralfavit[i]);
    }
}