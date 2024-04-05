/*
DANG THANH TOAN
2280603288
22DTHG6
 */
package HangHoa;
import java.util.Scanner;
public class HangTP extends HangHoa {
    private String ngaysx;
    private String ngayhh;

    public HangTP() {
        super();
    }
    public HangTP(String maHang, String tenHang, long donGia, String ngaysx, String ngayhh) {
        super(maHang, tenHang, donGia);
        this.ngaysx = ngaysx;
        this.ngayhh = ngayhh;
    }
    public HangTP(HangTP obj) {
        super(obj.getMaHang(), obj.getTenHang(), obj.getDonGia());
        this.ngaysx = obj.ngaysx;
        this.ngayhh = obj.ngayhh;
    }
    public void input() {
        super.input();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ngay san xuat : ");
        ngaysx = x.nextLine();
        System.out.print("Nhap ngay het han  : ");
        ngayhh = x.nextLine();
    }
    public void output() {
        super.output();
        System.out.printf("|%10s|%10s|\n", ngaysx, ngayhh);
    }
}