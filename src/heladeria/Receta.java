/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heladeria;



public class Receta {
    private String tipo;
    private String nombre_plato;
    private String nombre_cliente;
    private String tipo_pedido;
    private String obs;
    private int numero;
    private String ci;
   

    public Receta(String tipo, String nombre_plato, String nombre_cliente, String tipo_pedido, String obs,int numero,String ci) {
        this.tipo = tipo;
        this.nombre_plato = nombre_plato;
        this.nombre_cliente = nombre_cliente;
        this.tipo_pedido = tipo_pedido;
        this.obs = obs;
        this.numero = numero;
        this.ci = ci;
        
    }

    public Receta(String tipo, String nombre_plato, String nombre_cliente, String tipo_pedido, String obs,String ci) {
        this.tipo = tipo;
        this.nombre_plato = nombre_plato;
        this.nombre_cliente = nombre_cliente;
        this.tipo_pedido = tipo_pedido;
        this.obs = obs;
        this.ci = ci;
        this.numero = 0;
        
    }

    public Receta(String tipo, String nombre_plato) {
        this.tipo = tipo;
        
        this.nombre_plato = nombre_plato;
        this.numero = 0;
        this.nombre_cliente = "";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    public String getnombre_plato() {
        return nombre_plato;
    }

    public void setnombre_plato(String nombre_plato) {
        this.nombre_plato = nombre_plato;
    }

    public String getnombre_cliente() {
        return nombre_cliente;
    }

    public void setnombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getnumero() {
        return numero;
    }

    public void setporciones(int numero) {
        this.numero = numero;
    }
    public String getci() {
        return ci;
    }

    public void setci(String ci) {
        this.ci = ci;
    }
    public String getobs() {
        return obs;
    }

    public void setobs(String obs) {
        this.obs = obs;
    }
    
}
