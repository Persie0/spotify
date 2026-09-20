package org.msgpack.core;

/* JADX INFO: loaded from: classes16.dex */
public class MessageInsufficientBufferException extends MessagePackException {
    public MessageInsufficientBufferException() {
    }

    public MessageInsufficientBufferException(String str) {
        super(str);
    }

    public MessageInsufficientBufferException(Throwable th) {
        super(th);
    }

    public MessageInsufficientBufferException(String str, Throwable th) {
        super(str, th);
    }
}
