package org.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain{

	@JsonProperty("3h")
	private Double jsonMember3h;

	@JsonProperty("1h")
	private Double jsonMember1h;

	public Double getJsonMember3h(){
		return jsonMember3h;
	}

	public Double getJsonMember1h(){
		return jsonMember1h;
	}

	@Override
 	public String toString(){
		return 
			"Rain{" + 
			"3h = '" + jsonMember3h + '\'' + 
			",1h = '" + jsonMember1h + '\'' + 
			"}";
		}
}