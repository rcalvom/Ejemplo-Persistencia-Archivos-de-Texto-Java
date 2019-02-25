
package Main;

import Clases.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Farm X = new Farm("X", "Granja que produce leche", new Ubicacion(0, 0));
        Farm Y = new Farm("Y", "Granja que produce harina", new Ubicacion(0, 0));
        Manufacturer W = new Manufacturer("W", "Manufactura que produce pan", new Ubicacion(0, 0));
        MateriaPrima leche = new MateriaPrima("Leche", X);
        MateriaPrima harina = new MateriaPrima("Harina", Y);
        ArrayList<MateriaPrima> MPPan = new ArrayList();
        MPPan.add(leche);
        MPPan.add(harina);
        DistributionCenter distributionCenter = new DistributionCenter("Distribuidor", "Distribuidor", new Ubicacion(0, 0));
        ProductoTerminado pan = new ProductoTerminado(0, MPPan, W, distributionCenter);
        Retail R = new Retail("R", "Tienda", new Ubicacion(0, 0));
        
    }
    
    public static boolean GuardarArchivoProductos(ProductoTerminado productoTerminado) throws FileNotFoundException, IOException{
        ArrayList<ProductoTerminado> carga = new ArrayList<>();
        File file = new File("PersistenciaProductos.txt");
        if(!file.exists()){
            file.createNewFile();
        }else{
            //cargarDatos();
            carga.add(productoTerminado);
        }
        PrintStream out = new PrintStream(file);
        for(ProductoTerminado p : carga){
            out.print(p.getCodVenta());
        }
        
        out.flush();
        out.close();
        return true;
    }
    
    public static boolean GuardarArchivoGranjas(ProductoTerminado productoTerminado) throws FileNotFoundException, IOException{
        File file = new File("PersistenciaGranjas.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        PrintStream out = new PrintStream(file);
        return true;
    }
    
}
