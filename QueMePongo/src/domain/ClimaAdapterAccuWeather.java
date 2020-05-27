package domain;

public class ClimaAdapterAccuWeather implements AdaptadorClima{
	
	AccuWeatherAPI apiClima = new AccuWeatherAPI();
	List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(“Buenos Aires, Argentina”);
	
	public Float temperatura() {
		return condicionesClimaticas.get(0).get("PrecipitationProbability"); //Devuelve un número del 0 al 1;	
	}
}