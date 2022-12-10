package br.com.alura.conversor.api;

import java.io.IOException;

import org.json.JSONObject;

import br.com.alura.conversor.calculator.TipoMoedaEnum;
import br.com.alura.conversor.model.ConversorJson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 
 * @author Firmo Lopes
 *
 */
public class Api {

	// Erro de execução
	public double converterMoeda(TipoMoedaEnum moedaInicial, TipoMoedaEnum moedaFinal, double valor) {
		OkHttpClient cliente = new OkHttpClient().newBuilder().build();

		Request request = new Request.Builder()
				.url("https://api.apilayer.com/exchangerates_data/convert?to=" + moedaFinal.getTipo() + "&from="
						+ moedaInicial.getTipo() + "&amount=10")
				.addHeader("apikey", "8ZrvoTNSyaVIoYrMQOH2FoMC2WEH7gSW").method("GET", null).build();

		try (Response response = cliente.newCall(request).execute()) {
			String jsonString = response.body().string();
			JSONObject json = new JSONObject(jsonString);
			ConversorJson conversor = new ConversorJson();
			double resultado = conversor.pegandoDadosJson(json);
			return resultado;

		} catch (IOException e) {
			e.printStackTrace();
			return 0.0;
		}

	}

}