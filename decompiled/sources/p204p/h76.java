package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h76 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f88351a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f88352b = new b6o0(vc41.TAG);

    public h76(h66 h66Var) {
        this.f88351a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f88351a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f88352b;
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
        return (obj instanceof h76) && this.f88351a.equals(((h76) obj).f88351a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f88351a.hashCode() * 31);
    }
}
