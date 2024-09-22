public class Main {
    public static void main(String[] args) {
        // Создание объектов различных классов
        Student student = new Student("Влад Волчков", 19, "Мужчина", 2, 4.2, "БВТ2302");
        TeachingAssistant ta = new TeachingAssistant("Иван Иванов", 25, "Мужчина", "Физика", 20);
        Professor professor = new Professor("Иван Иванович", 65, "Мужчина", "Математика", 15, "Профессор", 40);
        
        // Демонстрация полиморфизма: каждый объект вызывает свой метод displayRole()
        Person[] people = { student, ta, professor };
        for (Person person : people) {
            person.introduce();   // Вызов метода из базового класса Person
            person.displayRole(); // Полиморфный вызов переопределенных методов
            System.out.println();
        }
        
        // Вывод количества созданных объектов
        System.out.println("Total number of people created: " + Person.getPersonCount());
    }
}

