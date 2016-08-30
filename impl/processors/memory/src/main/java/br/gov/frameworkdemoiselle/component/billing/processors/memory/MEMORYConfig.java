package br.gov.frameworkdemoiselle.component.billing.processors.memory;

import br.gov.frameworkdemoiselle.annotation.Name;
import br.gov.frameworkdemoiselle.configuration.Configuration;

@Configuration(prefix = "frameworkdemoiselle.audit.processor.MEMORY")
public class MEMORYConfig {

	@Name("server.url")
	private String serverUrl;
	
	public String getServerUrl() {
		return serverUrl;
	}
	
	

}
