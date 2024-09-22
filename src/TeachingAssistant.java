/**
 * Класс TeachingAssistant наследуется от Person и добавляет параметры: предмет и количество рабочих часов.
 * Принцип наследования: класс TeachingAssistant наследует поля и методы класса Person.
 * Полиморфизм: метод displayRole() переопределяется для ассистента преподавателя.
 */
public class TeachingAssistant extends Person {
    protected String subject;        // Предмет, который ассистент преподает
    private int hoursPerWeek;      // Количество рабочих часов в неделю

    // Конструктор с параметрами
    public TeachingAssistant(String name, int age, String gender, String subject, int hoursPerWeek) {
        super(name, age, gender); // Вызов конструктора суперкласса
        this.subject = subject;
        this.hoursPerWeek = hoursPerWeek;
    }

    // Конструктор по умолчанию
    public TeachingAssistant() {
        this("Unknown", 0, "Unknown", "Undefined", 0);
    }

    // Переопределение метода для отображения роли ассистента преподавателя
    @Override
    public void displayRole() {
        System.out.println("Меня зовут " + name + ". Я ассистент преподавателя по дисциплине " + subject + ". Количество моих рабочих часов в неделю составляет " + hoursPerWeek + " часов.");
    }

    // Геттеры и сеттеры для дополнительных полей
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}
