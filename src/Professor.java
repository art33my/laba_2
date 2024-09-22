/**
 * Класс Professor наследуется от TeachingAssistant и добавляет параметры: ученая степень и опыт работы.
 * Принцип наследования: класс Professor наследует поля и методы классов Person и TeachingAssistant.
 * Полиморфизм: метод displayRole() переопределяется для преподавателя.
 */
public class Professor extends TeachingAssistant {
    private String degree;         // Ученая степень
    private int experienceYears;   // Опыт работы в годах

    // Конструктор с параметрами
    public Professor(String name, int age, String gender, String subject, int hoursPerWeek, String degree, int experienceYears) {
        super(name, age, gender, subject, hoursPerWeek); // Вызов конструктора суперкласса
        this.degree = degree;
        this.experienceYears = experienceYears;
    }

    // Конструктор по умолчанию
    public Professor() {
        this("Unknown", 0, "Unknown", "Undefined", 0, "None", 0);
    }

    // Переопределение метода для отображения роли преподавателя
    @Override
    public void displayRole() {
        System.out.println("Меня зовут " + name + ", моя ученая степень " + degree + " по предмету " + subject + ". Мой опыт работы преподавателем составляет " + experienceYears + " лет.");
    }

    // Геттеры и сеттеры для дополнительных полей
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
