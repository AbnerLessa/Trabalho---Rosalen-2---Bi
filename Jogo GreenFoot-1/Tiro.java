import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiro extends Actor
{
     
    public void act()
    {
        mover();
    }
    public void mover(){
        MyWorld w = (MyWorld) getWorld();
        move(6);
        if(isAtEdge()){
           w.removeObject(this); 
        }
        else if(isTouching(Pedra1.class)){
            removeTouching(Pedra1.class);
            w.meteoros = w.meteoros + 1;
            w.totalPedras1 = w.totalPedras1 + 1;
            w.removeObject(this);
        }
        else if(isTouching(Pedra2.class)){
            removeTouching(Pedra2.class);
            w.meteoros = w.meteoros + 1;
            w.totalPedras2 = w.totalPedras2 + 1;
            w.removeObject(this);
    }
    }
}
