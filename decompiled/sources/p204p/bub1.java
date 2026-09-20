package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bub1 {

    /* JADX INFO: renamed from: a */
    public final String f31076a;

    /* JADX INFO: renamed from: b */
    public final int f31077b;

    /* JADX INFO: renamed from: c */
    public final long f31078c;

    /* JADX INFO: renamed from: d */
    public final long f31079d;

    public bub1(int i, long j, long j2, String str) {
        this.f31076a = str;
        this.f31077b = i;
        this.f31078c = j;
        this.f31079d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bub1)) {
            return false;
        }
        bub1 bub1Var = (bub1) obj;
        return wj50.m88271j(this.f31076a, bub1Var.f31076a) && this.f31077b == bub1Var.f31077b && this.f31078c == bub1Var.f31078c && this.f31079d == bub1Var.f31079d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31079d) + dq60.m36605e(f710.m40938f(this.f31077b, this.f31076a.hashCode() * 31, 31), this.f31078c, 31);
    }
}
