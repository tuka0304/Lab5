
public class Main_bai1 {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy("QL001", "Nguyen Van A", "Dai hoc", "Quan tri", 2000000);
        NghienCuu nghienCuu = new NghienCuu("NC001", "Tran Thi B", "Thac si", "Hoa hoc", 1500000);
        PhucVu phucVu = new PhucVu("PV001", "Le Van C", "Trung cap");

        quanLy.nhap();
        nghienCuu.nhap();
        phucVu.nhap();

        System.out.println("\nThong tin nhan vien:");
        quanLy.xuat();
        System.out.println("Luong: " + quanLy.tinhLuong());

        nghienCuu.xuat();
        System.out.println("Luong: " + nghienCuu.tinhLuong());

        phucVu.xuat();
        System.out.println("Luong: " + phucVu.tinhLuong());
    }
}
