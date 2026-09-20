package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f1f extends g1f {

    /* JADX INFO: renamed from: b */
    public final j46 f64885b;

    /* JADX INFO: renamed from: c */
    public final int f64886c;

    /* JADX INFO: renamed from: d */
    public final int f64887d;

    public f1f(j46 j46Var, int i, int i2) {
        super(d1f.f44251b);
        this.f64885b = j46Var;
        this.f64886c = i;
        this.f64887d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1f)) {
            return false;
        }
        f1f f1fVar = (f1f) obj;
        return wj50.m88271j(this.f64885b, f1fVar.f64885b) && this.f64886c == f1fVar.f64886c && this.f64887d == f1fVar.f64887d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f64887d) + mt60.m62800g(this.f64886c, this.f64885b.hashCode() * 31, 31);
    }
}
