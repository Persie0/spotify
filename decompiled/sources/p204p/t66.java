package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t66 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f217453a;

    /* JADX INFO: renamed from: b */
    public final ry30 f217454b;

    /* JADX INFO: renamed from: c */
    public final a6o0 f217455c;

    public t66(h66 h66Var, ry30 ry30Var) {
        this.f217453a = h66Var;
        this.f217454b = ry30Var;
        this.f217455c = ry30Var != null ? new a6o0(ry30Var) : null;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f217453a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f217455c;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: c */
    public final boolean mo24910c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t66)) {
            return false;
        }
        t66 t66Var = (t66) obj;
        return wj50.m88271j(this.f217453a, t66Var.f217453a) && wj50.m88271j(this.f217454b, t66Var.f217454b);
    }

    public final int hashCode() {
        int iHashCode = this.f217453a.hashCode() * 31;
        ry30 ry30Var = this.f217454b;
        return iHashCode + (ry30Var == null ? 0 : ry30Var.hashCode());
    }
}
