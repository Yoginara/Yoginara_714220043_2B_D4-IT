import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ular extends Actor
{
    /**
     * Act - do whatever the Ular wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 2; 
    public void act() {
        moveUlar();
    }

    private void moveUlar() {
        if (getX() <= 0 || getX() >= getWorld().getWidth() - 1) {
            speed = -speed;
        }
        setLocation(getX() + speed, getY());
    }
}
