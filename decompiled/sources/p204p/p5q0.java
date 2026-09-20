package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p5q0 {

    /* JADX INFO: renamed from: a */
    public final ew50 f174203a;

    /* JADX INFO: renamed from: b */
    public final boolean f174204b;

    /* JADX INFO: renamed from: c */
    public final q2q0 f174205c;

    /* JADX INFO: renamed from: d */
    public final boolean f174206d;

    /* JADX INFO: renamed from: e */
    public final boolean f174207e;

    public p5q0(ew50 ew50Var, boolean z, q2q0 q2q0Var, boolean z2, boolean z3) {
        this.f174203a = ew50Var;
        this.f174204b = z;
        this.f174205c = q2q0Var;
        this.f174206d = z2;
        this.f174207e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5q0)) {
            return false;
        }
        p5q0 p5q0Var = (p5q0) obj;
        return wj50.m88271j(this.f174203a, p5q0Var.f174203a) && this.f174204b == p5q0Var.f174204b && wj50.m88271j(this.f174205c, p5q0Var.f174205c) && this.f174206d == p5q0Var.f174206d && this.f174207e == p5q0Var.f174207e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f174207e) + s571.m77245d((this.f174205c.hashCode() + s571.m77245d(this.f174203a.hashCode() * 31, 31, this.f174204b)) * 31, 31, this.f174206d);
    }
}
