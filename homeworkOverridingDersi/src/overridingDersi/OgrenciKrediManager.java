package overridingDersi;

public class OgrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {   //ezilmesini istemiyorsak final yazar�z.
		return tutar * 1.10;
		
	}

}