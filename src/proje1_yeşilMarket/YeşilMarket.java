package proje1_yeşilMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YeşilMarket {
	
	public static List <String> ürünler = new ArrayList<>();  // Global
	public static List <Double> fiyatlar = new ArrayList<>();
	
	public static List <String> sepetÜrünler = new ArrayList<>();
	public static List <Double> sepetKg = new ArrayList<>();
	public static List <Double> sepetFiyatlar = new ArrayList<>();
	
		
	public static void main(String[] args) {
		
		/* Yeşil Market alış-veriş programı.
		 * 
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL 
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL
					
		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve ödem sonrasında programı bitirinzi.
		 */
		Scanner scan = new Scanner(System.in);
		
		ürünler.addAll(Arrays.asList("Domates","Patates","Biber","Soğan","Havuç",
				                     "Elma","Muz","Çilek","Kavun","Üzüm","Limon"));
		
		
		fiyatlar.addAll(Arrays.asList(2.1, 3.2, 1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));	
		
		ürünListele();
		System.out.println("Ürününüzü numaraya göre seçiniz:");
		int ürünNo = scan.nextInt();
		System.out.println("Ağırlık giriniz:");
		double kg = scan.nextDouble();
		sepeteEkle(ürünNo, kg);
		
	}
	
	public static void ürünListele() {
		System.out.println("No\t Ürünler \tFiyatlar");
		System.out.println("===\t ======== \t========");
		
		for (int i = 0; i<ürünler.size(); i++) {
			System.out.println(" "+ i + "\t" + ürünler.get(i) + "\t \t   " + fiyatlar.get(i));
		}
	}
	
	public static void sepeteEkle(int ürünNo, double kg) {
		sepetÜrünler.add(ürünler.get(ürünNo));
		sepetKg.add(kg);
		sepetFiyatlar.add(fiyatlar.get(ürünNo) * kg);
		
	}
	
	
	
	

}
