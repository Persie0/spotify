package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class x3p0 {

    /* JADX INFO: renamed from: a */
    public final int f257854a;

    /* JADX INFO: renamed from: b */
    public final int f257855b;

    /* JADX INFO: renamed from: c */
    public final int f257856c;

    /* JADX INFO: renamed from: d */
    public final long f257857d;

    /* JADX INFO: renamed from: e */
    public final String f257858e;

    public x3p0(int i, int i2, int i3, long j, String str) {
        this.f257854a = i;
        this.f257855b = i2;
        this.f257856c = i3;
        this.f257857d = j;
        this.f257858e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3p0)) {
            return false;
        }
        x3p0 x3p0Var = (x3p0) obj;
        return this.f257854a == x3p0Var.f257854a && this.f257855b == x3p0Var.f257855b && this.f257856c == x3p0Var.f257856c && this.f257857d == x3p0Var.f257857d && wj50.m88271j(this.f257858e, x3p0Var.f257858e);
    }

    public final int hashCode() {
        int iM36605e = dq60.m36605e(mt60.m62800g(this.f257856c, mt60.m62800g(this.f257855b, edb.m38547C(this.f257854a) * 31, 31), 31), this.f257857d, 31);
        String str = this.f257858e;
        return iM36605e + (str == null ? 0 : str.hashCode());
    }
}
