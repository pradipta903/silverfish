package org.github.silverfish.client.impl;

import org.github.silverfish.client.QueueElement;

public class ByteArrayQueueElement extends QueueElement<String, byte[], Metadata> {

    public ByteArrayQueueElement(String id, byte[] element, Metadata metadata) {
        super(id, element, metadata);
    }
}
