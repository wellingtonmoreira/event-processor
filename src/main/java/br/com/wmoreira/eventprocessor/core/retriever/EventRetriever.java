package br.com.wmoreira.eventprocessor.core.retriever;

import br.com.wmoreira.eventprocessor.core.model.EventMessage;

public interface EventRetriever {
	EventMessage retrieve();
}
