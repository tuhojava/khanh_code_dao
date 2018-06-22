package MT_1_OOP;

import java.util.Scanner;

public class SinhVienIT extends SinhVienFPT{
	public double diemjava;
	public double diemhtml;
	public double diemcss;
	public double diemtb;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public double getdiem() {
		System.out.print(" nhap diem java : ");
		diemjava = Double.parseDouble(sc.nextLine());
		System.out.print(" nhap diem html : ");
		diemhtml = Double.parseDouble(sc.nextLine());
		System.out.print(" nhap diem css : ");
		diemcss = Double.parseDouble(sc.nextLine());
		
		diemtb = (2*diemjava + diemhtml + diemcss)/4;
		return diemtb ;
	
	}
	public static void main(String[] args) {
		SinhVienIT it = new SinhVienIT();
		it.nhap();
		it.getdiem();
		it.gethocLuc();
	}
}
