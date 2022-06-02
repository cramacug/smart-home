package org.cramacug.garden.internals.readings.repository

import org.apache.pulsar.client.api.ProducerAccessMode
import org.apache.pulsar.client.api.PulsarClient
import org.slf4j.event.LoggingEvent

class Broker {

    private val url = "pulsar://192.168.1.155:37531/"

    var client =
        PulsarClient
            .builder()
            .serviceUrl(url)
            .build()

    fun testPulsar(){

        client.newProducer()
            .accessMode(ProducerAccessMode.Shared)
            .topic("tipic_topic")
            .create()
    }
}