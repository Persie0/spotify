package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class pv20 implements qv20 {

    /* JADX INFO: renamed from: a */
    public final long f181577a;

    public pv20(long j) {
        this.f181577a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pv20) && this.f181577a == ((pv20) obj).f181577a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f181577a);
    }
}
