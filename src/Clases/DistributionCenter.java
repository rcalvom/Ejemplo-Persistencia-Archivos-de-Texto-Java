
package Clases;

import java.util.ArrayList;

public class DistributionCenter extends Eslabon{

    private ArrayList<ProductoTerminado> productosDistribuir; 
    
    public DistributionCenter(String nombre, String descripcion, Ubicacion ubicacion) {
        super(nombre, descripcion, ubicacion);
        this.productosDistribuir = new ArrayList<>();
    }

    @Override
    public boolean Envio(Eslabon eslabon) {
        return true;
    }

    public ArrayList<ProductoTerminado> getProductosDistribuir() {
        return productosDistribuir;
    }

    public void setProductosDistribuir(ArrayList<ProductoTerminado> productosDistribuir) {
        this.productosDistribuir = productosDistribuir;
    }
    
    
    
}
