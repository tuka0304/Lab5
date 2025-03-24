import java.util.Scanner;
public class Main_bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong hinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Hinh ds[] = new Hinh[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Chon loai hinh se nhap: ");
            System.out.println("1: Hinh vuong");
            System.out.println("2: Hinh chu nhat");
            System.out.println("3: Hinh tron");
            int chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    ds[i] = new HinhVuong();
                    ds[i].nhap();
                    break;
                case 2:
                    ds[i] = new HinhChuNhat();
                    ds[i].nhap();
                    break;
                case 3:
                    ds[i] = new HinhTron();
                    ds[i].nhap();
                    break;
                default:
                    System.out.println("Ban phai chon 1 trong 3 loai tren");
                    i--;
            }
        }

        System.out.println("\nDanh sach hinh:");
        for (Hinh hinh : ds) {
            hinh.xuat();
        }

        Hinh hinhDienTichLonNhat = ds[0];
        for (Hinh hinh : ds) {
            if (hinh.dienTich() > hinhDienTichLonNhat.dienTich()) {
                hinhDienTichLonNhat = hinh;
            }
        }

        System.out.println("\nHinh co dien tich lon nhat:");
        hinhDienTichLonNhat.xuat();
    }
}