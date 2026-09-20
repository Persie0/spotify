package org.msgpack.core.buffer;

import java.io.IOException;
import java.util.Enumeration;
import org.msgpack.core.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public class SequenceMessageBufferInput implements MessageBufferInput {
    private MessageBufferInput input;
    private Enumeration<? extends MessageBufferInput> sequence;

    public SequenceMessageBufferInput(Enumeration<? extends MessageBufferInput> enumeration) {
        this.sequence = (Enumeration) Preconditions.checkNotNull(enumeration, "input sequence is null");
        try {
            nextInput();
        } catch (IOException unused) {
        }
    }

    private void nextInput() throws IOException {
        MessageBufferInput messageBufferInput = this.input;
        if (messageBufferInput != null) {
            messageBufferInput.close();
        }
        if (!this.sequence.hasMoreElements()) {
            this.input = null;
            return;
        }
        MessageBufferInput messageBufferInputNextElement = this.sequence.nextElement();
        this.input = messageBufferInputNextElement;
        if (messageBufferInputNextElement == null) {
            throw new NullPointerException("An element in the MessageBufferInput sequence is null");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        do {
            nextInput();
        } while (this.input != null);
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() throws IOException {
        MessageBufferInput messageBufferInput = this.input;
        if (messageBufferInput == null) {
            return null;
        }
        MessageBuffer next = messageBufferInput.next();
        if (next != null) {
            return next;
        }
        nextInput();
        return next();
    }
}
