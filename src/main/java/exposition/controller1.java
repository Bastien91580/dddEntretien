package exposition;

import model.candidat.Candidat;
import model.entretien.Entretien;
import use_case.PlanifierEntretien;

import java.util.Date;

public class controller1 {
    public controller1() {

    }

    public Entretien makeEntretien(long idCandidat, Date date, int duree){
        PlanifierEntretien planifierEntretien = new PlanifierEntretien(date, idCandidat, duree);
        Entretien entretien = planifierEntretien.executePlanification();
        return entretien;
    }

}
