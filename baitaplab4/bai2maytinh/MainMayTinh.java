package baitaplab4.bai2maytinh;

public class MainMayTinh {

    public static void main(String[] args) {

        MayTinh mt = new MayTinh();

        mt.hang = "Dell";
        mt.ram = 16;
        mt.oCung = 512;
        mt.gia = 18000000;

        mt.kiemTraCauHinh();

        System.out.println("Chơi game: " + mt.coTheChoiGame());

        System.out.println("Thuế: " + mt.tinhThue());
    }
}