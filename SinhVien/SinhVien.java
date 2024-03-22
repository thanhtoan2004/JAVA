package SinhVien;
import java.util.Scanner;
public class SinhVien
{
    private String maso;
    private String hoten;
    private float dtb;
    Scanner s= new Scanner(System.in);
    public SinhVien()
    {
        super();
        this.maso = "";
        this.hoten = "";
        this.dtb = 1.0f;
    }
    public SinhVien(SinhVien sv)
    {
        this.maso = sv.maso;
        this.hoten = sv.hoten;
        this.dtb = sv.dtb;
    }
    public SinhVien(String maso, String hoten, float dtb)
    {
        super();
        this.maso = maso;
        this.hoten = hoten;
        this.dtb = dtb;
    }
    public String getMaso()
    {
        return maso;
    }
    public void setMaso(String maso)
    {
        this.maso = maso;
    }
    public String getHoten()
    {
        return hoten;
    }
    public void setHoten(String hoten)
    {
        this.hoten = hoten;
    }
    public float getDtb()
    {
        return dtb;
    }
    public void setDtb(float dtb)
    {
        this.dtb = dtb;
    }
    public void input()
    {
        System.out.print("Nhập tên : ");
        hoten = s.nextLine();
        System.out.print("Nhập mã số : ");
        maso = s.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        dtb = s.nextInt();
        s.nextLine();
    }
    public String toString()
    {
        return String.format("| %10s | %5s | %5.1f |", this.hoten, this.maso, this.dtb);
    }
}