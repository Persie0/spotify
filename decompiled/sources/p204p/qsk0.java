package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class qsk0 {

    /* JADX INFO: renamed from: a */
    public final fq01 f192143a;

    /* JADX INFO: renamed from: b */
    public final boolean f192144b;

    /* JADX INFO: renamed from: c */
    public final boolean f192145c;

    /* JADX INFO: renamed from: d */
    public final qu01 f192146d;

    /* JADX INFO: renamed from: e */
    public final boolean f192147e;

    static {
        wg61 wg61Var = fq01.f72032c;
    }

    public qsk0(fq01 fq01Var, boolean z, boolean z2, qu01 qu01Var, boolean z3) {
        this.f192143a = fq01Var;
        this.f192144b = z;
        this.f192145c = z2;
        this.f192146d = qu01Var;
        this.f192147e = z3;
    }

    /* JADX INFO: renamed from: a */
    public static qsk0 m73753a(qsk0 qsk0Var, boolean z, boolean z2, qu01 qu01Var, boolean z3, int i) {
        boolean z4 = z;
        fq01 fq01Var = qsk0Var.f192143a;
        if ((i & 2) != 0) {
            z4 = qsk0Var.f192144b;
        }
        if ((i & 4) != 0) {
            z2 = qsk0Var.f192145c;
        }
        if ((i & 8) != 0) {
            qu01Var = qsk0Var.f192146d;
        }
        if ((i & 16) != 0) {
            z3 = qsk0Var.f192147e;
        }
        boolean z5 = z3;
        qsk0Var.getClass();
        qu01 qu01Var2 = qu01Var;
        return new qsk0(fq01Var, z4, z2, qu01Var2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsk0)) {
            return false;
        }
        qsk0 qsk0Var = (qsk0) obj;
        return wj50.m88271j(this.f192143a, qsk0Var.f192143a) && this.f192144b == qsk0Var.f192144b && this.f192145c == qsk0Var.f192145c && wj50.m88271j(this.f192146d, qsk0Var.f192146d) && this.f192147e == qsk0Var.f192147e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f192147e) + ((this.f192146d.hashCode() + s571.m77245d(s571.m77245d(this.f192143a.hashCode() * 31, 31, this.f192144b), 31, this.f192145c)) * 31);
    }
}
