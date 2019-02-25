
package Clases;

import java.util.ArrayList;

public class Manufacturer extends Eslabon{

    private ArrayList<ProductoTerminado> productosProducidos;
    
    public Manufacturer(String nombre, String descripcion, Ubicacion ubicacion) {
        super(nombre, descripcion, ubicacion);
        this.productosProducidos = new ArrayList<>();
    }

    @Override
    public boolean Envio(Eslabon eslabon) {
        return true;
    }
    
}
