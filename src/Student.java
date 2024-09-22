/**
 * Класс Student наследуется от Person и добавляет параметры: курс, средний балл и группа.
 * Принцип наследования: класс Student наследует поля и методы класса Person.
 * Полиморфизм: метод displayRole() переопределяется для класса Student.
 */
public class Student extends Person {
    private int course;            // Курс студента
    private double averageGrade;   // Средний балл
    private String groupName;      // Название группы

    // Конструктор с параметрами
    public Student(String name, int age, String gender, int course, double averageGrade, String groupName) {
        super(name, age, gender); // Вызов конструктора суперкласса
        this.course = course;
        this.averageGrade = averageGrade;
        this.groupName = groupName;
    }

    // Конструктор по умолчанию
    public Student() {
        this("Unknown", 0, "Unknown", 1, 0.0, "Undefined");
    }

    // Переопределение метода для отображения роли студента
    @Override
    public void displayRole() {
        System.out.println("Я " + name + " учусь на " + course + " курсе в группе " + groupName + ". Мой средний балл " + averageGrade + ".");
    }

    // Геттеры и сеттеры для дополнительных полей
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
