### Kafka Streams Application 테스트
- intellij
- java 11+
- kafka 2.5.0
- gradle
    - org.apache.kafka:kafka-streams:2.6.0
    - org.springframework.boot:spring-boot-starter-web:2.4.5
    - org.springframework.kafka:spring-kafka:2.6.7

### 로컬 kafka 실행



### kafka command
> **Topic Create**: /bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --topic test --partitions {파티션개수} --replication-factor {리플리케이션 개수}

> **console producer 실행**: /bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test

> **Console Consumer 실행**: /bin/kafka-console-consumer.sh --topic streams-wordcount-output --from-beginning --bootstrap-server localhost:9092 --property print.key=true --property value.deserializer=org.apache.kafka.common.serialization.LongDeserializer
