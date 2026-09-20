package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f2z0 {

    /* JADX INFO: renamed from: a */
    public final String f65309a;

    /* JADX INFO: renamed from: b */
    public final String f65310b;

    /* JADX INFO: renamed from: c */
    public final String f65311c;

    /* JADX INFO: renamed from: d */
    public final String f65312d;

    /* JADX INFO: renamed from: e */
    public final List f65313e;

    /* JADX INFO: renamed from: f */
    public final int f65314f;

    /* JADX INFO: renamed from: g */
    public final int f65315g;

    /* JADX INFO: renamed from: h */
    public final boolean f65316h;

    /* JADX INFO: renamed from: i */
    public final boolean f65317i;

    /* JADX INFO: renamed from: j */
    public final boolean f65318j;

    /* JADX INFO: renamed from: k */
    public final boolean f65319k;

    /* JADX INFO: renamed from: l */
    public final String f65320l;

    /* JADX INFO: renamed from: m */
    public final int f65321m;

    public f2z0(String str, String str2, String str3, String str4, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str5, int i3) {
        this.f65309a = str;
        this.f65310b = str2;
        this.f65311c = str3;
        this.f65312d = str4;
        this.f65313e = list;
        this.f65314f = i;
        this.f65315g = i2;
        this.f65316h = z;
        this.f65317i = z2;
        this.f65318j = z3;
        this.f65319k = z4;
        this.f65320l = str5;
        this.f65321m = i3;
    }

    /* JADX INFO: renamed from: a */
    public static f2z0 m40628a(f2z0 f2z0Var, String str, List list, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4) {
        String str2 = f2z0Var.f65309a;
        String str3 = (i4 & 2) != 0 ? f2z0Var.f65310b : str;
        String str4 = f2z0Var.f65311c;
        String str5 = f2z0Var.f65312d;
        List list2 = (i4 & 16) != 0 ? f2z0Var.f65313e : list;
        int i5 = (i4 & 32) != 0 ? f2z0Var.f65314f : i;
        int i6 = (i4 & 64) != 0 ? f2z0Var.f65315g : i2;
        boolean z5 = (i4 & 128) != 0 ? f2z0Var.f65316h : z;
        boolean z6 = (i4 & 256) != 0 ? f2z0Var.f65317i : z2;
        boolean z7 = (i4 & 512) != 0 ? f2z0Var.f65318j : z3;
        boolean z8 = (i4 & 1024) != 0 ? f2z0Var.f65319k : z4;
        String str6 = f2z0Var.f65320l;
        int i7 = (i4 & 4096) != 0 ? f2z0Var.f65321m : i3;
        f2z0Var.getClass();
        return new f2z0(str2, str3, str4, str5, list2, i5, i6, z5, z6, z7, z8, str6, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2z0)) {
            return false;
        }
        f2z0 f2z0Var = (f2z0) obj;
        return wj50.m88271j(this.f65309a, f2z0Var.f65309a) && wj50.m88271j(this.f65310b, f2z0Var.f65310b) && wj50.m88271j(this.f65311c, f2z0Var.f65311c) && wj50.m88271j(this.f65312d, f2z0Var.f65312d) && wj50.m88271j(this.f65313e, f2z0Var.f65313e) && this.f65314f == f2z0Var.f65314f && this.f65315g == f2z0Var.f65315g && this.f65316h == f2z0Var.f65316h && this.f65317i == f2z0Var.f65317i && this.f65318j == f2z0Var.f65318j && this.f65319k == f2z0Var.f65319k && wj50.m88271j(this.f65320l, f2z0Var.f65320l) && this.f65321m == f2z0Var.f65321m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65321m) + s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f65315g, mt60.m62800g(this.f65314f, s571.m77244c(s571.m77243b(s571.m77243b(s571.m77243b(this.f65309a.hashCode() * 31, 31, this.f65310b), 31, this.f65311c), 31, this.f65312d), 31, this.f65313e), 31), 31), 31, this.f65316h), 31, this.f65317i), 31, this.f65318j), 31, this.f65319k), 31, this.f65320l);
    }
}
