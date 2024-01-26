import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buah extends Actor
{
    /**
     * Act - do whatever the Buah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 2;

    public void act() {
        moveBuah();
    }

    private void moveBuah() {
        if (getX() <= 0 || getX() >= getWorld().getWidth() - 1) {
            speed = -speed;
        }
        setLocation(getX() + speed, getY()); 
    }
}
