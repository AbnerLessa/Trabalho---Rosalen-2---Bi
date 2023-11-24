import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instruções here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruções extends Actor
{
    /**
     * Act - do whatever the Instruções wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {super.act();
    getWorld().removeObject(this);
    } 
}
