package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class w6s0 implements y6s0 {

    /* JADX INFO: renamed from: a */
    public final boolean f248464a;

    /* JADX INFO: renamed from: b */
    public final long f248465b;

    /* JADX INFO: renamed from: c */
    public final long f248466c;

    public w6s0(long j, long j2, boolean z) {
        this.f248464a = z;
        this.f248465b = j;
        this.f248466c = j2;
    }

    @Override // p204p.y6s0
    /* JADX INFO: renamed from: e */
    public final long mo87306e() {
        return this.f248465b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6s0)) {
            return false;
        }
        w6s0 w6s0Var = (w6s0) obj;
        return this.f248464a == w6s0Var.f248464a && this.f248465b == w6s0Var.f248465b && this.f248466c == w6s0Var.f248466c;
    }

    @Override // p204p.y6s0
    /* JADX INFO: renamed from: f */
    public final boolean mo87307f() {
        return this.f248464a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f248466c) + dq60.m36605e(Boolean.hashCode(this.f248464a) * 31, this.f248465b, 31);
    }
}
