package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bux0 {

    /* JADX INFO: renamed from: a */
    public final int f31231a;

    /* JADX INFO: renamed from: b */
    public final long f31232b;

    /* JADX INFO: renamed from: c */
    public final int f31233c;

    public bux0(int i, long j, int i2) {
        this.f31231a = i;
        this.f31232b = j;
        this.f31233c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bux0)) {
            return false;
        }
        bux0 bux0Var = (bux0) obj;
        return this.f31231a == bux0Var.f31231a && this.f31232b == bux0Var.f31232b && this.f31233c == bux0Var.f31233c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31233c) + dq60.m36605e(Integer.hashCode(this.f31231a) * 31, this.f31232b, 31);
    }
}
