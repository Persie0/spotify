package p204p;

/* JADX INFO: loaded from: classes6.dex */
@rtz0
public final class ksd1 {
    public static final jsd1 Companion = new jsd1();

    /* JADX INFO: renamed from: a */
    public final nsd1 f125932a;

    /* JADX INFO: renamed from: b */
    public final qsd1 f125933b;

    public /* synthetic */ ksd1(int i, nsd1 nsd1Var, qsd1 qsd1Var) {
        if ((i & 1) == 0) {
            this.f125932a = null;
        } else {
            this.f125932a = nsd1Var;
        }
        if ((i & 2) == 0) {
            this.f125933b = null;
        } else {
            this.f125933b = qsd1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksd1)) {
            return false;
        }
        ksd1 ksd1Var = (ksd1) obj;
        return wj50.m88271j(this.f125932a, ksd1Var.f125932a) && wj50.m88271j(this.f125933b, ksd1Var.f125933b);
    }

    public final int hashCode() {
        nsd1 nsd1Var = this.f125932a;
        int iHashCode = (nsd1Var == null ? 0 : nsd1Var.hashCode()) * 31;
        qsd1 qsd1Var = this.f125933b;
        return iHashCode + (qsd1Var != null ? qsd1Var.f192076a.hashCode() : 0);
    }
}
