package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ss50 extends vs50 {

    /* JADX INFO: renamed from: a */
    public final int f213489a;

    /* JADX INFO: renamed from: b */
    public final nw80 f213490b;

    /* JADX INFO: renamed from: c */
    public final rs50 f213491c;

    public ss50(int i, nw80 nw80Var, rs50 rs50Var) {
        this.f213489a = i;
        this.f213490b = nw80Var;
        this.f213491c = rs50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss50)) {
            return false;
        }
        ss50 ss50Var = (ss50) obj;
        return this.f213489a == ss50Var.f213489a && wj50.m88271j(this.f213490b, ss50Var.f213490b) && wj50.m88271j(this.f213491c, ss50Var.f213491c);
    }

    public final int hashCode() {
        return this.f213491c.hashCode() + ((this.f213490b.hashCode() + (Integer.hashCode(this.f213489a) * 31)) * 31);
    }

    public /* synthetic */ ss50(int i, nw80 nw80Var) {
        this(i, nw80Var, new ps50(js50.f115400a));
    }
}
