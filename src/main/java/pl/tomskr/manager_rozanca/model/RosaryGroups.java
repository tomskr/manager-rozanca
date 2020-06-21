package pl.tomskr.manager_rozanca.model;



public class RosaryGroups {

    public RosaryGroups() {
    }

    public RosaryGroups(long id, String nazwaGrupy) {
        Id = id;
        this.nazwaGrupy = nazwaGrupy;
    }

    private long Id;
    private String nazwaGrupy;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNazwaGrupy() {
        return nazwaGrupy;
    }

    public void setNazwaGrupy(String nazwaGrupy) {
        this.nazwaGrupy = nazwaGrupy;
    }
}
