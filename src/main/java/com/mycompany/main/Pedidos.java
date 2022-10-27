/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;


public class Pedidos implements tipo_de_pedidos {
    private String articulo;
    private int codigo;
    private int cantidad_pro;
    private int precio;
    private int peso;

    public Pedidos(int codigo, int cantidad_pro, int precio, int peso,String artiuclo)
   {
       this.articulo=articulo;
        this.codigo = codigo;
        this.cantidad_pro = cantidad_pro;
        this.precio = precio;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "codigo=" + codigo + ", cantidad_pro=" + cantidad_pro + ", precio=" + precio + ", peso=" + peso + '}';
    }
    

    public int getCodigo() {
                System.out.print("*Codigo: " + codigo+"  ");
        System.out.println("  ");
        return codigo;
    }

    public int getCantidad_pro() {
                      System.out.print("*cantidad: " + cantidad_pro+"  ");
               System.out.println("  ");
        return cantidad_pro;
    }

    public int getPrecio() {
                      System.out.print("*Precio: " + precio+"  ");
               System.out.println("  ");
        return precio;
    }

    public int getPeso() {
                      System.out.print("*Peso: " + peso+"  ");
               System.out.println("  ");
        return peso;
    }

    public String getArticulo() {
                System.out.print("-Articulo: " + articulo+"  ");
               System.out.println("  ");
        return articulo;
    }
    
    /**
     *
     */
    @Override
    public void transporteCarretera() {
        System.out.println("transporte carretera");
    }

    @Override
    public void transporteAereo() {
      System.out.println("transporte aereo");   
    }

    @Override
    public void envioRapido() {
         System.out.println("envio rapido");
    }

    @Override
    public void envioEstandar() {
        System.out.println("envio estandar");
    }

    @Override
    public void productoLigero() {
         System.out.println("Producto ligero");
    }

    @Override
    public void productoPesado() {
       System.out.println("Producto pesado");
    }
    public void mostrarTipoPedido(){
            System.out.print("1.");
    productoPesado();
     System.out.print("2.");
    productoLigero();
     System.out.println("--------------------------------");
     System.out.print("3.");
    envioEstandar();
     System.out.print("4.");
    envioRapido();
     System.out.println("--------------------------------");
     System.out.print("5.");
    transporteAereo();
     System.out.print("6.");
    transporteCarretera();
    }
    
    
    
    
    
    


    }

   

   

 


    
 
