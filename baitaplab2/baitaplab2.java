package baitaplab2;

public class baitaplab2 {
    public static void main(String[] args) {
        // Khai báo các biến kiểu số nguyên
        int a = 15;
        int b = 4;

        // Khai báo biến kiểu số thực
        double c = 3.5;

        // Tính toán tổng
        int tong = a + b;

        // Tính toán thương (ép kiểu để lấy kết quả chính xác)
        double thuong = (double) a / b;

        // In kết quả ra màn hình
        System.out.println("Tổng là: " + tong);
        System.out.println("Thương là: " + thuong);
    }
}