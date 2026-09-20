package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class nv41 {

    /* JADX INFO: renamed from: a */
    public final long f158786a;

    /* JADX INFO: renamed from: b */
    public final boolean f158787b;

    /* JADX INFO: renamed from: c */
    public final long f158788c;

    /* JADX INFO: renamed from: d */
    public final long f158789d;

    /* JADX INFO: renamed from: e */
    public final long f158790e;

    public nv41(long j, boolean z, long j2, long j3, long j4) {
        this.f158786a = j;
        this.f158787b = z;
        this.f158788c = j2;
        this.f158789d = j3;
        this.f158790e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv41)) {
            return false;
        }
        nv41 nv41Var = (nv41) obj;
        return this.f158786a == nv41Var.f158786a && this.f158787b == nv41Var.f158787b && this.f158788c == nv41Var.f158788c && this.f158789d == nv41Var.f158789d && this.f158790e == nv41Var.f158790e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f158790e) + dq60.m36605e(dq60.m36605e(s571.m77245d(Long.hashCode(this.f158786a) * 31, 31, this.f158787b), this.f158788c, 31), this.f158789d, 31);
    }
}
