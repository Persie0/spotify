package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jmq0 extends q2m0 {

    /* JADX INFO: renamed from: b */
    public final String f113926b;

    /* JADX INFO: renamed from: c */
    public final String f113927c;

    /* JADX INFO: renamed from: d */
    public final int f113928d;

    /* JADX INFO: renamed from: e */
    public final mkc0 f113929e;

    /* JADX INFO: renamed from: f */
    public final jsa0 f113930f;

    public jmq0(String str, String str2, int i, mkc0 mkc0Var, jsa0 jsa0Var) {
        super(4);
        this.f113926b = str;
        this.f113927c = str2;
        this.f113928d = i;
        this.f113929e = mkc0Var;
        this.f113930f = jsa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmq0)) {
            return false;
        }
        jmq0 jmq0Var = (jmq0) obj;
        return wj50.m88271j(this.f113926b, jmq0Var.f113926b) && wj50.m88271j(this.f113927c, jmq0Var.f113927c) && this.f113928d == jmq0Var.f113928d && wj50.m88271j(this.f113929e, jmq0Var.f113929e) && wj50.m88271j(this.f113930f, jmq0Var.f113930f);
    }

    public final int hashCode() {
        String str = this.f113926b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f113927c;
        int iM40938f = f710.m40938f(this.f113928d, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        mkc0 mkc0Var = this.f113929e;
        int iHashCode2 = (iM40938f + (mkc0Var == null ? 0 : mkc0Var.hashCode())) * 31;
        jsa0 jsa0Var = this.f113930f;
        return iHashCode2 + (jsa0Var != null ? jsa0Var.hashCode() : 0);
    }
}
