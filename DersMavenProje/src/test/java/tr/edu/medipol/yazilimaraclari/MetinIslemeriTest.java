package tr.edu.medipol.yazilimaraclari;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemeriTest {

	@Test
	public void testBuyukHarfCevir() {
		String ornek1 = "zahit can karaca";
		String sonuc = MetinIslemleri.buyukHarfCevir(ornek1);
		assertEquals("ZAHÝT CAN KARACA",sonuc);
	}

	@Test
	public void testBuyukHarfCevirNull() {
		String ornek1 = null;
		String sonuc = MetinIslemleri.buyukHarfCevir(ornek1);
		assertEquals(null,sonuc);
	}
	
	@Test
	public void testBuyukHarfCevirBos() {
		String ornek1 = "";
		String sonuc = MetinIslemleri.buyukHarfCevir(ornek1);
		assertEquals("",sonuc);
	}

}
