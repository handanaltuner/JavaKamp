package overridingDersi;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {   //ezilmesini istemiyorsak final yazarız.
		return tutar * 1.10;
		
	}

}