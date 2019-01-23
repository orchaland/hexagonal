
package orcha.lang.generated;

import orcha.lang.configuration.OrchaSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


/**
 * Do not edit this file : auto generated file
 * 
 */
@Configuration
@ComponentScan(basePackages = {
    "configuration",
    "generated"
})
@ImportResource({

})
public class ImportDynamicResourcesForTestConfiguration {


    @Bean
    public OrchaSession orchaSession() {
        OrchaSession orchaSession = new OrchaSession();
        return orchaSession;
    }

}