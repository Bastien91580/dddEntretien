package commun.dto;

import model.entretien.Entretien;

public class dtoEntretien {
    private Entretien entretien;

    public dtoEntretien(Entretien entretien) {
        this.entretien = entretien;
    }

    public Entretien getEntretien() {
        return entretien;
    }
}
