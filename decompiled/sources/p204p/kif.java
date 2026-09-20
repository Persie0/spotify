package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kif implements mif {

    /* JADX INFO: renamed from: a */
    public final int f122954a;

    /* JADX INFO: renamed from: b */
    public final boolean f122955b;

    /* JADX INFO: renamed from: c */
    public final uhf f122956c;

    /* JADX INFO: renamed from: d */
    public final int f122957d;

    /* JADX INFO: renamed from: e */
    public final qdz0 f122958e;

    public kif(int i, boolean z, uhf uhfVar, int i2, qdz0 qdz0Var) {
        this.f122954a = i;
        this.f122955b = z;
        this.f122956c = uhfVar;
        this.f122957d = i2;
        this.f122958e = qdz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kif)) {
            return false;
        }
        kif kifVar = (kif) obj;
        return this.f122954a == kifVar.f122954a && this.f122955b == kifVar.f122955b && wj50.m88271j(this.f122956c, kifVar.f122956c) && this.f122957d == kifVar.f122957d && wj50.m88271j(this.f122958e, kifVar.f122958e);
    }

    public final int hashCode() {
        return this.f122958e.hashCode() + mt60.m62800g(this.f122957d, (this.f122956c.hashCode() + s571.m77245d(Integer.hashCode(this.f122954a) * 31, 31, this.f122955b)) * 31, 31);
    }
}
