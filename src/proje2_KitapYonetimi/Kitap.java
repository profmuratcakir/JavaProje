package proje2_KitapYonetimi;

public class Kitap {
	
	private int no;
	private String kitapAdi;
	private String yazarAdi;
	private int yayinYili;
	private double fiyat;
	
	public Kitap(int no, String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
		this.no = no;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.yayinYili = yayinYili;
		this.fiyat = fiyat;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public int getYayinYili() {
		return yayinYili;
	}

	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "No=" + no + ", Kitap Adı=" + kitapAdi + ", Yazar=" + yazarAdi + ", Yayın Yılı=" + yayinYili
				+ ", fiyat=" + fiyat;
	}
	
	


}
