package io.confluent.examples.streams.interactivequeries.kafkamusic;

/**
 * @author dante on 11/11/18.
 * @project kafka-streams-examples
 */
public class KafkaMusicExampleDriver {

  public static void main(final String[] args) {
    final String bootstrapServers = args.length > 0 ? args[0] : "localhost:9092";
    final String schemeRegistryUrl = args.length > 1 ? args[1] : "http://localhost:8081";
    System.out.println("Connecting to Kafka cluster via bootstrap servers " + bootstrapServers);
    System.out.println("Connecting to Confluent schema registry at " + schemeRegistryUrl);


  }
}
