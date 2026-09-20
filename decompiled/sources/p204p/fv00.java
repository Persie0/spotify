package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fv00 implements jv00 {

    /* JADX INFO: renamed from: a */
    public final String f73612a;

    /* JADX INFO: renamed from: b */
    public final int f73613b;

    /* JADX INFO: renamed from: c */
    public final String f73614c;

    /* JADX INFO: renamed from: d */
    public final boolean f73615d;

    public fv00(String str, int i, String str2, boolean z) {
        this.f73612a = str;
        this.f73613b = i;
        this.f73614c = str2;
        this.f73615d = z;
    }

    @Override // p204p.jv00
    /* JADX INFO: renamed from: a */
    public final boolean mo40080a() {
        return this.f73615d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv00)) {
            return false;
        }
        fv00 fv00Var = (fv00) obj;
        return wj50.m88271j(this.f73612a, fv00Var.f73612a) && this.f73613b == fv00Var.f73613b && wj50.m88271j(this.f73614c, fv00Var.f73614c) && this.f73615d == fv00Var.f73615d;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f73613b, this.f73612a.hashCode() * 31, 31);
        String str = this.f73614c;
        return Boolean.hashCode(this.f73615d) + ((iM40938f + (str == null ? 0 : str.hashCode())) * 31);
    }
}
