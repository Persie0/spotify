package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p66 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f174300a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f174301b = new b6o0(vc41.AUDIOBOOK);

    public p66(h66 h66Var) {
        this.f174300a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f174300a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f174301b;
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
        return (obj instanceof p66) && this.f174300a.equals(((p66) obj).f174300a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f174300a.hashCode() * 31);
    }
}
