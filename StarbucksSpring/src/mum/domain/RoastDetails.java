package mum.domain;

import java.util.List;
import java.io.Serializable;

public class RoastDetails implements Serializable{
	private static final long serialVersionUID = 5784L;
	private List<String> roastAdvice;
	private String roastChoice;

	public List<String> getRoastAdvice() {
		return roastAdvice;
	}

	public void setRoastAdvice(List<String> roastAdvice) {
		this.roastAdvice = roastAdvice;
	}
	
	public String getRoastChoice() {
		return roastChoice;
	}

	public void setRoastChoice(String roastChoice) {
		this.roastChoice = roastChoice;
	}	
	
}
