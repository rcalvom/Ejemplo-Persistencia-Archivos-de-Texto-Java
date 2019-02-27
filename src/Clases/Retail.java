
package Clases;

import java.util.ArrayList;

public class Retail extends Eslabon{

    private ArrayList<ProductoTerminado> productosVenta;
    
    public Retail(String nombre, String descripcion, Ubicacion ubicacion) {
        super(nombre, descripcion, ubicacion);
        this.productosVenta = new ArrayList<>();
    }
    
    public Retail(){
        super(null, null, null);
        this.fechaLlegada = new Fecha();
        this.fechaSalida = new Fecha();
        this.ubicacion = new Ubicacion();

    }

    @Override
    public boolean Envio(Eslabon eslabon) {
        return true;
    }
}
