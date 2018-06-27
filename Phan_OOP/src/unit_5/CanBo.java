package unit_5;

import java.util.Scanner;

public abstract class CanBo {

	public String hoTen;
	public double heSoLuong;
	public double phuCap;
	
	public CanBo() {
	}
	
	public CanBo(String hoten, double hesoluong, double phucap) {
		this.hoTen = hoten;
		this.heSoLuong = hesoluong;
		this.phuCap = phucap;
	}

	public String getHoten() {
		return hoTen;
	}

	public void setHoten(String hoten) {
		this.hoTen = hoten;
	}

	public double getHesoluong() {
		return heSoLuong;
	}

	public void setHesoluong(double hesoluong) {
		this.heSoLuong = hesoluong;
	}

	public double getPhucap() {
		return phuCap;
	}

	public void setPhucap(double phucap) {
		this.phuCap = phucap;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten can bo: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhap he so luong: ");
		this.heSoLuong = Double.parseDouble(sc.nextLine());
	}
	public void xuat() {
		System.out.println(" Ten can bo : "+hoTen);
		System.out.println(" He so luong : "+heSoLuong);
	}
	
	abstract public  double getTinhLuong();
	abstract public  double getPhuCap();
}
