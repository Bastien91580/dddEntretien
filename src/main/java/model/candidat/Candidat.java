package model.candidat;


import model.skill.Skill;

import java.util.Date;

public class Candidat {
    private String name;
    private String lastname;
    private Date birth;
    private Skill[] skills;

    public Candidat(String name, String lastname, Date birth, Skill[] skills) {
        this.name = name;
        this.lastname = lastname;
        this.birth = birth;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getBirth() {
        return birth;
    }

    public Skill[] getSkills() {
        return skills;
    }
}
