package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wlf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final String f252541a;

    /* JADX INFO: renamed from: b */
    public final d850 f252542b;

    public wlf0(String str, d850 d850Var) {
        this.f252541a = str;
        this.f252542b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlf0)) {
            return false;
        }
        wlf0 wlf0Var = (wlf0) obj;
        return wj50.m88271j(this.f252541a, wlf0Var.f252541a) && wj50.m88271j(this.f252542b, wlf0Var.f252542b);
    }

    public final int hashCode() {
        int iHashCode = this.f252541a.hashCode() * 31;
        d850 d850Var = this.f252542b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
