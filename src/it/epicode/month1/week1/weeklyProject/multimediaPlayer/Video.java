package it.epicode.month1.week1.weeklyProject.multimediaPlayer;

public class Video extends Audio implements Playable {
    private int brightness;

    public Video(String title, int duration, int volume, int brightness) {
        super(title, duration, volume);
        this.brightness = brightness;
    }

    public void increaseBrightness(int brightness) {
        if ((this.brightness + brightness) < 100) {
            this.brightness += brightness;
            System.out.println("You increased the brightness to " + brightness);
        } else {
            this.brightness = 100;
            System.out.println("The brightness is set to the max.");
        }
    }

    public void decreaseBrightness(int brightness) {
        if ((this.brightness - brightness) >= 0) {
            this.brightness -= brightness;
            System.out.println("You decreased the brightness to " + brightness);
        } else {
            this.brightness = 0;
            System.out.println("The brightness is set to the minimum.");
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.print("Title: " + title + " | Volume: ");
            for (int j = 0; j < this.volume; j++) {
                System.out.print("!");
            }
            System.out.print(" | Brightness: ");
            for (int k = 0; k < this.brightness; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
