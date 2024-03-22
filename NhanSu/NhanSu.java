package NhanSu;
/*
//DANG THANH TOAN
//2280603288
//22DTHG6
 */
import java.util.Scanner;
public class NhanSu
{
    private String manhansu;
    private String hoten;
    private String chuyenmon;
    Scanner s = new Scanner(System.in);
    public NhanSu()
    {
        super();
        this.manhansu = "";
        this.hoten = "";
        this.chuyenmon = "";
    }
    public NhanSu(NhanSu ns)
    {
        this.manhansu = ns.manhansu;
        this.hoten = ns.hoten;
        this.chuyenmon = ns.chuyenmon;
    }
    public NhanSu(String manhansu, String hoten, String chuyenmon)
    {
        super();
        this.manhansu = manhansu;
        this.hoten = hoten;
        this.chuyenmon = chuyenmon;
    }
    public String getMaso()
    {
        return manhansu;
    }
    public void setMaso(String maso)
    {
        this.manhansu = maso;
    }
    public String getHoten()
    {
        return hoten;
    }
    public void setHoten(String hoten)
    {
        this.hoten = hoten;
    }
    public String getChuyenmon()
    {
        return chuyenmon;
    }
    public void setChuyenmon(String chuyenmon)
    {
        this.chuyenmon = chuyenmon;
    }
    public void input()
    {
        System.out.print("Nhập tên nhân sự : ");
        hoten = s.nextLine();
        System.out.print("Nhập mã nhân sự : ");
        manhansu = s.nextLine();
        System.out.print("Nhập chuyên môn: ");
        chuyenmon = s.nextLine();
        s.nextLine();
    }
    public String toString()
    {
        return String.format("| %10s | %5s | %10s |", this.hoten, this.manhansu, this.chuyenmon);
    }
}