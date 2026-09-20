package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v991 {

    /* JADX INFO: renamed from: a */
    public final w991 f238887a;

    /* JADX INFO: renamed from: b */
    public final mxf0 f238888b;

    public v991(w991 w991Var, mxf0 mxf0Var) {
        this.f238887a = w991Var;
        this.f238888b = mxf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v991)) {
            return false;
        }
        v991 v991Var = (v991) obj;
        return wj50.m88271j(this.f238887a, v991Var.f238887a) && wj50.m88271j(this.f238888b, v991Var.f238888b);
    }

    public final int hashCode() {
        return this.f238888b.hashCode() + (this.f238887a.hashCode() * 31);
    }
}
