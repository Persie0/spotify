package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class t0k {

    /* JADX INFO: renamed from: a */
    public final q0k f215900a;

    /* JADX INFO: renamed from: b */
    public final int f215901b;

    /* JADX INFO: renamed from: c */
    public final boolean f215902c;

    /* JADX INFO: renamed from: d */
    public final String f215903d;

    public t0k(q0k q0kVar, int i, boolean z, String str) {
        this.f215900a = q0kVar;
        this.f215901b = i;
        this.f215902c = z;
        this.f215903d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0k)) {
            return false;
        }
        t0k t0kVar = (t0k) obj;
        return wj50.m88271j(this.f215900a, t0kVar.f215900a) && this.f215901b == t0kVar.f215901b && this.f215902c == t0kVar.f215902c && wj50.m88271j(this.f215903d, t0kVar.f215903d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(f710.m40938f(this.f215901b, this.f215900a.hashCode() * 31, 31), 31, this.f215902c);
        String str = this.f215903d;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
