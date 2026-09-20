package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rty0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f202707a;

    /* JADX INFO: renamed from: b */
    public final d850 f202708b;

    public rty0(String str, d850 d850Var) {
        this.f202707a = str;
        this.f202708b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rty0)) {
            return false;
        }
        rty0 rty0Var = (rty0) obj;
        return wj50.m88271j(this.f202707a, rty0Var.f202707a) && wj50.m88271j(this.f202708b, rty0Var.f202708b);
    }

    public final int hashCode() {
        int iHashCode = this.f202707a.hashCode() * 31;
        d850 d850Var = this.f202708b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
