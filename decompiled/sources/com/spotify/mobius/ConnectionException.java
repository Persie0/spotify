package com.spotify.mobius;

/* JADX INFO: loaded from: classes8.dex */
public class ConnectionException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final Object f5533a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionException(Object obj, Throwable th) {
        super(obj.toString(), th);
        obj.getClass();
        this.f5533a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionException) {
            return this.f5533a.equals(((ConnectionException) obj).f5533a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5533a.hashCode();
    }
}
