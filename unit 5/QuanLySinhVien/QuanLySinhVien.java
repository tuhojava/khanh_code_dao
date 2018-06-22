package MT_1_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySinhVien {
	public String hoten;
	public String masv;
	public double diem;
	static Scanner sc = new Scanner(System.in);
	
	
	public QuanLySinhVien() {
		
	}

	public QuanLySinhVien(String hoten, String masv, double diem) {
		
		this.hoten = hoten;
		this.masv = masv;
		this.diem = diem;
	}
	public void nhap() {
		System.out.print(" nhap ten sinh vien : ");
		hoten = sc.nextLine();
		System.out.print(" nhap ma sinh vien : ");
		masv = sc.nextLine();
		System.out.print(" nhap diem sinh vien : ");
		diem = Double.parseDouble(sc.nextLine());
	}
	public void xeploai() {
		if(diem<5) {
			System.out.println(" xep loai : yeu .");
		}
		else if(diem>=5 && diem<6.5) {
			System.out.println(" xep loai : trung binh .");
		}
		else if(diem >=6.5 && diem<8) {
			System.out.println(" xep loai : kha .");
		}
		else if(diem >=8 && diem<9) {
			System.out.println(" xep loai : gioi .");
		}
		else {
			System.out.println(" xep loai : xuat sat .");
		}
	}
	public void xuat() {
		System.out.printf("\n\t%-20s %-10s %-10s ",hoten , masv , diem);
	}
	
	public static void main(String[] args) {
		ArrayList <QuanLySinhVien> danhsach = new ArrayList<>();
		int [] array;
		
		System.out.println(" 1 : nhap thong tin sinh vien .");
		System.out.println(" 2 : hien thi toan bo thong tin sinh vien .");
		System.out.println(" 3 : hien thi sinh vien co hoc luc gioi .");
		System.out.println(" 4 : sap xep sinh vien theo diem .");
		System.out.println(" 5 : thoat chuong trinh .");
		System.out.println("-------------------------------");
		int luachon ;
		
		do {
		System.out.println(" moi ban nhap lua chon .");
		luachon = Integer.parseInt(sc.nextLine());
		
		
		switch(luachon) {
		case 1 : {
			System.out.print(" nhap vao so luong sinh vien : ");
			int n = Integer.parseInt(sc.nextLine());
			array = new int[n];
			for(int i = 0 ; i<array.length; i++) {
				QuanLySinhVien sv = new QuanLySinhVien();
				System.out.println(" thong tin sinh vien thu : "+(i+1));
				sv.nhap();
				danhsach.add(sv);
			}
			
			break;
		}
		case 2 :{
			System.out.println(" --HIEN THI TOAN BO SINH VIEN CO TRONG DANH SACH --");
			for(int i=0 ;i<danhsach.size(); i++) {
				System.out.printf("\n\t%-20s %-10s %-5s "," Ho ten SV" , "Ma SV" , "Diem");
				danhsach.get(i).xuat();
				danhsach.get(i).xeploai();
			}
			System.out.println("");
			break;
		}
		case 3 :{
			
			break;
		}
		case 4 :{
			Collections.sort(danhsach, (QuanLySinhVien sv1 , QuanLySinhVien sv2) ->{
				if(sv1.diem > sv2.diem) {
					return -1;
				}
				else if(sv1.diem <sv2.diem) {
					return 1;
				}
				else {
					return 0;
				}
				
			});
			System.out.printf("\n\t%-20s %-10s %-5s "," Ho ten SV" , "Ma SV" , "Diem");
			for(int i =0; i < danhsach.size(); i++) {
				danhsach.get(i).xuat();
				danhsach.get(i).xeploai();
				System.out.println("");
			}
			break;
		}
		case 5 :{
			System.out.println(" ban da thoat chuong trinh .");
			break;
		}
		
		}
	}while(luachon !=5);
	}
		
	
}
