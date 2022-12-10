package br.com.alura.conversor.model;

import org.json.JSONObject;

public class ConversorJson {
	private double result;

	public double pegandoDadosJson(JSONObject json) {
		this.result = json.getDouble("result");
		return result;
	}
}