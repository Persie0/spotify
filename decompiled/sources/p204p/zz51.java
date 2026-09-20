package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zz51 {

    /* JADX INFO: renamed from: a */
    public long f287889a;

    /* JADX INFO: renamed from: b */
    public long f287890b;

    /* JADX INFO: renamed from: c */
    public int f287891c;

    /* JADX INFO: renamed from: d */
    public int f287892d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz51)) {
            return false;
        }
        zz51 zz51Var = (zz51) obj;
        return this.f287889a == zz51Var.f287889a && this.f287890b == zz51Var.f287890b && this.f287891c == zz51Var.f287891c && this.f287892d == zz51Var.f287892d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f287892d) + mt60.m62800g(this.f287891c, dq60.m36605e(Long.hashCode(this.f287889a) * 31, this.f287890b, 31), 31);
    }
}
