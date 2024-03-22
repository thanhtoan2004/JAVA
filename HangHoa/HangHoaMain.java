package HangHoa;
/*
//DANG THANH TOAN
//2280603288
//22DTHG6
 */
public class HangHoaMain
{
    public static void main(String[] args)
    {
        DSHangHoa ds = new DSHangHoa();
        ds.inputDS();
        ds.outputDS();
        ds.timkiemTenHang();
        System.out.println("Danh sách sau khi sắp xếp: ");
        ds.outputDS();
        System.out.println("---------------------------");
        ds.themHangHoa();
        ds.outputDS();
        ds.timkiemTenHang();
        ds.xoaHangHoa();
        System.out.println("Danh sách sau khi xóa: ");
        ds.outputDS();
        ds.suaHangHoa();
        ds.outputDS();
        DSHangHoa copyDS = ds.copy();
        System.out.println("Danh sách đã được nhân bản:");
        copyDS.outputDS();
    }
}
