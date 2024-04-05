/*
DANG THANH TOAN
2280603288
22DTHG6
 */
package HangHoa;
import java.util.Scanner;
public class HangHoa
{
    private String maHang;
    private String tenHang;
    private long donGia;
    public HangHoa()
    {
        super();
    }
    public HangHoa(String maHang, String tenHang, long donGia)
    {
        super();
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    public HangHoa(HangHoa obj)
    {
        super();
        this.maHang = obj.maHang;
        this.tenHang = obj.tenHang;
        this.donGia = obj.donGia;
    }
    public String getMaHang()
    {
        return maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public long getDonGia() {
        return donGia;
    }
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
    public void input()
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma hang : ");
        maHang = x.nextLine();
        System.out.print("Nhap ten hang : ");
        tenHang = x.nextLine();
        System.out.print("Nhap gia : ");
        donGia = x.nextLong();
    }
    public void keNgang()
    {
        System.out.printf("+ --------------- |---------------|--------------- +\n");
    }
    public void tieuDe() {
        keNgang();
        System.out.printf("| %-15s | %15s | %15s |\n", "  Mã hàng", "Tên hàng", "Đơn giá");
        keNgang();
    }
    public void output() {
        System.out.printf("|%15s|%15s|%15d|\n", maHang, tenHang, donGia);
    }
}
