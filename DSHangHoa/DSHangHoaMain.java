/*
DANG THANH TOAN
2280603288
22DTHG6
 */
package DSHangHoa;
import java.util.*;
import HangHoa.*;
public class DSHangHoaMain
{
    public static void main(String[] args)
    {
        DSHangHoa dshh = new DSHangHoa();
        HangHoa h;
        byte chon;
        dshh.init();
        Scanner x = new Scanner(System.in);
        do
        {
            System.out.println("\n\n");
            System.out.println("1.Thêm một mặt hàng vào danh sách");
            System.out.println("2.Xuất mặt hàng theo loại");
            System.out.println("0.Thoát");
            System.out.println("Chọn chức năng: ");
            chon = x.nextByte();
            switch (chon)
            {
                case 1:
                {
                    System.out.println("\n======MENU=========");
                    System.out.println("1.Mặt hàng điện máy");
                    System.out.println("2.Mặt hàng thực phẩm");
                    System.out.println("====================");
                    System.out.println("Chọn chức năng");
                    byte loai = x.nextByte();
                    if (loai == 1)
                    {
                        h = new HangDM();
                    }
                    else
                    {
                        h = new HangTP();
                        h.input();
                        dshh.themHH(h);
                        break;
                    }
                }
                case 2:
                {
                    System.out.println("2.Xuất danh sách mặt hàng theo loại[1.Điện máy, 2.Thực phẩm]: ");
                    byte loaiMH = x.nextByte();
                    dshh.xuatDSTheoLoai(loaiMH);
                    break;
                }
                default:
                {
                    chon = 0;
                }
            }
        }
        while (chon != 0);
    }
}
