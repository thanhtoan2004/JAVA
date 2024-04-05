/*
DANG THANH TOAN
2280603288
22DTHG6
 */
package HangHoa;
public class HangHoaMain {
    public static void main(String[] args) {
        HangHoa hh = new HangHoa();
        HangDM maylanh = new HangDM();
        HangTP banhkeo = new HangTP();
        System.out.println("Nhap thong tin hang hoa: ");
        hh.input();
        System.out.println("Xuat thong tin hang hoa: ");
        hh.output();
        System.out.println("\nNhap thong tin dien may : ");
        maylanh.input();
        System.out.println("Xuat thong tin dien may : ");
        maylanh.output();
        System.out.println("\nNhap thong tin hang thuc pham: ");
        banhkeo.input();
        System.out.println("Xuat thong tin hang thuc pham: ");
        banhkeo.output();
    }
}
