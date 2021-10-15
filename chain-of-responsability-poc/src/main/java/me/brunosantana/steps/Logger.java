package me.brunosantana.steps;

import java.util.List;
import java.util.Map;

import me.brunosantana.model.Response;

public class Logger implements Step {
	
	private Response response;

	@Override
	public Response execute(Map<String, Object> map) {
		StringBuffer sb = new StringBuffer();
		sb.append("Logger");
		if(map != null) { sb.append(" ");sb.append(map.get("campo2Calculado")); }
		System.out.println(sb.toString());
		return response;
	}

	@Override
	public void setPossibleNextSteps(List<Step> steps) {
		throw new RuntimeException("This is the last step for a while");
		
	}

	@Override
	public void setResponse(Response response) {
		this.response = response;
		
	}

}
