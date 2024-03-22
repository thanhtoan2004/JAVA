package NhanSu;
/*
//DANG THANH TOAN
//2280603288
//22DTHG6
 */
import java.util.Scanner;
public class DSNhanSu
{
    private int n;
    private NhanSu ns[];
    Scanner x = new Scanner(System.in);
    public DSNhanSu()
    {

    }
    public DSNhanSu(DSNhanSu ds)
    {
        this.n = ds.n;
        this.ns = ds.ns;
    }
    public DSNhanSu(int n, NhanSu[] sv)
    {
        this.n = n;
        this.ns = sv;
    }
    public int getN()
    {
        return n;
    }
    public void setN(int n)
    {
        this.n = n;
    }
    public NhanSu[] getSv()
    {
        return ns;
    }
    public void setSv(NhanSu[] sv)
    {
        this.ns = ns;
    }
    public void inputDS()
    {
        System.out.print("Nhập số người: ");
        n = x.nextInt();
        x.nextLine();
        ns = new NhanSu[n];
        for (int i = 0; i < n; i++) {
            ns[i] = new NhanSu();
            ns[i].input();
        }
    }
    public void tieude()
    {
        khung();
        System.out.printf("| %-10s | %5s | %5s |\n", "  Họ tên", "Mã số", "Chuyên môn");
        khung();
    }
    public void khung()
    {
        System.out.printf("+ ---------- | ----- | ---------- +\n");
    }
    public void outputDS()
    {
        tieude();
        for (int i = 0; i < n; i++)
        {
            System.out.println(ns[i].toString());
        }
        khung();
    }
    public void timkiemChuyenMon()
    {
        System.out.print("Nhập chuyên môn cần tìm: ");
        x.nextLine();
        String chuyenMonCanTim = x.nextLine();
        tieude();
        for (int i = 0; i < n; i++)
        {
            if (ns[i].getChuyenmon().equalsIgnoreCase(chuyenMonCanTim))
            {
                System.out.println(ns[i].toString());
            }
        }
        khung();
    }
    public void timkiemHoTen()
    {
        System.out.print("Nhập tên nhân sự cần tìm: ");
        String hoTenCanTim = x.nextLine();
        tieude();
        for (int i = 0; i < n; i++)
        {
            if (ns[i].getHoten().equalsIgnoreCase(hoTenCanTim))
            {
                System.out.println(ns[i].toString());
            }
        }
        khung();
    }
    public void themNS()
    {
        System.out.println("Nhập thông tin nhân sự mới: ");
        NhanSu[] newNs = new NhanSu[n + 1];
        for(int i = 0; i < n; i++)
        {
            newNs[i] = ns[i];
        }
        newNs[n] = new NhanSu();
        newNs[n].input();
        ns = newNs;
        n++;
    }
    public void xoaNS()
    {
        int a = -1;
        System.out.print("Nhập tên nhân sự cần xóa: ");
        String y = x.nextLine();
        for (int i = 0; i < n; i++)
        {
            if (ns[i].getHoten().equals(y))
            {
                a = i;
                break;
            }
        }
        if (a == -1)
        {
            System.out.println("Không tìm thấy nhân sự có mã số " + y);
            return;
        }
        for (int i = a; i < n - 1; i++)
        {
            ns[i] = ns[i + 1];
        }
        n--;
        ns[n] = null;
    }
    public void suaNS()
    {
        int a = -1;
        System.out.print("Nhập mã số nhân sự cần sửa: ");
        String z = x.nextLine();
        for (int i = 0; i < n; i++)
        {
            if (ns[i].getMaso().equals(z))
            {
                a = i;
                break;
            }
        }
        if (a == -1)
        {
            System.out.println("Không tìm thấy nhân sự có mã số là " + z);
            return;
        }
        System.out.println("Nhập thông tin mới cho nhân sự:");
        ns[a].input();
    }
    public DSNhanSu copy()
    {
        DSNhanSu copyList = new DSNhanSu();
        copyList.n = this.n;
        copyList.ns = new NhanSu[this.n];
        for (int i = 0; i < this.n; i++)
        {
            copyList.ns[i] = new NhanSu(this.ns[i]);
        }
        return copyList;
    }
}