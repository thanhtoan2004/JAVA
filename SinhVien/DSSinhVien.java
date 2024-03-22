package SinhVien;
import java.util.Scanner;
public class DSSinhVien
{
    private int n;
    private SinhVien sv[];
    Scanner x = new Scanner(System.in);
    public DSSinhVien()
    {
    }
    public DSSinhVien(DSSinhVien ds)
    {
        this.n = ds.n;
        this.sv = ds.sv;
    }
    public DSSinhVien(int n, SinhVien[] sv)
    {
        this.n = n;
        this.sv = sv;
    }
    public int getN()
    {
        return n;
    }
    public void setN(int n)
    {
        this.n = n;
    }
    public SinhVien[] getSv()
    {
        return sv;
    }
    public void setSv(SinhVien[] sv)
    {
        this.sv = sv;
    }
    public void inputDS()
    {
        System.out.print("Nhập số lượng : ");
        n = x.nextInt();
        sv = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            sv[i] = new SinhVien();
            sv[i].input();
        }
    }
    public void tieude()
    {
        khung();
        System.out.printf("| %-10s | %5s | %5.5s |\n", "  Họ tên", "Mã số", "Điểm");
        khung();
    }
    public void khung()
    {
        System.out.printf("+ ---------- | ----- | ----- +\n");
    }
    public void outputDS()
    {
        tieude();
        for (int i = 0; i < n; i++)
        {
            System.out.println(sv[i].toString());
        }
        khung();
    }
    public void sapxepDTB()
    {
        for (int i = 0; i < n - 1; i++)
        {
            if (sv[i].getDtb() > sv[i + 1].getDtb())
            {
                SinhVien temp = sv[i];
                sv[i] = sv[i + 1];
                sv[i + 1] = temp;
            }
        }
    }
    public void timkiemHoTen()
    {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        x.nextLine();
        String x1 = x.nextLine();
        tieude();
        for (int i = 0; i < n; i++) {
            if ((sv[i].getHoten()).compareTo(x1) == 0)
            {
                System.out.println(sv[i].toString());
            }
        }
        khung();
    }
    public void themSV()
    {
        System.out.println("Nhập thông tin sinh viên mới: ");
        SinhVien[] newSv = new SinhVien[n + 1];
        for (int i = 0; i < n; i++) {
            newSv[i] = sv[i];
        }
        newSv[n] = new SinhVien();
        newSv[n].input();
        sv = newSv;
        n++;
    }
    public void xoaSV()
    {
        int index = -1;
        System.out.print("Nhập tên sinh viên cần xóa: ");
        String x2 = x.nextLine();
        for (int i = 0; i < n; i++) {
            if (sv[i].getHoten().equals(x2)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Không tìm thấy sinh viên có mã số " + x2);
            return;
        }
        for (int i = index; i < n - 1; i++) {
            sv[i] = sv[i + 1];
        }
        n--;
        sv[n] = null;
    }
    public void suaSV()
    {
        int index = -1;
        System.out.print("Nhập mã số sinh viên cần sửa: ");
        String x3 = x.nextLine();
        for (int i = 0; i < n; i++) {
            if (sv[i].getMaso().equals(x3)) {
                index = i;
                break;
            }
        }
        if (index == -1)
        {
            System.out.println("Không tìm thấy sinh viên có mã số " + x3);
            return;
        }
        System.out.println("Nhập thông tin mới cho sinh viên:");
        sv[index].input();
    }
    public DSSinhVien copy()
    {
        DSSinhVien copyList = new DSSinhVien();
        copyList.n = this.n;
        copyList.sv = new SinhVien[this.n];
        for (int i = 0; i < this.n; i++)
        {
            copyList.sv[i] = new SinhVien(this.sv[i]);
        }
        return copyList;
    }
}