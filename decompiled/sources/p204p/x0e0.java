package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x0e0 {

    /* JADX INFO: renamed from: a */
    public final f5r0 f256869a;

    /* JADX INFO: renamed from: b */
    public final lar0 f256870b;

    /* JADX INFO: renamed from: c */
    public final ok11 f256871c;

    /* JADX INFO: renamed from: d */
    public final p9c1 f256872d;

    public x0e0(f5r0 f5r0Var, lar0 lar0Var, ok11 ok11Var, p9c1 p9c1Var) {
        this.f256869a = f5r0Var;
        this.f256870b = lar0Var;
        this.f256871c = ok11Var;
        this.f256872d = p9c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0e0)) {
            return false;
        }
        x0e0 x0e0Var = (x0e0) obj;
        return wj50.m88271j(this.f256869a, x0e0Var.f256869a) && wj50.m88271j(this.f256870b, x0e0Var.f256870b) && wj50.m88271j(this.f256871c, x0e0Var.f256871c) && wj50.m88271j(this.f256872d, x0e0Var.f256872d);
    }

    public final int hashCode() {
        f5r0 f5r0Var = this.f256869a;
        int iHashCode = (f5r0Var == null ? 0 : f5r0Var.hashCode()) * 31;
        lar0 lar0Var = this.f256870b;
        int iHashCode2 = (iHashCode + (lar0Var == null ? 0 : lar0Var.hashCode())) * 31;
        ok11 ok11Var = this.f256871c;
        int iHashCode3 = (iHashCode2 + (ok11Var == null ? 0 : ok11Var.hashCode())) * 961;
        p9c1 p9c1Var = this.f256872d;
        return iHashCode3 + (p9c1Var != null ? Long.hashCode(p9c1Var.f175214a) : 0);
    }
}
