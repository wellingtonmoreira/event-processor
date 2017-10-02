package br.com.wmoreira.eventprocessor.core.stream;

import br.com.wmoreira.eventprocessor.core.model.EventMessage;

public interface EventStream {
	void handleMessage(final EventMessage message);
}
