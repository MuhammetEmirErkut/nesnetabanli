package DogProject.src.model;

public class DogDoor {
    private boolean open;
    private Bark allowedBark;

    public DogDoor() {
        this.open = false;
    }

    public void setAllowedBark(Bark allowedBark) {
        this.allowedBark = allowedBark;
    }

    public Bark getAllowedBark() {
        return allowedBark;
    }

    public void open() {
        System.out.println("The dog door opens.");
        this.open = true;
    }
    public void close() {
        System.out.println("The dog door closes.");
        this.open = false;
    }
    public boolean isOpen() {
        return open;
    }
    
}
