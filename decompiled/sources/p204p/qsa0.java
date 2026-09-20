package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qsa0 extends vwf1 {

    /* JADX INFO: renamed from: e */
    public final long f192049e;

    public qsa0(long j) {
        this.f192049e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qsa0) && this.f192049e == ((qsa0) obj).f192049e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f192049e);
    }
}
