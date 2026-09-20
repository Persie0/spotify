package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jtq0 extends jjf1 {

    /* JADX INFO: renamed from: d */
    public final String f115950d;

    /* JADX INFO: renamed from: e */
    public final d850 f115951e;

    public jtq0(String str, d850 d850Var) {
        this.f115950d = str;
        this.f115951e = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtq0)) {
            return false;
        }
        jtq0 jtq0Var = (jtq0) obj;
        return wj50.m88271j(this.f115950d, jtq0Var.f115950d) && wj50.m88271j(this.f115951e, jtq0Var.f115951e);
    }

    public final int hashCode() {
        int iHashCode = this.f115950d.hashCode() * 31;
        d850 d850Var = this.f115951e;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
