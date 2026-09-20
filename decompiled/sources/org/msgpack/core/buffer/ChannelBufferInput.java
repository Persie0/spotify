package org.msgpack.core.buffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.msgpack.core.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public class ChannelBufferInput implements MessageBufferInput {
    private final MessageBuffer buffer;
    private ReadableByteChannel channel;

    public ChannelBufferInput(ReadableByteChannel readableByteChannel) {
        this(readableByteChannel, 8192);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.channel.close();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        ByteBuffer byteBufferSliceAsByteBuffer = this.buffer.sliceAsByteBuffer();
        while (byteBufferSliceAsByteBuffer.remaining() > 0 && this.channel.read(byteBufferSliceAsByteBuffer) != -1) {
        }
        byteBufferSliceAsByteBuffer.flip();
        if (byteBufferSliceAsByteBuffer.remaining() == 0) {
            return null;
        }
        return this.buffer.slice(0, byteBufferSliceAsByteBuffer.limit());
    }

    public ReadableByteChannel reset(ReadableByteChannel readableByteChannel) {
        ReadableByteChannel readableByteChannel2 = this.channel;
        this.channel = readableByteChannel;
        return readableByteChannel2;
    }

    public ChannelBufferInput(ReadableByteChannel readableByteChannel, int i) {
        this.channel = (ReadableByteChannel) Preconditions.checkNotNull(readableByteChannel, "input channel is null");
        Preconditions.checkArgument(i > 0, "buffer size must be > 0: " + i);
        this.buffer = MessageBuffer.allocate(i);
    }
}
