package MT_1_OOP;

	public class BienLai extends HoDan {
		public int chiSoCu;
		public int chiSoMoi;
		public double soTienTra;
		
		@Override
		public void nhap() {
			super.nhap();
			System.out.print(" nhap so cu : ");
			chiSoCu = Integer.parseInt(sc.nextLine());
			System.out.print(" nhap so moi : ");
			chiSoMoi = Integer.parseInt(sc.nextLine());
		}
		@Override
		public void xuat() {
			super.xuat();
			System.out.println(" chi so cu : "+chiSoCu);
			System.out.println(" chi so moi : "+chiSoMoi);
			System.out.println(" so tien tra : "+(chiSoMoi-chiSoCu)*750);
		}

	}

