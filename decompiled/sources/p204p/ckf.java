package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ckf implements lkf {

    /* JADX INFO: renamed from: a */
    public final qdz0 f38941a;

    /* JADX INFO: renamed from: b */
    public final d850 f38942b;

    public ckf(qdz0 qdz0Var, d850 d850Var) {
        this.f38941a = qdz0Var;
        this.f38942b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckf)) {
            return false;
        }
        ckf ckfVar = (ckf) obj;
        return wj50.m88271j(this.f38941a, ckfVar.f38941a) && wj50.m88271j(this.f38942b, ckfVar.f38942b);
    }

    public final int hashCode() {
        int iHashCode = this.f38941a.hashCode() * 31;
        d850 d850Var = this.f38942b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
