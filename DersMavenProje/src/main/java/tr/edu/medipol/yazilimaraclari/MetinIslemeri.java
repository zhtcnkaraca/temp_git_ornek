package tr.edu.medipol.yazilimaraclari;

public class MetinIslemeri {

	public static void main(String[] args) {
		String ornek1 = "Merhaba Arkadaþlar";
		String sonuc1 = MetinIslemeri.buyukHarfCevir(ornek1);
		System.out.println(ornek1 + " " + sonuc1);
		
	}
	
	static String buyukHarfCevir(String orjinalMetin) {
		if(orjinalMetin == null) {
			return orjinalMetin;
		}
		return orjinalMetin.toUpperCase();
	}

}
