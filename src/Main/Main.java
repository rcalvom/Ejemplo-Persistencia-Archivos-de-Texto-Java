
package Main;

import Clases.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Cadena de suministro\n");
        Scanner in = new Scanner(System.in);
        ArrayList<ProductoTerminado> productos = new ArrayList<>();
        int opcion = 0;
        do {            
            System.out.println("1. Cargar archivo");
            System.out.println("2. Mostrar traza de un producto");
            System.out.println("3. Agregar producto");
            System.out.println("4. Salir\n");
            opcion = in.nextInt();
            System.out.println("");
            switch(opcion){
                case 1:
                    productos = CargarArchivoProductos();
                    if(productos == null){
                        System.out.println("El archivo no fue encontrado\n");
                    }else{
                        System.out.println("El archivo fue cargado con exito\n");
                    }
                break;
                case 2:
                    System.out.println("Seleccione el producto:\n");
                    for(int i = 0; i< productos.size(); i++){
                        System.out.println((i+1)+". "+productos.get(i).getNombre());
                    }
                    System.out.println("");
                    MostrarTraza(productos,in.nextInt()-1);
                break;
                case 3:
                    String s = null;
                    ProductoTerminado pt = new ProductoTerminado();
                    System.out.print("Indique nombre producto: ");
                    pt.setNombre(in.next());
                    System.out.println("¿Agregar Materia Prima? (S/N)");
                    while(in.next().equals("S")){
                        MateriaPrima mp = new MateriaPrima();
                        System.out.println("Indique Nombre de la materia prima: ");
                        mp.setNombre(in.next());
                        System.out.println("Indique Nombre de la granja:");
                        mp.getGranja().setNombre(in.next());
                        pt.addMateriaPrima(mp);
                        System.out.println("¿Agregar Otra Materia Prima? (S/N)");
                    }
                    System.out.println("Indique nombre de la manufacturera: ");
                    pt.getManufacturer().setNombre(in.next());
                    System.out.println("Indique dia de llegada a la manufacturera");
                    pt.getManufacturer().getFechaLlegada().setDia(in.nextInt());
                    System.out.println("Indique mes de llegada a la manufacturera");
                    pt.getManufacturer().getFechaLlegada().setMes(in.nextInt());
                    System.out.println("Indique anio de llegada a la manufacturera");
                    pt.getManufacturer().getFechaLlegada().setAnio(in.nextInt());
                    System.out.println("Indique dia de Salida de la manufacturera");
                    pt.getManufacturer().getFechaSalida().setDia(in.nextInt());
                    System.out.println("Indique mes de Salida de la manufacturera");
                    pt.getManufacturer().getFechaSalida().setMes(in.nextInt());
                    System.out.println("Indique anio de Salida de la manufacturera");
                    pt.getManufacturer().getFechaSalida().setAnio(in.nextInt());
                    System.out.println("Indique latitud de la manufacturera");
                    pt.getManufacturer().getUbicacion().setLatitud(in.nextInt());
                    System.out.println("Indique longitud de la manufacturera");
                    pt.getManufacturer().getUbicacion().setLongitud(in.nextInt());
                    
                    System.out.println("Indique nombre de la Distribuidora: ");
                    pt.getDistributionCenter().setNombre(in.next());
                    System.out.println("Indique dia de llegada a la distribuidora");
                    pt.getDistributionCenter().getFechaLlegada().setDia(in.nextInt());
                    System.out.println("Indique mes de llegada a la distribuidora");
                    pt.getDistributionCenter().getFechaLlegada().setMes(in.nextInt());
                    System.out.println("Indique anio de llegada a la distribuidora");
                    pt.getDistributionCenter().getFechaLlegada().setAnio(in.nextInt());
                    System.out.println("Indique dia de Salida de la distribuidora");
                    pt.getDistributionCenter().getFechaSalida().setDia(in.nextInt());
                    System.out.println("Indique mes de Salida de la distribuidora");
                    pt.getDistributionCenter().getFechaSalida().setMes(in.nextInt());
                    System.out.println("Indique anio de Salida de la distribuidora");
                    pt.getDistributionCenter().getFechaSalida().setAnio(in.nextInt());
                    System.out.println("Indique latitud de la distribuidora");
                    pt.getDistributionCenter().getUbicacion().setLatitud(in.nextInt());
                    System.out.println("Indique longitud de la distribuidora");
                    pt.getDistributionCenter().getUbicacion().setLongitud(in.nextInt());
                    
                    System.out.println("Indique nombre de la Tienda: ");
                    pt.getRetail().setNombre(in.next());
                    System.out.println("Indique dia de llegada a la tienda");
                    pt.getRetail().getFechaLlegada().setDia(in.nextInt());
                    System.out.println("Indique mes de llegada a la tienda");
                    pt.getRetail().getFechaLlegada().setMes(in.nextInt());
                    System.out.println("Indique anio de llegada a la tienda");
                    pt.getRetail().getFechaLlegada().setAnio(in.nextInt());
                    System.out.println("Indique dia de Salida de la tienda");
                    pt.getRetail().getFechaSalida().setDia(in.nextInt());
                    System.out.println("Indique mes de Salida de la tienda");
                    pt.getRetail().getFechaSalida().setMes(in.nextInt());
                    System.out.println("Indique anio de Salida de la tienda");
                    pt.getRetail().getFechaSalida().setAnio(in.nextInt());
                    System.out.println("Indique latitud de la tienda");
                    pt.getRetail().getUbicacion().setLatitud(in.nextFloat());
                    System.out.println("Indique longitud de la tienda");
                    pt.getRetail().getUbicacion().setLongitud(in.nextFloat());
                    System.out.println("Indique código venta");
                    pt.setCodVenta(in.nextInt());
                    System.out.println("Indique precio del producto");
                    pt.setPrecio(in.nextFloat());
                    System.out.println("Indique número de lote");
                    pt.setLote(in.nextInt());
                    GuardarArchivoProductos(pt);
                break;
            }
        } while (opcion!=4);
        
    }
    
    public static boolean GuardarArchivoProductos(ProductoTerminado productoTerminado) throws FileNotFoundException, IOException{
        ArrayList<ProductoTerminado> carga= new ArrayList<>();
        File file = new File("PersistenciaProductos.txt");
        if(!file.exists()){
            file.createNewFile();
        }else{
            carga = CargarArchivoProductos();
        }
        carga.add(productoTerminado);
        PrintStream out = new PrintStream(file);
        for(ProductoTerminado p : carga){
            EscribirDato(out, "Nombre");
            EscribirDato(out, p.getNombre());
            EscribirDato(out, "Manufacturera");
            EscribirDato(out, p.getManufacturer().getNombre());
            EscribirDato(out, "Fecha");
            EscribirDato(out, p.getManufacturer().getFechaLlegada().getDia()+"");
            EscribirDato(out, p.getManufacturer().getFechaLlegada().getMes()+"");
            EscribirDato(out, p.getManufacturer().getFechaLlegada().getAnio()+"");
            EscribirDato(out, p.getManufacturer().getFechaSalida().getDia()+"");
            EscribirDato(out, p.getManufacturer().getFechaSalida().getMes()+"");
            EscribirDato(out, p.getManufacturer().getFechaSalida().getAnio()+"");
            EscribirDato(out, "Ubicacion");
            EscribirDato(out, p.getManufacturer().getUbicacion().getLatitud()+"");
            EscribirDato(out, p.getManufacturer().getUbicacion().getLongitud()+"");
            EscribirDato(out, "MateriasPrimas");
            for(MateriaPrima p1 : p.getMateriasPrimas()){
                EscribirDato(out, p1.getNombre());
                EscribirDato(out, p1.getGranja().getNombre());
            }
            EscribirDato(out, "Retail");
            EscribirDato(out, p.getRetail().getNombre());
            EscribirDato(out, "Fecha");
            EscribirDato(out, p.getRetail().getFechaLlegada().getDia()+"");
            EscribirDato(out, p.getRetail().getFechaLlegada().getMes()+"");
            EscribirDato(out, p.getRetail().getFechaLlegada().getAnio()+"");
            EscribirDato(out, p.getRetail().getFechaSalida().getDia()+"");
            EscribirDato(out, p.getRetail().getFechaSalida().getMes()+"");
            EscribirDato(out, p.getRetail().getFechaSalida().getAnio()+"");
            EscribirDato(out, "Ubicacion");
            EscribirDato(out, p.getRetail().getUbicacion().getLatitud()+"");
            EscribirDato(out, p.getRetail().getUbicacion().getLongitud()+"");
            EscribirDato(out, "Distribution");
            EscribirDato(out, p.getDistributionCenter().getNombre());
            EscribirDato(out, "Fecha");
            EscribirDato(out, p.getDistributionCenter().getFechaLlegada().getDia()+"");
            EscribirDato(out, p.getDistributionCenter().getFechaLlegada().getMes()+"");
            EscribirDato(out, p.getDistributionCenter().getFechaLlegada().getAnio()+"");
            EscribirDato(out, p.getDistributionCenter().getFechaSalida().getDia()+"");
            EscribirDato(out, p.getDistributionCenter().getFechaSalida().getMes()+"");
            EscribirDato(out, p.getDistributionCenter().getFechaSalida().getAnio()+"");
            EscribirDato(out, "Ubicacion");
            EscribirDato(out, p.getDistributionCenter().getUbicacion().getLatitud()+"");
            EscribirDato(out, p.getDistributionCenter().getUbicacion().getLongitud()+"");
            EscribirDato(out, "Codigo");
            EscribirDato(out, p.getCodVenta()+"");
            EscribirDato(out, "Precio");
            EscribirDato(out, p.getPrecio()+"");
            EscribirDato(out, "Lote");
            EscribirDato(out, p.getLote()+"");
            out.println();
        }
        out.flush();
        out.close();
        return true;
    }
    
    public static ArrayList<ProductoTerminado> CargarArchivoProductos() throws FileNotFoundException{
        File file = new File("PersistenciaProductos.txt");
        String s = null;
        ProductoTerminado p = null;
        if(file.exists()){
            ArrayList<ProductoTerminado> carga = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                p = new ProductoTerminado();
                s = scanner.next();
                if(s.equals("Nombre")){
                    s = scanner.next();
                    p.setNombre(s);
                }
                s = scanner.next();
                if(s.equals("Manufacturera")){
                    p.getManufacturer().setNombre(scanner.next());
                }
                s = scanner.next();
                if(s.equals("Fecha")){
                    p.getManufacturer().setFechaLlegada(new Fecha(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                    p.getManufacturer().setFechaSalida(new Fecha(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                }
                s = scanner.next();
                if(s.equals("Ubicacion")){
                    p.getManufacturer().setUbicacion(new Ubicacion(Float.parseFloat(scanner.next()), Float.parseFloat(scanner.next())));
                }
                s = scanner.next();
                if(s.equals("MateriasPrimas")){
                    s = scanner.next();
                    while(!s.equals("Retail")){
                        MateriaPrima p1 = new MateriaPrima();
                        p1.setNombre(s);
                        s = scanner.next();
                        p1.getGranja().setNombre(s);
                        s = scanner.next();
                        p.addMateriaPrima(p1);
                    }
                }
                if(s.equals("Retail")){
                    p.getRetail().setNombre(scanner.next());
                }
                s = scanner.next();
                if(s.equals("Fecha")){
                    p.getRetail().setFechaLlegada(new Fecha(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                    p.getRetail().setFechaSalida(new Fecha(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                }
                s = scanner.next();
                if(s.equals("Ubicacion")){
                    p.getRetail().setUbicacion(new Ubicacion(Float.parseFloat(scanner.next()), Float.parseFloat(scanner.next())));
                }
                s = scanner.next();
                if(s.equals("Distribution")){
                    p.getDistributionCenter().setNombre(scanner.next());
                }
                s = scanner.next();
                if(s.equals("Fecha")){
                    p.getDistributionCenter().setFechaLlegada(new Fecha(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                    p.getDistributionCenter().setFechaSalida(new Fecha(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                }
                s = scanner.next();
                if(s.equals("Ubicacion")){
                    p.getDistributionCenter().setUbicacion(new Ubicacion(Float.parseFloat(scanner.next()), Float.parseFloat(scanner.next())));
                }
                s = scanner.next();
                if(s.equals("Codigo")){
                    p.setCodVenta(Integer.parseInt(scanner.next()));
                }
                s = scanner.next();
                if(s.equals("Precio")){
                    p.setPrecio(Float.parseFloat(scanner.next()));
                }
                s = scanner.next();
                if(s.equals("Lote")){
                    p.setLote(scanner.nextInt());
                }
                carga.add(p);
            }
            return carga;
        }else{
            return null;
        }
    }
    
    public static void EscribirDato(PrintStream out, String dato){
        if(dato!=null){
            out.print(dato+" ");
        }else{
            out.print("null ");
        }
    }

    private static void MostrarTraza(ArrayList<ProductoTerminado> productos, int i) {
        System.out.println("Nombre: " + productos.get(i).getNombre());
        System.out.println("Codigo: " + productos.get(i).getCodVenta());
        System.out.println("Precio: " + productos.get(i).getPrecio());
        System.out.println("Lote: " + productos.get(i).getLote());
        System.out.println("Materias Primas: ");
        for(MateriaPrima mp :productos.get(i).getMateriasPrimas()){
            System.out.println("\t"+mp.getNombre()+". Producido en: "+mp.getGranja().getNombre());
        }
        System.out.println("Manufacturera: "+productos.get(i).getManufacturer().getNombre());
        System.out.println("\tFecha Llegada: "+productos.get(i).getManufacturer().getFechaLlegada().getDia()+"/"+productos.get(i).getManufacturer().getFechaLlegada().getMes()+"/"+productos.get(i).getManufacturer().getFechaLlegada().getAnio());
        System.out.println("\tFecha Salida: "+productos.get(i).getManufacturer().getFechaSalida().getDia()+"/"+productos.get(i).getManufacturer().getFechaSalida().getMes()+"/"+productos.get(i).getManufacturer().getFechaSalida().getAnio());
        System.out.println("\tUbicacion: "+productos.get(i).getManufacturer().getUbicacion().getLatitud()+"  "+productos.get(i).getManufacturer().getUbicacion().getLongitud());
        System.out.println("Distribuidora: "+productos.get(i).getDistributionCenter().getNombre());
        System.out.println("\tFecha Llegada: "+productos.get(i).getDistributionCenter().getFechaLlegada().getDia()+"/"+productos.get(i).getDistributionCenter().getFechaLlegada().getMes()+"/"+productos.get(i).getDistributionCenter().getFechaLlegada().getAnio());
        System.out.println("\tFecha Salida: "+productos.get(i).getDistributionCenter().getFechaSalida().getDia()+"/"+productos.get(i).getDistributionCenter().getFechaSalida().getMes()+"/"+productos.get(i).getDistributionCenter().getFechaSalida().getAnio());
        System.out.println("\tUbicacion: "+productos.get(i).getDistributionCenter().getUbicacion().getLatitud()+"  "+productos.get(i).getDistributionCenter().getUbicacion().getLongitud());
        System.out.println("Tienda: "+productos.get(i).getRetail().getNombre());
        System.out.println("\tFecha Llegada: "+productos.get(i).getRetail().getFechaLlegada().getDia()+"/"+productos.get(i).getRetail().getFechaLlegada().getMes()+"/"+productos.get(i).getRetail().getFechaLlegada().getAnio());
        System.out.println("\tFecha Salida: "+productos.get(i).getRetail().getFechaSalida().getDia()+"/"+productos.get(i).getRetail().getFechaSalida().getMes()+"/"+productos.get(i).getRetail().getFechaSalida().getAnio());
        System.out.println("\tUbicacion: "+productos.get(i).getRetail().getUbicacion().getLatitud()+"  "+productos.get(i).getRetail().getUbicacion().getLongitud());
        System.out.println("");
        
    }
    
}
