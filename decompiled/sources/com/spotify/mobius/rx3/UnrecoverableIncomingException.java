package com.spotify.mobius.rx3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
class UnrecoverableIncomingException extends RuntimeException {
    public UnrecoverableIncomingException(Throwable th) {
        super("PROGRAMMER ERROR: Mobius cannot recover from this exception; ensure your event sources don't invoke onError", th);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnrecoverableIncomingException)) {
            return false;
        }
        UnrecoverableIncomingException unrecoverableIncomingException = (UnrecoverableIncomingException) obj;
        if (obj != this) {
            return (getCause() == null && unrecoverableIncomingException.getCause() == null) || getCause().equals(unrecoverableIncomingException.getCause());
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getCause()});
    }
}
