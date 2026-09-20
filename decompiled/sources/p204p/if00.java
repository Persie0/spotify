package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class if00 implements jf00 {

    /* JADX INFO: renamed from: a */
    public final String f101601a;

    /* JADX INFO: renamed from: b */
    public final long f101602b;

    /* JADX INFO: renamed from: c */
    public final long f101603c;

    public if00(long j, String str, long j2) {
        this.f101601a = str;
        this.f101602b = j;
        this.f101603c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if00)) {
            return false;
        }
        if00 if00Var = (if00) obj;
        return wj50.m88271j(this.f101601a, if00Var.f101601a) && this.f101602b == if00Var.f101602b && this.f101603c == if00Var.f101603c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f101603c) + dq60.m36605e(this.f101601a.hashCode() * 31, this.f101602b, 31);
    }
}
