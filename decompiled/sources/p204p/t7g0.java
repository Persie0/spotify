package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t7g0 {

    /* JADX INFO: renamed from: a */
    public final o690 f217766a;

    /* JADX INFO: renamed from: b */
    public final o690 f217767b;

    public t7g0(o690 o690Var, o690 o690Var2) {
        this.f217766a = o690Var;
        this.f217767b = o690Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7g0)) {
            return false;
        }
        t7g0 t7g0Var = (t7g0) obj;
        return wj50.m88271j(this.f217766a, t7g0Var.f217766a) && wj50.m88271j(this.f217767b, t7g0Var.f217767b);
    }

    public final int hashCode() {
        o690 o690Var = this.f217766a;
        int iHashCode = (o690Var == null ? 0 : o690Var.hashCode()) * 31;
        o690 o690Var2 = this.f217767b;
        return iHashCode + (o690Var2 != null ? o690Var2.hashCode() : 0);
    }
}
