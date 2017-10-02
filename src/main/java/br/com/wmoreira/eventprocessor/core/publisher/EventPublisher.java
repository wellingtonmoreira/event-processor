package br.com.wmoreira.eventprocessor.core.publisher;

import br.com.wmoreira.eventprocessor.core.model.EventMessage;

public interface EventPublisher {
	void produce(final EventMessage message);
}
