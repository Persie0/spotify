package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e76 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f56838a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f56839b = new b6o0(vc41.SEARCH);

    public e76(h66 h66Var) {
        this.f56838a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f56838a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f56839b;
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
        return (obj instanceof e76) && this.f56838a.equals(((e76) obj).f56838a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f56838a.hashCode() * 31);
    }
}
