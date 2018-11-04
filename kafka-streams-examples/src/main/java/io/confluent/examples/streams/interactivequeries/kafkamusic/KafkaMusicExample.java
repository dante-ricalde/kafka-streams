/*
 * Copyright . Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.confluent.examples.streams.interactivequeries.kafkamusic;

/**
 * @author dante on 11/4/18.
 * @project kafka-streams-examples
 */
public class KafkaMusicExample {

  private static final String DEFAULT_REST_ENDPOINT_HOSTNAME = "localhost";
  private static final String DEFAULT_BOOTSTRAP_SERVERS = "localhost:9092";
  private static final String DEFAULT_SCHEMA_REGISTRY_URL = "http://localhost:8081";

  public static void main(final String[] args) {
    if (args.length == 0 || args.length > 4) {
      throw new IllegalArgumentException("usage: ...<portForRestEndpoint> " +
        "[<bootstrap.servers> (optional, default: " + DEFAULT_BOOTSTRAP_SERVERS + ")] " +
        "[<scheme.registry.url> (optional, default: " + DEFAULT_SCHEMA_REGISTRY_URL + ")] " +
        "[<hostnameForRestEndPoint> (optional, default: " + DEFAULT_REST_ENDPOINT_HOSTNAME + ")]");
    }



  }

}
