import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{
    /** 
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        checkCollision();
    }

    private void checkCollision() {
        if (isTouching(People.class)) {
            Greenfoot.delay(30);

            World world = getWorld();
            world.showText("Level 2", world.getWidth() / 2, world.getHeight() / 2);
            Greenfoot.delay(50);

            MyWorld myWorld = (MyWorld) world;
            myWorld.moveToNextLevel();
        }
    }

}
