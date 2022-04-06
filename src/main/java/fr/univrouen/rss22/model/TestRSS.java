package fr.univrouen.rss22.model;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class TestRSS {
	@Test
	public String loadFileXML() {
		org.springframework.core.io.Resource resource 
		= new DefaultResourceLoader().getResource("classpath:xml/item.xml");
	
		try {
			InputStream input = resource.getInputStream();
			return new String(input.readAllBytes(),StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
	
        
		 
	}
	


}
