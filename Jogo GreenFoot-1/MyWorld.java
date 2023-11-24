import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int totalPedras1 = 2;
    public int totalPedras2 = 3;
    public int ataque = 0;
    public int meteoros = 0;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 650, 1); 
        prepare();
        Instruções I = new Instruções() ;
        addObject( I, 400, 330 );
    }
    public void act(){
        if(ataque < 6){
            this.showText("Salve a Terra da Chuva de Meteoros                            Passaram: " + ataque + "          Destruidos: " + meteoros,400,620);
        }
        if(totalPedras1 > 0){
            Pedra1 pedraA = new Pedra1();
            addObject(pedraA,889,Greenfoot.getRandomNumber(600));
            totalPedras1 = totalPedras1 - 1;
            
        }
        if(totalPedras2 > 0){
            Pedra2 pedraB = new Pedra2();
            addObject(pedraB,889,Greenfoot.getRandomNumber(600));
            totalPedras2 = totalPedras2 - 1;
        }
        if(ataque > 5){
            this.showText("Você Perdeu! Os meteoros chegaram a Terra - Destruiu: " + meteoros,300,572);
            Greenfoot.stop();
        }
        
    }
    private void prepare()
    {
        Foguete foguete = new Foguete();
        addObject(foguete,84,311);
        foguete.setLocation(67,302);
    }
}
