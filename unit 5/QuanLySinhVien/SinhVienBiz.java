package MT_1_OOP;

import java.util.Scanner;

public  class SinhVienBiz extends SinhVienFPT {
	public double diemmarketing;
	public double diemsales;
	public double diemtb;
	
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public double getdiem() {
		System.out.print(" nhap diem marketing : ");
		diemmarketing = Double.parseDouble(sc.nextLine());
		System.out.print(" nhap diem sales : ");
		diemsales = Double.parseDouble(sc.nextLine());
		
		diemtb = ((2*diemmarketing) + diemsales)/3;
		return diemtb;
	}
	
	public static void main(String[] args) {
		SinhVienBiz biz = new SinhVienBiz();
		biz.nhap();
		biz.getdiem();
		biz.xuat();
		biz.gethocLuc();
	}
}
