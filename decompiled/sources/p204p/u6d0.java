package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class u6d0 {

    /* JADX INFO: renamed from: a */
    public final String f227301a;

    /* JADX INFO: renamed from: b */
    public final int f227302b;

    /* JADX INFO: renamed from: c */
    public final long f227303c;

    /* JADX INFO: renamed from: d */
    public final long f227304d;

    public u6d0(int i, long j, long j2, String str) {
        this.f227301a = str;
        this.f227302b = i;
        this.f227303c = j;
        this.f227304d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6d0)) {
            return false;
        }
        u6d0 u6d0Var = (u6d0) obj;
        return wj50.m88271j(this.f227301a, u6d0Var.f227301a) && this.f227302b == u6d0Var.f227302b && this.f227303c == u6d0Var.f227303c && this.f227304d == u6d0Var.f227304d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f227304d) + dq60.m36605e(f710.m40938f(this.f227302b, this.f227301a.hashCode() * 31, 31), this.f227303c, 31);
    }
}
