package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class isy0 extends puy0 {

    /* JADX INFO: renamed from: a */
    public final String f105362a;

    /* JADX INFO: renamed from: b */
    public final d850 f105363b;

    public isy0(String str, d850 d850Var) {
        this.f105362a = str;
        this.f105363b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isy0)) {
            return false;
        }
        isy0 isy0Var = (isy0) obj;
        return wj50.m88271j(this.f105362a, isy0Var.f105362a) && wj50.m88271j(this.f105363b, isy0Var.f105363b);
    }

    public final int hashCode() {
        int iHashCode = this.f105362a.hashCode() * 31;
        d850 d850Var = this.f105363b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
