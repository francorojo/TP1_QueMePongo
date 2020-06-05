package domain;

import java.util.LinkedList;

import java.util.List;

/*
 * La clase usuario tendra su propio atuendo
 * que este podra ser incluido o no en la generacion. Tambien tendra un nombre y una id para identidad.
*/

public class Usuarie {
	static int idGlobal=0;
	int idUsuario;
	Guardarropa guardarropa;
	Borrador prendaBorrador = NULL;
	List<GuardarropaCriterio> ListaDeGuardarropasPorCriterio
	List<GuardarropaCompartido> ListaDeGuardarropasCompartidos
	List<PreferenciasIndividuales> preferenciasInd
	List<PreferenciasAtuendo> preferenciasAtuendo
	PrendaBorrador prendaBorrador = NULL
	List<Uniforme> uniformes;
	
	public Usuarie(String unNombre) {
		this.id = idGlobal++;
		this.nombre = unNombre;
		this.guardarropa = new Guardarropa();
		this.atuendo = null;
		this.uniformes = new LinkedList<>();
	}
	
	public void crearBorrador(TipoPrenda tipoPrenda) {
		this.prendaBorrador = new Borrador(tipoPrenda);
	}
	
	public void agregarPrenda(){
		guardarropa.agregar(prendaBorrador.crearPrenda());
		prendaBorrador=null;
		
	}
	
	public void compartirGuardarropa(Usuarie usuario){
		Guardarropa nuevoGuardarropa = new Guardarropa();
		this.agregarGuardarropa(nuevoGuardarropa);
		usuario.agregarGuardarropa(nuevoGuardarropa);
	}
	
	
	public void agregarGuardarropaCompartido(Guardarropa nuevoGuardarropa){
		this.ListaDeGuardarropa.add(nuevoGuardarropa);
	}
	
	public void agregarPrendaGuardarropaCompartido(Prenda prenda){
		this.ListaDeGuarropa.add(prenda);
	}
	
	public void agregarPrendaGuardarropaCompartido(Prenda prenda){
		this.ListaDeGuarropa.add(prenda);
	}

	public void aceptarSolicitud(TipoSolicitud solitud){
		solicitud.ejecutar(this.guardarropaCompartido);
	}
}
