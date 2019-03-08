package br.usjt.previsao_tempo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrevisaoTempoController {

	@GetMapping("/tempo")
	public String tempo() {
		return "tempo";
	}
}
