import java.util.Date;
public class Main_bai5 {public static void main(String[] args) {
    PhongKhoaBan phongKhoaBan = new PhongKhoaBan("PK01", "Khoa CNTT");
    NhanVien nhanVien = new NhanVien("Nguyen Thi Lan", 1990, 10000000, new Date(), phongKhoaBan);

    nhanVien.nhap();

    System.out.println("\nThong tin nhan vien:");
    nhanVien.xuat();
}
}


