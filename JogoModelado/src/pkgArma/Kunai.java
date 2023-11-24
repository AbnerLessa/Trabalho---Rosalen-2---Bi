/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgArma;

/**
 *
 * @author abner
 */
public class Kunai extends Arma{ 
    String nome;

    public Kunai(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getArma(){
        return "Kunai";
    }   
}
