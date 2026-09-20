package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class cl2 {

    /* JADX INFO: renamed from: a */
    public final km2 f39153a;

    /* JADX INFO: renamed from: b */
    public final jm2 f39154b;

    /* JADX INFO: renamed from: c */
    public final cm2 f39155c;

    public cl2(km2 km2Var, jm2 jm2Var, cm2 cm2Var, int i) {
        km2Var = (i & 1) != 0 ? null : km2Var;
        jm2Var = (i & 2) != 0 ? null : jm2Var;
        cm2Var = (i & 4) != 0 ? null : cm2Var;
        this.f39153a = km2Var;
        this.f39154b = jm2Var;
        this.f39155c = cm2Var;
    }

    /* JADX INFO: renamed from: a */
    public final cm2 m33215a() {
        return this.f39155c;
    }

    /* JADX INFO: renamed from: b */
    public final jm2 m33216b() {
        return this.f39154b;
    }

    /* JADX INFO: renamed from: c */
    public final km2 m33217c() {
        return this.f39153a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl2)) {
            return false;
        }
        cl2 cl2Var = (cl2) obj;
        return wj50.m88271j(this.f39153a, cl2Var.f39153a) && wj50.m88271j(this.f39154b, cl2Var.f39154b) && wj50.m88271j(this.f39155c, cl2Var.f39155c);
    }

    public final int hashCode() {
        km2 km2Var = this.f39153a;
        int iHashCode = (km2Var == null ? 0 : km2Var.hashCode()) * 31;
        jm2 jm2Var = this.f39154b;
        int iHashCode2 = (iHashCode + (jm2Var == null ? 0 : jm2Var.f113734a.hashCode())) * 31;
        cm2 cm2Var = this.f39155c;
        return iHashCode2 + (cm2Var != null ? cm2Var.f39574a.hashCode() : 0);
    }
}
