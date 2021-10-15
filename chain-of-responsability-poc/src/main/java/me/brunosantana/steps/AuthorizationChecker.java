package me.brunosantana.steps;

import java.util.List;
import java.util.Map;

import me.brunosantana.model.Response;

public class AuthorizationChecker implements Step {

	private List<Step> steps;

	@Override
	public Response execute(Map<String, Object> map) {
		System.out.println("Authorization");
		boolean authorizationOk = true;
		if(authorizationOk) {
			Step nextStep = steps.get(0);
			return nextStep.execute(map);
		}else {
			throw new RuntimeException("Authorization failed");
		}
	}

	@Override
	public void setPossibleNextSteps(List<Step> steps) {
		this.steps = steps;
		
	}

	@Override
	public void setResponse(Response response) {
		throw new RuntimeException("Does not make sense a response here");	
	}
	


}
