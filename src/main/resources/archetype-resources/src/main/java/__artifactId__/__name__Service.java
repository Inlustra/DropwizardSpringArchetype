#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId};

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import uk.me.magicbeans.dropwizard.spring.SpringService;


public class ${name}Service extends Application<${name}Configuration> {

    public static void main(String[] args) throws Exception {
        new ${name}Service().run(args);
    }

    @Override
    public void run(${name}Configuration configuration, Environment environment) throws Exception {
        SpringService springService = new SpringService(${name}Context.class);
        springService.run(configuration, environment);
    }

}
