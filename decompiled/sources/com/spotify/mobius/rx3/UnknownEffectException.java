package com.spotify.mobius.rx3;

/* JADX INFO: loaded from: classes8.dex */
public class UnknownEffectException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final Object f5827a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownEffectException(Object obj) {
        super(obj.toString());
        obj.getClass();
        this.f5827a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnknownEffectException) {
            return this.f5827a.equals(((UnknownEffectException) obj).f5827a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5827a.hashCode();
    }
}
