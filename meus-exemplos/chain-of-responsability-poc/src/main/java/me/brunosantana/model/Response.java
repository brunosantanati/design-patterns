package me.brunosantana.model;

public class Response {
	
	private String campo1;
	private String campo2;
	
	public Response(String campo1) {
		super();
		this.campo1 = campo1;
	}
	
	public Response(String campo1, String campo2) {
		super();
		this.campo1 = campo1;
		this.campo2 = campo2;
	}
	
	public String getCampo1() {
		return campo1;
	}
	
	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}
	
	public String getCampo2() {
		return campo2;
	}
	
	public void setCampo2(String campo2) {
		this.campo2 = campo2;
	}

	@Override
	public String toString() {
		return "Response [campo1=" + campo1 + ", campo2=" + campo2 + "]";
	}

}
