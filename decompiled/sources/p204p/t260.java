package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t260 extends v260 {

    /* JADX INFO: renamed from: a */
    public final y260 f216429a;

    /* JADX INFO: renamed from: b */
    public final q260 f216430b;

    /* JADX INFO: renamed from: c */
    public final m260 f216431c;

    /* JADX INFO: renamed from: d */
    public final by50 f216432d;

    public t260(y260 y260Var, q260 q260Var, m260 m260Var, by50 by50Var) {
        this.f216429a = y260Var;
        this.f216430b = q260Var;
        this.f216431c = m260Var;
        this.f216432d = by50Var;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: a */
    public final by50 mo77039a() {
        return this.f216432d;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: b */
    public final m260 mo77040b() {
        return this.f216431c;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: c */
    public final q260 mo77041c() {
        return this.f216430b;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: d */
    public final boolean mo77042d() {
        return false;
    }

    @Override // p204p.v260
    /* JADX INFO: renamed from: e */
    public final a360 mo77043e() {
        return this.f216429a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t260)) {
            return false;
        }
        t260 t260Var = (t260) obj;
        return this.f216429a.equals(t260Var.f216429a) && this.f216430b.equals(t260Var.f216430b) && wj50.m88271j(this.f216431c, t260Var.f216431c) && wj50.m88271j(this.f216432d, t260Var.f216432d);
    }

    public final int hashCode() {
        int iHashCode = (this.f216430b.hashCode() + (this.f216429a.hashCode() * 31)) * 31;
        m260 m260Var = this.f216431c;
        return this.f216432d.hashCode() + s571.m77245d((iHashCode + (m260Var == null ? 0 : m260Var.hashCode())) * 31, 31, false);
    }
}
