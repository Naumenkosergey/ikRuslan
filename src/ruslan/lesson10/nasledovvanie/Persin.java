package ruslan.lesson10.nasledovvanie;

import org.junit.runners.parameterized.ParametersRunnerFactory;

import java.sql.Array;

public class Persin implements House, Say {
    private String name;
    private String surname;

    public Persin(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Persin() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void info(){
        System.out.println(getName()+" " + getSurname());
    }

    @Override
    public void say() {
        System.out.println("hi");
    }
}
