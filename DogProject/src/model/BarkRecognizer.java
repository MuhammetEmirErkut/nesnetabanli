package DogProject.src.model;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("BarkRecognizer: Heard a '" + bark.getSound() + "'");
        if(door.getAllowedBark() != null && door.getAllowedBark().equals(bark)){
            door.open();
        } else {
            System.out.println("This dog is not allowed.");
        }
    }

    public void recognize(String sound) {
        Bark bark = new Bark(sound);
        recognize(bark);
    }
}
