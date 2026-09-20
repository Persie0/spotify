package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d76 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f46000a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f46001b = new b6o0(vc41.RADIO);

    public d76(h66 h66Var) {
        this.f46000a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f46000a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f46001b;
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
        return (obj instanceof d76) && this.f46000a.equals(((d76) obj).f46000a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f46000a.hashCode() * 31);
    }
}
