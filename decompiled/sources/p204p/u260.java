package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u260 extends v260 {

    /* JADX INFO: renamed from: a */
    public final y260 f225996a;

    /* JADX INFO: renamed from: b */
    public final q260 f225997b;

    /* JADX INFO: renamed from: c */
    public final m260 f225998c;

    /* JADX INFO: renamed from: d */
    public final by50 f225999d;

    public u260(y260 y260Var, q260 q260Var, m260 m260Var, by50 by50Var) {
        this.f225996a = y260Var;
        this.f225997b = q260Var;
        this.f225998c = m260Var;
        this.f225999d = by50Var;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: a */
    public final by50 mo77039a() {
        return this.f225999d;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: b */
    public final m260 mo77040b() {
        return this.f225998c;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: c */
    public final q260 mo77041c() {
        return this.f225997b;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: d */
    public final boolean mo77042d() {
        return true;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: e */
    public final a360 mo77043e() {
        return this.f225996a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u260)) {
            return false;
        }
        u260 u260Var = (u260) obj;
        return this.f225996a.equals(u260Var.f225996a) && this.f225997b.equals(u260Var.f225997b) && wj50.m88271j(this.f225998c, u260Var.f225998c) && wj50.m88271j(this.f225999d, u260Var.f225999d);
    }

    public final int hashCode() {
        int iHashCode = (this.f225997b.hashCode() + (this.f225996a.hashCode() * 31)) * 31;
        m260 m260Var = this.f225998c;
        return this.f225999d.hashCode() + s571.m77245d((iHashCode + (m260Var == null ? 0 : m260Var.hashCode())) * 31, 31, true);
    }
}
