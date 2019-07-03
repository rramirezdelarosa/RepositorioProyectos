package Clases;

import java.util.ArrayList;
import java.util.List;

public class Total {
    private double igv;
    private double subtotal;
    private double total;
    private List<Detalle> detalle = new ArrayList<Detalle>();
    private Datos datos = new Datos();
    
    public void calcular(){
        
        if(detalle != null || detalle.size() > 0){
            double total = 0;
            for (Detalle item : detalle) {
                total += item.getTotal();
            }
            this.setTotal(total);
            this.setIgv(this.total * 0.18);
            this.setSubtotal(this.total - this.igv);
        }        
    }
    
    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Detalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<Detalle> detalle) {
        this.detalle = detalle;
    }   
    
    public Datos getDatos() {
        return this.datos;
    }

    public void setDatos(Datos datos) {
        this.datos = datos;
    }
    
}
