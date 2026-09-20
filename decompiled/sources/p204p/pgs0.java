package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class pgs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f177391a;

    /* JADX INFO: renamed from: b */
    public final d850 f177392b;

    public pgs0(String str, d850 d850Var) {
        this.f177391a = str;
        this.f177392b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgs0)) {
            return false;
        }
        pgs0 pgs0Var = (pgs0) obj;
        return wj50.m88271j(this.f177391a, pgs0Var.f177391a) && wj50.m88271j(this.f177392b, pgs0Var.f177392b);
    }

    public final int hashCode() {
        int iHashCode = this.f177391a.hashCode() * 31;
        d850 d850Var = this.f177392b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
