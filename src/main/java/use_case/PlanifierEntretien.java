package use_case;

import commun.dto.dtoEntretien;
import commun.dto.dtoPlanifEntretien;
import model.RootPlanifEntretien;
import model.candidat.Candidat;
import model.entretien.Entretien;

import java.util.Date;

public class PlanifierEntretien {
    private Date date;
    private Candidat candidat;
    private int duree;

    public PlanifierEntretien(Date date, long idCandidat, int duree) {
        this.date = date;
        this.duree = duree;
        Repo1 repo1 = new Repo1();
        this.candidat = repo1.fakeRecuperationInfoUser(idCandidat);
    }

    public Entretien executePlanification(){
        dtoPlanifEntretien dtoSend = new dtoPlanifEntretien(date, candidat, duree);
        RootPlanifEntretien rooter = new RootPlanifEntretien(dtoSend);
        dtoEntretien dtoReceived =  rooter.execute();
        return dtoReceived.getEntretien();
    }
}
