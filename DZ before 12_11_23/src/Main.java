
/*TODO:
        В класс 'ForwardList' добавить следующий методы:
        ??? push_back(???);     //добавляет значение в конец списка     DONE
        ??? pop_front(???);     //удаляет начальный элемент списка      DONE
        ??? pop_back(???);      //удаляет последний элемент списка      DONE
        ??? insert(???);        //добавляет значение по заданному индексу   DONE
        ??? erase(???);         //удаляет значение по заданному индексу
        CopyConstructor;
        ??? reverse(???);       //меняет порядок следования элементов на противоположный
        ??? clear(???);         //очищает список*/


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
            // list.push_back(rand.nextInt(100));
            list.push_front(rand.nextInt(100));

        }
        //list.push_back(123);   //для проверки работы push_back
        list.print();
        //  list.pop_front();  // вызываем метод pop_front (удаляем первый элемент)
        // list.pop_back();   // вызываем метод pop_back (удаляем последний элемент)

        System.out.print("Введите значение добавляемого элемента: ");
        int value = kb.nextInt();
        System.out.print("Введите индекс добавляемого элемента: ");
        int index = kb.nextInt();
        list.insert(value, index);
        list.print();


    }
}