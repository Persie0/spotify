package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class you0 {

    /* JADX INFO: renamed from: a */
    public final String f274736a;

    /* JADX INFO: renamed from: b */
    public final String f274737b;

    /* JADX INFO: renamed from: c */
    public final String f274738c;

    /* JADX INFO: renamed from: d */
    public final String f274739d;

    /* JADX INFO: renamed from: e */
    public final String f274740e;

    /* JADX INFO: renamed from: f */
    public final int f274741f;

    /* JADX INFO: renamed from: g */
    public final int f274742g;

    /* JADX INFO: renamed from: h */
    public final int f274743h;

    /* JADX INFO: renamed from: i */
    public final List f274744i;

    /* JADX INFO: renamed from: j */
    public final boolean f274745j;

    /* JADX INFO: renamed from: k */
    public final int f274746k;

    /* JADX INFO: renamed from: l */
    public final boolean f274747l;

    /* JADX INFO: renamed from: m */
    public final boolean f274748m;

    public you0(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, List list, boolean z, int i4, boolean z2, boolean z3) {
        this.f274736a = str;
        this.f274737b = str2;
        this.f274738c = str3;
        this.f274739d = str4;
        this.f274740e = str5;
        this.f274741f = i;
        this.f274742g = i2;
        this.f274743h = i3;
        this.f274744i = list;
        this.f274745j = z;
        this.f274746k = i4;
        this.f274747l = z2;
        this.f274748m = z3;
    }

    /* JADX INFO: renamed from: a */
    public static you0 m94291a(you0 you0Var, String str, String str2, int i, int i2, int i3, List list, boolean z, int i4, boolean z2, boolean z3, int i5) {
        String str3 = you0Var.f274736a;
        String str4 = (i5 & 2) != 0 ? you0Var.f274737b : str;
        String str5 = you0Var.f274738c;
        String str6 = you0Var.f274739d;
        String str7 = (i5 & 16) != 0 ? you0Var.f274740e : str2;
        int i6 = (i5 & 32) != 0 ? you0Var.f274741f : i;
        int i7 = (i5 & 64) != 0 ? you0Var.f274742g : i2;
        int i8 = (i5 & 128) != 0 ? you0Var.f274743h : i3;
        List list2 = (i5 & 256) != 0 ? you0Var.f274744i : list;
        boolean z4 = (i5 & 512) != 0 ? you0Var.f274745j : z;
        int i9 = (i5 & 1024) != 0 ? you0Var.f274746k : i4;
        boolean z5 = (i5 & 2048) != 0 ? you0Var.f274747l : z2;
        boolean z6 = (i5 & 4096) != 0 ? you0Var.f274748m : z3;
        you0Var.getClass();
        return new you0(str3, str4, str5, str6, str7, i6, i7, i8, list2, z4, i9, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof you0)) {
            return false;
        }
        you0 you0Var = (you0) obj;
        return wj50.m88271j(this.f274736a, you0Var.f274736a) && wj50.m88271j(this.f274737b, you0Var.f274737b) && wj50.m88271j(this.f274738c, you0Var.f274738c) && wj50.m88271j(this.f274739d, you0Var.f274739d) && wj50.m88271j(this.f274740e, you0Var.f274740e) && this.f274741f == you0Var.f274741f && this.f274742g == you0Var.f274742g && this.f274743h == you0Var.f274743h && wj50.m88271j(this.f274744i, you0Var.f274744i) && this.f274745j == you0Var.f274745j && this.f274746k == you0Var.f274746k && this.f274747l == you0Var.f274747l && this.f274748m == you0Var.f274748m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f274748m) + s571.m77245d(f710.m40938f(this.f274746k, s571.m77245d(s571.m77244c(mt60.m62800g(this.f274743h, mt60.m62800g(this.f274742g, mt60.m62800g(this.f274741f, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f274736a.hashCode() * 31, 31, this.f274737b), 31, this.f274738c), 31, this.f274739d), 31, this.f274740e), 31), 31), 31), 31, this.f274744i), 31, this.f274745j), 31), 31, this.f274747l);
    }
}
