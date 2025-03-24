import java.util.Scanner;
class QuanLy extends NhanVien {
    private String chuyenMon;
    private double phuCapChucVu;

    public QuanLy(String maNhanVien, String tenNhanVien, String trinhDo, String chuyenMon, double phuCapChucVu) {
        super(maNhanVien, tenNhanVien, trinhDo);
        this.chuyenMon = chuyenMon;
        this.phuCapChucVu = phuCapChucVu;
    }

    @Override
    public double tinhLuong() {
        return this.luongCoBan + this.phuCapChucVu;
    }

    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuyen mon: ");
        this.chuyenMon = scanner.nextLine();
        System.out.print("Nhap phu cap chuc vu: ");
        this.phuCapChucVu = scanner.nextDouble();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " + chuyenMon + ", Phu cap chuc vu: " + phuCapChucVu);
    }
}