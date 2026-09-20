package io.ably.lib.types;

/* JADX INFO: loaded from: classes16.dex */
public class MessageDecodeException extends AblyException {
    private static final long serialVersionUID = 1;

    private MessageDecodeException(Throwable th, ErrorInfo errorInfo) {
        super(th, errorInfo);
    }

    public static MessageDecodeException fromDescription(String str) {
        return new MessageDecodeException(new Exception(str), new ErrorInfo(str, 40013));
    }

    public static MessageDecodeException fromThrowableAndErrorInfo(Throwable th, ErrorInfo errorInfo) {
        return new MessageDecodeException(th, errorInfo);
    }
}
