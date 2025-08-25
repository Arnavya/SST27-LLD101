public class Square implements Shape {
    private int side;

    public Square(int s) {
        this.side = s;
    }

    public void setSide(int s) { this.side = s; }

    @Override
    public int area() { return side * side; }
}
