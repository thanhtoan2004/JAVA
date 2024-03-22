package SinhVien;
public class SinhVienMain {
    public static void main(String[] args)
    {
        DSSinhVien ds = new DSSinhVien();
        ds.inputDS();
        ds.outputDS();
        ds.sapxepDTB();
        System.out.println("Danh sánh sau khi sắp xếp: ");
        ds.outputDS();
        System.out.println("--------------------");
        ds.themSV();
        ds.outputDS();
        ds.timkiemHoTen();
        ds.xoaSV();
        System.out.println("Danh sách sau khi xóa : ");
        ds.outputDS();
        ds.suaSV();
        ds.outputDS();
        DSSinhVien copyDS = ds.copy();
        System.out.println("Danh sách đã được nhân bản:");
        copyDS.outputDS();
    }
}
