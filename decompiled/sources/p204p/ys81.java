package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ys81 {

    /* JADX INFO: renamed from: a */
    public final String f275722a;

    /* JADX INFO: renamed from: b */
    public final String f275723b;

    /* JADX INFO: renamed from: c */
    public final String f275724c;

    /* JADX INFO: renamed from: d */
    public final String f275725d;

    /* JADX INFO: renamed from: e */
    public final long f275726e;

    /* JADX INFO: renamed from: f */
    public final boolean f275727f;

    /* JADX INFO: renamed from: g */
    public final String f275728g;

    public ys81(String str, String str2, String str3, String str4, long j, boolean z, String str5) {
        this.f275722a = str;
        this.f275723b = str2;
        this.f275724c = str3;
        this.f275725d = str4;
        this.f275726e = j;
        this.f275727f = z;
        this.f275728g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys81)) {
            return false;
        }
        ys81 ys81Var = (ys81) obj;
        return wj50.m88271j(this.f275722a, ys81Var.f275722a) && wj50.m88271j(this.f275723b, ys81Var.f275723b) && wj50.m88271j(this.f275724c, ys81Var.f275724c) && wj50.m88271j(this.f275725d, ys81Var.f275725d) && this.f275726e == ys81Var.f275726e && this.f275727f == ys81Var.f275727f && wj50.m88271j(this.f275728g, ys81Var.f275728g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(dq60.m36605e(s571.m77243b(s571.m77243b(s571.m77243b(this.f275722a.hashCode() * 31, 31, this.f275723b), 31, this.f275724c), 31, this.f275725d), this.f275726e, 31), 31, this.f275727f);
        String str = this.f275728g;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
