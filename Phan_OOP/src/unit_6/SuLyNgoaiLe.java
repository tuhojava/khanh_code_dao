package unit_6;

public class SuLyNgoaiLe extends Exception{
	public String st;
	
	public SuLyNgoaiLe() {

	}
	
	public SuLyNgoaiLe(String stHoTen){
	this.st = stHoTen;
	}
	@Override
	public String toString() {
	return this.st;
	}
	
	
   // su ly ngoai le khi de ho ten rong
	static public void chkHoTen(String hoTen) throws SuLyNgoaiLe {
		if (hoTen.equals("")) {
			throw new SuLyNgoaiLe("Ho ten rong");
		}	
	}
	
//su ly ngoai le khi nhap diem <0 va >10 
	static public void chkDiem(double diem) throws SuLyNgoaiLe {
		if(diem < 0 || diem >10) {
			throw new SuLyNgoaiLe(" diem nhap vao khong dung ");
		}
	}
	// su ly khi nhap vao tuoi <0 va >100
	static public void chkTuoi(int tuoi) throws SuLyNgoaiLe {
		if(tuoi < 0 || tuoi >100) {
			throw new SuLyNgoaiLe(" tuoi phai >0 va <= 100 ");
		}
	}
	// su ly khi ma sv rong
	static public void chkmasv(String masv) throws SuLyNgoaiLe {
		if (masv.equals("")) {
			throw new SuLyNgoaiLe("Ma sv rong");
		}	
	}
	
}
