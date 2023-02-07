public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("Circle ", 10);
        Triangle triangle = new Triangle("Triangle ",20, 20, 20);
        Square square = new Square("Square ", 10);
        Rectangle rectangle = new Rectangle("Rectangle ", 5, 5);

        Car car = new Car("Mersedes");
        Bus bus = new Bus("Sprinter");

        Drawable[] drawables = {circle, triangle, square, rectangle, car, bus};
        for (int i = 0; i < drawables.length; i++) {
            drawables[i].draw();
            if (drawables[i] instanceof Figure){
                System.out.println(((Figure)drawables[i]).getName() + " " + ((Figure)drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Transport){
                System.out.println(((Transport) drawables[i]).getName());
                car.callSound();
            }
        }
    }
}