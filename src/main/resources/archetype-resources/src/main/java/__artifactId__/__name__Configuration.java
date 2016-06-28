#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId};

import uk.me.magicbeans.dropwizard.spring.SpringServiceConfiguration;


import java.util.Optional;

public class ${name}Configuration extends SpringServiceConfiguration {

    private Optional<String> getEnvironmentVariable(String name) {
        String result = System.getenv(name);
        return result == null || result.isEmpty() ? Optional.empty() : Optional.of(result);
    }
}
