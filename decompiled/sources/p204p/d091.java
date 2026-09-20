package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d091 implements e091 {

    /* JADX INFO: renamed from: a */
    public final String f43821a;

    /* JADX INFO: renamed from: b */
    public final long f43822b;

    /* JADX INFO: renamed from: c */
    public final long f43823c;

    public d091(long j, String str, long j2) {
        this.f43821a = str;
        this.f43822b = j;
        this.f43823c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d091)) {
            return false;
        }
        d091 d091Var = (d091) obj;
        return wj50.m88271j(this.f43821a, d091Var.f43821a) && this.f43822b == d091Var.f43822b && this.f43823c == d091Var.f43823c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43823c) + dq60.m36605e(this.f43821a.hashCode() * 31, this.f43822b, 31);
    }
}
