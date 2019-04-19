package model.entretien;

import model.candidat.Candidat;

import java.util.Date;

public class Entretien {
    private EntretienID id;
    private enum Status {EN_ATTENTE, CONFIRME, ANNULE}
    private Status currentStatus;
    private String annulationReason;
    private Creneau creneau;
    private String recruteur;
    private Candidat candidat;

    public Entretien(String recruteur, Candidat candidat, Date startDate, int duree) {
        this.id = new EntretienID();
        this.currentStatus = Status.EN_ATTENTE;

        this.creneau = new Creneau(startDate, duree);

        this.recruteur = recruteur;
        this.candidat = candidat;
    }

    public EntretienID getId() {
        return id;
    }

    public Status getCurrentStatus() {
        return currentStatus;
    }

    public String getAnnulationReason() {
        return annulationReason;
    }

    public String getStatus() {
        return currentStatus.toString();
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public String getRecruteur() {
        return recruteur;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void confirmer() {
        this.currentStatus = Status.CONFIRME;
    }

    public void annuler(String reason) {
        this.currentStatus = Status.ANNULE;
        annulationReason = reason;
    }
}
