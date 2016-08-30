package br.gov.frameworkdemoiselle.component.billing.processors.sgdb;

import br.gov.frameworkdemoiselle.annotation.Name;
import br.gov.frameworkdemoiselle.configuration.Configuration;

@Configuration(prefix = "frameworkdemoiselle.audit.processor.SGDB")
public class SGDBConfig {

    @Name("server.url")
    private String serverUrl;

    public String getServerUrl() {
        return serverUrl;
    }

}
