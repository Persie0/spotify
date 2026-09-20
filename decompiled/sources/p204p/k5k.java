package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k5k {

    /* JADX INFO: renamed from: a */
    public final f5k f119532a;

    /* JADX INFO: renamed from: b */
    public final e5k f119533b;

    /* JADX INFO: renamed from: c */
    public final flw0 f119534c;

    public k5k(f5k f5kVar, e5k e5kVar, flw0 flw0Var) {
        this.f119532a = f5kVar;
        this.f119533b = e5kVar;
        this.f119534c = flw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final flw0 m55441a() {
        return this.f119534c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5k)) {
            return false;
        }
        k5k k5kVar = (k5k) obj;
        return wj50.m88271j(this.f119532a, k5kVar.f119532a) && wj50.m88271j(this.f119533b, k5kVar.f119533b) && wj50.m88271j(this.f119534c, k5kVar.f119534c);
    }

    public final int hashCode() {
        int iHashCode = (this.f119533b.hashCode() + (this.f119532a.hashCode() * 31)) * 31;
        flw0 flw0Var = this.f119534c;
        return iHashCode + (flw0Var == null ? 0 : flw0Var.hashCode());
    }
}
