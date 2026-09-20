package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v6f0 {

    /* JADX INFO: renamed from: a */
    public final long f237834a;

    /* JADX INFO: renamed from: b */
    public final int f237835b;

    /* JADX INFO: renamed from: c */
    public final boolean f237836c;

    /* JADX INFO: renamed from: d */
    public final String f237837d;

    /* JADX INFO: renamed from: e */
    public final lnn0 f237838e;

    /* JADX INFO: renamed from: f */
    public final dpx f237839f;

    public v6f0(long j, int i, boolean z, String str, lnn0 lnn0Var, dpx dpxVar) {
        this.f237834a = j;
        this.f237835b = i;
        this.f237836c = z;
        this.f237837d = str;
        this.f237838e = lnn0Var;
        this.f237839f = dpxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6f0)) {
            return false;
        }
        v6f0 v6f0Var = (v6f0) obj;
        return this.f237834a == v6f0Var.f237834a && this.f237835b == v6f0Var.f237835b && this.f237836c == v6f0Var.f237836c && wj50.m88271j(this.f237837d, v6f0Var.f237837d) && this.f237838e == v6f0Var.f237838e && wj50.m88271j(this.f237839f, v6f0Var.f237839f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(mt60.m62800g(this.f237835b, Long.hashCode(this.f237834a) * 31, 31), 31, this.f237836c);
        String str = this.f237837d;
        return this.f237839f.hashCode() + ((this.f237838e.hashCode() + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
