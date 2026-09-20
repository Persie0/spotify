package org.msgpack.core;

/* JADX INFO: loaded from: classes16.dex */
public class MessagePackException extends RuntimeException {
    public static final IllegalStateException UNREACHABLE = new IllegalStateException("Cannot reach here");

    public MessagePackException() {
    }

    public static UnsupportedOperationException UNSUPPORTED(String str) {
        return new UnsupportedOperationException(str);
    }

    public MessagePackException(String str) {
        super(str);
    }

    public MessagePackException(String str, Throwable th) {
        super(str, th);
    }

    public MessagePackException(Throwable th) {
        super(th);
    }
}
