
// Загрузить группу из файла, т.е., объекты должны появиться в массиве не в результате инициализации массива в коде,
// а в результате чтения файла. Каждая строка файла - это какой-то объект (Student, Teacher....)
// У Олеси Олеговны самое простое и понятное решение)


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> groups = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("DZ before 27 10 23.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                String type = parts[0];
                String lastName = parts[1];
                String firstName = parts[2];
                int age = Integer.parseInt(parts[3]);
                String speciality;
                String group;
                int rating;
                int attendance;
                String subject;
                switch (type) {
                    case "Student":
                        speciality = parts[4];
                        group = parts[5];
                        rating = Integer.parseInt(parts[6]);
                        attendance = Integer.parseInt(parts[7]);
                        groups.add(new Student(lastName, firstName, age, speciality, group, rating, attendance));
                        break;
                    case "Teacher":
                        speciality = parts[4];
                        int experience= Integer.parseInt(parts[5]);
                        groups.add(new Teacher(lastName, firstName, age, speciality, experience));
                        break;
                    case "Graduate":
                        speciality = parts[4];
                        group= parts[5];
                        rating= Integer.parseInt(parts[6]);
                        attendance= Integer.parseInt(parts[7]);
                        subject = parts[8];
                        groups.add(new Graduate(lastName, firstName, age, speciality, group, rating, attendance, subject));
                        break;
                    case "Specialist":
                        speciality = parts[4];
                        group = parts[5];
                        rating= Integer.parseInt(parts[6]);
                        attendance= Integer.parseInt(parts[7]);
                        subject = parts[8];
                        int grade = Integer.parseInt(parts[9]);
                        groups.add(new Specialist(lastName, firstName, age, speciality, group, rating, attendance, subject, grade));
                        break;
                    case "Human":
                         lastName = parts[1];
                         firstName = parts[2];
                         age = Integer.parseInt(parts[3]);
                         groups.add(new Human(lastName, firstName, age));
                         break;


                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < groups.size(); i++) {
            System.out.println(groups.get(i));

        }
    }
}