package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rqj0 implements tqj0 {

    /* JADX INFO: renamed from: a */
    public final ock f201836a;

    /* JADX INFO: renamed from: b */
    public final iol f201837b;

    /* JADX INFO: renamed from: c */
    public final String f201838c;

    public rqj0(ock ockVar, iol iolVar, String str) {
        this.f201836a = ockVar;
        this.f201837b = iolVar;
        this.f201838c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqj0)) {
            return false;
        }
        rqj0 rqj0Var = (rqj0) obj;
        return wj50.m88271j(this.f201836a, rqj0Var.f201836a) && wj50.m88271j(this.f201837b, rqj0Var.f201837b) && wj50.m88271j(this.f201838c, rqj0Var.f201838c);
    }

    public final int hashCode() {
        int iHashCode = (this.f201837b.hashCode() + (this.f201836a.hashCode() * 31)) * 31;
        String str = this.f201838c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
