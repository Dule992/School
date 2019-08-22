package media;

public class Television {

    private int volume = 0;
    private int currentProgram = 1;
    private boolean isTurnedOn = false;

    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }
    
    public void setCurrentProgram(int newProgram) {
        
        this.currentProgram = newProgram;
    }

    public void setIsTurnedOn(boolean True) {
    
        this.isTurnedOn = true;
    }
            
    public int getVolume() {
        return this.volume;
    }
    
    public int getCurrentProgram() {
    
        return this.currentProgram;
    }

    public boolean getIsTurnedOn() {
    
        return this.isTurnedOn;
    }
}
