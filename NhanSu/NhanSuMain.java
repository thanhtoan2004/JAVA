package NhanSu;
/*
//DANG THANH TOAN
//2280603288
//22DTHG6
 */
public class NhanSuMain
{
    public static void main(String[] args)
    {
        DSNhanSu ds = new DSNhanSu();
        ds.inputDS();
        ds.outputDS();
        ds.timkiemChuyenMon();
        System.out.println("Danh sánh sau khi sắp xếp: ");
        ds.outputDS();
        ds.themNS();
        ds.outputDS();
        ds.timkiemHoTen();
        ds.xoaNS();
        System.out.println("Danh sách sau khi xóa : ");
        ds.outputDS();
        ds.suaNS();
        ds.outputDS();
        DSNhanSu copyDS = ds.copy();
        System.out.println("Danh sách đã được nhân bản:");
        copyDS.outputDS();

    }
}
