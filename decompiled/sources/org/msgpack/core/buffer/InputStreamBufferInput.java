package org.msgpack.core.buffer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import org.msgpack.core.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public class InputStreamBufferInput implements MessageBufferInput {
    private final byte[] buffer;

    /* JADX INFO: renamed from: in */
    private InputStream f10964in;

    public InputStreamBufferInput(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public static MessageBufferInput newBufferInput(InputStream inputStream) {
        FileChannel channel;
        Preconditions.checkNotNull(inputStream, "InputStream is null");
        return (!(inputStream instanceof FileInputStream) || (channel = ((FileInputStream) inputStream).getChannel()) == null) ? new InputStreamBufferInput(inputStream) : new ChannelBufferInput(channel);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f10964in.close();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() throws IOException {
        int i = this.f10964in.read(this.buffer);
        if (i == -1) {
            return null;
        }
        return MessageBuffer.wrap(this.buffer, 0, i);
    }

    public InputStream reset(InputStream inputStream) {
        InputStream inputStream2 = this.f10964in;
        this.f10964in = inputStream;
        return inputStream2;
    }

    public InputStreamBufferInput(InputStream inputStream, int i) {
        this.f10964in = (InputStream) Preconditions.checkNotNull(inputStream, "input is null");
        this.buffer = new byte[i];
    }
}
