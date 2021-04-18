package udemy;

public class IMuhendisTest {
	public static void main(String[] args) {

		IMuhendis muhendis1 = new PcMuhendisi(false, true);
		muhendis1.adli_sicil_sorgula();
		muhendis1.askerlik_durumu_sorgula();
		muhendis1.mezuniyet_ortalamasi(3.75);

		String[] tecrube = { "Vestel", "Arcelik", "Aselsan" };
		muhendis1.is_tecrubesi(tecrube);

		System.out.println("--------------Makine Muhendisi-------------");
		IMuhendis muhendis2 = new MMuhendisi(false, true);
		muhendis2.adli_sicil_sorgula();
		muhendis2.askerlik_durumu_sorgula();
		muhendis2.mezuniyet_ortalamasi(3.75);

		String[] tecrube1 = { "Tezmaksan", "Arcelik", "Aselsan" };
		muhendis2.is_tecrubesi(tecrube1);


	}
}
