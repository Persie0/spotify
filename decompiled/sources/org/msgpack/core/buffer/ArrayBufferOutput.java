package org.msgpack.core.buffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ArrayBufferOutput implements MessageBufferOutput {
    private int bufferSize;
    private MessageBuffer lastBuffer;
    private List<MessageBuffer> list;

    public ArrayBufferOutput() {
        this(8192);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void add(byte[] bArr, int i, int i2) {
        this.list.add(MessageBuffer.wrap(bArr, i, i2));
    }

    public void clear() {
        this.list.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int getSize() {
        Iterator<MessageBuffer> it = this.list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public MessageBuffer next(int i) {
        MessageBuffer messageBuffer = this.lastBuffer;
        if (messageBuffer != null && messageBuffer.size() > i) {
            return this.lastBuffer;
        }
        MessageBuffer messageBufferAllocate = MessageBuffer.allocate(Math.max(this.bufferSize, i));
        this.lastBuffer = messageBufferAllocate;
        return messageBufferAllocate;
    }

    public List<MessageBuffer> toBufferList() {
        return new ArrayList(this.list);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[getSize()];
        int size = 0;
        for (MessageBuffer messageBuffer : this.list) {
            messageBuffer.getBytes(0, bArr, size, messageBuffer.size());
            size += messageBuffer.size();
        }
        return bArr;
    }

    public MessageBuffer toMessageBuffer() {
        if (this.list.size() == 1) {
            return this.list.get(0);
        }
        return this.list.isEmpty() ? MessageBuffer.allocate(0) : MessageBuffer.wrap(toByteArray());
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void write(byte[] bArr, int i, int i2) {
        MessageBuffer messageBufferAllocate = MessageBuffer.allocate(i2);
        messageBufferAllocate.putBytes(0, bArr, i, i2);
        this.list.add(messageBufferAllocate);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void writeBuffer(int i) {
        this.list.add(this.lastBuffer.slice(0, i));
        if (this.lastBuffer.size() - i <= this.bufferSize / 4) {
            this.lastBuffer = null;
        } else {
            MessageBuffer messageBuffer = this.lastBuffer;
            this.lastBuffer = messageBuffer.slice(i, messageBuffer.size() - i);
        }
    }

    public ArrayBufferOutput(int i) {
        this.bufferSize = i;
        this.list = new ArrayList();
    }
}
