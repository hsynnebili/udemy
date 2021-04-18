package udemy;

public interface IMuhendis {

	void askerlik_durumu_sorgula();

	String mezuniyet_ortalamasi(double derece);

	void adli_sicil_sorgula();

	void is_tecrubesi(String[] array);

}

class PcMuhendisi implements IMuhendis {

	private boolean askerlik;
	private boolean adli_sicil;

	public PcMuhendisi(boolean askerlik, boolean adli_sicil) {

		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}

	public void askerlik_durumu_sorgula() {
		if (askerlik) {
			System.out.println("Askerligimi yaptim");
		}

		else {
			System.out.println("Askerligimi yapmadim.");
		}
	}

	@Override
	public String mezuniyet_ortalamasi(double derece) {
		System.out.println(derece);
		return "Ortalamam =" + derece;
	}

	@Override
	public void adli_sicil_sorgula() {
		if (adli_sicil) {
			System.out.println("Adli sicil kaydim var.");
		} else {
			System.out.println("Adli sicil kaydim yoktur.");
		}

	}

	@Override
	public void is_tecrubesi(String[] array) {
		System.out.println("Bilgisayar muhendisi olarak su sirketlerde calistim");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

	}

}

class MMuhendisi implements IMuhendis {
	private boolean askerlik;
	private boolean adli_sicil;

	public MMuhendisi(boolean askerlik, boolean adli_sicil) {

		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}

	@Override
	public void askerlik_durumu_sorgula() {

		if (askerlik) {
			System.out.println("Askerligimi yaptim");
		}

		else {
			System.out.println("Askerligimi yapmadim.");
		}

	}

	@Override
	public String mezuniyet_ortalamasi(double derece) {
		System.out.println(derece);
		return "Ortalamam= " + derece;
	}

	@Override
	public void adli_sicil_sorgula() {
		if (adli_sicil) {
			System.out.println("Adli sicil kaydim var.");
		} else {
			System.out.println("Adli sicil kaydim yoktur.");
		}
	}

	@Override
	public void is_tecrubesi(String[] array1) {
		System.out.println("Makine  muhendisi olarak su sirketlerde calistim");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);

		}

	}
}