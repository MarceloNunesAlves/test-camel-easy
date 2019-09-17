package br.com.mna.aggregation;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.springframework.stereotype.Component;

@Component
public class GenericStrategy implements AggregationStrategy {

	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		if (oldExchange == null) {
			return newExchange;
		}

		return oldExchange;
	}
/*
	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {

		if (oldExchange == null) {
			return newExchange;
		}

		return oldExchange;

	}
*/
}
