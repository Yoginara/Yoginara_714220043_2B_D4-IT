    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class MyWorld2 here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class MyWorld2 extends World
    {
        private int initialX = 200; // Ganti dengan nilai posisi awal X yang sesuai
        private int initialY = 550; // Ganti dengan nilai posisi awal Y yang sesuai
        private int score;
        private int lives;
        /**
         * Constructor for objects of class MyWorld2.
         * 
         */
        public MyWorld2(int score, int lives) {    
            super(400, 600, 1);
            this.score = score; 
            this.lives = lives;
            prepareLevel2();
            preparePeople();
            prepareRumah();
            prepare(score, lives);
            showText("Score: " + score, 60, 20);    
        }
        
        private void prepareLevel2() {
            Buah buah = new Buah(); 
            addObject(buah, 100, 150);
            Ular ular = new Ular();
            addObject(ular, 200, 200);
            Buah buah2 = new Buah();
            addObject(buah2, 300, 250);
            Ular ular2 = new Ular();
            addObject(ular2, 400, 300);
            Buah buah3 = new Buah();
            addObject(buah3, -100, 360);
            Ular ular3 = new Ular();
            addObject(ular3, -200, 430);
            Buah buah4 = new Buah();
            addObject(buah4, -300, 500);
            Ular ular4 = new Ular();
            addObject(ular4, -300, 100);
            
        }
        
        private void preparePeople() {  
            People person = new People();
            int xPerson = getWidth() / 2; // Posisi tengah
            int yPerson = getHeight() - 50; // Posisi bawah
            addObject(person, xPerson, yPerson);
            
            // Simpan posisi awal untuk digunakan saat mereset posisi
            person.setInitialPosition(xPerson, yPerson);
            
        
        }
        
        public int getInitialX() {
            return initialX;
        }

        public int getInitialY() {
            return initialY;
        }
        
        public void addScore(int points) {
            score += points;
            showText("Score: " + score, 60, 20); // Memperbarui tampilan skor
        }
        
        public void decreaseLives() {
            lives--; 
            showText("Lives: " + lives, getWidth() - 60, 20);
            if (lives <= 0) {
                showText("Game Over", getWidth() / 2, getHeight() / 2); // Tampilkan pesan "Game Over"
                showText("Score: " + score, getWidth() / 2, getHeight() / 2 + 20);
                showText("Lives: " + lives, getWidth() / 2, getHeight() / 2 + 40);
                Greenfoot.stop(); // Hentikan permainan
            }
        }
        
        private void prepare(int score, int lives) {
            
            showText("Score: " + score, 60, 20);
            showText("Lives: " + lives, getWidth() - 60, 20);
        }
        
        private void prepareRumah() {
            Rumah rumah = new Rumah();
            addObject(rumah, 200, 35);
        }
        
        public int getScore() {
            return score;
        }
    
        public int getLives() {
            return lives;
        }
}
