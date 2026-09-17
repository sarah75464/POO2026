package Taller01;

public class MediaPlayer {
    private int volume;
    private boolean isPlaying;

    public MediaPlayer() {
        this.volume = 50;
        this.isPlaying = false;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean isPlaying() {
        return this.isPlaying;
    }

    public void increaseVolume() {
        if (this.volume <= 95) {
            this.volume += 5;
        } else {
            this.volume = 100;
        }
    }

    public void decreaseVolume() {
        if (this.volume >= 5) {
            this.volume -= 5;
        } else {
            this.volume = 0;
        }
    }

    public void play() {
        this.isPlaying = true;
    }

    public void stop() {
        this.isPlaying = false;
    }
}