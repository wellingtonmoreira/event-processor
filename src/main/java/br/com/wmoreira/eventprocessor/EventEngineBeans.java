package br.com.wmoreira.eventprocessor;

import org.wso2.siddhi.core.SiddhiAppRuntime;
import org.wso2.siddhi.core.SiddhiManager;

public class EventEngineBeans {

	//TODO: Bean + Destroyer Method
	SiddhiManager siddhiManager() {
		return new SiddhiManager();
	}
	
	//TODO: Bean + Destroyer Method
	SiddhiAppRuntime siddhiAppRuntime(final String siddhiAppConfig) {
		final SiddhiAppRuntime runtime = siddhiManager().createSiddhiAppRuntime(siddhiAppConfig);
		runtime.start();
		return runtime;
	}
	
}
