package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class lh81 {

    /* JADX INFO: renamed from: a */
    public final int f133418a;

    /* JADX INFO: renamed from: b */
    public final long f133419b;

    /* JADX INFO: renamed from: c */
    public final long f133420c;

    /* JADX INFO: renamed from: d */
    public final long f133421d;

    public lh81(int i, long j, long j2, long j3) {
        this.f133418a = i;
        this.f133419b = j;
        this.f133420c = j2;
        this.f133421d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh81)) {
            return false;
        }
        lh81 lh81Var = (lh81) obj;
        return this.f133418a == lh81Var.f133418a && this.f133419b == lh81Var.f133419b && this.f133420c == lh81Var.f133420c && this.f133421d == lh81Var.f133421d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f133421d) + dq60.m36605e(dq60.m36605e(edb.m38547C(this.f133418a) * 31, this.f133419b, 31), this.f133420c, 31);
    }
}
