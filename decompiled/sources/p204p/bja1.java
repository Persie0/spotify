package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bja1 {

    /* JADX INFO: renamed from: a */
    public final String f27648a;

    /* JADX INFO: renamed from: b */
    public final String f27649b;

    /* JADX INFO: renamed from: c */
    public final aja1 f27650c;

    /* JADX INFO: renamed from: d */
    public final aja1 f27651d;

    public bja1(String str, String str2, aja1 aja1Var, aja1 aja1Var2) {
        this.f27648a = str;
        this.f27649b = str2;
        this.f27650c = aja1Var;
        this.f27651d = aja1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bja1)) {
            return false;
        }
        bja1 bja1Var = (bja1) obj;
        return wj50.m88271j(this.f27648a, bja1Var.f27648a) && wj50.m88271j(this.f27649b, bja1Var.f27649b) && wj50.m88271j(this.f27650c, bja1Var.f27650c) && wj50.m88271j(this.f27651d, bja1Var.f27651d);
    }

    public final int hashCode() {
        int iHashCode = (this.f27650c.hashCode() + s571.m77243b(this.f27648a.hashCode() * 31, 31, this.f27649b)) * 31;
        aja1 aja1Var = this.f27651d;
        return iHashCode + (aja1Var == null ? 0 : aja1Var.hashCode());
    }
}
