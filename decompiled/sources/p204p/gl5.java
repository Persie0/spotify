package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gl5 {

    /* JADX INFO: renamed from: a */
    public final String f80995a;

    /* JADX INFO: renamed from: b */
    public final pni f80996b;

    public gl5(String str, pni pniVar) {
        this.f80995a = str;
        this.f80996b = pniVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl5)) {
            return false;
        }
        gl5 gl5Var = (gl5) obj;
        return wj50.m88271j(this.f80995a, gl5Var.f80995a) && wj50.m88271j(this.f80996b, gl5Var.f80996b);
    }

    public final int hashCode() {
        int iHashCode = this.f80995a.hashCode() * 31;
        pni pniVar = this.f80996b;
        return iHashCode + (pniVar == null ? 0 : pniVar.hashCode());
    }
}
