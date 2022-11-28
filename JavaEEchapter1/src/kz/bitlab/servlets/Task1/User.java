package kz.bitlab.servlets.Task1;

public class User {
    String name;
    String surName;
    String departament;
    int salary;
    public User() {
        this.name = "no name";
        this.surName = "no surName";
        this.departament = "no departament";
        this.salary = 0;
    }

    public User(String name, String surName, String departament, int salary) {
        this.name = name;
        this.surName = surName;
        this.departament = departament;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
