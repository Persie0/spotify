package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xw51 implements bx51 {

    /* JADX INFO: renamed from: a */
    public final vw51 f266595a;

    /* JADX INFO: renamed from: b */
    public final zw51 f266596b;

    public xw51(vw51 vw51Var, zw51 zw51Var) {
        this.f266595a = vw51Var;
        this.f266596b = zw51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw51)) {
            return false;
        }
        xw51 xw51Var = (xw51) obj;
        return wj50.m88271j(this.f266595a, xw51Var.f266595a) && wj50.m88271j(this.f266596b, xw51Var.f266596b);
    }

    public final int hashCode() {
        return this.f266596b.hashCode() + (this.f266595a.hashCode() * 31);
    }
}
