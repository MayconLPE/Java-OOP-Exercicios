package model;

public class TV {
    private int canal;
    private int volume;

    public TV(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }
    
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    
}
