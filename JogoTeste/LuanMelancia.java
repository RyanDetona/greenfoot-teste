import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LuanMelancia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LuanMelancia extends Actor
{
    public int speed=3;
    private int leavesEaten;
    GreenfootSound ataq = new GreenfootSound("Attack.mp3");private int sTimer = 0;
    public LuanMelancia()
    {
        leavesEaten = 0;
    }
    public void act()
    {
       if(Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(),this.getY() - speed);
        }
        if(Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(),this.getY() + speed);
        }
        if(Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed,this.getY());
        }
        if(Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed,this.getY());
        }else if (Greenfoot.isKeyDown("f") && (sTimer == 0)){
             sTimer ++;
             ataq.play();
             getWorld().addObject(new Melancia(), getX()- 100,getY()+ 30);
            }else {if(!Greenfoot.isKeyDown("f")){
                sTimer = 0;
        }
    }
}
}
    

    
