package sergey.lesson10.nasledovanie;

public class Employee extends Person {

    private String dolgnost;


    public Employee() {
    }

    public Employee(String dolgnost) {
        this.dolgnost = dolgnost;
    }

    public Employee(String dolgnost, String name, String lastName, String surName, int age, Gender gender) {
        super(name, lastName, surName, age, gender);
        this.dolgnost = dolgnost;

    }

    public String getDolgnost() {
        return dolgnost;
    }

    public void setDolgnost(String dolgnost) {
        this.dolgnost = dolgnost;
    }

    @Override
    public void informaton() {
        System.out.printf("%s: %s %s %s возраст %d пол:", getDolgnost(), getSurname(), getName(), getLastName(), getAge());
        System.out.println(getGender());


    }
}
