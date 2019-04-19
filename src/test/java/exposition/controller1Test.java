package exposition;

import model.entretien.Creneau;
import model.entretien.Entretien;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class controller1Test {

    @Test
    public void testSameCreneauInFinalEntretien() {
        // 18/04/2019 9h00 -> 1555578000
        Date date = new Date(1555578000);
        controller1 controller1 = new controller1();
        Creneau one = new Creneau(date, 30);

        Entretien entretien = controller1.makeEntretien(22, date, 30);
        assertEquals(entretien.getCreneau(), one);
    }

    @Test
    public void testDifferentCreneauInFinalEntretien() {
        // 18/04/2019 9h00 -> 1555578000
        Date date = new Date(1555578000);
        controller1 controller1 = new controller1();
        Creneau one = new Creneau(date, 60);

        Entretien entretien = controller1.makeEntretien(22, date, 30);
        assertNotEquals(entretien.getCreneau(), one);
    }

}