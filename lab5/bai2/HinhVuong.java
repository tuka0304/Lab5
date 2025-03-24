import java.util.Scanner;
class HinhVuong implements Hinh {
    private float canh;

    public HinhVuong() {
        this.canh = 0;
    }

    public HinhVuong(float canh) {
        this.canh = canh;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh cua hinh vuong: ");
        this.canh = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Hinh vuong co canh: " + canh + ", Dien tich: " + dienTich());
    }

    @Override
    public float dienTich() {
        return canh * canh;
    }
}

class HinhChuNhat implements Hinh {
    private float dai;
    private float rong;

    public HinhChuNhat() {
        this.dai = 0;
        this.rong = 0;
    }

    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai cua hinh chu nhat: ");
        this.dai = scanner.nextFloat();
        System.out.print("Nhap chieu rong cua hinh chu nhat: ");
        this.rong = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Hinh chu nhat co dai: " + dai + ", rong: " + rong + ", Dien tich: " + dienTich());
    }

    @Override
    public float dienTich() {
        return dai * rong;
    }
}