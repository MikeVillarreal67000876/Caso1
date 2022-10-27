/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author mikev_6wadxan
 */
public class Sucursal  {




    

    public void catalogo() {
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


    }
    public void nuevoCatalogo(){
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
           
    
    
    
    }



  
    
    
    
}
