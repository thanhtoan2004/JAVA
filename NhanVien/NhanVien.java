package NhanVien;
/*
//DANG THANH TOAN
//2280603288
//22DTHG6
 */
import java.util.Scanner;
public class NhanVien
{
    private String manhanvien;
    private String hoten;
    private String trinhdo;
    Scanner s = new Scanner(System.in);
    public NhanVien()
    {
        super();
        this.manhanvien = "";
        this.hoten = "";
        this.trinhdo = "";
    }
    public NhanVien(NhanVien nv)
    {
        this.manhanvien = nv.manhanvien;
        this.hoten = nv.hoten;
        this.trinhdo = nv.trinhdo;
    }
    public NhanVien(String manhanvien, String hoten, String trinhdo)
    {
        super();
        this.manhanvien = manhanvien;
        this.hoten = hoten;
        this.trinhdo = trinhdo;
    }
    public String getMaso()
    {
        return manhanvien;
    }
    public void setMaso(String maso)
    {
        this.manhanvien = maso;
    }
    public String getHoten()
    {
        return hoten;
    }
    public void setHoten(String hoten)
    {
        this.hoten = hoten;
    }
    public String getTrinhdo()
    {
        return trinhdo;
    }
    public void setTrinhdo(String trinhdo)
    {
        this.trinhdo = trinhdo;
    }
    public void input()
    {
        System.out.print("Nhập tên sinh viên : ");
        hoten = s.nextLine();
        System.out.print("Nhập mã sinh viên : ");
        manhanvien = s.nextLine();
        System.out.print("Nhập trình độ : ");
        trinhdo = s.nextLine();
        s.nextLine();
    }
    public String toString()
    {
        return String.format("| %10s | %5s | %10s |", this.hoten, this.manhanvien, this.trinhdo);
    }
}