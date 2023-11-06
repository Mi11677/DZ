
//TODO:
//Загрузить группу из файла, т.е., объекты должны появиться в массиве не в результате инициализации массива в коде,
//а в результате чтения файла. Каждая строка файла - это какой-то объект (Student, Teacher....)


// Нужно было устранить ошибку код 25 (пустота), использовался встроенный метод .trim


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        load("group.txt");
    }

    public static Human[] load(String filename) throws FileNotFoundException
    {

        ArrayList<Human> al_group = new ArrayList<>();
        File file = new File(filename);
        Scanner scanner = new Scanner(file);       // Создаём и открываем поток чтения из файла
        while (scanner.hasNextLine())
        {
            String buffer = scanner.nextLine();
            if (buffer.isEmpty())continue;
            String[] values = buffer.split("[:,;]");

            Human member = HumanFactory.Create(values[0]);
            member.init(values);
        }
        scanner.close();        //  Закрываем поток
        Human[] group = new Human[al_group.size()];
        return al_group.toArray(group);
    }

}