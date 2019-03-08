package br.usjt.previsao_tempo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import br.usjt.previsao_tempo.model.PrevTempo;
import br.usjt.previsao_tempo.repository.PrevTempoRepository;

@Controller
public class PrevTempoController {

	@Autowired
	private PrevTempoRepository prevTempoRepo;
	
	@GetMapping ("/previsao")
	public ModelAndView listarTempo() {
	
		ModelAndView mv = new ModelAndView("lista_tempo");
		
		List<PrevTempo> tempos = prevTempoRepo.findAll();
		
		mv.addObject("tempos",tempos);
		mv.addObject(new PrevTempo());
		return mv;	
	}
	public String Salvar(PrevTempo tempos){
		prevTempoRepo.save(tempos);
        return "redirect:/previsao";
}

}
