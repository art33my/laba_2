/**
 * Абстрактный класс Person описывает базовые свойства и поведение человека.
 * Принцип инкапсуляции: поля класса закрыты для прямого доступа и доступны через геттеры и сеттеры.
 * Принцип абстракции: класс абстрактный, содержит абстрактный метод displayRole(), который будет реализован в подклассах.
 */
public abstract class Person {
    protected String name;
    private int age;
    private String gender;
    private static int personCount = 0; // Статическая переменная для подсчета созданных объектов

    // Конструктор с параметрами
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        personCount++; // Увеличиваем счетчик при создании нового объекта
    }

    // Конструктор по умолчанию
    public Person() {
        this("Unknown", 0, "Unknown");
    }

    // Абстрактный метод для реализации в подклассах
    public abstract void displayRole();

    // Метод для вывода основной информации о человеке
    public void introduce() {
        System.out.println("Меня зовут " + name + ". Мне " + age + " лет, я " + gender + ".");
    }

    // Геттеры и сеттеры для полей (инкапсуляция)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Статический метод для получения количества созданных объектов
    public static int getPersonCount() {
        return personCount;
    }
}
