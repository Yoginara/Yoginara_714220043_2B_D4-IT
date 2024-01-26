import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class People here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class People extends Actor
{
    /**
     * Act - do whatever the People wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int lives = 0;
    private int initialX;
    private int initialY;
    private static People instance;
    public void act() {
        movePlayer();
        checkCollision();
        
    }

    private void movePlayer() {
        if (Greenfoot.isKeyDown("A")) {
            move(-3); // Menggerakkan ke kiri
        }
        if (Greenfoot.isKeyDown("D")) {
            move(3); // Menggerakkan ke kanan
        }
        if (Greenfoot.isKeyDown("W")) {
            setLocation(getX(), getY() - 3); // Menggerakkan ke atas
        }
        if (Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() + 3); // Menggerakkan ke bawah
        }
    }
    
    public void setInitialPosition(int x, int y) {
        initialX = x;
        initialY = y;
    }
    
    private void checkCollision() {
        if (isTouching(Buah.class)) {
            Buah buah = (Buah) getOneIntersectingObject(Buah.class);
            getWorld().removeObject(buah);
            if (getWorld() instanceof MyWorld) {
                MyWorld world = (MyWorld) getWorld();
                world.addScore(10);
            } else if (getWorld() instanceof MyWorld2) {
                MyWorld2 world = (MyWorld2) getWorld();
                world.addScore(10);
            }
        }

        if (isTouching(Ular.class)) {
            lives++;
            if (lives < 3) {
                setLocation(initialX, initialY);
                if (getWorld() instanceof MyWorld) {
                    MyWorld world = (MyWorld) getWorld();
                    world.decreaseLives();
                } else if (getWorld() instanceof MyWorld2) {
                    MyWorld2 world = (MyWorld2) getWorld();
                        world.decreaseLives();
                }
            } else {
                if (getWorld() instanceof MyWorld) {
                    MyWorld world = (MyWorld) getWorld();
                    world.setGameOver();
                } else if (getWorld() instanceof MyWorld2) {
                }
            }
        }
    }
    
    public static People getInstance() {
        if (instance == null) {
            instance = new People();    
        }
        return instance;
    }
    
    public int getInitialX() {
        return initialX;
    }

    public int getInitialY() {
        return initialY;
    }
}
