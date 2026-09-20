package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class m6e1 {

    /* JADX INFO: renamed from: a */
    public final String f140488a;

    /* JADX INFO: renamed from: b */
    public final int f140489b;

    /* JADX INFO: renamed from: c */
    public final int f140490c;

    /* JADX INFO: renamed from: d */
    public final Long f140491d;

    /* JADX INFO: renamed from: e */
    public final x3p0 f140492e;

    /* JADX INFO: renamed from: f */
    public final u90 f140493f;

    /* JADX INFO: renamed from: g */
    public final x67 f140494g;

    /* JADX INFO: renamed from: h */
    public final String f140495h;

    /* JADX INFO: renamed from: i */
    public final int f140496i;

    /* JADX INFO: renamed from: j */
    public final String f140497j;

    /* JADX INFO: renamed from: k */
    public final boolean f140498k;

    /* JADX INFO: renamed from: l */
    public final String f140499l;

    /* JADX INFO: renamed from: m */
    public final boolean f140500m;

    /* JADX INFO: renamed from: n */
    public final List f140501n;

    /* JADX INFO: renamed from: o */
    public final int f140502o;

    /* JADX INFO: renamed from: p */
    public final List f140503p;

    /* JADX INFO: renamed from: q */
    public final Integer f140504q;

    /* JADX INFO: renamed from: r */
    public final boolean f140505r;

    /* JADX INFO: renamed from: s */
    public final int f140506s;

    /* JADX INFO: renamed from: t */
    public final n3e1 f140507t;

    /* JADX INFO: renamed from: u */
    public final String f140508u;

    public m6e1(String str, int i, int i2, Long l, x3p0 x3p0Var, u90 u90Var, x67 x67Var, String str2, int i3, String str3, boolean z, String str4, boolean z2, List list, int i4, List list2, Integer num, boolean z3, int i5, n3e1 n3e1Var, String str5) {
        this.f140488a = str;
        this.f140489b = i;
        this.f140490c = i2;
        this.f140491d = l;
        this.f140492e = x3p0Var;
        this.f140493f = u90Var;
        this.f140494g = x67Var;
        this.f140495h = str2;
        this.f140496i = i3;
        this.f140497j = str3;
        this.f140498k = z;
        this.f140499l = str4;
        this.f140500m = z2;
        this.f140501n = list;
        this.f140502o = i4;
        this.f140503p = list2;
        this.f140504q = num;
        this.f140505r = z3;
        this.f140506s = i5;
        this.f140507t = n3e1Var;
        this.f140508u = str5;
    }

    /* JADX INFO: renamed from: a */
    public static m6e1 m61007a(m6e1 m6e1Var, int i, int i2, Long l, x3p0 x3p0Var, u90 u90Var, x67 x67Var, String str, int i3, String str2, boolean z, String str3, boolean z2, List list, int i4, List list2, Integer num, boolean z3, int i5, int i6) {
        String str4 = m6e1Var.f140488a;
        int i7 = (i6 & 2) != 0 ? m6e1Var.f140489b : i;
        int i8 = (i6 & 4) != 0 ? m6e1Var.f140490c : i2;
        Long l2 = (i6 & 8) != 0 ? m6e1Var.f140491d : l;
        x3p0 x3p0Var2 = (i6 & 16) != 0 ? m6e1Var.f140492e : x3p0Var;
        u90 u90Var2 = (i6 & 32) != 0 ? m6e1Var.f140493f : u90Var;
        x67 x67Var2 = (i6 & 64) != 0 ? m6e1Var.f140494g : x67Var;
        String str5 = (i6 & 128) != 0 ? m6e1Var.f140495h : str;
        int i9 = (i6 & 256) != 0 ? m6e1Var.f140496i : i3;
        String str6 = (i6 & 512) != 0 ? m6e1Var.f140497j : str2;
        boolean z4 = (i6 & 1024) != 0 ? m6e1Var.f140498k : z;
        String str7 = (i6 & 2048) != 0 ? m6e1Var.f140499l : str3;
        boolean z5 = (i6 & 4096) != 0 ? m6e1Var.f140500m : z2;
        List list3 = (i6 & 8192) != 0 ? m6e1Var.f140501n : list;
        int i10 = (i6 & 16384) != 0 ? m6e1Var.f140502o : i4;
        List list4 = (i6 & 32768) != 0 ? m6e1Var.f140503p : list2;
        Integer num2 = (i6 & 65536) != 0 ? m6e1Var.f140504q : num;
        boolean z6 = (i6 & 131072) != 0 ? m6e1Var.f140505r : z3;
        m6e1Var.getClass();
        m6e1Var.getClass();
        int i11 = (i6 & 1048576) != 0 ? m6e1Var.f140506s : i5;
        n3e1 n3e1Var = m6e1Var.f140507t;
        String str8 = m6e1Var.f140508u;
        m6e1Var.getClass();
        return new m6e1(str4, i7, i8, l2, x3p0Var2, u90Var2, x67Var2, str5, i9, str6, z4, str7, z5, list3, i10, list4, num2, z6, i11, n3e1Var, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6e1)) {
            return false;
        }
        m6e1 m6e1Var = (m6e1) obj;
        return wj50.m88271j(this.f140488a, m6e1Var.f140488a) && this.f140489b == m6e1Var.f140489b && this.f140490c == m6e1Var.f140490c && wj50.m88271j(this.f140491d, m6e1Var.f140491d) && wj50.m88271j(this.f140492e, m6e1Var.f140492e) && wj50.m88271j(this.f140493f, m6e1Var.f140493f) && wj50.m88271j(this.f140494g, m6e1Var.f140494g) && wj50.m88271j(this.f140495h, m6e1Var.f140495h) && this.f140496i == m6e1Var.f140496i && wj50.m88271j(this.f140497j, m6e1Var.f140497j) && this.f140498k == m6e1Var.f140498k && wj50.m88271j(this.f140499l, m6e1Var.f140499l) && this.f140500m == m6e1Var.f140500m && wj50.m88271j(this.f140501n, m6e1Var.f140501n) && this.f140502o == m6e1Var.f140502o && wj50.m88271j(this.f140503p, m6e1Var.f140503p) && wj50.m88271j(this.f140504q, m6e1Var.f140504q) && this.f140505r == m6e1Var.f140505r && this.f140506s == m6e1Var.f140506s && wj50.m88271j(this.f140507t, m6e1Var.f140507t) && wj50.m88271j(this.f140508u, m6e1Var.f140508u);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f140490c, f710.m40938f(this.f140489b, this.f140488a.hashCode() * 31, 31), 31);
        Long l = this.f140491d;
        int iHashCode = (this.f140492e.hashCode() + ((iM62800g + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        u90 u90Var = this.f140493f;
        int iHashCode2 = (iHashCode + (u90Var == null ? 0 : u90Var.hashCode())) * 31;
        x67 x67Var = this.f140494g;
        int iHashCode3 = (iHashCode2 + (x67Var == null ? 0 : x67Var.hashCode())) * 31;
        String str = this.f140495h;
        int iM40938f = f710.m40938f(this.f140496i, (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f140497j;
        int iM77245d = s571.m77245d((iM40938f + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f140498k);
        String str3 = this.f140499l;
        int iM77244c = s571.m77244c(mt60.m62800g(this.f140502o, s571.m77244c(s571.m77245d((iM77245d + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f140500m), 31, this.f140501n), 31), 31, this.f140503p);
        Integer num = this.f140504q;
        return this.f140508u.hashCode() + ((this.f140507t.hashCode() + mt60.m62800g(this.f140506s, mt60.m62800g(0, s571.m77245d((iM77244c + (num == null ? 0 : num.hashCode())) * 31, 31, this.f140505r), 961), 31)) * 31);
    }

    public /* synthetic */ m6e1(String str, n3e1 n3e1Var, String str2) {
        x3p0 x3p0Var = new x3p0(3, 0, 0, 0L, null);
        lau lauVar = lau.f131415a;
        this(str, 1, 0, null, x3p0Var, null, null, null, 1, null, false, null, true, lauVar, 0, lauVar, null, true, 0, n3e1Var, str2);
    }
}
