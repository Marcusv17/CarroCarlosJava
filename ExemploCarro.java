package com.mycompany.exemplocarro;



public class ExemploCarro {

     public static void main(String[] args) {
        Carro umCarro = new Carro();
         umCarro.modelo = "Gol";
         umCarro.cor = "Preto";
         umCarro.motor = "1.0";
         
         umCarro.ligar();
         umCarro.mudarMarcha();
         umCarro.acelerar();
         umCarro.brecar();
        umCarro.desligar();
        
        System.out.println("O modelo do carro é um: " + umCarro.modelo + ".");      
        System.out.println("A cor do carro é : " + umCarro.cor + "."); 
        System.out.println("O motor do carro é : " + umCarro.motor + "."); 
        
        umCarro = null;
        
        
       
    }
}
