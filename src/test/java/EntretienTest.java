import model.candidat.Candidat;
import model.entretien.Creneau;
import model.entretien.Entretien;
import model.skill.Skill;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EntretienTest {

    @Test
    public void testSameCreneauAreEquals() {
        Date date = new Date(1555579000);
        Creneau one  = new Creneau(date, 30);

        Skill[] skills  = new Skill[2];
        skills[0] = new Skill("Java", 2);
        skills[1] = new Skill("C#", 3);
        Candidat candidat = new Candidat("Jack", "Jean", new Date(1555508000), skills);

        Entretien entretien = new Entretien("paul", candidat, date, 30);

        assertEquals(entretien.getCreneau(), one);
    }

    @Test
    public void testDiffrentCreneauAreNotEquals() {
        Date date = new Date(1555579000);
        Creneau one  = new Creneau(date, 60);

        Skill[] skills  = new Skill[2];
        skills[0] = new Skill("Java", 2);
        skills[1] = new Skill("C#", 3);
        Candidat candidat = new Candidat("Jack", "Jean", new Date(1555508000), skills);

        Entretien entretien = new Entretien("paul", candidat, date, 30);

        assertNotEquals(entretien.getCreneau(), one);
    }

}