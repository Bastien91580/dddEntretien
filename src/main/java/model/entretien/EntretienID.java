package model.entretien;


import java.util.Random;

public class EntretienID {
    private long id;

    public EntretienID() {
        this.id = new Random().nextLong();
    }

    public Long getId() {
        return id;
    }
}
