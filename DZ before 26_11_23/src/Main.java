
//TODO:
//   1. Проверить все методы на пустом дереве;
//   Для исправления  вставляем строку  "if(Root == null)return 0;"  в методы maxValue() и minValue()


//   2. Обеспечить вызов методов дерева без необходимости передачи в них корня,
//   т.е., вместо tree.sum(tree.getRoot()) метод должен вызываться так: tree.sum();
//   3. Добавить в дерево метод ??? count(), который возвращает коичество элементов дерева;
//   4. На базе Бинарное дерева создать уникальное Бинарное дерево;
//   5. Написать метод ??? clear(), который очищает дерево (удаляет все его элементы);
//   6. Написать метод ??? erase(), который удаляет элемент с заданным значением;
//     сделал другой метод erase, тк работал только на идеально сбалансированнм дереве (не удаляется 33, 32, 50)


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
            tree.insert(rand.nextInt(1000));
        }
        tree.print();

        System.out.println("Минимальное значение в дереве: "  + tree.minValue());
        System.out.println("Максимальное значение в дереве: " + tree.maxValue());
        System.out.println("Сумма элементов в дереве: "       + tree.sum());
        System.out.println("Количество  элементов в дереве: " + tree.count());
        System.out.println("Среднее-арифметическое  элементов дерева: " + tree.avg());


        UniqueTree u_tree = new UniqueTree();
        for (int i = 0; i < n; i++)
        {
            u_tree.insert(rand.nextInt(100));
        }
        System.out.println();
        System.out.println("Уникальное дерево");
        u_tree.print();
        u_tree.clear();
        u_tree.print();
        System.out.println("После очистки дерева ");
        System.out.println();
        System.out.println("Минимальное значение в дереве: "  + u_tree.minValue());
        System.out.println("Максимальное значение в дереве: " + u_tree.maxValue());
        System.out.println("Сумма элементов в дереве: "       + u_tree.sum());
        System.out.println("Количество  элементов в дереве: " + u_tree.count());
        System.out.println("Среднее-арифметическое  элементов дерева: " + u_tree.avg());
        System.out.println();

        Tree tree1 = new Tree(new  int[]{50, 25 ,75 ,16 ,32 ,64, 80, 33});
        tree1.print();


        System.out.print("Введите значение удаляемого элемента: ");
        int value = kb.nextInt();
        tree1.erase(value);
        System.out.println("После удаления: ");
        tree1.print();
        System.out.println("Минимальное значение в дереве: "  + tree1.minValue());
        System.out.println("Максимальное значение в дереве: " + tree1.maxValue());
        System.out.println("Сумма элементов в дереве: "       + tree1.sum());
        System.out.println("Количество  элементов в дереве: " + tree1.count());
        System.out.println("Среднее-арифметическое  элементов дерева: " + tree1.avg());

    }
}