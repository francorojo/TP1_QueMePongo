package domain;

abstract class Sastre {
    Atuendo uniforme;
	Borrador borrador;
	
    public Uniforme fabricarUniforme() {
    	uniforme = new Atuendo();
    	this.fabricarParteSuperior();
    	this.fabricarParteInferior();
    	this.fabricarCalzado();
    }
    
    abstract Prenda fabricarParteSuperior();
    abstract Prenda fabricarParteInferior();
    abstract Prenda fabricarCalzado();

}
