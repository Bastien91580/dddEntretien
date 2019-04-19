package model.entretien;

import commun.exception.ValidationException;

import java.util.Date;
import java.util.Objects;


public class Creneau {
    private Date startDate;
    private Date endDate;

    public Creneau(Date startDate, int duree) {
        checkDuree(duree);

        this.startDate = startDate;
        final long ONE_MINUTE_IN_MILLIS = 60000;
        long curTimeInMs = startDate.getTime();
        this.endDate = new Date(curTimeInMs + (duree * ONE_MINUTE_IN_MILLIS));
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creneau creneau = (Creneau) o;
        return Objects.equals(startDate, creneau.startDate) &&
                Objects.equals(endDate, creneau.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startDate, endDate);
    }


    private void checkDuree(int duree){
        if(duree % 30 != 0){
            throw new ValidationException("la durée doit etre un multiple de 30.");
        }

        if(duree < 30){
            throw new ValidationException("la durée doit etre au minimum de 30 min.");
        }

        if(duree > 120){
            throw new ValidationException("la durée doit etre au maximum de 120 min.");
        }
    }

}