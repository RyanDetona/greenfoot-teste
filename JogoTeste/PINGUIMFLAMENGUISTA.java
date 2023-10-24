import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

    
public class PINGUIMFLAMENGUISTA extends Actor
{
    /**
     * Act - do whatever the PINGUIMFLAMENGUISTA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed=2;
    private int leavesEaten;
    GreenfootSound ataq = new GreenfootSound("Attack.mp3");private int sTimer = 0;
     public PINGUIMFLAMENGUISTA()
    {
        leavesEaten = 0;
    }
    public void act()
    {
       if(Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(),this.getY() - speed);
        }
        if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(),this.getY() + speed);
        }
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed,this.getY());
        }
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed,this.getY());
        }else if (Greenfoot.isKeyDown(";") && (sTimer == 0)){
             sTimer ++;
             ataq.play();
             getWorld().addObject(new Peixe(), getX()- 100,getY()+ 30);
            }else {if(!Greenfoot.isKeyDown(";")){
                sTimer = 0;
        }
    }
}
}

