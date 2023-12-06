public class Student {
    private String name;
    private String surname;
    private String address;
    private int id;

    public Student(String name, String surname, String address, int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }

    public String toString() {
        return "Student ID: " + id + "\nName: " + name + "\nSurname: " + surname + "\nAddress: " + address + "\n";
    }

    public static void main(String[] args) {

        Student alice = new Student("Алиса", "Смит", "Коктем-2", 24);


        Student azamat = new Student("Азамат", "Айталиев", "Жетысу-3", 2);
        Student kristina = new Student("Кристина", "Иванова", "Аксай", 26);


        System.out.println("Информация о студенте Алисе:");
        System.out.println(alice);

        System.out.println("Информация о студенте Азамате:");
        System.out.println(azamat);

        System.out.println("Информация о студенте Кристине:");
        System.out.println(kristina);
    }
}

