package baitaplab4.bai3TaiKhoanNganHang;

public class TaiKhoanNganHang {

    String soTaiKhoan;
    String tenChuTaiKhoan;
    double soDu;

    void guiTien(double soTien) {
        soDu += soTien;
        System.out.println("Đã gửi " + soTien);
    }

    boolean rutTien(double soTien) {

        if (soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Đã rút " + soTien);
            return true;
        } else {
            System.out.println("Không đủ số dư.");
            return false;
        }
    }

    void chuyenTien(TaiKhoanNganHang taiKhoanKhac, double soTien) {

        if (rutTien(soTien)) {
            taiKhoanKhac.guiTien(soTien);
            System.out.println("Chuyển tiền thành công.");
        }
    }

    void hienThiSoDu() {
        System.out.println(tenChuTaiKhoan + ": " + soDu);
    }
}