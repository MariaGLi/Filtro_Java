package MVC.Modelo;

public class Habilidad {
    private int id;
    private int id_ninja;
    private String nombre;
    private String descripcion;

    public Habilidad() {
    }

    public Habilidad(int id, int id_ninja, String nombre, String descripcion) {
        this.id = id;
        this.id_ninja = id_ninja;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
