package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ncr0 implements rcr0 {

    /* JADX INFO: renamed from: a */
    public final String f152574a;

    /* JADX INFO: renamed from: b */
    public final long f152575b;

    /* JADX INFO: renamed from: c */
    public final long f152576c;

    public ncr0(long j, String str, long j2) {
        this.f152574a = str;
        this.f152575b = j;
        this.f152576c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncr0)) {
            return false;
        }
        ncr0 ncr0Var = (ncr0) obj;
        return wj50.m88271j(this.f152574a, ncr0Var.f152574a) && this.f152575b == ncr0Var.f152575b && this.f152576c == ncr0Var.f152576c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f152576c) + dq60.m36605e(this.f152574a.hashCode() * 31, this.f152575b, 31);
    }
}
