package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class g76 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f77192a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f77193b = new b6o0(vc41.PODCASTS);

    public g76(h66 h66Var) {
        this.f77192a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f77192a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f77193b;
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
        return (obj instanceof g76) && this.f77192a.equals(((g76) obj).f77192a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f77192a.hashCode() * 31);
    }
}
