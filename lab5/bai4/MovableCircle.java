class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }

    public MovablePoint getCenter() { return center; }
    public void setCenter(MovablePoint center) { this.center = center; }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "Hinh tron tai " + center.toString() + ", ban kinh=" + radius;
    }
}