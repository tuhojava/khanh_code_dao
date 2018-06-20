package MT_1_OOP;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

abstract public class SinhVienFPT {
	public String hoten;
	public String nghanhhoc;
	
	Scanner sc = new Scanner (System.in);
	
	public void nhap() {
		System.out.println(" nhap ten sinh vien : ");
		hoten = sc.nextLine();
		System.out.println(" nhap nghanh hoc : ");
		nghanhhoc = sc.nextLine();
	}
	abstract public double getdiem() ;
	
	public String gethocLuc() {
		
		if(getdiem() < 5) {
			return "Yeu";
		}
		else if(getdiem() < 6.5){
			return " Trung Binh ";
		}
		else if(getdiem() < 7.5){
			return "Tien Tien ";
		}
		else if (getdiem() < 9){
			return " Gioi ";
		}
		else {
			return " Xuat Sat";
		}
		
	}	
	
	public void xuat() {
		System.out.println(" ten sinh vien : "+hoten);
		System.out.println(" nghanh hoc : "+nghanhhoc);
	}
}
