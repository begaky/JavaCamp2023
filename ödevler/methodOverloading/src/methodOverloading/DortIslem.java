package methodOverloading;

public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2+ sayi3;
	}
	
	//iki methodun isimleri aynı olması fakat imzalarının farklı olması yani
	//birinde sayi1 sayi2 varken diğerinde sayi3 de var. İşte imzalarının farklı olmasına overloading denir.
}
