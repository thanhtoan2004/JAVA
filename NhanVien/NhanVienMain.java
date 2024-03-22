package NhanVien;
/*
//DANG THANH TOAN
//2280603288
//22DTHG6
 */
public class NhanVienMain
{
    public static void main(String[] args)
    {
        DSNhanVien ds = new DSNhanVien();
        ds.inputDS();
        ds.outputDS();
        ds.timkiemTrinhDo();
        System.out.println("Danh sánh sau khi sắp xếp: ");
        ds.outputDS();
        ds.themNV();
        ds.outputDS();
        ds.timkiemHoTen();
        ds.xoaNV();
        System.out.println("Danh sách sau khi xóa : ");
        ds.outputDS();
        ds.suatNV();
        ds.outputDS();
        DSNhanVien copyDS = ds.copy();
        System.out.println("Danh sách đã được nhân bản:");
        copyDS.outputDS();

    }
}
