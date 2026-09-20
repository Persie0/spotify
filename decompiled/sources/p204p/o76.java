package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class o76 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f162470a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f162471b = new b6o0(vc41.EVENTS);

    public o76(h66 h66Var) {
        this.f162470a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f162470a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f162471b;
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
        return (obj instanceof o76) && this.f162470a.equals(((o76) obj).f162470a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f162470a.hashCode() * 31);
    }
}
