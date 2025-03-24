public class Main_bai4 {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 2, 2, 5);
        System.out.println("Vi tri ban dau: " + circle.toString());

        circle.moveUp();
        System.out.println("Sau khi di chuyen len: " + circle.toString());

        circle.moveDown();
        System.out.println("Sau khi di chuyen xuong: " + circle.toString());

        circle.moveLeft();
        System.out.println("Sau khi di chuyen sang trai: " + circle.toString());

        circle.moveRight();
        System.out.println("Sau khi di chuyen sang phai: " + circle.toString());
    }
}
