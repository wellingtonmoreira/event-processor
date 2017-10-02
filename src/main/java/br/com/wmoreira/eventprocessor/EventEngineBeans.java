package br.com.wmoreira.eventprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wso2.siddhi.core.SiddhiAppRuntime;
import org.wso2.siddhi.core.SiddhiManager;

@Configuration
public class EventEngineBeans {

	@Bean(destroyMethod = "shutdown")
	SiddhiManager siddhiManager() {
		return new SiddhiManager();
	}
	
	@Bean(destroyMethod = "shutdown")
	SiddhiAppRuntime siddhiAppRuntime(final SiddhiManager manager) {
		final SiddhiAppRuntime runtime = manager.createSiddhiAppRuntime("define stream AppEventStream (event string)");
		runtime.start();
		return runtime;
	}
	
}
