package dk.vv.mtogo.delivery.msvc;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "delivery.msvc", namingStrategy = ConfigMapping.NamingStrategy.VERBATIM)
public interface Configuration {

    QueueConfig queues();

    Bing bing();

    public interface Bing{
        String key();
    }

    public interface QueueConfig {

        interface InQueue {
            String queue();

            String exchange();

            String routingKey();
        }

        interface OutQueue {
            String exchange();

            String routingKey();
        }

        OutQueue notification();
        InQueue deliveryCreation();

        InQueue deliveryStatus();
        OutQueue deliveryInformation();




    }
}
