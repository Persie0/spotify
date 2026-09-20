package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ts6 {

    /* JADX INFO: renamed from: a */
    public final ss6 f223223a;

    /* JADX INFO: renamed from: b */
    public final wy81 f223224b;

    public ts6(ss6 ss6Var, wy81 wy81Var) {
        this.f223223a = ss6Var;
        this.f223224b = wy81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts6)) {
            return false;
        }
        ts6 ts6Var = (ts6) obj;
        return wj50.m88271j(this.f223223a, ts6Var.f223223a) && wj50.m88271j(this.f223224b, ts6Var.f223224b);
    }

    public final int hashCode() {
        int iHashCode = this.f223223a.hashCode() * 31;
        wy81 wy81Var = this.f223224b;
        return iHashCode + (wy81Var == null ? 0 : wy81Var.hashCode());
    }
}
