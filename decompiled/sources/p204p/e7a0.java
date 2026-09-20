package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e7a0 {

    /* JADX INFO: renamed from: a */
    public final jcl0 f56877a;

    /* JADX INFO: renamed from: b */
    public final daj f56878b;

    /* JADX INFO: renamed from: c */
    public final jh0 f56879c;

    /* JADX INFO: renamed from: d */
    public final p9c1 f56880d;

    /* JADX INFO: renamed from: e */
    public final y7t0 f56881e;

    /* JADX INFO: renamed from: f */
    public final y6s0 f56882f;

    /* JADX INFO: renamed from: g */
    public final g0w f56883g;

    /* JADX INFO: renamed from: h */
    public final wtb f56884h;

    /* JADX INFO: renamed from: i */
    public final tu00 f56885i;

    /* JADX INFO: renamed from: j */
    public final byv f56886j;

    public e7a0(jcl0 jcl0Var, daj dajVar, jh0 jh0Var, p9c1 p9c1Var, y7t0 y7t0Var, y6s0 y6s0Var, g0w g0wVar, wtb wtbVar, tu00 tu00Var, byv byvVar) {
        this.f56877a = jcl0Var;
        this.f56878b = dajVar;
        this.f56879c = jh0Var;
        this.f56880d = p9c1Var;
        this.f56881e = y7t0Var;
        this.f56882f = y6s0Var;
        this.f56883g = g0wVar;
        this.f56884h = wtbVar;
        this.f56885i = tu00Var;
        this.f56886j = byvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7a0)) {
            return false;
        }
        e7a0 e7a0Var = (e7a0) obj;
        return wj50.m88271j(this.f56877a, e7a0Var.f56877a) && wj50.m88271j(this.f56878b, e7a0Var.f56878b) && wj50.m88271j(this.f56879c, e7a0Var.f56879c) && wj50.m88271j(this.f56880d, e7a0Var.f56880d) && wj50.m88271j(this.f56881e, e7a0Var.f56881e) && wj50.m88271j(this.f56882f, e7a0Var.f56882f) && wj50.m88271j(this.f56883g, e7a0Var.f56883g) && wj50.m88271j(this.f56884h, e7a0Var.f56884h) && wj50.m88271j(this.f56885i, e7a0Var.f56885i) && wj50.m88271j(this.f56886j, e7a0Var.f56886j);
    }

    public final int hashCode() {
        jcl0 jcl0Var = this.f56877a;
        int iHashCode = (jcl0Var == null ? 0 : jcl0Var.hashCode()) * 31;
        daj dajVar = this.f56878b;
        int iHashCode2 = (iHashCode + (dajVar == null ? 0 : dajVar.hashCode())) * 31;
        jh0 jh0Var = this.f56879c;
        int iHashCode3 = (iHashCode2 + (jh0Var == null ? 0 : Boolean.hashCode(jh0Var.f112302a))) * 31;
        p9c1 p9c1Var = this.f56880d;
        int iHashCode4 = (iHashCode3 + (p9c1Var == null ? 0 : Long.hashCode(p9c1Var.f175214a))) * 31;
        y7t0 y7t0Var = this.f56881e;
        int iHashCode5 = (iHashCode4 + (y7t0Var == null ? 0 : y7t0Var.hashCode())) * 31;
        y6s0 y6s0Var = this.f56882f;
        int iHashCode6 = (iHashCode5 + (y6s0Var == null ? 0 : y6s0Var.hashCode())) * 31;
        g0w g0wVar = this.f56883g;
        int iHashCode7 = (iHashCode6 + (g0wVar == null ? 0 : g0wVar.hashCode())) * 31;
        wtb wtbVar = this.f56884h;
        int iHashCode8 = (iHashCode7 + (wtbVar == null ? 0 : wtbVar.hashCode())) * 31;
        tu00 tu00Var = this.f56885i;
        int iHashCode9 = (iHashCode8 + (tu00Var == null ? 0 : tu00Var.f223736a.hashCode())) * 31;
        byv byvVar = this.f56886j;
        return iHashCode9 + (byvVar != null ? edb.m38547C(byvVar.f32324a) : 0);
    }
}
