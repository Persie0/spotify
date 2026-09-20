package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cgl0 extends fgl0 {

    /* JADX INFO: renamed from: a */
    public final bgl0 f37741a;

    /* JADX INFO: renamed from: b */
    public final bgl0 f37742b;

    /* JADX INFO: renamed from: c */
    public final agl0 f37743c;

    public cgl0(bgl0 bgl0Var, bgl0 bgl0Var2, agl0 agl0Var) {
        this.f37741a = bgl0Var;
        this.f37742b = bgl0Var2;
        this.f37743c = agl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgl0)) {
            return false;
        }
        cgl0 cgl0Var = (cgl0) obj;
        return wj50.m88271j(this.f37741a, cgl0Var.f37741a) && wj50.m88271j(this.f37742b, cgl0Var.f37742b) && wj50.m88271j(this.f37743c, cgl0Var.f37743c);
    }

    public final int hashCode() {
        int iHashCode = (this.f37742b.hashCode() + (this.f37741a.hashCode() * 31)) * 31;
        agl0 agl0Var = this.f37743c;
        return iHashCode + (agl0Var == null ? 0 : agl0Var.hashCode());
    }
}
