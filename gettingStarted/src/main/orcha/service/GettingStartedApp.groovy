package service

import groovy.util.logging.Slf4j

@Slf4j
class GettingStartedApp {
	
	public int myMethod(int i){
		log.info "GettingStartedApp receives: " + i
		log.info "GettingStartedApp returns: " + i
		return i;
	}

}
