package api_testing.pojo;

import java.util.List;

import api_testing.DTO.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentWeatherPojo {

	@JsonProperty("rain")
	private RainDTO rain;

	@JsonProperty("visibility")
	private Integer visibility;

	@JsonProperty("timezone")
	private Integer timezone;

	@JsonProperty("main")
	private MainDTO main;

	@JsonProperty("clouds")
	private CloudsDTO clouds;

	@JsonProperty("sys")
	private SysDTO sys;

	@JsonProperty("dt")
	private Integer dt;

	@JsonProperty("coord")
	private CoordDTO coord;

	@JsonProperty("snow")
	private SnowDTO snow;

	@JsonProperty("weather")
	private List<WeatherItemDTO> weather;

	@JsonProperty("name")
	private String name;

	@JsonProperty("cod")
	private Integer cod;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("base")
	private String base;

	@JsonProperty("wind")
	private WindDTO wind;

	public RainDTO getRain(){
		return rain;
	}

	public Integer getVisibility(){
		return visibility;
	}

	public Integer getTimezone(){
		return timezone;
	}

	public MainDTO getMain(){
		return main;
	}

	public CloudsDTO getClouds(){
		return clouds;
	}

	public SysDTO getSys(){
		return sys;
	}

	public Integer getDt(){
		return dt;
	}

	public CoordDTO getCoord(){
		return coord;
	}

	public SnowDTO getSnow(){
		return snow;
	}

	public List<WeatherItemDTO> getWeather(){
		return weather;
	}

	public String getName(){
		return name;
	}

	public Integer getCod(){
		return cod;
	}

	public Integer getId(){
		return id;
	}

	public String getBase(){
		return base;
	}

	public WindDTO getWind(){
		return wind;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"rain = '" + rain + '\'' + 
			",visibility = '" + visibility + '\'' + 
			",timezone = '" + timezone + '\'' + 
			",main = '" + main + '\'' + 
			",clouds = '" + clouds + '\'' + 
			",sys = '" + sys + '\'' + 
			",dt = '" + dt + '\'' + 
			",coord = '" + coord + '\'' + 
			",snow = '" + snow + '\'' + 
			",weather = '" + weather + '\'' + 
			",name = '" + name + '\'' + 
			",cod = '" + cod + '\'' + 
			",id = '" + id + '\'' + 
			",base = '" + base + '\'' + 
			",wind = '" + wind + '\'' + 
			"}";
		}
}