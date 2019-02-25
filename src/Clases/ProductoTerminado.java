
package Clases;

import java.util.ArrayList;

public class ProductoTerminado {
    private float precio;
    private int lote;
    private int codVenta;
    private ArrayList<MateriaPrima> materiasPrimas;
    private Manufacturer manufacturer;
    private DistributionCenter distributionCenter;
    private Retail retail;

    public ProductoTerminado(int lote, ArrayList<MateriaPrima> materiasPrimas, Manufacturer manufacturer, DistributionCenter distributionCenter) {
        this.lote = lote;
        this.materiasPrimas = materiasPrimas;
        this.manufacturer = manufacturer;
        this.distributionCenter = distributionCenter;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public ArrayList<MateriaPrima> getMateriasPrimas() {
        return materiasPrimas;
    }

    public void setMateriasPrimas(ArrayList<MateriaPrima> materiasPrimas) {
        this.materiasPrimas = materiasPrimas;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public DistributionCenter getDistributionCenter() {
        return distributionCenter;
    }

    public void setDistributionCenter(DistributionCenter distributionCenter) {
        this.distributionCenter = distributionCenter;
    }

    public Retail getRetail() {
        return retail;
    }

    public void setRetail(Retail retail) {
        this.retail = retail;
    }
    
    
}
