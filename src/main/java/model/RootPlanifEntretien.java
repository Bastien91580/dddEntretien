package model;

import commun.dto.dtoEntretien;
import commun.dto.dtoPlanifEntretien;
import model.entretien.Entretien;

public class RootPlanifEntretien {
    private dtoPlanifEntretien dtoEntry;

    public RootPlanifEntretien(dtoPlanifEntretien dtoEntry) {
        this.dtoEntry = dtoEntry;
    }

    public dtoEntretien execute(){
        Entretien entretien = new Entretien("jean", dtoEntry.getCandidat(), dtoEntry.getDate(), dtoEntry.getDuree());
        dtoEntretien returnValue = new dtoEntretien(entretien);
        return returnValue;
    }

}
