package baitaplab5;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {

        ArrayList<Integer> danhSachSoNguyen = new ArrayList<>();

        Scanner banPhim = new Scanner(System.in);

        // Nhập 10 số
        for (int i = 0; i < 10; i++) {

            System.out.print("Mời nhập phần tử thứ " + (i + 1) + ": ");

            int tam = banPhim.nextInt();

            danhSachSoNguyen.add(tam);
        }

        // Xuất danh sách
        System.out.println("\nDanh sách vừa nhập:");

        for (int i = 0; i < danhSachSoNguyen.size(); i++) {
            System.out.print(danhSachSoNguyen.get(i) + " ");
        }

        // Đếm số chẵn
        int demChan = 0;

        for (int x : danhSachSoNguyen) {

            if (x % 2 == 0) {
                demChan++;
            }

        }

        System.out.println("\nSố phần tử chẵn là: " + demChan);

        // Tính tổng

        int tong = 0;

        for (int x : danhSachSoNguyen) {

            tong += x;

        }

        System.out.println("Tổng tất cả các phần tử là: " + tong);

        banPhim.close();
    }
}