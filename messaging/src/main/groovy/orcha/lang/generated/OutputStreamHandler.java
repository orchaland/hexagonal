
package orcha.lang.generated;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.Transformer;


/**
 * Do not edit this file : auto generated file
 * 
 */
@EnableBinding(org.springframework.cloud.stream.messaging.Source.class)
public class OutputStreamHandler {

    private final static Logger log = LoggerFactory.getLogger(OutputStreamHandler.class);

    @Transformer(inputChannel = "bankCustomer-OutputChannelRoute1", outputChannel = "output")
    public Object transform(Object message) {
        log.info(("Sending message to the messaging middleware: "+ message));
        return message;
    }

}
