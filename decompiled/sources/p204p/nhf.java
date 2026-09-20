package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nhf extends uhf {

    /* JADX INFO: renamed from: b */
    public final String f153997b;

    /* JADX INFO: renamed from: c */
    public final int f153998c;

    /* JADX INFO: renamed from: d */
    public final qf40 f153999d;

    public nhf(int i, String str, qf40 qf40Var) {
        super(khf.f122641e);
        this.f153997b = str;
        this.f153998c = i;
        this.f153999d = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhf)) {
            return false;
        }
        nhf nhfVar = (nhf) obj;
        return wj50.m88271j(this.f153997b, nhfVar.f153997b) && this.f153998c == nhfVar.f153998c && wj50.m88271j(this.f153999d, nhfVar.f153999d);
    }

    public final int hashCode() {
        return this.f153999d.hashCode() + mt60.m62800g(this.f153998c, this.f153997b.hashCode() * 31, 31);
    }
}
