
package Clases;

import java.util.ArrayList;

public class Manufacturer extends Eslabon{

    private ArrayList<ProductoTerminado> productosProducidos;
    
    public Manufacturer(String nombre, String descripcion, Ubicacion ubicacion) {
        super(nombre, descripcion, ubicacion);
        this.productosProducidos = new ArrayList<>();
    }
    
    public Manufacturer(){
        super(null, null, null);
        this.fechaLlegada = new Fecha();
        this.fechaSalida = new Fecha();
        this.ubicacion = new Ubicacion();

    }

    @Override
    public boolean Envio(Eslabon eslabon) {
        return true;
    }

    public ArrayList<ProductoTerminado> getProductosProducidos() {
        return productosProducidos;
    }

    public void setProductosProducidos(ArrayList<ProductoTerminado> productosProducidos) {
        this.productosProducidos = productosProducidos;
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
    
    
    
}
