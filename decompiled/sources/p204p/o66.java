package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o66 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f162227a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f162228b = new b6o0(vc41.ARTIST);

    public o66(h66 h66Var) {
        this.f162227a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f162227a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f162228b;
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
        return (obj instanceof o66) && this.f162227a.equals(((o66) obj).f162227a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f162227a.hashCode() * 31);
    }
}
