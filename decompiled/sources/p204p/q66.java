package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q66 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f185688a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f185689b = new b6o0(vc41.AUDIOBOOK_AUTHOR);

    public q66(h66 h66Var) {
        this.f185688a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f185688a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f185689b;
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
        return (obj instanceof q66) && this.f185688a.equals(((q66) obj).f185688a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f185688a.hashCode() * 31);
    }
}
