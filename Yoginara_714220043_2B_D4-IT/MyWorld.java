import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private boolean gameOver = false;
    private int score = 0;
    private int lives = 3;
    private int currentLevel = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(400, 600, 1);
        preparePeople();
        prepareBuah();
        prepareUlar();
        preparePortal();
        showScoreAndLives();
        
    }
    
    public void act() {
        if (gameOver) {
            showText("Game Over", getWidth() / 2, getHeight() / 2);
            Greenfoot.stop();
        }
    }
    
    private void preparePeople() {  
        People person = new People();
        int xPerson = getWidth() / 2;
        int yPerson = getHeight() - 50; 
        addObject(person, xPerson, yPerson);
        
        person.setInitialPosition(xPerson, yPerson);
        
        
    }

    private void prepareBuah() {
        Buah buah = new Buah();
        addObject (buah,430,120);
        Buah buah2 = new Buah();
        addObject (buah2,430,290);
        Buah buah3 = new Buah();
        addObject (buah3,430,450);
        
    }
    private void preparePortal(){
        Portal portal = new Portal();
        addObject (portal,200,35);
    }
    
    private void prepareUlar() {
        Ular ular = new Ular();
        addObject (ular,-430,209);
        Ular ular2 = new Ular();
        addObject (ular2,-430,370);
        
    }
    
    public void setGameOver() {
        gameOver = true;
        lives = 3;
    }
    
    public void addScore(int points) {
        score += points;
        showScoreAndLives();
    }

    public void decreaseLives() {
        lives--;
        if (lives <= 0) {
            setGameOver();
        }
        showScoreAndLives();
    }

    private void showScoreAndLives() {
        showText("Score: " + score, 60, 20);
        showText("Lives: " + lives, getWidth() - 60, 20);
    }
    
    public void moveToNextLevel() {
        if (currentLevel == 1) {
            currentLevel = 2;
            Greenfoot.setWorld(new MyWorld2(score, lives));
        }
    }

}
