package p204p;

/* JADX INFO: renamed from: p.hb */
/* JADX INFO: loaded from: classes8.dex */
public final class C1931hb {

    /* JADX INFO: renamed from: a */
    public final boolean f89340a;

    /* JADX INFO: renamed from: b */
    public final int f89341b;

    public C1931hb(boolean z, int i) {
        this.f89340a = z;
        this.f89341b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1931hb)) {
            return false;
        }
        C1931hb c1931hb = (C1931hb) obj;
        return this.f89340a == c1931hb.f89340a && this.f89341b == c1931hb.f89341b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f89341b) + (Boolean.hashCode(this.f89340a) * 31);
    }
}
