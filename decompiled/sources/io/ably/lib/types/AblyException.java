package io.ably.lib.types;

import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes15.dex */
public class AblyException extends Exception {
    private static final long serialVersionUID = -3804072091596832634L;
    public ErrorInfo errorInfo;

    /* JADX INFO: loaded from: classes16.dex */
    public static class HostFailedException extends AblyException {
        private static final long serialVersionUID = 1;

        public HostFailedException(Throwable th, ErrorInfo errorInfo) {
            super(th, errorInfo);
        }
    }

    public AblyException(Throwable th, ErrorInfo errorInfo) {
        super(th);
        this.errorInfo = errorInfo;
    }

    public static AblyException fromErrorInfo(ErrorInfo errorInfo) {
        return fromErrorInfo(new Exception(errorInfo.message), errorInfo);
    }

    public static AblyException fromThrowable(Throwable th) {
        if (th instanceof AblyException) {
            return (AblyException) th;
        }
        return ((th instanceof ConnectException) || (th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof NoRouteToHostException)) ? new HostFailedException(th, ErrorInfo.fromThrowable(th)) : new AblyException(th, ErrorInfo.fromThrowable(th));
    }

    public static AblyException fromErrorInfo(Throwable th, ErrorInfo errorInfo) {
        int i = errorInfo.statusCode;
        return (i < 500 || i > 504) ? new AblyException(th, errorInfo) : new HostFailedException(th, errorInfo);
    }
}
