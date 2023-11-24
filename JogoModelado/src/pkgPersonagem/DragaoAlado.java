/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgPersonagem;

/**
 *
 * @author abner
 */
public class DragaoAlado extends Personagem implements Ipers {
    
    public String nome;
    int vida;
    

    public DragaoAlado(String nome) {
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
        return "RAAAAAHHHHHHHHHHHHH!!!(O DRAGÃO RUGIU).";
    }
    
    @Override
    public String desenhar(){
        return "                 _\n" +
"                            ==(W{==========-      /===-\n" +
"                              ||  (.--.)         /===-_---~~~~~~~~~------____\n" +
"                              | \\_,|**|,__      |===-~___                _,-'`\n" +
"                 -==\\\\        `\\ ' `--'   ),    `//~\\\\   ~~~~`---.___.-~~\n" +
"             ______-==|        /`\\_. .__/\\ \\    | |  \\\\           _-~`\n" +
"       __--~~~  ,-/-==\\\\      (   | .  |~~~~|   | |   `\\        ,'\n" +
"    _-~       /'    |  \\\\     )__/==0==-\\<>/   / /      \\      /\n" +
"  .'        /       |   \\\\      /~\\___/~~\\/  /' /        \\   /'\n" +
" /  ____  /         |    \\`\\.__/-~~   \\  |_/'  /          \\/'\n" +
"/-'~    ~~~~~---__  |     ~-/~         ( )   /'        _--~`\n" +
"                  \\_|      /        _) | ;  ),   __--~~\n" +
"                    '~~--_/      _-~/- |/ \\   '-~ \\\n" +
"                   {\\__--_/}    / \\\\_>-|)<__\\      \\\n" +
"                   /'   (_/  _-~  | |__>--<__|      |\n" +
"                  |   _/) )-~     | |__>--<__|      |\n" +
"                  / /~ ,_/       / /__>---<__/      |\n" +
"                 o-o _//        /-~_>---<__-~      /\n" +
"                 (^(~          /~_>---<__-      _-~\n" +
"                ,/|           /__>--<__/     _-~\n" +
"             ,//('(          |__>--<__|     /                  .----_\n" +
"            ( ( '))          |__>--<__|    |                 /' _---_~\\\n" +
"         `-)) )) (           |__>--<__|    |                /'  /     ~\\`\\\n" +
"        ,/,'//( (             \\__>--<__\\    \\            /'  //        ||\n" +
"      ,( ( ((, ))              ~-__>--<_~-_  ~--____---~' _/'/        /'\n" +
"    `~/  )` ) ,/|                 ~-_~>--<_/-__       __-~ _/\n" +
"  ._-~//( )/ )) `                    ~~-'_/_/ /~~~~~~~__--~\n" +
"   ;'( ')/ ,)(                              ~~~~~~~~~~\n" +
"  ' ') '( (/\n" +
"    '   '  `";
}

    @Override
    public String getArma() {
        return this.arma.getArma();
    }
   
        }
    


    
    

    

