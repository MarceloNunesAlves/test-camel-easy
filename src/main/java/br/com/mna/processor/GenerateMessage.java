package br.com.mna.processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class GenerateMessage implements Processor {

	public void process(Exchange exchange) throws Exception {
		int count_seg = Integer.valueOf((String) exchange.getIn().getHeader("COUNT_FOR_SEG"));
		
		List<String> body = new ArrayList<String>();
		
		for(int i=0;i<count_seg;i++) {
			body.add(String.valueOf(randomIntBetween(100, 120)));
		}
		
		exchange.getIn().setBody(body);
	}
	
	public int randomInt(int valueMax){
		Random gerador = new Random();
        return gerador.nextInt(valueMax);
	}
	
	public int randomIntBetween(int valueMin, int valueMax){
		Random r = new Random();
		int result = r.nextInt(valueMax-valueMin) + valueMin;
		return result;
	}

}
