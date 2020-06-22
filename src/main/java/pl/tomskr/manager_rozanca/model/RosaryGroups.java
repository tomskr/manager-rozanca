package pl.tomskr.manager_rozanca.model;



public class RosaryGroups {

    public RosaryGroups() {
    }

    public RosaryGroups(String id, String nazwaGrupy) {
        Id = id;
        this.nazwaGrupy = nazwaGrupy;
    }

    private String Id;
    private String nazwaGrupy;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNazwaGrupy() {
        return nazwaGrupy;
    }

    public void setNazwaGrupy(String nazwaGrupy) {
        this.nazwaGrupy = nazwaGrupy;
    }
}
