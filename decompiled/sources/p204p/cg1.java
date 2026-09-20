package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cg1 {

    /* JADX INFO: renamed from: a */
    public final v3m f37506a;

    /* JADX INFO: renamed from: b */
    public final uu41 f37507b;

    /* JADX INFO: renamed from: c */
    public final boolean f37508c;

    public cg1(v3m v3mVar, uu41 uu41Var, boolean z) {
        this.f37506a = v3mVar;
        this.f37507b = uu41Var;
        this.f37508c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg1)) {
            return false;
        }
        cg1 cg1Var = (cg1) obj;
        return wj50.m88271j(this.f37506a, cg1Var.f37506a) && wj50.m88271j(this.f37507b, cg1Var.f37507b) && this.f37508c == cg1Var.f37508c;
    }

    public final int hashCode() {
        int iHashCode = this.f37506a.hashCode() * 31;
        uu41 uu41Var = this.f37507b;
        return Boolean.hashCode(this.f37508c) + ((iHashCode + (uu41Var == null ? 0 : uu41Var.hashCode())) * 31);
    }
}
