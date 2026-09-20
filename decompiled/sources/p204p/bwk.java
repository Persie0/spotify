package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bwk implements dwk {

    /* JADX INFO: renamed from: a */
    public final long f31665a;

    /* JADX INFO: renamed from: b */
    public final boolean f31666b;

    public bwk(long j, boolean z) {
        this.f31665a = j;
        this.f31666b = z;
    }

    @Override // p204p.dwk
    /* JADX INFO: renamed from: a */
    public final long mo30691a() {
        return this.f31665a;
    }

    @Override // p204p.dwk
    /* JADX INFO: renamed from: b */
    public final boolean mo30692b() {
        return this.f31666b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwk)) {
            return false;
        }
        bwk bwkVar = (bwk) obj;
        return this.f31665a == bwkVar.f31665a && this.f31666b == bwkVar.f31666b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31666b) + (Long.hashCode(this.f31665a) * 31);
    }
}
