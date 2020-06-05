
public class Quitar implements OperacionEnGuardarropa {
	Prenda prenda;
	Agregar(Prenda prenda){
		this.prenda = prenda;
	}
	void ejecutar(List<Prenda> prendas, Prenda prenda) {
		prendas.sacar(prenda);
	}
	void deshacer(List<Prenda> prendas, Prenda prenda) {
		prendas.add(prenda);
	}
}