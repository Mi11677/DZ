


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello List!");

        Scanner kb = new Scanner(System.in);
        Random rand = new Random(0);
        System.out.print("Введите размер списка: ");
        int n = kb.nextInt();
        List list = new List();
        for (int i = 0; i < n; i++) {
            list.push_back(rand.nextInt(100));
        }
        list.print();
        //  list.reverse_print();
//        list.pop_front();
//        list.pop_back();
        //  list.clear();
        // list.print();
        //  list.reverse_print();


        System.out.print("Введите добавляемое значение: ");
        int num = kb.nextInt();
        System.out.print("Введите индекс  добавляемого значения: ");
        int pos = kb.nextInt();
        list.insert(num, pos);
        list.print();

        System.out.print("Введите индекс удаляемого значения: ");
         pos = kb.nextInt();
        list.erase(pos);
        list.print();



    }
}
