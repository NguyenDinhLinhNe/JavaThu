package main;
import java.util.*;

import shapes.hinhChuNhat;
import shapes.hinhTron;
import shapes.hinhTru;
import shapes.hinhVuong;

public class mainClass {
    public static void main(String[] args) {
        // hinh tron
        hinhTron htron = new hinhTron();
        htron.xuatTen();
        htron.nhapBanKinh();
        htron.tinhChuVi();
        htron.tinhDienTich();
        htron.inChuVi();
        htron.inDienTich();

        // hinh chu nhat
        hinhChuNhat hcn = new hinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();

        // hinh tru
        hinhTru htru = new hinhTru();
        htru.xuatTen();
        htru.nhapChieuCao();
        htru.tinhTheTich();
        htru.inTheTich();

        // hinh vuong
        hinhVuong hv = new hinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();
    }
}
