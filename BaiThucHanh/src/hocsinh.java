import java.util.Scanner;

public class HocSinh {
    public String HoTen;
    public String QueQuan;
    public String GioiTinh;
    public int masv;
    public int NamSinh;
    public int Tuoi;
    public void nhapThongTinHs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap Ho va Ten sinh vien : ");
        HoTen = sc.nextLine();
        System.out.print("nhap que quan sinh vien : ");
        QueQuan = sc.nextLine();
        System.out.print("nhap gioi tinh : ");
        GioiTinh = sc.nextLine();
        System.out.print("nhap nam sinh : ");
        NamSinh = sc.nextInt();   
        System.out.print("nhap ma sinh vien : ");
        masv = sc.nextInt();

    }
    public int TinhTuoi(){
        Tuoi = 2024 - NamSinh;
        return Tuoi;
    }
    public void inThongTinHs()
    {
        System.out.println("Thong tin sinh vien :");
        System.out.println("Ten: "+HoTen);
        System.out.println("GioiTinh: " +GioiTinh);
        System.out.println("Ma so sinh vien: "+masv);
        System.out.println("Tuoi: "+Tuoi);
        System.out.println("Que quan: "+QueQuan);
    }
    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        hs.nhapThongTinHs();
        hs.TinhTuoi();
        hs.inThongTinHs();

    }
}
