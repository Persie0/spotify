package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n66 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f150715a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f150716b = new b6o0(vc41.ARTIST);

    public n66(h66 h66Var) {
        this.f150715a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f150715a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f150716b;
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
        return (obj instanceof n66) && this.f150715a.equals(((n66) obj).f150715a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f150715a.hashCode() * 31);
    }
}
