package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c76 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f34761a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f34762b = new b6o0(vc41.PODCASTS);

    public c76(h66 h66Var) {
        this.f34761a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f34761a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f34762b;
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
        return (obj instanceof c76) && this.f34761a.equals(((c76) obj).f34761a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f34761a.hashCode() * 31);
    }
}
