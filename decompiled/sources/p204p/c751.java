package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c751 {

    /* JADX INFO: renamed from: a */
    public final long f34757a;

    /* JADX INFO: renamed from: b */
    public final long f34758b;

    /* JADX INFO: renamed from: c */
    public final long f34759c;

    /* JADX INFO: renamed from: d */
    public final long f34760d;

    public c751(long j, long j2, long j3, long j4) {
        this.f34757a = j;
        this.f34758b = j2;
        this.f34759c = j3;
        this.f34760d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c751)) {
            return false;
        }
        c751 c751Var = (c751) obj;
        return this.f34757a == c751Var.f34757a && this.f34758b == c751Var.f34758b && this.f34759c == c751Var.f34759c && this.f34760d == c751Var.f34760d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34760d) + dq60.m36605e(dq60.m36605e(Long.hashCode(this.f34757a) * 31, this.f34758b, 31), this.f34759c, 31);
    }
}
