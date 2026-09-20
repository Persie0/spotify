package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ra01 {

    /* JADX INFO: renamed from: a */
    public final lc01 f197155a;

    /* JADX INFO: renamed from: b */
    public final wwu f197156b;

    /* JADX INFO: renamed from: c */
    public final njg1 f197157c;

    /* JADX INFO: renamed from: d */
    public final sd01 f197158d;

    /* JADX INFO: renamed from: e */
    public final Object f197159e;

    public ra01(lc01 lc01Var, wwu wwuVar, njg1 njg1Var, sd01 sd01Var, Object obj) {
        this.f197155a = lc01Var;
        this.f197156b = wwuVar;
        this.f197157c = njg1Var;
        this.f197158d = sd01Var;
        this.f197159e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra01)) {
            return false;
        }
        ra01 ra01Var = (ra01) obj;
        return wj50.m88271j(this.f197155a, ra01Var.f197155a) && wj50.m88271j(this.f197156b, ra01Var.f197156b) && wj50.m88271j(this.f197157c, ra01Var.f197157c) && wj50.m88271j(this.f197158d, ra01Var.f197158d) && wj50.m88271j(this.f197159e, ra01Var.f197159e);
    }

    public final int hashCode() {
        int iHashCode = (this.f197158d.hashCode() + ((this.f197157c.hashCode() + ((this.f197156b.hashCode() + (this.f197155a.hashCode() * 31)) * 31)) * 31)) * 31;
        Object obj = this.f197159e;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
