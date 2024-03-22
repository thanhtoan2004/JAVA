package HangHoa;
/*
//DANG THANH TOAN
//2280603288
//22DTHG6
 */
import java.util.Scanner;
public class DSHangHoa
{
    private int n;
    private HangHoa hh[];
    Scanner x = new Scanner(System.in);
    public DSHangHoa(DSHangHoa ds)
    {
        this.n = ds.n;
        this.hh = ds.hh;
    }
    public DSHangHoa(int n, HangHoa[] hh)
    {
        this.n = n;
        this.hh = hh;
    }
    public DSHangHoa()
    {
    }
    public int getN()
    {
        return n;
    }
    public void setN(int n)
    {
        this.n = n;
    }
    public HangHoa[] getSv()
    {
        return hh;
    }
    public void setHh(HangHoa[] hh)
    {
        this.hh = hh;
    }
    public void inputDS()
    {
        System.out.print("Nhập số hàng hóa : ");
        n = x.nextInt();
        x.nextLine();
        hh = new HangHoa[n];
        for (int i = 0; i < n; i++)
        {
            hh[i] = new HangHoa();
            hh[i].nhapHangHoa();
        }
    }
    public void tieude() {
        khung();
        System.out.printf("| %-10s | %10s | %10s |\n", "  Mã hàng", "Tên hàng", "Đơn giá");
        khung();
    }
    public void khung()
    {
        System.out.printf("+ ---------- | ---------- | ---------- +\n");
    }
    public void outputDS()
    {
        tieude();
        for (int i = 0; i < n; i++)
        {
            System.out.println(hh[i].toString());
        }
        khung();
    }

    public void timkiemTenHang()
    {
        System.out.print("Nhập tên hàng cần tìm: ");
        String tenHangCanTim = x.nextLine();
        tieude();
        for (int i = 0; i < n; i++)
        {
            if (hh[i].getTenHang().equalsIgnoreCase(tenHangCanTim))
            {
                System.out.println(hh[i].toString());
            }
        }
        khung();
    }

    public void themHangHoa()
    {
        System.out.println("Nhập thông tin hàng hóa mới: ");
        HangHoa[] newHH = new HangHoa[n + 1];
        for (int i = 0; i < n; i++)
        {
            newHH[i] = hh[i];
        }
        newHH[n] = new HangHoa();
        newHH[n].nhapHangHoa();
        hh = newHH;
        n++;
    }
    public void xoaHangHoa()
    {
        int a = -1;
        System.out.print("Nhập tên hàng cần xóa: ");
        String tenHangXoa = x.nextLine();
        for (int i = 0; i < n; i++)
        {
            if (hh[i].getTenHang().equalsIgnoreCase(tenHangXoa))
            {
                a = i;
                break;
            }
        }
        if (a == -1)
        {
            System.out.println("Không tìm thấy hàng hóa có tên " + tenHangXoa);
            return;
        }
        for (int i = a; i < n - 1; i++)
        {
            hh[i] = hh[i + 1];
        }
        n--;
        hh[n] = null;
    }
    public void suaHangHoa()
    {
        int a = -1;
        System.out.print("Nhập mã số hàng hóa cần sửa: ");
        String maHangSua = x.nextLine();
        for (int i = 0; i < n; i++)
        {
            if (hh[i].getMaHang().equals(maHangSua))
            {
                a = i;
                break;
            }
        }
        if (a == -1)
        {
            System.out.println("Không tìm thấy hàng hóa có mã số " + maHangSua);
            return;
        }
        System.out.println("Nhập thông tin mới cho hàng hóa:");
        hh[a].nhapHangHoa();
    }
    public DSHangHoa copy()
    {
        DSHangHoa copyList = new DSHangHoa();
        copyList.n = this.n;
        copyList.hh = new HangHoa[copyList.n];
        for (int i = 0; i < this.n; i++)
        {
            copyList.hh[i] = new HangHoa(this.hh[i]);
        }
        return copyList;
    }
}
