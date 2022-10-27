/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author mikev_6wadxan
 */
public interface tipo_de_pedidos {
    
    
//tipo transporte 
    public void transporteCarretera();
    public void transporteAereo();
  
    
    //tipo entrega
    
    public void envioRapido();
    public void envioEstandar();
    
    //tipo contenido
    public void productoLigero();
    public void productoPesado();
    
}

