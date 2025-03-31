import java.util.Date;
import java.util.Scanner;

class NhanVien extends ConNguoi {
        private double luong;
        private Date ngayNhanViec;
        private PhongKhoaBan phongKhoaBan;

        public NhanVien() {
            super();
            this.luong = 0.0;
            this.ngayNhanViec = new Date();
            this.phongKhoaBan = null;
        }

        public NhanVien(String hoTen, int namSinh, double luong, Date ngayNhanViec, PhongKhoaBan phongKhoaBan) {
            super(hoTen, namSinh);
            this.luong = luong;
            this.ngayNhanViec = ngayNhanViec;
            this.phongKhoaBan = phongKhoaBan;
        }

        public double getLuong() {
            return luong;
        }
    
        public void setLuong(double luong) {
            this.luong = luong;
        }
    
        public Date getNgayNhanViec() {
            return ngayNhanViec;
        }
    
        public void setNgayNhanViec(Date ngayNhanViec) {
            this.ngayNhanViec = ngayNhanViec;
        }
    
        public PhongKhoaBan getPhongKhoaBan() {
            return phongKhoaBan;
        }
    
        public void setPhongKhoaBan(PhongKhoaBan phongKhoaBan) {
            this.phongKhoaBan = phongKhoaBan;
        }

        @Override
        public void nhap() {
            super.nhap();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap luong: ");
            this.luong = scanner.nextDouble();
            System.out.print("Nhap ngay nhan viec (yyyy-MM-dd): ");
            this.ngayNhanViec = new Date(scanner.next());
            this.phongKhoaBan = new PhongKhoaBan();
            phongKhoaBan.nhap();
        }

        @Override
        public void xuat() {
            super.xuat();
            System.out.println("Luong: " + luong);
            System.out.println("Ngay nhan viec: " + ngayNhanViec);
            phongKhoaBan.xuat();
        }
    }

