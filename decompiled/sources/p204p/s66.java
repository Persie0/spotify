package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s66 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f206012a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f206013b = new b6o0(vc41.COLLECTION);

    public s66(h66 h66Var) {
        this.f206012a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f206012a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f206013b;
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
        return (obj instanceof s66) && this.f206012a.equals(((s66) obj).f206012a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f206012a.hashCode() * 31);
    }
}
