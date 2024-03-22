package NhanVien;
/*
//DANG THANH TOAN
//2280603288
//22DTHG6
 */
import java.util.Scanner;
public class DSNhanVien
{
    private int n;
    private NhanVien nv[];
    Scanner x = new Scanner(System.in);
    public DSNhanVien()
    {

    }
    public DSNhanVien(DSNhanVien ds)
    {
        this.n = ds.n;
        this.nv = ds.nv;
    }
    public DSNhanVien(int n, NhanVien[] nv)
    {
        this.n = n;
        this.nv = nv;
    }
    public int getN()
    {
        return n;
    }
    public void setN(int n)
    {
        this.n = n;
    }
    public NhanVien[] getSv()
    {
        return nv;
    }
    public void setSv(NhanVien[] sv)
    {
        this.nv = nv;
    }
    public void inputDS()
    {
        System.out.print("Nhập số người: ");
        n = x.nextInt();
        x.nextLine();
        nv = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            nv[i] = new NhanVien();
            nv[i].input();
        }
    }
    public void tieude()
    {
        khung();
        System.out.printf("| %-10s | %5s | %5s |\n", "  Họ tên", "Mã số", "Trình độ");
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
            System.out.println(nv[i].toString());
        }
        khung();
    }
    public void timkiemTrinhDo()
    {
        System.out.print("Nhập trình độ cần tìm: ");
        x.nextLine();
        String trinhDoCanTim = x.nextLine();
        tieude();
        for (int i = 0; i < n; i++)
        {
            if (nv[i].getTrinhdo().equalsIgnoreCase(trinhDoCanTim))
            {
                System.out.println(nv[i].toString());
            }
        }
        khung();
    }
    public void timkiemHoTen()
    {
        System.out.print("Nhập tên nhân viên cần tìm: ");
        String hoTenCanTim = x.nextLine();
        tieude();
        for (int i = 0; i < n; i++)
        {
            if (nv[i].getHoten().equalsIgnoreCase(hoTenCanTim))
            {
                System.out.println(nv[i].toString());
            }
        }
        khung();
    }
    public void themNV()
    {
        System.out.println("Nhập thông tin nhân viên mới: ");
        NhanVien[] newNv = new NhanVien[n + 1];
        for(int i = 0; i < n; i++)
        {
            newNv[i] = nv[i];
        }
        newNv[n] = new NhanVien();
        newNv[n].input();
        nv = newNv;
        n++;
    }
    public void xoaNV()
    {
        int a = -1;
        System.out.print("Nhập tên nhân viên cần xóa: ");
        String y = x.nextLine();
        for (int i = 0; i < n; i++)
        {
            if (nv[i].getHoten().equals(y))
            {
                a = i;
                break;
            }
        }
        if (a == -1)
        {
            System.out.println("Không tìm thấy nhân viên có mã số " + y);
            return;
        }
        for (int i = a; i < n - 1; i++)
        {
            nv[i] = nv[i + 1];
        }
        n--;
        nv[n] = null;
    }
    public void suatNV()
    {
        int a = -1;
        System.out.print("Nhập mã số nhân viên cần sửa: ");
        String z = x.nextLine();
        for (int i = 0; i < n; i++)
        {
            if (nv[i].getMaso().equals(z))
            {
                a = i;
                break;
            }
        }
        if (a == -1)
        {
            System.out.println("Không tìm thấy nhân viên có mã số là " + z);
            return;
        }
        System.out.println("Nhập thông tin mới cho nhân viên:");
        nv[a].input();
    }
    public DSNhanVien copy()
    {
        DSNhanVien copyList = new DSNhanVien();
        copyList.n = this.n;
        copyList.nv = new NhanVien[this.n];
        for (int i = 0; i < this.n; i++)
        {
            copyList.nv[i] = new NhanVien(this.nv[i]);
        }
        return copyList;
    }
}