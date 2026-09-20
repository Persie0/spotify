package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b2l0 {

    /* JADX INFO: renamed from: a */
    public final String f22631a;

    /* JADX INFO: renamed from: b */
    public final String f22632b;

    /* JADX INFO: renamed from: c */
    public final String f22633c;

    /* JADX INFO: renamed from: d */
    public final String f22634d;

    /* JADX INFO: renamed from: e */
    public final int f22635e;

    /* JADX INFO: renamed from: f */
    public final int f22636f;

    /* JADX INFO: renamed from: g */
    public final rcm0 f22637g;

    /* JADX INFO: renamed from: h */
    public final int f22638h;

    public b2l0(String str, String str2, String str3, String str4, int i, int i2, rcm0 rcm0Var, int i3) {
        this.f22631a = str;
        this.f22632b = str2;
        this.f22633c = str3;
        this.f22634d = str4;
        this.f22635e = i;
        this.f22636f = i2;
        this.f22637g = rcm0Var;
        this.f22638h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2l0)) {
            return false;
        }
        b2l0 b2l0Var = (b2l0) obj;
        return wj50.m88271j(this.f22631a, b2l0Var.f22631a) && wj50.m88271j(this.f22632b, b2l0Var.f22632b) && wj50.m88271j(this.f22633c, b2l0Var.f22633c) && wj50.m88271j(this.f22634d, b2l0Var.f22634d) && this.f22635e == b2l0Var.f22635e && this.f22636f == b2l0Var.f22636f && this.f22637g.equals(b2l0Var.f22637g) && this.f22638h == b2l0Var.f22638h;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f22631a.hashCode() * 31, 31, this.f22632b), 31, this.f22633c);
        String str = this.f22634d;
        return Integer.hashCode(this.f22638h) + yds.m93483m(this.f22637g, f710.m40938f(this.f22636f, f710.m40938f(this.f22635e, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
    }
}
