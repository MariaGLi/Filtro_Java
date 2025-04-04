package MVC.Modelo;

public class AsigMision {
    private int id;
    private int id_ninja;
    private int id_mision;
    private String fechaInicio;

    public AsigMision() {
    }

    public AsigMision(int id, int id_ninja, int id_mision, String fechaInicio) {
        this.id = id;
        this.id_ninja = id_ninja;
        this.id_mision = id_mision;
        this.fechaInicio = fechaInicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_ninja() {
        return id_ninja;
    }

    public void setId_ninja(int id_ninja) {
        this.id_ninja = id_ninja;
    }

    public int getId_mision() {
        return id_mision;
    }

    public void setId_mision(int id_mision) {
        this.id_mision = id_mision;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
