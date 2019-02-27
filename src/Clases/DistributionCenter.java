
package Clases;

import java.util.ArrayList;

public class DistributionCenter extends Eslabon{

    private ArrayList<ProductoTerminado> productosDistribuir; 
    
    public DistributionCenter(String nombre, String descripcion, Ubicacion ubicacion) {
        super(nombre, descripcion, ubicacion);
        this.productosDistribuir = new ArrayList<>();
    }
    
    public DistributionCenter(){
        super(null, null, null);
        this.fechaLlegada = new Fecha();
        this.fechaSalida = new Fecha();
        this.ubicacion = new Ubicacion();

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
