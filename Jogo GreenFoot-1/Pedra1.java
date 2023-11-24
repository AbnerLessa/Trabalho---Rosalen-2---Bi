import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pedra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedra1 extends Actor
{
    /**
     * Act - do whatever the Pedra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-4);
        if(isAtEdge()){
            MyWorld w = (MyWorld) getWorld();
            w.ataque = w.ataque + 2;
            w.totalPedras1 = w.totalPedras1 + 1;
            w.removeObject(this);
        }
    }
}
