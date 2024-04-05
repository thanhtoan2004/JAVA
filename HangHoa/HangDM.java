/*
DANG THANH TOAN
2280603288
22DTHG6
 */
package HangHoa;
import java.util.Scanner;
public class HangDM extends HangHoa {
    private int thoigianbaohanh;
    private int dienap;
    private int congsuat;
    public HangDM()
    {
        super();
    }
    public HangDM(String maHang, String tenHang, long donGia, int thoigianbaohanh, int dienap, int congsuat) {
        super(maHang, tenHang, donGia);
        this.thoigianbaohanh = thoigianbaohanh;
        this.dienap = dienap;
        this.congsuat = congsuat;
    }
    public HangDM(HangDM obj) {
        super(obj.getMaHang(), obj.getTenHang(), obj.getDonGia());
        this.thoigianbaohanh = obj.thoigianbaohanh;
        this.dienap = obj.dienap;
        this.congsuat = obj.congsuat;
    }
    public void input() {
        super.input();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh : ");
        thoigianbaohanh = x.nextInt();
        System.out.print("Nhap dien ap  : ");
        dienap = x.nextInt();
        System.out.print("Nhap cong suat: ");
        congsuat = x.nextInt();
    }
    public void output() {
        super.output();
        System.out.printf("|%10s|%10s|%10s|\n", thoigianbaohanh, dienap, congsuat);
    }
}