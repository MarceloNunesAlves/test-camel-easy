Camel ActiveMQ Project
======================

This project embeds Apache ActiveMQ together with Apache Camel.

To build this project use

    mvn install

To run this project use the following Maven goal

    mvn camel:run

For more help see the Apache Camel documentation

    http://camel.apache.org/

GENERATE=false
NAME_HOST=localhost
TYPE=InfluxDB
CONSUMERSCOUNT=1
COUNT_FOR_SEG=100
INFLUXDB=localhost
ELASTIC=localhost:9200
ROUTE_TEST=false
STEP=60
SOCKET_NETFLOW=true
SOCKET_URL=172.30.88.33:2055
KAFKA_SEND=true
KAFKA_CONSUMERS=3
KAFKA_HOST=localhost
KAFKA_TOPIC=streams-flow-input
KAFKA_TOPIC_AGG=streams-flow-output
KAFKA_CONSUMER_GROUP_ID=group-output-flow
PERSISTENCE=true
INFLUXDB_ESTR_VER=4

Instalar no linux
apt-get update ; apt-get install sysstat