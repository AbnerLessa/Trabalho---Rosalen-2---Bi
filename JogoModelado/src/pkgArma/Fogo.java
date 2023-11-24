/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgArma;

/**
 *
 * @author abner
 */
public class Fogo extends Arma{
    String nome;
    
    public Fogo(String nome){
        this.nome = nome;
    }      
    @Override
    public String getArma(){
        return "Fogo";
    } 
}
