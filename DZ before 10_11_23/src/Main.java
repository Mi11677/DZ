
//TODO:   разобрали на уроке
 //       В класс 'ForwardList' добавить следующий методы:
 //       ??? push_back(???);     //добавляет значение в конец списка
 //       ??? pop_front(???);     //удаляет начальный элемент списка
 //       ??? pop_back(???);      //удаляет последний элемент списка


// методы в main не вызывал


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(0);
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = kb.nextInt();

        ForwardList list = new ForwardList();
        for (int i = 0; i < n; i++)
        {
            list.push_front(rand.nextInt(100));
        }
        list.print();
    }
}