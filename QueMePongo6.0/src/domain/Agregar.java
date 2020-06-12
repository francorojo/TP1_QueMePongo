package domain;

public class Agregar implements OperacionEnGuardarropa {
	Prenda prenda;
	Agregar(Prenda prenda){
		this.prenda = prenda;
	}
	void ejecutar(List<Prenda> prendas, Prenda prenda) {
		prendas.add(prenda);
	}
	void deshacer(List<Prenda> prendas, Prenda prenda) {
		prendas.sacar(prenda);
	}
}
