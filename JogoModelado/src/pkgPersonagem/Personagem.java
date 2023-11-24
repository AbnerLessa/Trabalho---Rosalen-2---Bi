/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgPersonagem;
import pkgArma.*;
public  abstract class Personagem implements Iarma {
    Arma arma;
    public Personagem() {
        
    }
    
    public Personagem(Arma arma) {
        this.arma = arma;
    }
    public abstract int getVida();
    public abstract String getInfo();
    public abstract String desenhar();
    public abstract String falar();
    public abstract void setVida();
    public void arma(){
      arma.getArma();
    }
    
    public void setArma(Arma arma){
      this.arma = arma;
    }
    
  public static String correr(){
       return "Você Correu!!";
    }  
  
}

 


