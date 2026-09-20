package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hvr0 extends bwr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f95775a;

    /* JADX INFO: renamed from: b */
    public final String f95776b;

    /* JADX INFO: renamed from: c */
    public final String f95777c;

    /* JADX INFO: renamed from: d */
    public final d850 f95778d;

    /* JADX INFO: renamed from: e */
    public final String f95779e;

    public hvr0(boolean z, String str, String str2, d850 d850Var, String str3) {
        this.f95775a = z;
        this.f95776b = str;
        this.f95777c = str2;
        this.f95778d = d850Var;
        this.f95779e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvr0)) {
            return false;
        }
        hvr0 hvr0Var = (hvr0) obj;
        return this.f95775a == hvr0Var.f95775a && wj50.m88271j(this.f95776b, hvr0Var.f95776b) && wj50.m88271j(this.f95777c, hvr0Var.f95777c) && wj50.m88271j(this.f95778d, hvr0Var.f95778d) && wj50.m88271j(this.f95779e, hvr0Var.f95779e);
    }

    public final int hashCode() {
        int iHashCode = (this.f95778d.hashCode() + s571.m77243b(s571.m77243b(Boolean.hashCode(this.f95775a) * 31, 31, this.f95776b), 31, this.f95777c)) * 31;
        String str = this.f95779e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
