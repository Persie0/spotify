package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class jgx implements tvd1 {

    /* JADX INFO: renamed from: a */
    public final tvd1 f112290a;

    /* JADX INFO: renamed from: b */
    public final tvd1 f112291b;

    public jgx(tvd1 tvd1Var, tvd1 tvd1Var2) {
        this.f112290a = tvd1Var;
        this.f112291b = tvd1Var2;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: a */
    public final int mo41499a(yqq yqqVar, ko70 ko70Var) {
        int iMo41499a = this.f112290a.mo41499a(yqqVar, ko70Var) - this.f112291b.mo41499a(yqqVar, ko70Var);
        if (iMo41499a < 0) {
            return 0;
        }
        return iMo41499a;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: b */
    public final int mo41500b(yqq yqqVar, ko70 ko70Var) {
        int iMo41500b = this.f112290a.mo41500b(yqqVar, ko70Var) - this.f112291b.mo41500b(yqqVar, ko70Var);
        if (iMo41500b < 0) {
            return 0;
        }
        return iMo41500b;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: c */
    public final int mo41501c(yqq yqqVar) {
        int iMo41501c = this.f112290a.mo41501c(yqqVar) - this.f112291b.mo41501c(yqqVar);
        if (iMo41501c < 0) {
            return 0;
        }
        return iMo41501c;
    }

    @Override // p204p.tvd1
    /* JADX INFO: renamed from: d */
    public final int mo41502d(yqq yqqVar) {
        int iMo41502d = this.f112290a.mo41502d(yqqVar) - this.f112291b.mo41502d(yqqVar);
        if (iMo41502d < 0) {
            return 0;
        }
        return iMo41502d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgx)) {
            return false;
        }
        jgx jgxVar = (jgx) obj;
        return wj50.m88271j(jgxVar.f112290a, this.f112290a) && wj50.m88271j(jgxVar.f112291b, this.f112291b);
    }

    public final int hashCode() {
        return this.f112291b.hashCode() + (this.f112290a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f112290a + " - " + this.f112291b + ')';
    }
}
