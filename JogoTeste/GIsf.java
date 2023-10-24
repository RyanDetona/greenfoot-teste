import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GIsf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GIsf extends Actor
{
    GifImage myGif = new GifImage("I-can-float.gif");
    /**
     * Act - do whatever the GIsf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
    }
}
