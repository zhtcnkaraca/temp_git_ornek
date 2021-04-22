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

}
