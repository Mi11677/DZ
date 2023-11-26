
//8. Написать метод ??? depth(), который возвращает глубину дерева;
//9. Написать метод ??? depth_print(???), который выводит все элементы на заданной глубине;    (не получился((()
//10.Протестировать производительность всех методов;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Tree!");

        Scanner kb = new Scanner(System.in);
        Random rand = new Random(0);
        System.out.print("Введите размер дерева: ");
        int n = kb.nextInt();
        Tree tree = new Tree();
        for (int i = 0; i < n; i++) {
            tree.insert(rand.nextInt(100));
        }

        //tree.print();
        System.out.println();
        long start_time, end_time;

        start_time = System.nanoTime();
        System.out.print("Минимальное значение в дереве: "  + tree.minValue());
        end_time = System.nanoTime();
        System.out.println("\t Вычислено за " + (end_time - start_time)*1e-9);

        start_time = System.nanoTime();
        System.out.print("Максимальное значение в дереве: " + tree.maxValue());
        end_time = System.nanoTime();
        System.out.println("\t Вычислено за " + (end_time - start_time)*1e-9);

        start_time = System.nanoTime();
        System.out.print("Сумма элементов в дереве: "       + tree.sum());
        end_time = System.nanoTime();
        System.out.println("\t Вычислено за " + (end_time - start_time)*1e-9);

        start_time = System.nanoTime();
        System.out.print("Количество  элементов в дереве: " + tree.count());
        end_time = System.nanoTime();
        System.out.println("\t Вычислено за " + (end_time - start_time)*1e-9);

        start_time = System.nanoTime();
        System.out.print("Среднее-арифметическое  элементов дерева: " + tree.avg());
        end_time = System.nanoTime();
        System.out.println("\t Вычислено за " + (end_time - start_time)*1e-9);

        start_time = System.nanoTime();
        System.out.print("Глубина дерева: " + tree.depht());
        end_time = System.nanoTime();
        System.out.println("\t Вычислено за " + (end_time - start_time)*1e-9);



        Tree tree1 = new Tree(new  int[]{50, 25 ,75 ,16 ,32 ,64, 80, 33});
        tree1.print();

        System.out.println("Глубина дерева: " + tree1.depht());

        System.out.print("Введите значение удаляемого элемента: ");
        int value = kb.nextInt();

        start_time = System.nanoTime();
        tree1.erase(value);
        end_time = System.nanoTime();
        System.out.println("\t Вычислено за " + (end_time - start_time)*1e-9);
        tree1.print();

    }
}