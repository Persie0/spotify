package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oki0 extends fag1 {

    /* JADX INFO: renamed from: d */
    public final ou31 f166374d;

    /* JADX INFO: renamed from: e */
    public final sr01 f166375e;

    /* JADX INFO: renamed from: f */
    public final int f166376f;

    /* JADX INFO: renamed from: g */
    public final boolean f166377g;

    public oki0(ou31 ou31Var, sr01 sr01Var, int i, boolean z) {
        this.f166374d = ou31Var;
        this.f166375e = sr01Var;
        this.f166376f = i;
        this.f166377g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oki0)) {
            return false;
        }
        oki0 oki0Var = (oki0) obj;
        return wj50.m88271j(this.f166374d, oki0Var.f166374d) && wj50.m88271j(this.f166375e, oki0Var.f166375e) && this.f166376f == oki0Var.f166376f && this.f166377g == oki0Var.f166377g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166377g) + f710.m40938f(this.f166376f, rkh0.m75733g(this.f166375e, this.f166374d.hashCode() * 31, 31), 31);
    }
}
