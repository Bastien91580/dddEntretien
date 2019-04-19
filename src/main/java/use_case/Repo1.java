package use_case;

import model.candidat.Candidat;
import model.skill.Skill;

import java.util.Date;

public class Repo1 {

    public Repo1() {

    }

    public Candidat fakeRecuperationInfoUser(long id){
        Skill [] skills  = new Skill[2];
        skills[0] = new Skill("Java", 2);
        skills[1] = new Skill("C#", 3);
        Candidat candidat = new Candidat("Jack", "Jean", new Date(1555508000), skills);
        return candidat;
    }

    /*
    public Candidat getInformationForIdUser(long iUser){
        // Connecion Databse
        // Request
        // Creation of Candidat
        // Return Candidat
    }
    */
}
