package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p76 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f174600a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f174601b = new b6o0(vc41.VIDEO);

    public p76(h66 h66Var) {
        this.f174600a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f174600a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f174601b;
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
        return (obj instanceof p76) && this.f174600a.equals(((p76) obj).f174600a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f174600a.hashCode() * 31);
    }
}
