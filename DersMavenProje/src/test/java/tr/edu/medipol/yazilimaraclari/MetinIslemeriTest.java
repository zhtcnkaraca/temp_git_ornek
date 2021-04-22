package tr.edu.medipol.yazilimaraclari;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetinIslemeriTest {

	@Test
	public void testBuyukHarfCevir() {
		String deneme = "zahit can karaca";
		String sonuc = MetinIslemleri.buyukHarfCevir(deneme);
		assertEquals("ZAHÝT CAN KARACA",sonuc);
	}

}
