package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lob0 {

    /* JADX INFO: renamed from: a */
    public final kob0 f135371a;

    /* JADX INFO: renamed from: b */
    public final int f135372b;

    /* JADX INFO: renamed from: c */
    public final sbb0 f135373c;

    /* JADX INFO: renamed from: d */
    public final int f135374d;

    /* JADX INFO: renamed from: e */
    public final boolean f135375e;

    /* JADX INFO: renamed from: f */
    public final boolean f135376f;

    public lob0(kob0 kob0Var, int i, sbb0 sbb0Var, int i2, boolean z, boolean z2) {
        this.f135371a = kob0Var;
        this.f135372b = i;
        this.f135373c = sbb0Var;
        this.f135374d = i2;
        this.f135375e = z;
        this.f135376f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lob0)) {
            return false;
        }
        lob0 lob0Var = (lob0) obj;
        return this.f135371a.equals(lob0Var.f135371a) && this.f135372b == lob0Var.f135372b && wj50.m88271j(this.f135373c, lob0Var.f135373c) && this.f135374d == lob0Var.f135374d && this.f135375e == lob0Var.f135375e && this.f135376f == lob0Var.f135376f && Float.compare(16.0f, 16.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(16.0f) + s571.m77245d(s571.m77245d(f710.m40938f(this.f135374d, (this.f135373c.hashCode() + f710.m40938f(this.f135372b, this.f135371a.hashCode() * 31, 31)) * 31, 31), 31, this.f135375e), 31, this.f135376f);
    }
}
