/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author mikev_6wadxan
 */
public class Main {
     
   

    public static void main(String[] args) {
       System.out.println("Bienvenido al Almacen musical,usted se encuentra en la casa central.");
        System.out.println("A continuacion va a ver el catalogo actual ");
       Casacentral c1=new Casacentral("cds",1,2,3,4);
       
       Casacentral pro1=new  Casacentral("CD salsa",500000,123,5,50);
                Casacentral pro2=new  Casacentral("CDS merengue",800000,456,2,60);
                         Casacentral pro3=new  Casacentral("CDS regueaton",700000,789,3,50);
                                 Casacentral pro4=new  Casacentral("CDS pop",600000,159,7,45);
                                         Casacentral pro5=new  Casacentral("CDS rock",100000,753,1,50);

           System.out.print("1."); 
           pro1.mostrarProducto();
                      System.out.print("2."); 
           pro2.mostrarProducto();
                      System.out.print("3."); 
           pro3.mostrarProducto();
                      System.out.print("4."); 
           pro4.mostrarProducto();
                      System.out.print("5."); 
           pro5.mostrarProducto();
           
           System.out.println("");
           
            Scanner sc=new Scanner(System.in);
               System.out.println("Por favor escriba 1 si quiere actualizar un nuevo catalogo y enviarlo a las sucursales  ");
                   System.out.println("Por favor escriba 2 si quiere enviar pedidos del catalogo existente a las sucursales  ");
                   
           int valor=sc.nextInt();
           
           if (valor==1){
               System.out.println("Nuevo catalogo"); 
                  Casacentral nuevopro1=new  Casacentral("CD Hip-Hop",450000,124,5,50);
                Casacentral nuevopro2=new  Casacentral("CDS regue",850000,458,2,60);
                         Casacentral nuevopro3=new  Casacentral("CDS tecno ",250000,780,3,50);
                                 Casacentral nuevopro4=new  Casacentral("CDS banda",900000,150,7,45);
                                         Casacentral nuevopro5=new  Casacentral("CDS cumbia",150000,756,1,50);

           System.out.print("1."); 
           nuevopro1.mostrarProducto();
                      System.out.print("2."); 
           nuevopro2.mostrarProducto();
                      System.out.print("3."); 
           nuevopro3.mostrarProducto();
                      System.out.print("4."); 
           nuevopro4.mostrarProducto();
                      System.out.print("5."); 
           nuevopro5.mostrarProducto();
           
           System.out.println("");
           
                                                 System.out.println("A continuacion va a conocer los tipos de pedido:  ");
                                                 
                                                 Casacentral tomapedido=new Casacentral("Productos del nuevo catalogo",0,0,0,0);
                                                 tomapedido.mostrarTipoPedido();
                                                 
                                                  System.out.println("Por favor elija el tipo de producto");
                                                  int producto=sc.nextInt();
                                                       System.out.println("Por favor elija el tipo de envio");
                                                  int envio=sc.nextInt();
                                                       System.out.println("Por favor elija el tipo de transporte");
                                                  int transporte=sc.nextInt();
                                                  
                                                  
                                                  if(producto==1 && envio==3 && transporte==5){
                                                     System.out.println("Usted elijio:");
                                                     tomapedido.productoPesado();
                                                     tomapedido.envioEstandar();
                                                     tomapedido.transporteAereo();
                                                    
                                                  }
                                                  else {
                                                    System.out.println("Usted elijio:");
                                                     tomapedido.productoLigero();
                                                     tomapedido.envioRapido();
                                                     tomapedido.transporteCarretera();
                                                  }
                                                  System.out.println("El catalogo actual llego a la sucursal y recibio la siguiente informacion");
                                                  Sucursal llegadapedidos1=new Sucursal();
                                                  llegadapedidos1.catalogo();
                                                  
                                                  
           
           }
           
           if(valor==2){
            System.out.println("Por favor elija el tipo de producto");
            
            Casacentral tomapedido2=new Casacentral("Productos catalogo actual",0,0,0,0);
              System.out.println("A continuacion va a conocer los tipos de pedido:  ");
              tomapedido2.mostrarTipoPedido();
                                                  int producto=sc.nextInt();
                                                       System.out.println("Por favor elija el tipo de envio");
                                                  int envio=sc.nextInt();
                                                       System.out.println("Por favor elija el tipo de transporte");
                                                  int transporte=sc.nextInt();
                                                  
                                                  
                                                  if(producto==1 && envio==3 && transporte==5){
                                                     System.out.println("Usted elijio:");
                                                     tomapedido2.productoPesado();
                                                     tomapedido2.envioEstandar();
                                                     tomapedido2.transporteAereo();
                                                    
                                                  }
                                                  else {
                                                    System.out.println("Usted elijio:");
                                                     tomapedido2.productoLigero();
                                                     tomapedido2.envioRapido();
                                                     tomapedido2.transporteCarretera();
                                                  }
                                                  
                                                   System.out.println("");
                                                  
                                                  System.out.println("El nuevo catalogo llego a la sucursal y recibio la siguiente informacion");
                                                  
                                                  Sucursal llegadapedidos2=new Sucursal();
                                                  llegadapedidos2.nuevoCatalogo();
                                                              
           
           }
           
           
   
       
    

    }
 
}
