import model.entretien.Creneau;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CreneauTest {

    @Test
    public void testDifferentCreneauAreNotEquals() {
        // 18/04/2019 9h00 -> 1555578000
        Date date = new Date(1555578000);
        Creneau one  = new Creneau(date, 60);
        Date dateTwo = new Date(1555578001);
        Creneau two  = new Creneau(dateTwo, 60);
        assertFalse(one.equals(two));
    }

    @Test
    public void testDureeInferiorAt30() {
        // 18/04/2019 9h00 -> 1555578000
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Date date = new Date(1555578000);
                Creneau test = new Creneau(date, 20);
            }
        });
    }

    @Test
    public void testDureeSuperiorAt120() {
        // 18/04/2019 9h00 -> 1555578000
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Date date = new Date(1555578000);
                Creneau test = new Creneau(date, 150);
            }
        });
    }

    @Test
    public void testDureeNotAMultipleOf30() {
        // 18/04/2019 9h00 -> 1555578000
        assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Date date = new Date(1555578000);
                Creneau test = new Creneau(date, 34);
            }
        });
    }



}