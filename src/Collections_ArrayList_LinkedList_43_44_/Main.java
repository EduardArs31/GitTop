package Collections_ArrayList_LinkedList_43_44_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<String> students = new ArrayList<>();
        List<String> newStudents = new ArrayList<>();


        students.add("Александр");
        students.add("Алексей");
        students.add("Иван");
        students.add("Василий");
        students.add("Константин");

        System.out.println(students);

        newStudents.add("Федор");
        newStudents.add("Платон");
        newStudents.add("Денис");
        newStudents.add("Павел");
        newStudents.add("Глеб");

        students.addAll(newStudents);
        System.out.println(students);

        students.remove("Иван");
        System.out.println("Удалить по имени" + students);
        students.remove(1);
        System.out.println("Удалить по индексу" + students);
        System.out.println("Есть ли в списке Василий -" + students.contains("Василий"));
        System.out.println("Есть ли в списке Николай -" + students.contains("Николай") + "Есть ли в списке Павел -" +
                newStudents.add("Павел"));

        System.out.println("содержится ли определенное имя в списке -" + students.containsAll(newStudents));
        System.out.println("количество студентов -" + students.size());
        System.out.println("пустой ли список -" + students.isEmpty());
        students.clear();
        newStudents.clear();
        System.out.println("Пустой ли список ? " + students.isEmpty()+"    "+newStudents.isEmpty() );
       // System.out.println("Удалите всех студентов -" + students  + "\n");
        System.out.println("----------------------------------------------------" + "\n");
        System.out.println("ArrayList, время выполнения в миллисекундах -" + add(arrayList));
        System.out.println("LinkedList, время выполнения в миллисекундах - " + add(linkedList) + "\n");
        System.out.println("ArrayList, время выполнения в  миллисекундах - " + get(arrayList));
        System.out.println("LinkedList, время выполнения в миллисекундах - " + get(linkedList) + "\n");
    }
        public static long add(List<Integer> list) {

            long start = System.currentTimeMillis();

            for (int i = 0; i < 1_000_000; i++) {
                list.add(i);
            }
            long finish = System.currentTimeMillis();
            return finish - start;
        }
        public static long get(List<Integer> list) {

            long start = System.currentTimeMillis();

            for (int i = 0; i < 100_000; i++) {
                list.get(i);
            }
            long finish = System.currentTimeMillis();
            return finish - start;
    }
}





