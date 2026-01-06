package DogProject.src.test;

import DogProject.src.model.Bark;
import DogProject.src.model.BarkRecognizer;
import DogProject.src.model.DogDoor;    
import DogProject.src.model.Remote;

public class DogDoorSimulator {
    

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        
        // Ceyhun'un havlamasını izin verilen havlama olarak ayarla
        Bark ceyhunBark = new Bark("Woof");
        door.setAllowedBark(ceyhunBark);
        
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);
        System.out.println("Ceyhun starts barking.");

        System.out.println("Ceyhuns all done...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        remote.pressButton();
        
        System.out.println("\nCeyhun stuck outside...");

        System.out.println("Ceyhun starts barking.");
        recognizer.recognize("Woof");

        System.out.println("Ceyhuns back inside...");

        Bark smallDogBark = new Bark("Yip");
        System.out.println("A small dog starts barking.");
        recognizer.recognize(smallDogBark);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nCeyhun starts barking.");
        recognizer.recognize("Woof");

        System.out.println("Ceyhuns back inside...");
    }
}
