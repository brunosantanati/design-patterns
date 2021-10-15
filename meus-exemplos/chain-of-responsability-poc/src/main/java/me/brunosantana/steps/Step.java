package me.brunosantana.steps;

import java.util.List;
import java.util.Map;

import me.brunosantana.model.Response;

public interface Step {
	
	Response execute(Map<String, Object> map);
	void setPossibleNextSteps(List<Step> steps);
	void setResponse(Response response);

}
