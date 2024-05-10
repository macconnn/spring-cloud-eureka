#!/bin/bash

EUREKA_SERVER="eureka-server"
EUREKA_SERVER2="eureka-server2"
EUREKA_PROVIDER="eureka-provider"
EUREKA_CONSUMER="eureka-consumer"

java -jar $EUREKA_SERVER/target/$EUREKA_SERVER-1.0-SNAPSHOT.jar &
java -jar $EUREKA_SERVER2/target/$EUREKA_SERVER2-1.0-SNAPSHOT.jar &
java -jar $EUREKA_PROVIDER/target/$EUREKA_PROVIDER-1.0-SNAPSHOT.jar &
java -jar $EUREKA_CONSUMER/target/$EUREKA_CONSUMER-1.0-SNAPSHOT.jar &
