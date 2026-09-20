package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class osa0 extends vwf1 {

    /* JADX INFO: renamed from: e */
    public final long f168782e;

    public osa0(long j) {
        this.f168782e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osa0) && this.f168782e == ((osa0) obj).f168782e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168782e);
    }
}
