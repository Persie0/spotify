package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final long f204739a;

    public s1l(long j) {
        this.f204739a = j;
    }

    /* JADX INFO: renamed from: a */
    public final long m76984a() {
        return this.f204739a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1l) && this.f204739a == ((s1l) obj).f204739a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f204739a);
    }
}
