
package baitaplab3;
import java.util.Scanner;
public class tonghaiso {
    public static void main(String[] args) {
        // Khai báo các biến
        double num1, num2, tong;

        // Khai báo đối tượng Scanner để nhận dữ liệu từ bàn phím
        Scanner banPhim = new Scanner(System.in);

        // Nhập số thứ nhất
        System.out.print("Mời nhập số thứ nhất: ");
        num1 = banPhim.nextDouble();

        // Nhập số thứ hai
        System.out.print("Mời nhập số thứ hai: ");
        num2 = banPhim.nextDouble();

        // Tính tổng
        tong = num1 + num2;

        // Xuất kết quả ra màn hình
        System.out.println("Tổng của " + num1 + " và " + num2 + " là " + tong);

        // Đóng Scanner
        banPhim.close();
    }
}