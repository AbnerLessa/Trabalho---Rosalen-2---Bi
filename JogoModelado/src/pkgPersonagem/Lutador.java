/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgPersonagem;

/**
 *
 * @author abner
 */
public class Lutador extends Personagem implements Ipers {
    
    public String nome;
    int vida;

    public Lutador(String nome) {
        this.nome = nome;
        this.vida = vida;
    }
    
    @Override 
    public String getInfo(){
        return this.nome + " tem " + this.vida + " vida(s)!";
    }
    @Override
    public int getVida(){
        return this.vida;
    }
    
    
    
    @Override
    public void setVida(){
        this.vida  = (int)Math.floor(Math.random() * (30 - 15 + 1) + 15);
    }
    
    @Override
    public String falar(){
        return " não acredito que tenha me seguido até aqui, irá pagar por essa perseguição";
    }
    
    @Override
    public String desenhar(){
        return " `                                 =-  -::  -=                           \n" +
"                                          -:-::::-::-::-+                       \n" +
"              @              *** ++++++=**:::::::::::::+                        \n" +
"              @##         *+++*+++=+++#+::::::::::::::::::-                     \n" +
"               *%@      *++=+++++====+##+::::::::.::::::-#%                     \n" +
"               @%%@     +==+++=*+==++++-::::::::::::::-==-+##                   \n" +
"                %%@@  =-+==++==*++=+*=#++**+++==----=+*+*#####%                 \n" +
"                @@@#--:-+=++*+++**++*+*#%##---=++===*#%%#=#####%                \n" +
"                  -::-=++****####%#++**%%%#---+++:.:=%%%*.######                \n" +
"                  -:-++++######      *##++#+==++=-:=*#**-:######%               \n" +
"                  +++*++         @@@  +*+-:=+++=++=*+-:+:+######++=+++++++*     \n" +
"                    %%%        @@@@%++**==:::::::::::--==#*#+##%+========+++*   \n" +
"                     %%    @@@@@@@+#****+=--:::--::---=+=--+#%%++===========++  \n" +
"                         @@@@@@%@*=***#**===-=.....+-+*+=--*#*+++======+++===+  \n" +
"                      +++%@@%*+*@*=****#**++++-::--*#%%*+==**+=++=++++**+====+  \n" +
"                *+++++++++#+*=++@#=+****#***##**###%##*+======+***+==*+++===+#  \n" +
"              +++**++====++**++=%@+=*****#**#*#*#**+++++++===+***#+*==++===+#   \n" +
"            *+==+++=====+*****+=+@@+=*******##**#***++=====++#**#*+++*++++++*   \n" +
"           +=====+======+******++=%@*=+****#####*+=========+##**#*++======++    \n" +
"           +=====+======+**######*+*@%          +=++++++===+ #**#*=======+*     \n" +
"         %%+=====+++++++***####                *+++++++++++* #**#*======+*      \n" +
"       %#%*++=++******####                    *++=======+++# @%###**++++        \n" +
"     %###%%**#*******####                     +==========+*  %%%%%%@            \n" +
"    %####%%%@ #######                         +++++++++++*% @%%%%%%             \n" +
"   %####%#%                                  ***=++++*#**#  @%%%###%            \n" +
" %*===+*#%                                    *-::-+**###   %+-::--+%           \n" +
" %#++++=+                                    =:::::###      @#+*****%           \n" +
"  %%%%%%                                   +-::::::-+         %%%%%%            \n" +
"                                         +---::-:-:---                          \n" +
"                                            #:- ----+-+                         \n" +
"                                             -+ == =";
    }
    
    @Override
    public String getArma() {
        return this.arma.getArma();
    }
}
