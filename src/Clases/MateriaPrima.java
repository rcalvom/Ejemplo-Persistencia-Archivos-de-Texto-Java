
package Clases;


public class MateriaPrima {
    private String nombre;
    private Farm granja;

    public MateriaPrima(String nombre, Farm granja) {
        this.nombre = nombre;
        this.granja = granja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Farm getGranja() {
        return granja;
    }

    public void setGranja(Farm granja) {
        this.granja = granja;
    }
    
}
