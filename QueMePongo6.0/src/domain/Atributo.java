package domain;

public abstract class Atributo {
	AdaptadorClima clima;
	
	bool filtraSegunCaracterista(Prenda prenda){}
	
	void cambiarAdaptador(AdaptadorClima clima) {
		this.clima = clima;
	}
}
