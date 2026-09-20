package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jcz0 {

    /* JADX INFO: renamed from: a */
    public final String f111206a;

    /* JADX INFO: renamed from: b */
    public final boolean f111207b;

    /* JADX INFO: renamed from: c */
    public final x431 f111208c;

    /* JADX INFO: renamed from: d */
    public final boolean f111209d;

    /* JADX INFO: renamed from: e */
    public final long f111210e;

    public jcz0(String str, boolean z, x431 x431Var, boolean z2, long j) {
        this.f111206a = str;
        this.f111207b = z;
        this.f111208c = x431Var;
        this.f111209d = z2;
        this.f111210e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcz0)) {
            return false;
        }
        jcz0 jcz0Var = (jcz0) obj;
        return wj50.m88271j(this.f111206a, jcz0Var.f111206a) && this.f111207b == jcz0Var.f111207b && wj50.m88271j(this.f111208c, jcz0Var.f111208c) && this.f111209d == jcz0Var.f111209d && this.f111210e == jcz0Var.f111210e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f111210e) + s571.m77245d((this.f111208c.hashCode() + s571.m77245d(this.f111206a.hashCode() * 31, 31, this.f111207b)) * 31, 31, this.f111209d);
    }
}
