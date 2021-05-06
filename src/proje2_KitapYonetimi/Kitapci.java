package proje2_KitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//		1.	Kullanıcının Kitap ekleme, silme ve listeleme gibi 
//			işlemleri yapmasına imkan tanıyan bir uygulama yazınız. 
//	
//		2.	Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermeli. 
//			Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir. 
//	
//		3.	Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
//			Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir. 
//	
//			========= KITAP PROGRAMI =============
//				1: Kitap ekle 
//				2: Numara ile kitap sil
//				3: Tüm kitapları listele
//				4: Bitir 

public class Kitapci {
	
	public static int  kitapNo = 1000; // Global Değişken
	
	public static void main(String[] args) {

		List <Kitap> kitapListe = new ArrayList<>();
		topluKitapEkle(kitapListe);
		menu(kitapListe);

	}

	 private static void topluKitapEkle(List <Kitap> liste) {
		 Kitap kitap1 = new Kitap(++kitapNo, "Ali Can evde", "ali han", 2001, 11);
		 Kitap kitap2 = new Kitap(++kitapNo, "Ali Can yolda", "ali han", 2005, 10);
		 Kitap kitap3 = new Kitap(++kitapNo, "Yanlizlik", "Veli Kul", 2005, 21);
		 Kitap kitap4 = new Kitap(++kitapNo, "Sen", "Ayse Unal", 2005, 30);
	
		 liste.add(kitap1);
		 liste.add(kitap2);
		 liste.add(kitap3);
		 liste.add(kitap4);
	 }

	 private static void menu(List <Kitap> liste) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("========= KİTAP PROGRAMI =============");
		 System.out.println(" 1: Kitap ekle " + "\n 2: Numara ile kitap sil" + "\n "
		 		+ "3: Tum kitaplari listele"  + "\n 4: Bitir \n");
		 System.out.print("Lutfen tercihinizi giriniz:");
		 
		 int tercih = scan.nextInt();
		 
		 switch (tercih) {
		 	case 1:
		 		kitapEkle(liste);
		 		break;
	        case 2:
	        	noIleKitapSil(liste);
	           break;
	        case 3:
	            tumKitaplariListele(liste);
	            break;
	        case 4:
	            bitir();
	            break;
	        default:
	           System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyin");
	           menu(liste);
	        }

	    }
	 
	 	private static void kitapEkle(List <Kitap> liste) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Kitap adi giriniz");
	        String kitapAdi = scan.nextLine();
	        System.out.println("Yazar adi giriniz");
	        String yazarAdi = scan.nextLine();
	        System.out.println("Kitap yayin yilini giriniz");
	        int yayinYili = scan.nextInt();
	        System.out.println("Kitap fiyatini giriniz");
	        double fiyat = scan.nextDouble();
	        Kitap kitap = new Kitap(++kitapNo,kitapAdi, yazarAdi, yayinYili, fiyat);
	        liste.add(kitap);
	        System.out.println(kitap.toString() + " eklendi");
	        menu(liste);
	    }

	    private static void tumKitaplariListele(List <Kitap> liste) {
	        for (Kitap k  : liste){
	        	System.out.println(k.toString());
	        }
	        menu(liste);
	    }

	    private static void noIleKitapSil(List <Kitap> liste) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Silmek istediginiz kitabin numarasini giriniz");
	        int kitapNo = scan.nextInt();
	        for(Kitap k : liste) {
	        	if(k.getNo() == kitapNo) {
	        		System.out.println(k.toString() + " silindi");
	        		liste.remove(k);
	        		menu(liste);
	           	}
	        }
	    	System.out.println(kitapNo + " numaralı kitap bulunamadı");
	        menu(liste);
	    }

	    private static void bitir() {
	        System.out.println("Programi kullandiginiz icin tesekkurler");

	    }
}

