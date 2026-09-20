package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xuo0 {

    /* JADX INFO: renamed from: a */
    public final String f266141a;

    /* JADX INFO: renamed from: b */
    public final String f266142b;

    /* JADX INFO: renamed from: c */
    public final String f266143c;

    /* JADX INFO: renamed from: d */
    public final String f266144d;

    /* JADX INFO: renamed from: e */
    public final String f266145e;

    /* JADX INFO: renamed from: f */
    public final boolean f266146f;

    /* JADX INFO: renamed from: g */
    public final int f266147g;

    /* JADX INFO: renamed from: h */
    public final boolean f266148h;

    /* JADX INFO: renamed from: i */
    public final String f266149i;

    /* JADX INFO: renamed from: j */
    public final boolean f266150j;

    /* JADX INFO: renamed from: k */
    public final Long f266151k;

    public xuo0(String str, String str2, String str3, String str4, String str5, boolean z, int i, boolean z2, String str6, boolean z3, Long l) {
        this.f266141a = str;
        this.f266142b = str2;
        this.f266143c = str3;
        this.f266144d = str4;
        this.f266145e = str5;
        this.f266146f = z;
        this.f266147g = i;
        this.f266148h = z2;
        this.f266149i = str6;
        this.f266150j = z3;
        this.f266151k = l;
    }

    /* JADX INFO: renamed from: a */
    public final String m92204a() {
        return this.f266144d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xuo0)) {
            return false;
        }
        xuo0 xuo0Var = (xuo0) obj;
        return wj50.m88271j(this.f266141a, xuo0Var.f266141a) && wj50.m88271j(this.f266142b, xuo0Var.f266142b) && wj50.m88271j(this.f266143c, xuo0Var.f266143c) && wj50.m88271j(this.f266144d, xuo0Var.f266144d) && wj50.m88271j(this.f266145e, xuo0Var.f266145e) && this.f266146f == xuo0Var.f266146f && this.f266147g == xuo0Var.f266147g && this.f266148h == xuo0Var.f266148h && wj50.m88271j(this.f266149i, xuo0Var.f266149i) && this.f266150j == xuo0Var.f266150j && wj50.m88271j(this.f266151k, xuo0Var.f266151k);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(f710.m40938f(this.f266147g, s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f266141a.hashCode() * 31, 31, this.f266142b), 31, this.f266143c), 31, this.f266144d), 31, this.f266145e), 31, this.f266146f), 31), 31, this.f266148h);
        String str = this.f266149i;
        int iM77245d2 = s571.m77245d((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f266150j);
        Long l = this.f266151k;
        return iM77245d2 + (l != null ? l.hashCode() : 0);
    }
}
