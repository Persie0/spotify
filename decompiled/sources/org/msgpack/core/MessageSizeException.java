package org.msgpack.core;

/* JADX INFO: loaded from: classes16.dex */
public class MessageSizeException extends MessagePackException {
    private final long size;

    public MessageSizeException(long j) {
        this.size = j;
    }

    public long getSize() {
        return this.size;
    }

    public MessageSizeException(String str, long j) {
        super(str);
        this.size = j;
    }
}
