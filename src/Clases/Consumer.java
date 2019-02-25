
package Clases;

import java.util.ArrayList;

public class Consumer extends Eslabon{

    private ArrayList<ProductoTerminado> productosComprados;
    
    public Consumer(String nombre, String descripcion, Ubicacion ubicacion) {
        super(nombre, descripcion, ubicacion);
        this.productosComprados = new ArrayList<>();
    }

    @Override
    public boolean Envio(Eslabon eslabon) {
        return true;
    }
    
}
