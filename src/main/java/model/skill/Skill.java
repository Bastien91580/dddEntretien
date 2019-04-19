package model.skill;

public class Skill {
    private String name;
    private int year;

    public Skill(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
