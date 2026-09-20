package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vu41 {

    /* JADX INFO: renamed from: a */
    public final v140 f244863a;

    /* JADX INFO: renamed from: b */
    public final erc1 f244864b;

    /* JADX INFO: renamed from: c */
    public final daj f244865c;

    /* JADX INFO: renamed from: d */
    public final byv f244866d;

    /* JADX INFO: renamed from: e */
    public final y6s0 f244867e;

    /* JADX INFO: renamed from: f */
    public final qas f244868f;

    /* JADX INFO: renamed from: g */
    public final y7t0 f244869g;

    /* JADX INFO: renamed from: h */
    public final ok11 f244870h;

    /* JADX INFO: renamed from: i */
    public final xaw f244871i;

    public /* synthetic */ vu41(v140 v140Var, erc1 erc1Var, daj dajVar, byv byvVar, y6s0 y6s0Var, qas qasVar, y7t0 y7t0Var, ok11 ok11Var, int i) {
        this(v140Var, erc1Var, (i & 4) != 0 ? null : dajVar, (i & 8) != 0 ? null : byvVar, (i & 16) != 0 ? null : y6s0Var, (i & 32) != 0 ? null : qasVar, (i & 64) != 0 ? null : y7t0Var, (i & 128) != 0 ? null : ok11Var, (xaw) null);
    }

    /* JADX INFO: renamed from: a */
    public final byv m86411a() {
        return this.f244866d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu41)) {
            return false;
        }
        vu41 vu41Var = (vu41) obj;
        return wj50.m88271j(this.f244863a, vu41Var.f244863a) && wj50.m88271j(this.f244864b, vu41Var.f244864b) && wj50.m88271j(this.f244865c, vu41Var.f244865c) && wj50.m88271j(this.f244866d, vu41Var.f244866d) && wj50.m88271j(this.f244867e, vu41Var.f244867e) && wj50.m88271j(this.f244868f, vu41Var.f244868f) && wj50.m88271j(this.f244869g, vu41Var.f244869g) && wj50.m88271j(this.f244870h, vu41Var.f244870h) && wj50.m88271j(this.f244871i, vu41Var.f244871i);
    }

    public final int hashCode() {
        int iHashCode = (this.f244864b.hashCode() + (this.f244863a.hashCode() * 31)) * 31;
        daj dajVar = this.f244865c;
        int iHashCode2 = (iHashCode + (dajVar == null ? 0 : dajVar.hashCode())) * 31;
        byv byvVar = this.f244866d;
        int iM38547C = (iHashCode2 + (byvVar == null ? 0 : edb.m38547C(byvVar.f32324a))) * 31;
        y6s0 y6s0Var = this.f244867e;
        int iHashCode3 = (iM38547C + (y6s0Var == null ? 0 : y6s0Var.hashCode())) * 31;
        qas qasVar = this.f244868f;
        int iHashCode4 = (iHashCode3 + (qasVar == null ? 0 : qasVar.hashCode())) * 31;
        y7t0 y7t0Var = this.f244869g;
        int iHashCode5 = (iHashCode4 + (y7t0Var == null ? 0 : y7t0Var.hashCode())) * 31;
        ok11 ok11Var = this.f244870h;
        int iHashCode6 = (iHashCode5 + (ok11Var == null ? 0 : ok11Var.hashCode())) * 31;
        xaw xawVar = this.f244871i;
        return iHashCode6 + (xawVar != null ? xawVar.hashCode() : 0);
    }

    public vu41(v140 v140Var, erc1 erc1Var, daj dajVar, byv byvVar, y6s0 y6s0Var, qas qasVar, y7t0 y7t0Var, ok11 ok11Var, xaw xawVar) {
        this.f244863a = v140Var;
        this.f244864b = erc1Var;
        this.f244865c = dajVar;
        this.f244866d = byvVar;
        this.f244867e = y6s0Var;
        this.f244868f = qasVar;
        this.f244869g = y7t0Var;
        this.f244870h = ok11Var;
        this.f244871i = xawVar;
    }
}
