package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fpx0 {

    /* JADX INFO: renamed from: a */
    public final er50 f72011a;

    /* JADX INFO: renamed from: b */
    public final int f72012b;

    /* JADX INFO: renamed from: c */
    public final String f72013c;

    public fpx0(er50 er50Var, int i, String str) {
        this.f72011a = er50Var;
        this.f72012b = i;
        this.f72013c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpx0)) {
            return false;
        }
        fpx0 fpx0Var = (fpx0) obj;
        return wj50.m88271j(this.f72011a, fpx0Var.f72011a) && this.f72012b == fpx0Var.f72012b && wj50.m88271j(this.f72013c, fpx0Var.f72013c);
    }

    public final int hashCode() {
        return this.f72013c.hashCode() + mt60.m62800g(this.f72012b, this.f72011a.hashCode() * 31, 31);
    }
}
