package domain;

public class Prenda {
	TipoPrenda tipoPrenda;
	Color colorPrimario;
	Color colorSecundario;
	Material material;
	Int temperatura;
	
	public Prenda(TipoPrenda unTipoPrenda, Color colorPrimario, Color colorSecundario, Material material,Int temperatura) {
		this.tipoPrenda = unTipoPrenda;
		this.colorPrimario = colorPrimario;
		this.colorSecundario = colorSecundario;
		this.material = material;
		this.temperatura = temperatura;
	}
	
	public void mostrarTipoPrenda() {}
	public void mostrarColorPrimario() {}
	public void mostrarColorSecundario() {}
	public void mostrarTipoMaterial() {}
	
	public CategoriaPrenda categoria() {
		return tipoPrenda.getCategoria();
	}

	public boolean esParteSuperior() {
		return categoria()==CategoriaPrenda.PARTE_SUPERIOR;
	}
	
	public boolean esParteInferior() {
		return categoria()==CategoriaPrenda.PARTE_INFERIOR;
	}
	
	public boolean esCalzado() {
		return categoria()==CategoriaPrenda.CALZADO;
	}
	
	public boolean esAccesorio() {
		return categoria()==CategoriaPrenda.ACCESORIO;
	}

}
