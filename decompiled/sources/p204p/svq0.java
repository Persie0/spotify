package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class svq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final String f214499a;

    /* JADX INFO: renamed from: b */
    public final d850 f214500b;

    public svq0(String str, d850 d850Var) {
        this.f214499a = str;
        this.f214500b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svq0)) {
            return false;
        }
        svq0 svq0Var = (svq0) obj;
        return wj50.m88271j(this.f214499a, svq0Var.f214499a) && wj50.m88271j(this.f214500b, svq0Var.f214500b);
    }

    public final int hashCode() {
        int iHashCode = this.f214499a.hashCode() * 31;
        d850 d850Var = this.f214500b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
