package Taller01;

public class TestMediaPlayer {
    public static void main(String[] args) {
        MediaPlayer reproductor = new MediaPlayer();

        System.out.println("Volumen inicial: " + reproductor.getVolume());
        System.out.println("Reproduciendo: " + reproductor.isPlaying());

        reproductor.play();
        System.out.println("Estado despues de iniciar: " + reproductor.isPlaying());

        reproductor.stop();
        System.out.println("Estado despues de detener: " + reproductor.isPlaying());

        for (int i = 0; i < 15; i++) {
            reproductor.increaseVolume();
        }
        System.out.println("Volumen tras intentar superar 100: " + reproductor.getVolume());

        for (int i = 0; i < 25; i++) {
            reproductor.decreaseVolume();
        }
        System.out.println("Volumen tras intentar bajar de 0: " + reproductor.getVolume());
    }
}