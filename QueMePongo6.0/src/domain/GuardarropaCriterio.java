
public class GuardarropaCriterio extend Guardarropa{
	Criterio criterio
	GuarrropaCriterio(Criterio criterio) {
		this.criterio = criterio;
	}

	void filtrar(List<Prenda> prendas) {
		this.prendas = prendas.filter(prenda -> criterio.aplicarCriterio(prenda));
	}
}
