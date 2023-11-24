import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Foguete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Foguete extends Actor
{
    private int timer = 10;
    public void act()
    {
        if(timer > 0){
            timer = timer - 1;
        }else
        {
        atirar();
    }
        mover();
    }
    public void mover(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY() - 10);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY() + 10);
    }
  }
    public void atirar(){
        MyWorld w = (MyWorld) getWorld();
    if(Greenfoot.isKeyDown("space")){
        w.addObject(new Tiro(), getX() + 10, getY());
        timer = 10;
    }
    
  }
}

