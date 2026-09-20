package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hy51 {

    /* JADX INFO: renamed from: a */
    public final String f96468a;

    /* JADX INFO: renamed from: b */
    public final String f96469b;

    /* JADX INFO: renamed from: c */
    public final String f96470c;

    /* JADX INFO: renamed from: d */
    public final long f96471d;

    /* JADX INFO: renamed from: e */
    public final long f96472e;

    public hy51(long j, long j2, String str, String str2, String str3) {
        this.f96468a = str;
        this.f96469b = str2;
        this.f96470c = str3;
        this.f96471d = j;
        this.f96472e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy51)) {
            return false;
        }
        hy51 hy51Var = (hy51) obj;
        return wj50.m88271j(this.f96468a, hy51Var.f96468a) && wj50.m88271j(this.f96469b, hy51Var.f96469b) && wj50.m88271j(this.f96470c, hy51Var.f96470c) && this.f96471d == hy51Var.f96471d && this.f96472e == hy51Var.f96472e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f96472e) + dq60.m36605e(s571.m77243b(s571.m77243b(this.f96468a.hashCode() * 31, 31, this.f96469b), 31, this.f96470c), this.f96471d, 31);
    }
}
