import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rumah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rumah extends Actor
{
    /**
     * Act - do whatever the Rumah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        checkCollision();
    }
    
    private void checkCollision() {
        if (isTouching(People.class)) {
            World world = getWorld();
            if (world instanceof MyWorld2) {
                int middleX = world.getWidth() / 2;
                int middleY = world.getHeight() / 2;
                MyWorld2 myWorld2 = (MyWorld2) world;
                myWorld2.showText("Finish", middleX, middleY);
                Greenfoot.stop();
                
                int score = myWorld2.getScore();
                int lives = myWorld2.getLives();

                myWorld2.showText("Score: " + score, middleX, middleY + 20);
                myWorld2.showText("Lives: " + lives, middleX, middleY + 40);
                Greenfoot.stop();
            }
        }
    }   
}
