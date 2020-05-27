package domain;

class Temperatura {
    
	@override
	Bool filtraSegunCaracterista(Prenda prenda){
    return prenda.temperaturaMaxima > clima.getTemperatura(); 
	}
}
