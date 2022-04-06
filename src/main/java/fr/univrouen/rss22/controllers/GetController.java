package fr.univrouen.rss22.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
	@GetMapping("/resume")
	public String getListRSSinXML() {
	return "Envoi de la liste des flux RSS";
	}
	
	@GetMapping("/guid")
	public String getRSSinXML(@RequestParam(value = "guid") String texte) {
	return ("Détail du contenu RSS demandé"+texte);
	}
	
	@GetMapping("test")
	public String postRSSinXML(
			@RequestParam(value = "nb") String t1,
			@RequestParam(value = "search") String t2) {
		return "Test:\nguid="+t1+"\ntitre:"+t2;
		
	}
	
	
}
