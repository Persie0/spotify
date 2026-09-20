package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m66 extends q76 {

    /* JADX INFO: renamed from: a */
    public final h66 f140395a;

    /* JADX INFO: renamed from: b */
    public final boolean f140396b;

    /* JADX INFO: renamed from: c */
    public final b6o0 f140397c = new b6o0(vc41.ARTIST);

    public m66(h66 h66Var, boolean z) {
        this.f140395a = h66Var;
        this.f140396b = z;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: a */
    public final h66 mo24908a() {
        return this.f140395a;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: b */
    public final mif1 mo24909b() {
        return this.f140397c;
    }

    @Override // p204p.q76
    /* JADX INFO: renamed from: c */
    public final boolean mo24910c() {
        return this.f140396b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m66)) {
            return false;
        }
        m66 m66Var = (m66) obj;
        return wj50.m88271j(this.f140395a, m66Var.f140395a) && this.f140396b == m66Var.f140396b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140396b) + (this.f140395a.hashCode() * 31);
    }
}
