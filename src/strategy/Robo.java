package strategy;

public class Robo {
    private Conduct conduct;

    public void setConduct(Conduct conduct) {
        this.conduct = conduct;
    }
    
    public void move(){
        conduct.move();

    }

    
}
