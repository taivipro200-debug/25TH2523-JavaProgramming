package baitaplab4.bai3TaiKhoanNganHang;

public class MainNganHang {

    public static void main(String[] args) {

        TaiKhoanNganHang tk1 = new TaiKhoanNganHang();
        tk1.soTaiKhoan = "001";
        tk1.tenChuTaiKhoan = "Nguyễn Văn A";
        tk1.soDu = 5000000;

        TaiKhoanNganHang tk2 = new TaiKhoanNganHang();
        tk2.soTaiKhoan = "002";
        tk2.tenChuTaiKhoan = "Trần Thị B";
        tk2.soDu = 2000000;

        tk1.hienThiSoDu();
        tk2.hienThiSoDu();

        tk1.chuyenTien(tk2, 1000000);

        tk1.hienThiSoDu();
        tk2.hienThiSoDu();
    }
}
