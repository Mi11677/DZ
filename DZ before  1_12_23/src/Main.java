
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Exceptions !");
        System.out.println();

        Scanner kb = new Scanner(System.in);
        List<String> list = Arrays.asList("Стул ", "Стол ", "Диван ", "Кровать ");
        System.out.println(list);
        System.out.print("Введите цифру нужного Вам предмета: ");
        try
        {
            int num = kb.nextInt();
            System.out.println("Вы выбрали " + list.get(num - 1));
        } catch (IndexOutOfBoundsException e)
        {
            System.out.println("Неверный ввод ");
        }
        System.out.println("The end");
    }
}
