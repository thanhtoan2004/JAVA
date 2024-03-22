package HangHoa;
/*
//DANG THANH TOAN
//2280603288
//22DTHG6
 */
import java.util.Scanner;
public class HangHoa {
    private String maHang;
    private String tenHang;
    private long donGia;
    Scanner scanner = new Scanner(System.in);
    public HangHoa()
    {
        this.maHang = "";
        this.tenHang = "";
        this.donGia = 0;
    }
    public HangHoa(HangHoa hh)
    {
        this.maHang = hh.maHang;
        this.tenHang = hh.tenHang;
        this.donGia = hh.donGia;
    }
    public HangHoa(String maHang, String tenHang, long donGia)
    {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    public String getMaHang()
    {
        return maHang;
    }
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
    public String getTenHang()
    {
        return tenHang;
    }
    public void setTenHang(String tenHang)
    {
        this.tenHang = tenHang;
    }
    public long getDonGia()
    {
        return donGia;
    }

    public void setDonGia(long donGia)
    {
        this.donGia = donGia;
    }

    public void nhapHangHoa()
    {
        System.out.print("Nhập mã hàng: ");
        maHang = scanner.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextLong();
    }
    @Override
    public String toString()
    {
        return String.format("| %10s | %10s | %10d |", this.maHang, this.tenHang, this.donGia);
    }
}
