import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peixe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peixe extends Actor
{
    /**
     * Act - do whatever the Peixe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
    }
    public void acertarAlvo(){
        Actor a = getOneIntersectingObject(LuanMelancia.class);
        
        if (a != null){
        Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
        counter2.add(1);
        
        getWorld().removeObject(a);
        getWorld().removeObject(this);
        }
    }
    public void moveAtaque()
    {
    double angle = Math.toRadians( getRotation() );
    int x = (int) Math.round(getX() + Math.cos(angle));
    int y = (int) Math.round(getY() + Math.sin(angle));
    
    setLocation(x, y);
}
}
