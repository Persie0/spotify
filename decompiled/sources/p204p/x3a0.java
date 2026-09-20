package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class x3a0 {

    /* JADX INFO: renamed from: a */
    public final k69 f257722a;

    /* JADX INFO: renamed from: b */
    public final int f257723b;

    /* JADX INFO: renamed from: c */
    public final Float f257724c;

    public x3a0(k69 k69Var, int i, Float f) {
        this.f257722a = k69Var;
        this.f257723b = i;
        this.f257724c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3a0)) {
            return false;
        }
        x3a0 x3a0Var = (x3a0) obj;
        return wj50.m88271j(this.f257722a, x3a0Var.f257722a) && this.f257723b == x3a0Var.f257723b && wj50.m88271j(this.f257724c, x3a0Var.f257724c);
    }

    public final int hashCode() {
        k69 k69Var = this.f257722a;
        int iM62800g = mt60.m62800g(this.f257723b, (k69Var == null ? 0 : k69Var.hashCode()) * 31, 31);
        Float f = this.f257724c;
        return iM62800g + (f != null ? f.hashCode() : 0);
    }
}
