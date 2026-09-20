package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xh20 {

    /* JADX INFO: renamed from: a */
    public final boolean f261419a;

    /* JADX INFO: renamed from: b */
    public final boolean f261420b;

    /* JADX INFO: renamed from: c */
    public final boolean f261421c;

    /* JADX INFO: renamed from: d */
    public final boolean f261422d;

    /* JADX INFO: renamed from: e */
    public final String f261423e;

    /* JADX INFO: renamed from: f */
    public final boolean f261424f;

    /* JADX INFO: renamed from: g */
    public final fiz f261425g;

    public xh20(boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, fiz fizVar) {
        this.f261419a = z;
        this.f261420b = z2;
        this.f261421c = z3;
        this.f261422d = z4;
        this.f261423e = str;
        this.f261424f = z5;
        this.f261425g = fizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh20)) {
            return false;
        }
        xh20 xh20Var = (xh20) obj;
        return this.f261419a == xh20Var.f261419a && this.f261420b == xh20Var.f261420b && this.f261421c == xh20Var.f261421c && this.f261422d == xh20Var.f261422d && wj50.m88271j(this.f261423e, xh20Var.f261423e) && this.f261424f == xh20Var.f261424f && wj50.m88271j(this.f261425g, xh20Var.f261425g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f261419a) * 31, 31, this.f261420b), 31, false), 31, this.f261421c), 31, this.f261422d);
        String str = this.f261423e;
        int iM77245d2 = s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f261424f);
        fiz fizVar = this.f261425g;
        return iM77245d2 + (fizVar != null ? fizVar.hashCode() : 0);
    }
}
