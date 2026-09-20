package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class n3y {

    /* JADX INFO: renamed from: a */
    public final gmr0 f150151a;

    /* JADX INFO: renamed from: b */
    public final m3y f150152b;

    /* JADX INFO: renamed from: c */
    public final boolean f150153c;

    /* JADX INFO: renamed from: d */
    public final boolean f150154d;

    public n3y(gmr0 gmr0Var, m3y m3yVar, boolean z, boolean z2) {
        this.f150151a = gmr0Var;
        this.f150152b = m3yVar;
        this.f150153c = z;
        this.f150154d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3y)) {
            return false;
        }
        n3y n3yVar = (n3y) obj;
        return wj50.m88271j(this.f150151a, n3yVar.f150151a) && wj50.m88271j(this.f150152b, n3yVar.f150152b) && this.f150153c == n3yVar.f150153c && this.f150154d == n3yVar.f150154d;
    }

    public final int hashCode() {
        gmr0 gmr0Var = this.f150151a;
        int iHashCode = (gmr0Var == null ? 0 : gmr0Var.hashCode()) * 31;
        m3y m3yVar = this.f150152b;
        return Boolean.hashCode(this.f150154d) + s571.m77245d((iHashCode + (m3yVar != null ? m3yVar.hashCode() : 0)) * 31, 31, this.f150153c);
    }
}
