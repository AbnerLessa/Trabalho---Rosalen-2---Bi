/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgPersonagem;

/**
 *
 * @author abner
 */
public class General extends Personagem implements Ipers{
   String nome;
    int vida;
    
    public General(String nome) {
        this.nome = nome;
        this.vida = vida;     
    }
    
    @Override
    public void setVida(){
        this.vida  = (int)Math.floor(Math.random() * (30 - 15 + 1) + 15);
    }
    
    public void setName(String x){
        this.nome = x;
    }

    @Override
    public String getInfo() {
        return this.nome + " tem " + this.vida + " vida(s)!";
    }

    @Override
    public String desenhar() {
        return "                         __.--|~|--.__                               ,,;/;\n" +
"                         /~     | |    ;~\\                          ,;;;/;;'\n" +
"                        /|      | |    ;~\\\\                      ,;;;;/;;;'\n" +
"                       |/|      \\_/   ;;;|\\                    ,;;;;/;;;;'\n" +
"                       |/ \\          ;;;/  )                 ,;;;;/;;;;;'\n" +
"                   ___ | ______     ;_____ |___....__      ,;;;;/;;;;;'\n" +
"             ___.-~ \\\\(| \\  \\.\\ \\__/ /./ /:|)~   ~   \\   ,;;;;/;;;;;'\n" +
"         /~~~    ~\\    |  ~-.     |   .-~: |//  _.-~~--,;;;;/;;;;;'\n" +
"        (.-~___     \\.'|    | /-.__.-\\|::::| //~     ,;;;;/;;;;;'\n" +
"        /      ~~--._ \\|   /          `\\:: |/      ,;;;;/;;;;;'\n" +
"     .-|             ~~|   |  /V\"\"\"\"V\\ |:  |     ,;;;;/;;;;;' \\\n" +
"    /                   \\  |  ~`^~~^'~ |  /    ,;;;;/;;;;;'    ;\n" +
"   (        \\             \\|`\\._____./'|/    ,;;;;/;;;;;'      '\\\n" +
"  / \\        \\                             ,;;;;/;;;;;'     /    |\n" +
" |            |                          ,;;;;/;;;;;'      |     |\n" +
"|`-._          |                       ,;;;;/;;;;;'              \\\n" +
"|             /                      ,;;;;/;;;;;'  \\              \\__________\n" +
"(             )                 |  ,;;;;/;;;;;'      |        _.--~\n" +
" \\          \\/ \\              ,  ;;;;;/;;;;;'       /(     .-~_..--~~~~~~~~~~\n" +
" \\__         '  `       ,     ,;;;;;/;;;;;'    .   /  \\   / /~\n" +
" /          \\'  |`._______ ,;;;;;;/;;;;;;'    /   :    \\/'/'       /|_/|   ``|\n" +
"| _.-~~~~-._ |   \\ __   .,;;;;;;/;;;;;;' ~~~~'   .'    | |       /~ (/\\/    ||\n" +
"/~ _.-~~~-._\\    /~/   ;;;;;;;/;;;;;;;'          |    | |       / ~/_-'|-   /|\n" +
"(/~         \\| /' |   ;;;;;;/;;;;;;;;            ;   | |       (.-~;  /-   / |\n" +
"|            /___ `-,;;;;;/;;;;;;;;'            |   | |      ,/)  /  /-   /  |\n" +
" \\            \\  `-.`---/;;;;;;;;;' |          _'   |T|    /'('  /  /|- _/  //\n" +
"   \\           /~~/ `-. |;;;;;''    ______.--~~ ~\\  |u|  ,~)')  /   | \\~-==//\n" +
"     \\      /~(   `-\\  `-.`-;   /|    ))   __-####\\ |a|   (,   /|    |  \\\n" +
"       \\  /~.  `-.   `-.( `-.`~~ /##############'~~)| |   '   / |    |   ~\\\n" +
"        \\(   \\    `-._ /~)_/|  /############'       |X|      /  \\     \\_\\  `\\\n" +
"        ,~`\\  `-._  / )#####|/############'   /     |i|  _--~ _/ | .-~~____--'\n" +
"       ,'\\  `-._  ~)~~ `################'           |o| ((~>/~   \\ (((' -_\n" +
"     ,'   `-.___)~~      `#############             |n|           ~-_     ~\\_\n" +
" _.,'        ,'           `###########              |g|            _-~-__    (\n" +
"|  `-.     ,'              `#########       \\       | |          ((.-~~~-~_--~\n" +
"`\\    `-.;'                  `#####\"                | |           \"     ((.-~~\n" +
"  `-._   )               \\     |   |        .       |  \\                 \"\n" +
"      `~~  _/                  |    \\               |   `---------------------\n" +
"        |/~                `.  |     \\        .     |  O    __.---------------\n" +
"         |                   \\ ;      \\             |   _.-~\n" +
"         |                    |        |            |  /  |\n" +
"          |                   |         |           |/'  |";
    } 
    

    @Override
    public String falar() {
        return " não acredito que tenha me seguido até aqui, irá pagar por essa perseguição";
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
