package sergey.lesson10.nasledovanie;


public class Person {

    protected String name;
    private String Surname;
    private String lastName;
    private int age;
    private Gender gender;

    public Person() {
    }

    public Person(String name, String surname, String lastName, int age, Gender gender) {
        this.name = name;
        Surname = surname;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, String surname, String lastName, int age) {
        this.name = name;
        Surname = surname;
        this.lastName = lastName;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void informaton() {
        System.out.printf("Человек %s %s %s возраст %d", getSurname(), getName(), getLastName(), getAge());
    }
}
