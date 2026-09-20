package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class bmv0 {

    /* JADX INFO: renamed from: a */
    public final by50 f28627a;

    /* JADX INFO: renamed from: b */
    public final by50 f28628b;

    public bmv0(by50 by50Var, by50 by50Var2) {
        this.f28627a = by50Var;
        this.f28628b = by50Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmv0)) {
            return false;
        }
        bmv0 bmv0Var = (bmv0) obj;
        return wj50.m88271j(this.f28627a, bmv0Var.f28627a) && wj50.m88271j(this.f28628b, bmv0Var.f28628b);
    }

    public final int hashCode() {
        by50 by50Var = this.f28627a;
        int iHashCode = (by50Var == null ? 0 : by50Var.hashCode()) * 31;
        by50 by50Var2 = this.f28628b;
        return iHashCode + (by50Var2 != null ? by50Var2.hashCode() : 0);
    }
}
