package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lf61 {

    /* JADX INFO: renamed from: a */
    public final uv11 f132834a;

    /* JADX INFO: renamed from: b */
    public final uv11 f132835b;

    /* JADX INFO: renamed from: c */
    public final int f132836c;

    /* JADX INFO: renamed from: d */
    public final d850 f132837d;

    public lf61(uv11 uv11Var, uv11 uv11Var2, int i, d850 d850Var) {
        this.f132834a = uv11Var;
        this.f132835b = uv11Var2;
        this.f132836c = i;
        this.f132837d = d850Var;
    }

    /* JADX INFO: renamed from: a */
    public final uv11 m58844a() {
        return this.f132835b;
    }

    /* JADX INFO: renamed from: b */
    public final d850 m58845b() {
        return this.f132837d;
    }

    /* JADX INFO: renamed from: c */
    public final int m58846c() {
        return this.f132836c;
    }

    /* JADX INFO: renamed from: d */
    public final uv11 m58847d() {
        return this.f132834a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf61)) {
            return false;
        }
        lf61 lf61Var = (lf61) obj;
        return this.f132834a == lf61Var.f132834a && this.f132835b == lf61Var.f132835b && this.f132836c == lf61Var.f132836c && wj50.m88271j(this.f132837d, lf61Var.f132837d);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f132836c, (this.f132835b.hashCode() + (this.f132834a.hashCode() * 31)) * 31, 31);
        d850 d850Var = this.f132837d;
        return iM40938f + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
