package commun.dto;

import model.candidat.Candidat;
import model.entretien.Creneau;

import java.util.Date;

public class dtoPlanifEntretien {
    private Date date;
    private Candidat candidat;
    private int duree;

    public dtoPlanifEntretien(Date date, Candidat candidat, int duree) {
        this.date = date;
        this.candidat = candidat;
        this.duree = duree;
    }

    public Date getDate() {
        return this.date;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public int getDuree() {
        return duree;
    }
}
