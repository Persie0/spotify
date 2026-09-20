package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hju0 {

    /* JADX INFO: renamed from: a */
    public final String f92269a;

    /* JADX INFO: renamed from: b */
    public final qf40 f92270b;

    /* JADX INFO: renamed from: c */
    public final int f92271c;

    /* JADX INFO: renamed from: d */
    public final String f92272d;

    /* JADX INFO: renamed from: e */
    public final String f92273e;

    /* JADX INFO: renamed from: f */
    public final boolean f92274f;

    /* JADX INFO: renamed from: g */
    public final int f92275g;

    /* JADX INFO: renamed from: h */
    public final boolean f92276h;

    public /* synthetic */ hju0(String str, qf40 qf40Var, int i, String str2, String str3, boolean z, int i2, int i3) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? opo.m67574x(lau.f131415a) : qf40Var, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? 0 : i2, true);
    }

    /* JADX INFO: renamed from: a */
    public static hju0 m47708a(hju0 hju0Var, int i, String str) {
        String str2 = hju0Var.f92269a;
        qf40 qf40Var = hju0Var.f92270b;
        String str3 = hju0Var.f92273e;
        boolean z = hju0Var.f92274f;
        int i2 = hju0Var.f92275g;
        boolean z2 = hju0Var.f92276h;
        hju0Var.getClass();
        return new hju0(str2, qf40Var, i, str, str3, z, i2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hju0)) {
            return false;
        }
        hju0 hju0Var = (hju0) obj;
        return wj50.m88271j(this.f92269a, hju0Var.f92269a) && wj50.m88271j(this.f92270b, hju0Var.f92270b) && this.f92271c == hju0Var.f92271c && wj50.m88271j(this.f92272d, hju0Var.f92272d) && wj50.m88271j(this.f92273e, hju0Var.f92273e) && this.f92274f == hju0Var.f92274f && this.f92275g == hju0Var.f92275g && this.f92276h == hju0Var.f92276h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f92276h) + mt60.m62800g(this.f92275g, s571.m77245d(s571.m77243b(s571.m77243b(mt60.m62800g(this.f92271c, fr0.m42461e(this.f92270b, this.f92269a.hashCode() * 31, 31), 31), 31, this.f92272d), 31, this.f92273e), 31, this.f92274f), 31);
    }

    public hju0(String str, qf40 qf40Var, int i, String str2, String str3, boolean z, int i2, boolean z2) {
        this.f92269a = str;
        this.f92270b = qf40Var;
        this.f92271c = i;
        this.f92272d = str2;
        this.f92273e = str3;
        this.f92274f = z;
        this.f92275g = i2;
        this.f92276h = z2;
    }
}
