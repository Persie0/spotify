package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wg20 {

    /* JADX INFO: renamed from: a */
    public final pg20 f250947a;

    /* JADX INFO: renamed from: b */
    public final ug20 f250948b;

    /* JADX INFO: renamed from: c */
    public final a7f0 f250949c;

    public wg20(pg20 pg20Var, ug20 ug20Var, a7f0 a7f0Var) {
        this.f250947a = pg20Var;
        this.f250948b = ug20Var;
        this.f250949c = a7f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg20)) {
            return false;
        }
        wg20 wg20Var = (wg20) obj;
        return wj50.m88271j(this.f250947a, wg20Var.f250947a) && wj50.m88271j(this.f250948b, wg20Var.f250948b) && wj50.m88271j(this.f250949c, wg20Var.f250949c);
    }

    public final int hashCode() {
        int iHashCode = this.f250947a.hashCode() * 31;
        ug20 ug20Var = this.f250948b;
        int iHashCode2 = (iHashCode + (ug20Var == null ? 0 : ug20Var.hashCode())) * 31;
        a7f0 a7f0Var = this.f250949c;
        return iHashCode2 + (a7f0Var != null ? a7f0Var.hashCode() : 0);
    }
}
