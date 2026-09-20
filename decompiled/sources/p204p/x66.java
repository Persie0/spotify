package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x66 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f258600a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f258601b = new b6o0(vc41.USER);

    public x66(h66 h66Var) {
        this.f258600a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f258600a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f258601b;
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
        return (obj instanceof x66) && this.f258600a.equals(((x66) obj).f258600a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f258600a.hashCode() * 31);
    }
}
