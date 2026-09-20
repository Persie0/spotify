package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xg20 {

    /* JADX INFO: renamed from: a */
    public final qg20 f261181a;

    /* JADX INFO: renamed from: b */
    public final vg20 f261182b;

    /* JADX INFO: renamed from: c */
    public final th00 f261183c;

    public xg20(qg20 qg20Var, vg20 vg20Var, th00 th00Var) {
        this.f261181a = qg20Var;
        this.f261182b = vg20Var;
        this.f261183c = th00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg20)) {
            return false;
        }
        xg20 xg20Var = (xg20) obj;
        return wj50.m88271j(this.f261181a, xg20Var.f261181a) && wj50.m88271j(this.f261182b, xg20Var.f261182b) && wj50.m88271j(this.f261183c, xg20Var.f261183c);
    }

    public final int hashCode() {
        qg20 qg20Var = this.f261181a;
        int iHashCode = (qg20Var == null ? 0 : qg20Var.hashCode()) * 31;
        vg20 vg20Var = this.f261182b;
        int iHashCode2 = (iHashCode + (vg20Var == null ? 0 : vg20Var.hashCode())) * 31;
        th00 th00Var = this.f261183c;
        return iHashCode2 + (th00Var != null ? th00Var.hashCode() : 0);
    }
}
