package br.com.wmoreira.eventprocessor.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wso2.siddhi.core.SiddhiAppRuntime;
import org.wso2.siddhi.core.SiddhiManager;

import br.com.wmoreira.eventprocessor.core.stream.EventStream;

@Configuration
public class EventEngineBeans {
	
	@Bean(destroyMethod = "shutdown")
	SiddhiManager siddhiManager() {
		return new SiddhiManager();
	}
	
	@Bean(destroyMethod = "shutdown")
	SiddhiAppRuntime siddhiAppRuntime(final SiddhiManager manager, final List<EventStream> eventStreams) {
		final SiddhiAppRuntime runtime = manager.createSiddhiAppRuntime("define stream AppEventStream (event string)");
		runtime.start();
		return runtime;
	}
	
}
