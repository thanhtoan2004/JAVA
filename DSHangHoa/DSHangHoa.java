/*
DANG THANH TOAN
2280603288
22DTHG6
 */
package DSHangHoa;
import HangHoa.*;
public class DSHangHoa
{
    private HangHoa[] ds = new HangHoa[100];
    private int sl = 0;
    public void themHH(HangHoa h)
    {
        ds[sl++] = h;
    }
    public void xuatDSTheoLoai(byte loaiMH)
    {
        if(loaiMH == 1)
        {
            HangDM td = new HangDM();
            td.keNgang();
            td.tieuDe();
            td.keNgang();
            for(int i = 0; i < sl; i++)
            {
                if(ds[i] instanceof HangDM)
                {
                    ds[i].output();
                }
            }
            td.keNgang();
        }
        else if (loaiMH == 2)
        {
            HangTP td = new HangTP();
            td.keNgang();
            td.tieuDe();
            td.keNgang();
            for(int i = 0; i < sl; i++)
            {
                if(ds[i] instanceof HangTP)
                {
                    ds[i].output();
                }
            }
            td.keNgang();

        }
    }
    public void init()
    {
        ds[0] = new HangDM("DM1", "Tủ Lạnh",  1000, 2, 110, 50);
        ds[1] = new HangTP("TP1", "Thịt Heo", 120,  "10/10/2021", "10/10/2022");
        ds[2] = new HangDM("DM1", "Máy Lạnh", 2000, 2, 110, 50);
        ds[3] = new HangDM("DM1", "Máy Giat", 1000, 2, 110, 200);
        ds[4] = new HangTP("TP1", "Thịt Bò",  120,  "9/10/2021", "9/10/2022");
        ds[5] = new HangDM("DM1", "Máy Sấy",  2000, 2, 110, 200);
        ds[6] = new HangDM("DM1", "Ti Vi",    1000, 2, 110, 200);
        ds[7] = new HangDM("DM1", "Quạt Máy", 1000, 2, 110, 200);
        ds[8] = new HangTP("TP1", "Cá",       120,  "9/10/2021", "9/10/2022");
        ds[9] = new HangTP("TP1", "Rau",      120,  "9/10/2021", "9/10/2022");
        ds[10] = new HangDM("DM1", "Lò sưởi", 1000, 2, 110, 200);
        sl+= 11;
    }
}
