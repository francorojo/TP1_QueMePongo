package domain;

public class SasterSanJuan extends Sastre {
	@Override
	Prenda fabricarParteSuperior() {
        borrador = new Borrador(REMERA);
        borrador.asignarColorPrimario(new Color(colorVerde));
        borrador.asignarMaterial(PIQUE);
        return borrador.crearPrenda();
	}

	@Override
	Prenda fabricarParteInferior() {
        borrador = new Borrador(PANTALON);
        borrador.asignarColorPrimario(Color(new Color(GRIS));
        borrador.asignarMaterial(ACETATO);
        return borrador.crearPrenda(); 
	}

	@Override
	Prenda fabricarCalzado() {
        borrador = new Borrador(ZAPATILLAS)
        borrador.asignarColorPrimario(new Color(BLANCAS));
        borrador.asignarMaterial(CUERO);
        return borrador.crearPrenda(); 
	}
}
