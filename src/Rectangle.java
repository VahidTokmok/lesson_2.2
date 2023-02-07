public class Rectangle extends Figure{

    private int x, y;


    public Rectangle(String name, int x, int y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    @Override
    public int calculatePerimeter() {
        return (x + y) * 2;
    }

    @Override
    public void draw() {
        System.out.println("✉️");
    }
}
