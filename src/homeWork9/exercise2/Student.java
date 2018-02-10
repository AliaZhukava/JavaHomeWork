package homeWork9.exercise2;

public class Student {

    private String firstName;
    private String lastName;
    private Integer age;
    private Integer averageMark;

    public Student(String firstName, String lastName, Integer age, Integer averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Integer averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Студент {" +
                "Имя = " + firstName +
                " Фамилия = " + lastName +
                " возраст = " + age +
                " Средний балл за год = " + averageMark +
                '}';
    }
}
