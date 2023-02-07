public class Car extends Transport implements SoundProducable{

    public Car(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDE98");

    }

    @Override
    public void callSound() {
        System.out.println("beep beep");
    }
}
