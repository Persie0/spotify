package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xd61 {

    /* JADX INFO: renamed from: a */
    public final String f260392a;

    /* JADX INFO: renamed from: b */
    public final long f260393b;

    /* JADX INFO: renamed from: c */
    public final long f260394c;

    /* JADX INFO: renamed from: d */
    public final boolean f260395d;

    /* JADX INFO: renamed from: e */
    public final Integer f260396e;

    /* JADX INFO: renamed from: f */
    public final boolean f260397f;

    public xd61(String str, long j, long j2, boolean z, Integer num, boolean z2) {
        this.f260392a = str;
        this.f260393b = j;
        this.f260394c = j2;
        this.f260395d = z;
        this.f260396e = num;
        this.f260397f = z2;
    }

    /* JADX INFO: renamed from: a */
    public static xd61 m90409a(xd61 xd61Var, boolean z, boolean z2, int i) {
        String str = xd61Var.f260392a;
        long j = xd61Var.f260393b;
        long j2 = xd61Var.f260394c;
        if ((i & 8) != 0) {
            z = xd61Var.f260395d;
        }
        boolean z3 = z;
        Integer num = xd61Var.f260396e;
        if ((i & 32) != 0) {
            z2 = xd61Var.f260397f;
        }
        xd61Var.getClass();
        return new xd61(str, j, j2, z3, num, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd61)) {
            return false;
        }
        xd61 xd61Var = (xd61) obj;
        return wj50.m88271j(this.f260392a, xd61Var.f260392a) && this.f260393b == xd61Var.f260393b && this.f260394c == xd61Var.f260394c && this.f260395d == xd61Var.f260395d && wj50.m88271j(this.f260396e, xd61Var.f260396e) && this.f260397f == xd61Var.f260397f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(dq60.m36605e(dq60.m36605e(this.f260392a.hashCode() * 31, this.f260393b, 31), this.f260394c, 31), 31, this.f260395d);
        Integer num = this.f260396e;
        return Boolean.hashCode(this.f260397f) + ((iM77245d + (num == null ? 0 : num.hashCode())) * 31);
    }
}
