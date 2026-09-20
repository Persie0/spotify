package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class yl70 {

    /* JADX INFO: renamed from: a */
    public final v140 f273927a;

    /* JADX INFO: renamed from: b */
    public final erc1 f273928b;

    /* JADX INFO: renamed from: c */
    public final lar0 f273929c;

    /* JADX INFO: renamed from: d */
    public final zs6 f273930d;

    /* JADX INFO: renamed from: e */
    public final zs6 f273931e;

    /* JADX INFO: renamed from: f */
    public final uu41 f273932f;

    public yl70(v140 v140Var, erc1 erc1Var, lar0 lar0Var, zs6 zs6Var, zs6 zs6Var2, uu41 uu41Var) {
        this.f273927a = v140Var;
        this.f273928b = erc1Var;
        this.f273929c = lar0Var;
        this.f273930d = zs6Var;
        this.f273931e = zs6Var2;
        this.f273932f = uu41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl70)) {
            return false;
        }
        yl70 yl70Var = (yl70) obj;
        return wj50.m88271j(this.f273927a, yl70Var.f273927a) && wj50.m88271j(this.f273928b, yl70Var.f273928b) && wj50.m88271j(this.f273929c, yl70Var.f273929c) && wj50.m88271j(this.f273930d, yl70Var.f273930d) && wj50.m88271j(this.f273931e, yl70Var.f273931e) && wj50.m88271j(this.f273932f, yl70Var.f273932f);
    }

    public final int hashCode() {
        v140 v140Var = this.f273927a;
        int iHashCode = (v140Var == null ? 0 : v140Var.hashCode()) * 31;
        erc1 erc1Var = this.f273928b;
        int iHashCode2 = (iHashCode + (erc1Var == null ? 0 : erc1Var.hashCode())) * 31;
        lar0 lar0Var = this.f273929c;
        int iHashCode3 = (iHashCode2 + (lar0Var == null ? 0 : lar0Var.hashCode())) * 31;
        zs6 zs6Var = this.f273930d;
        int iHashCode4 = (iHashCode3 + (zs6Var == null ? 0 : zs6Var.hashCode())) * 31;
        zs6 zs6Var2 = this.f273931e;
        return this.f273932f.hashCode() + ((iHashCode4 + (zs6Var2 != null ? zs6Var2.hashCode() : 0)) * 31);
    }
}
