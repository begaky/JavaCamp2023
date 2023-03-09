
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		
		krediUI.KrediListele(new TarimKrediManager());

	}

}
