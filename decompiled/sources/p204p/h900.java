package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h900 {

    /* JADX INFO: renamed from: a */
    public final long f88845a;

    /* JADX INFO: renamed from: b */
    public final long f88846b;

    /* JADX INFO: renamed from: c */
    public final long f88847c;

    public h900(long j, long j2, long j3) {
        this.f88845a = j;
        this.f88846b = j2;
        this.f88847c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h900)) {
            return false;
        }
        h900 h900Var = (h900) obj;
        return this.f88845a == h900Var.f88845a && this.f88846b == h900Var.f88846b && this.f88847c == h900Var.f88847c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88847c) + dq60.m36605e(Long.hashCode(this.f88845a) * 31, this.f88846b, 31);
    }
}
