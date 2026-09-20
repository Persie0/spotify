package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class g6p0 {

    /* JADX INFO: renamed from: a */
    public final String f77090a;

    /* JADX INFO: renamed from: b */
    public final long f77091b;

    /* JADX INFO: renamed from: c */
    public final long f77092c;

    public g6p0(long j, String str, long j2) {
        this.f77090a = str;
        this.f77091b = j;
        this.f77092c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6p0)) {
            return false;
        }
        g6p0 g6p0Var = (g6p0) obj;
        return wj50.m88271j(this.f77090a, g6p0Var.f77090a) && this.f77091b == g6p0Var.f77091b && this.f77092c == g6p0Var.f77092c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f77092c) + dq60.m36605e(this.f77090a.hashCode() * 31, this.f77091b, 31);
    }
}
