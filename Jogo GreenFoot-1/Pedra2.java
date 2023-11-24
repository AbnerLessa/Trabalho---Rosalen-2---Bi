import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pedra2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedra2 extends Actor
{
    /**
     * Act - do whatever the Pedra2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-3);
        if(isAtEdge()){
            MyWorld w = (MyWorld) getWorld();
            w.ataque = w.ataque + 2;
            w.totalPedras2 = w.totalPedras2 + 1;
            w.removeObject(this);
        }
    }
}
