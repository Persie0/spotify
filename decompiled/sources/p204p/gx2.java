package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gx2 {

    /* JADX INFO: renamed from: a */
    public final String f85152a;

    /* JADX INFO: renamed from: b */
    public final String f85153b;

    /* JADX INFO: renamed from: c */
    public final String f85154c;

    /* JADX INFO: renamed from: d */
    public final String f85155d;

    /* JADX INFO: renamed from: e */
    public final boolean f85156e;

    /* JADX INFO: renamed from: f */
    public final boolean f85157f;

    /* JADX INFO: renamed from: g */
    public final int f85158g;

    public gx2(int i, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f85152a = str;
        this.f85153b = str2;
        this.f85154c = str3;
        this.f85155d = str4;
        this.f85156e = z;
        this.f85157f = z2;
        this.f85158g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx2)) {
            return false;
        }
        gx2 gx2Var = (gx2) obj;
        return wj50.m88271j(this.f85152a, gx2Var.f85152a) && wj50.m88271j(this.f85153b, gx2Var.f85153b) && this.f85154c.equals(gx2Var.f85154c) && wj50.m88271j(this.f85155d, gx2Var.f85155d) && this.f85156e == gx2Var.f85156e && this.f85157f == gx2Var.f85157f && this.f85158g == gx2Var.f85158g;
    }

    public final int hashCode() {
        int iHashCode = this.f85152a.hashCode() * 31;
        String str = this.f85153b;
        return edb.m38547C(this.f85158g) + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f85154c), 31, this.f85155d), 31, this.f85156e), 31, this.f85157f);
    }
}
