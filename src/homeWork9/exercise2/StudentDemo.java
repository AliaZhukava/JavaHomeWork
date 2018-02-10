package homeWork9.exercise2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {
        List<Student> list = new LinkedList<>();
        list.add(new Student("Андрей", "Иванов", 20, 8));
        list.add(new Student("Андрей", "Иванов", 19, 7));
        list.add(new Student("Андрей", "Иванов", 19, 9));
        list.add(new Student("Андрей", "Иванов", 20, 6));

        System.out.println("Ученик с самым высоким баллом:");
        bestStudent(list);
        System.out.println();
        list.sort(new FirstNameComparator());

        for (Student student : list) {
            System.out.println(student.toString());
        }
    }

    private static void bestStudent(List<Student> student) {
        Student bestStudent = student.get(0);
        for (Iterator<Student> iterator = student.iterator(); iterator.hasNext(); ) {
            Student anotherStudent = iterator.next();
            if (bestStudent.getAverageMark() < anotherStudent.getAverageMark()) {
                bestStudent = anotherStudent;
            }
        }
        System.out.println(bestStudent);
    }

    public static class FirstNameComparator implements Comparator<Student> {

        private LastNameComparator studentLastNameComparator = new LastNameComparator();

        @Override
        public int compare(Student o1, Student o2) {
            int result = o1.getFirstName().compareTo(o2.getFirstName());
            if (result == 0) {
                result = studentLastNameComparator.compare(o1, o2);
            }

            return result;
        }
    }

    public static class LastNameComparator implements Comparator<Student> {

        private AgeComparator studentAgeComparator = new AgeComparator();

        @Override
        public int compare(Student o1, Student o2) {
            int result = o1.getLastName().compareTo(o2.getLastName());
            if (result == 0) {
                result = studentAgeComparator.compare(o1, o2);
            }

            return result;
        }
    }

    public static class AgeComparator implements Comparator<Student> {

        private AverageMarkComparator studentAverageMarkComparator = new AverageMarkComparator();

        @Override
        public int compare(Student o1, Student o2) {
            int result = o1.getAge().compareTo(o2.getAge());
            if (result == 0) {
                result = studentAverageMarkComparator.compare(o1, o2);
            }

            return result;
        }
    }

    public static class AverageMarkComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAverageMark().compareTo(o2.getAverageMark());
        }
    }
}
