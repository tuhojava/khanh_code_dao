package MT_1_OOP;

import java.util.Scanner;

public  class SinhVienBiz extends SinhVienFPT {
	public double diemmarketing;
	public double diemsales;
	public double diemtb;
	
	Scanner sc = new Scanner(System.in);
	
	public void nhap() {
		super.nhap();
		System.out.print(" nhap diem marketing : ");
		diemmarketing = Double.parseDouble(sc.nextLine());
		System.out.print(" nhap diem sales : ");
		diemsales = Double.parseDouble(sc.nextLine());
	
	}
	
	@Override
	public double getdiem() {
			
		diemtb = ((2*diemmarketing) + diemsales)/3;
		return diemtb;
		
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println(" diem trung binh : "+diemtb);
		System.out.println(" xep laoi : "+gethocLuc());
	}
	public static void main(String[] args) {
		SinhVienBiz biz = new SinhVienBiz();
		biz.nhap();
		biz.getdiem();
		biz.gethocLuc();
		biz.xuat();
	}
}
