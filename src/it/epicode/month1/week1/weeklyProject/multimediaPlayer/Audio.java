package it.epicode.month1.week1.weeklyProject.multimediaPlayer;

public class Audio extends MultimediaElement implements Playable{

    protected int volume;

    public Audio(String title, int duration, int volume) {
        super(title, duration);
        this.volume = volume;
    }

    public void lowerVolume(int volume) {
        if ((this.volume - volume) >= 0) {
            this.volume -= volume;
            System.out.println("You lowered the volume to " + this.volume);
        } else {
            this.volume = 0;
            System.out.println("The volume is set to the minimum.");
        }
    }

    public void increaseVolume(int volume) {
        if ((this.volume + volume) <= 100) {
            this.volume += volume;
            System.out.println("You raised the volume to " + this.volume);
        } else {
            this.volume = 100;
            System.out.println("The volume is set to the max.");
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.print("Title: " + title + " | Volume: ");
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}
