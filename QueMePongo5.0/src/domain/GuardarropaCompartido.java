
public class GuardarropaCompartido extend Guardarropa{
	List<OperacionEnGuardarropa> listaDeSolicitudes 
	List<OperacionEnGuardarropa> listaDeAceptadas 
	List<Usuario> usuariosCompartidos
	
	void agregarSolicutudNuevaPrenda(OperacionEnGuardarropa operacion) {
		listaDeSolicitudes.add(operacion);
	}
	void agregarSolicutudQuitarPrenda(OperacionEnGuardarropa operacion) {
		listaDeSolicitudes.add(operacion);
	}
	void aceptarSolicutudes() {
		listaDeSolicitudes.iterar{
			respuesta = recibirRespuesta(operacion);
			if(respuesta)
				operacion.ejecutar(prendas,operacion.prenda());
				listaDeAceptadas.add(operacion);
		}
	}
	void deshacerSolicitudes() {
		listaDeSolicitudes.iterar{
			respuesta = recibirRespuesta(operacion);
			if(respuesta)
				prendas.deshacer(prendas,operacion.prenda());
		}
	}
}
