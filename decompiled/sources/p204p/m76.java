package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m76 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f140673a;

    /* JADX INFO: renamed from: b */
    public final b6o0 f140674b = new b6o0(vc41.USER);

    public m76(h66 h66Var) {
        this.f140673a = h66Var;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f140673a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f140674b;
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
        return (obj instanceof m76) && this.f140673a.equals(((m76) obj).f140673a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f140673a.hashCode() * 31);
    }
}
