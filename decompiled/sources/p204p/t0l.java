package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final long f215904a;

    public t0l(long j) {
        this.f215904a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m79838a() {
        return this.f215904a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0l) && this.f215904a == ((t0l) obj).f215904a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f215904a);
    }
}
