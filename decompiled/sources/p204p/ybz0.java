package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ybz0 {

    /* JADX INFO: renamed from: a */
    public final long f271321a;

    /* JADX INFO: renamed from: b */
    public final long f271322b;

    /* JADX INFO: renamed from: c */
    public final int f271323c;

    /* JADX INFO: renamed from: d */
    public final int f271324d;

    public ybz0(int i, int i2, long j, long j2) {
        this.f271321a = j;
        this.f271322b = j2;
        this.f271323c = i;
        this.f271324d = i2;
    }

    /* JADX INFO: renamed from: a */
    public static ybz0 m93324a(ybz0 ybz0Var, int i) {
        return new ybz0(i, ybz0Var.f271324d, ybz0Var.f271321a, ybz0Var.f271322b);
    }

    /* JADX INFO: renamed from: b */
    public final long m93325b() {
        return this.f271321a;
    }

    /* JADX INFO: renamed from: c */
    public final int m93326c() {
        return this.f271324d;
    }

    /* JADX INFO: renamed from: d */
    public final long m93327d() {
        return this.f271322b;
    }

    /* JADX INFO: renamed from: e */
    public final int m93328e() {
        return this.f271323c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybz0)) {
            return false;
        }
        ybz0 ybz0Var = (ybz0) obj;
        return this.f271321a == ybz0Var.f271321a && this.f271322b == ybz0Var.f271322b && this.f271323c == ybz0Var.f271323c && this.f271324d == ybz0Var.f271324d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f271324d) + mt60.m62800g(this.f271323c, dq60.m36605e(Long.hashCode(this.f271321a) * 31, this.f271322b, 31), 31);
    }
}
