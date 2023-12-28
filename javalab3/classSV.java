class SinhVien{
    String hoTen;
    double diem;
    SinhVien(String hoTen, double diem){
        this.hoTen = hoTen;
        this.diem =diem;
}
    String layHocLuc() {
        if (diem < 5) {
            return "Yeu";
        } else if (diem < 6.5) {
            return "Trung binh";
        } else if (diem < 7.5) {
            return "Kha";
        } else if (diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }
};
