package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class psa0 extends vwf1 {

    /* JADX INFO: renamed from: e */
    public final long f180795e;

    public psa0(long j) {
        this.f180795e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psa0) && this.f180795e == ((psa0) obj).f180795e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f180795e);
    }
}
