package org.github.silverfish.client.rabbitmq;

import org.github.silverfish.client.GenericWorkingQueueAdapter;
import org.github.silverfish.client.QueueElement;
import org.github.silverfish.client.WorkingQueue;
import org.github.silverfish.client.impl.Serializers;

import static java.util.function.Function.identity;

public class RabbitMQQueues {
    private RabbitMQQueues() {}

    public static <E> WorkingQueue<Long, E, Void, QueueElement<Long, E, Void>> createGenericRabbitMQ(RabbitMQ rabbitMQ) {
        return new GenericWorkingQueueAdapter<Long, E, Void, QueueElement<Long, E, Void>, Long, byte[], Void>(rabbitMQ,
                Serializers.<E>createPlainJavaSerializer(),
                Serializers.<E>createPlainJavaDeserializer(),
                identity(),
                identity(),
                identity(),
                identity(),
                QueueElement::new);
    }
}
