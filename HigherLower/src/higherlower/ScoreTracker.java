package higherlower;

/**
 * @author Derek Shaheen 
 * @date: Mar 15, 2018
 * @version: 1.0
 */
public class ScoreTracker {
    private int score = 0;
    
    public ScoreTracker(){
    }
    
    public void increaseScore(){
        score++;
    }
    
    public void decreaseScore(){
        score--;
    }

    public int getScore() {
        return score;
    }
    
    public String printScore() {
        return score + "";
    }
    
    public void reset() {
        score = 0;
    }
    
}
