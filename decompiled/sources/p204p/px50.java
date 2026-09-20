package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class px50 {

    /* JADX INFO: renamed from: a */
    public final long f182209a;

    /* JADX INFO: renamed from: b */
    public final int f182210b;

    /* JADX INFO: renamed from: c */
    public final ox50 f182211c;

    public px50(long j, int i, ox50 ox50Var) {
        this.f182209a = j;
        this.f182210b = i;
        this.f182211c = ox50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px50)) {
            return false;
        }
        px50 px50Var = (px50) obj;
        return this.f182209a == px50Var.f182209a && this.f182210b == px50Var.f182210b && wj50.m88271j(this.f182211c, px50Var.f182211c);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f182210b, Long.hashCode(this.f182209a) * 31, 31);
        ox50 ox50Var = this.f182211c;
        return iM40938f + (ox50Var == null ? 0 : ox50Var.hashCode());
    }
}
