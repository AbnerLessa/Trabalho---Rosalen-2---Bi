/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgPersonagem;

/**
 *
 * @author abner
 */
public class Mago extends Personagem implements Ipers {
   public String nome;
    int vida;
    public Mago(String nome) {
        this.nome = nome;
        this.vida = vida;
    }
   
    @Override
    public void setVida() {
        this.vida = (int)Math.floor(Math.random() * (30 - 15 + 1) + 15);
    }
    @Override
    public String falar() {
        return " não acredito que tenha me seguido até aqui, irá pagar por essa perseguição";
    }
    
    @Override
    public String getInfo() {
        return this.nome + " tem " + this.vida + " vida(s)!";
    }

    @Override
    public String desenhar() {
        return "                                     \\\n" +
"                                               *\n" +
"             / \\\n" +
"            /___\\\n" +
"           ( o o )            * *\n" +
"           )  L  (           /   * *\n" +
"   ________()(-)()________  /     * * *\n" +
" E\\| _____ )()()() ______ |/B     * * *\n" +
"   |/      ()()()(       \\|      * * * *\n" +
"           | )() |\n" +
"           /     \\\n" +
"          / *  *  \\\n" +
"         /   *  *  \\\n" +
"        / *_  *  _  \\ ";
    }

    @Override
    public String getArma() {
        return this.arma.getArma();
    }
    
    @Override
    public int getVida(){
        return this.vida;
    }
    
    
}

