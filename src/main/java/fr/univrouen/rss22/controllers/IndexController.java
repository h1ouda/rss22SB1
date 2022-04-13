package fr.univrouen.rss22.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
	@GetMapping("/h")
	public String index() {
	return "Hello rss22 !";
	}
	
	@GetMapping("/")
	public String getAccueil() throws IOException {
		org.springframework.core.io.Resource resource = new DefaultResourceLoader().getResource("classpath:Accueil.html");
		InputStream input = resource.getInputStream();
		return new String(input.readAllBytes(),StandardCharsets.UTF_8);
		
	}
}
