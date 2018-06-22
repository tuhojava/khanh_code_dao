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
		if(getdiem() <5) {
			System.out.println(" xep loai : Yeu ");
		}
		else if(getdiem() >=5 && getdiem()< 6.5){
			System.out.println(" xep loai : Trung Binh ");
		}
		else if(getdiem() >= 6.5 && getdiem()< 7.5){
			System.out.println(" xep loai : Tien Tien ");
		}
		else if (getdiem() >= 7.5 && getdiem()<= 9){
			System.out.println(" sep loai : Gioi ");
		}
		else {
			System.out.println(" xep loai : Xuat Sat");
		}
		return null;
	}	
	
	public void xuat() {
		System.out.println(" ten sinh vien : "+hoten);
		System.out.println(" nghanh hoc : "+nghanhhoc);
	}
}
