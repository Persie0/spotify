package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sty0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f213962a;

    /* JADX INFO: renamed from: b */
    public final d850 f213963b;

    public sty0(String str, d850 d850Var) {
        this.f213962a = str;
        this.f213963b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sty0)) {
            return false;
        }
        sty0 sty0Var = (sty0) obj;
        return wj50.m88271j(this.f213962a, sty0Var.f213962a) && wj50.m88271j(this.f213963b, sty0Var.f213963b);
    }

    public final int hashCode() {
        int iHashCode = this.f213962a.hashCode() * 31;
        d850 d850Var = this.f213963b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
