import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author Ryan Detona 
 * @version 0.1 alpha
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("Fundo.mp3");
    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public void started(){
        bgMusic.playLoop();
    }
    public void stopped(){
        bgMusic.pause();
    }
    
    public Mundo()
    {    
        super(800, 600, 1);
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        PINGUIMFLAMENGUISTA pINGUIMFLAMENGUISTA = new PINGUIMFLAMENGUISTA();
        addObject(pINGUIMFLAMENGUISTA,141,146);
        LuanMelancia luanMelancia = new LuanMelancia();
        addObject(luanMelancia,668,121);
        Counter counter = new Counter();
        addObject(counter,664,23);
        GIsf gIsf = new GIsf();
        addObject(gIsf,391,306);
        removeObject(gIsf);
        Counter2 counter2 = new Counter2();
        addObject(counter2,137,27);
    }
}
