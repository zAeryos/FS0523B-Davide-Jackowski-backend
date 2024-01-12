package it.epicode.month1.week1.weeklyProject.multimediaPlayer;

public class Project {

    public static void main(String[] args) {
        Audio audio = new Audio("AudioTest", 3, 50);

        audio.play();
        audio.lowerVolume(40);
        audio.play();
        audio.lowerVolume(15);
        audio.increaseVolume(40);
        audio.increaseVolume(100);

        Video video = new Video("VideoTest", 5, 50, 30);

        video.play();
        video.decreaseBrightness(20);
        video.increaseBrightness(80);
        video.increaseBrightness(20);
        video.lowerVolume(30);

        Image image = new Image("ImageTest", 30);

        image.show();
        image.decreaseBrightness(15);
        image.show();
        image.increaseBrightness(50);
        image.show();
    }
}
