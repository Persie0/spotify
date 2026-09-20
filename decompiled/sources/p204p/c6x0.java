package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class c6x0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f34640a;

    public c6x0(Throwable th) {
        this.f34640a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c6x0) {
            return wj50.m88271j(this.f34640a, ((c6x0) obj).f34640a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34640a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f34640a + ')';
    }
}
