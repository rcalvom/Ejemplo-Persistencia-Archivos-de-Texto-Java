
package Clases;

import java.util.ArrayList;

public class Retail extends Eslabon{

    private ArrayList<ProductoTerminado> productosVenta;
    
    public Retail(String nombre, String descripcion, Ubicacion ubicacion) {
        super(nombre, descripcion, ubicacion);
        this.productosVenta = new ArrayList<>();
    }

    @Override
    public boolean Envio(Eslabon eslabon) {
        return true;
    }
}
