/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author Administrador
 */
public class Cafetera {
    private int cantidad_maxima;
    private int cantidad_actual;
    
    public Cafetera (int cantidad_maxima,int cantidad_actual){
        this.cantidad_actual = cantidad_actual;
        this.cantidad_maxima = cantidad_maxima;
        
    }

    public Cafetera() {
        this.cantidad_actual = 0;
        this.cantidad_maxima = 100;
    }
    
    public Cafetera(double cantidad_maxima,double cantidad_actual){
        cantidad_maxima = this.getCantidad_maxima();
        cantidad_actual = this.getCantidad_actual();
        
        if(cantidad_actual > cantidad_maxima){
            cantidad_actual = this.getCantidad_maxima();
        }else{
            cantidad_actual = cantidad_maxima;
        }
        
    }

    public int getCantidad_maxima() {
        return cantidad_maxima;
    }

    public void setCantidad_maxima(int cantidad_maxima) {
        this.cantidad_maxima = cantidad_maxima;
    }

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    
    }
    
    public void llenar(int cantidad_actual){
        int aux;
        
        aux=this.getCantidad_maxima();
        cantidad_actual=aux;
        
        this.setCantidad_actual(cantidad_actual);
        
    }
    
    public void vaciar(){
        
    this.setCantidad_actual(0);
    }
    
    public void Añadir(int Añadir_cafe){
        int aux;
        
        aux=this.getCantidad_actual()+Añadir_cafe;
        this.setCantidad_actual(aux);
        
    }
    public String Mostrar(){
        String aux;
        
        aux="Capacidad Actual de la cafetera: "+this.getCantidad_actual()+"\n"
            + "Capacidad maxima de la cafetera: "+this.getCantidad_maxima();
                
        return aux;
    }
    public void Servir_cafe(int serv){
        int aux;
    }
    
}
