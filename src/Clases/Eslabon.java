
package Clases;

public abstract class Eslabon {
    protected String nombre;
    protected String descripcion;
    protected Ubicacion ubicacion;
    protected Fecha fechaLlegada;
    protected Fecha fechaSalida;

    public Eslabon(String nombre, String descripcion, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
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

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Fecha getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Fecha fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Fecha getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    public abstract boolean Envio(Eslabon eslabon);
    
}
