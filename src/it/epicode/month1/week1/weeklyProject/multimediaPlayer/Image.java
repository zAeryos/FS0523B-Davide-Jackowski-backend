package it.epicode.month1.week1.weeklyProject.multimediaPlayer;

public class Image extends MultimediaElement implements Showable{
    private int brightness;
    public Image(String title, int brightness) {
        super(title, 0);
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
    public void show() {
        System.out.print("Title: " + title + " | Brightness: ");
        for (int i = 0; i < brightness; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
