package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class r66 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f196179a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f196180b = new b6o0(vc41.BROWSE);

    public r66(h66 h66Var) {
        this.f196179a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f196179a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f196180b;
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
        return (obj instanceof r66) && this.f196179a.equals(((r66) obj).f196179a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f196179a.hashCode() * 31);
    }
}
