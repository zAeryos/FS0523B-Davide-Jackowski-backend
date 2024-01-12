package it.epicode.month1.week1.weeklyProject.multimediaPlayer;

import java.util.Arrays;
import java.util.Scanner;

public class Project {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MultimediaElement[] multimediaList = new MultimediaElement[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Choose a type of multimedia element to add (1 = Audio, 2 = Video, 3 = Image)");
            int type = scanner.nextInt();
            scanner.nextLine();

            String title = "";

            if (type > 0 && type < 4) {
                System.out.println("Insert a title");
                title = scanner.nextLine();
            } else {
                System.out.println("The type you have chosen was not valid");
            }

            int duration;
            int volume;
            int brightness;

            switch (type) {
                case 1:
                    System.out.println("Insert a duration");
                    duration = scanner.nextInt();
                    System.out.println(duration);
                    System.out.println("Insert a starting volume");
                    volume = scanner.nextInt();
                    System.out.println(volume);
                    multimediaList[i] = new Audio(title, duration, volume);
                    break;
                case 2:
                    System.out.println("Insert a duration");
                    duration = scanner.nextInt();
                    System.out.println("Insert a starting volume");
                    volume = scanner.nextInt();
                    System.out.println("Insert a starting brightness");
                    brightness = scanner.nextInt();
                    multimediaList[i] = new Video(title, duration, volume, brightness);
                    break;
                case 3:
                    System.out.println("Insert a starting brightness");
                    brightness = scanner.nextInt();
                    multimediaList[i] = new Image(title, brightness);
                    break;
                default:
                    i--;
                    break;
            }
        }

        int choice;

        do {
            System.out.println("Choose an element number from 1-5, or 0 to exit.");
            choice = scanner.nextInt();
            if (choice > 0 && choice <= 5) {
                if (multimediaList[choice - 1].getClass() == Video.class) {
                    ((Video)multimediaList[choice - 1]).play();
                } else if (multimediaList[choice - 1].getClass() == Audio.class) {
                    ((Audio)multimediaList[choice - 1]).play();
                } else if (multimediaList[choice - 1].getClass() == Image.class) {
                    ((Image)multimediaList[choice - 1]).show();
                } else {
                    System.out.println("Sorry, there was an unknown error. Please try again.");
                }
            } else if (choice == 0) {
                System.out.println("You are now leaving.");
            } else {
                System.out.println("Chosen number was not valid.");
            }
        } while (choice != 0);

        // Questi sono solo test per far vedere che i metodi per le varie classi funzionano tutte

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
