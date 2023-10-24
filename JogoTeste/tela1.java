import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tela1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tela1 extends World
{
    private int atraso=0;
    /**
     * Constructor for objects of class tela1.
     * 
     */
    public tela1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public void act(){
        //intro
        if(Greenfoot.isKeyDown("enter") && (atraso == 0)){
            setBackground(new GreenfootImage("tela2.png"));
            atraso++;
        } else {
            if(!Greenfoot.isKeyDown("enter")){
                atraso = 0;            
            }
        }
        //dialogo
        if(Greenfoot.isKeyDown("enter")&& (atraso == 0)){
            setBackground(new GreenfootImage("tela3.png"));
            atraso++;
        } else if(!Greenfoot.isKeyDown("enter")){
                atraso = 0;            
            
        }
        //fight
        if(Greenfoot.isKeyDown("enter")&& (atraso == 0)){
            Mundo world = new Mundo();
            Greenfoot.setWorld(world);
            setBackground(new GreenfootImage("tela3.png"));
            atraso++;
            atraso++;
        } else if(!Greenfoot.isKeyDown("enter")){
                atraso = 0;            
            
        }
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}
