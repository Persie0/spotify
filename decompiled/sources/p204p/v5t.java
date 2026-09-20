package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v5t {

    /* JADX INFO: renamed from: A */
    public final boolean f237616A;

    /* JADX INFO: renamed from: B */
    public final String f237617B;

    /* JADX INFO: renamed from: C */
    public final boolean f237618C;

    /* JADX INFO: renamed from: D */
    public final boolean f237619D;

    /* JADX INFO: renamed from: E */
    public final boolean f237620E;

    /* JADX INFO: renamed from: a */
    public final String f237621a;

    /* JADX INFO: renamed from: b */
    public final String f237622b;

    /* JADX INFO: renamed from: c */
    public final String f237623c;

    /* JADX INFO: renamed from: d */
    public final boolean f237624d;

    /* JADX INFO: renamed from: e */
    public final boolean f237625e;

    /* JADX INFO: renamed from: f */
    public final boolean f237626f;

    /* JADX INFO: renamed from: g */
    public final String f237627g;

    /* JADX INFO: renamed from: h */
    public final String f237628h;

    /* JADX INFO: renamed from: i */
    public final aa8 f237629i;

    /* JADX INFO: renamed from: j */
    public final Integer f237630j;

    /* JADX INFO: renamed from: k */
    public final boolean f237631k;

    /* JADX INFO: renamed from: l */
    public final int f237632l;

    /* JADX INFO: renamed from: m */
    public final boolean f237633m;

    /* JADX INFO: renamed from: n */
    public final t6y0 f237634n;

    /* JADX INFO: renamed from: o */
    public final String f237635o;

    /* JADX INFO: renamed from: p */
    public final boolean f237636p;

    /* JADX INFO: renamed from: q */
    public final String f237637q;

    /* JADX INFO: renamed from: r */
    public final boolean f237638r;

    /* JADX INFO: renamed from: s */
    public final boolean f237639s;

    /* JADX INFO: renamed from: t */
    public final boolean f237640t;

    /* JADX INFO: renamed from: u */
    public final boolean f237641u;

    /* JADX INFO: renamed from: v */
    public final boolean f237642v;

    /* JADX INFO: renamed from: w */
    public final boolean f237643w;

    /* JADX INFO: renamed from: x */
    public final c6u0 f237644x;

    /* JADX INFO: renamed from: y */
    public final boolean f237645y;

    /* JADX INFO: renamed from: z */
    public final boolean f237646z;

    public v5t(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, String str5, aa8 aa8Var, Integer num, boolean z4, int i, boolean z5, t6y0 t6y0Var, String str6, boolean z6, String str7, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, c6u0 c6u0Var, boolean z13, boolean z14, boolean z15, String str8) {
        this.f237621a = str;
        this.f237622b = str2;
        this.f237623c = str3;
        this.f237624d = z;
        this.f237625e = z2;
        this.f237626f = z3;
        this.f237627g = str4;
        this.f237628h = str5;
        this.f237629i = aa8Var;
        this.f237630j = num;
        this.f237631k = z4;
        this.f237632l = i;
        this.f237633m = z5;
        this.f237634n = t6y0Var;
        this.f237635o = str6;
        this.f237636p = z6;
        this.f237637q = str7;
        this.f237638r = z7;
        this.f237639s = z8;
        this.f237640t = z9;
        this.f237641u = z10;
        this.f237642v = z11;
        this.f237643w = z12;
        this.f237644x = c6u0Var;
        this.f237645y = z13;
        this.f237646z = z14;
        this.f237616A = z15;
        this.f237617B = str8;
        boolean z16 = true;
        boolean z17 = z || z3 || z6 || z7;
        this.f237618C = z17;
        this.f237619D = z17 && wl51.m88491o1(str3).toString().length() > 0;
        if (kgg1.m56363z(str5) && (kgg1.m56363z(str4) || !z4 || z3)) {
            z16 = false;
        }
        this.f237620E = z16;
    }

    /* JADX INFO: renamed from: a */
    public static v5t m84757a(v5t v5tVar, String str, boolean z, String str2, aa8 aa8Var, Integer num, boolean z2, t6y0 t6y0Var, String str3, String str4, int i) {
        String str5 = v5tVar.f237621a;
        String str6 = v5tVar.f237622b;
        String str7 = (i & 4) != 0 ? v5tVar.f237623c : str;
        boolean z3 = (i & 8) != 0 ? v5tVar.f237624d : true;
        v5tVar.getClass();
        boolean z4 = (i & 32) != 0 ? v5tVar.f237625e : z;
        boolean z5 = (i & 64) != 0 ? v5tVar.f237626f : true;
        String str8 = str7;
        boolean z6 = z3;
        boolean z7 = z4;
        String str9 = v5tVar.f237627g;
        String str10 = (i & 256) != 0 ? v5tVar.f237628h : str2;
        aa8 aa8Var2 = (i & 512) != 0 ? v5tVar.f237629i : aa8Var;
        Integer num2 = (i & 1024) != 0 ? v5tVar.f237630j : num;
        aa8 aa8Var3 = aa8Var2;
        boolean z8 = v5tVar.f237631k;
        boolean z9 = z5;
        String str11 = str10;
        Integer num3 = num2;
        int i2 = v5tVar.f237632l;
        boolean z10 = (i & 8192) != 0 ? v5tVar.f237633m : z2;
        t6y0 t6y0Var2 = (i & 16384) != 0 ? v5tVar.f237634n : t6y0Var;
        String str12 = (i & 32768) != 0 ? v5tVar.f237635o : str3;
        boolean z11 = (i & 65536) != 0 ? v5tVar.f237636p : true;
        String str13 = (i & 131072) != 0 ? v5tVar.f237637q : str4;
        boolean z12 = (i & 262144) != 0 ? v5tVar.f237638r : true;
        v5tVar.getClass();
        v5tVar.getClass();
        boolean z13 = v5tVar.f237639s;
        boolean z14 = v5tVar.f237640t;
        boolean z15 = v5tVar.f237641u;
        boolean z16 = v5tVar.f237642v;
        boolean z17 = v5tVar.f237643w;
        c6u0 c6u0Var = v5tVar.f237644x;
        boolean z18 = v5tVar.f237645y;
        boolean z19 = v5tVar.f237646z;
        boolean z20 = v5tVar.f237616A;
        String str14 = v5tVar.f237617B;
        v5tVar.getClass();
        return new v5t(str5, str6, str8, z6, z7, z9, str9, str11, aa8Var3, num3, z8, i2, z10, t6y0Var2, str12, z11, str13, z12, z13, z14, z15, z16, z17, c6u0Var, z18, z19, z20, str14);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m84758b() {
        return this.f237626f;
    }

    /* JADX INFO: renamed from: c */
    public final String m84759c() {
        return this.f237627g;
    }

    /* JADX INFO: renamed from: d */
    public final aa8 m84760d() {
        return this.f237629i;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m84761e() {
        return this.f237630j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5t)) {
            return false;
        }
        v5t v5tVar = (v5t) obj;
        return wj50.m88271j(this.f237621a, v5tVar.f237621a) && wj50.m88271j(this.f237622b, v5tVar.f237622b) && wj50.m88271j(this.f237623c, v5tVar.f237623c) && this.f237624d == v5tVar.f237624d && this.f237625e == v5tVar.f237625e && this.f237626f == v5tVar.f237626f && wj50.m88271j(this.f237627g, v5tVar.f237627g) && wj50.m88271j(this.f237628h, v5tVar.f237628h) && wj50.m88271j(this.f237629i, v5tVar.f237629i) && wj50.m88271j(this.f237630j, v5tVar.f237630j) && this.f237631k == v5tVar.f237631k && this.f237632l == v5tVar.f237632l && this.f237633m == v5tVar.f237633m && wj50.m88271j(this.f237634n, v5tVar.f237634n) && wj50.m88271j(this.f237635o, v5tVar.f237635o) && this.f237636p == v5tVar.f237636p && wj50.m88271j(this.f237637q, v5tVar.f237637q) && this.f237638r == v5tVar.f237638r && this.f237639s == v5tVar.f237639s && this.f237640t == v5tVar.f237640t && this.f237641u == v5tVar.f237641u && this.f237642v == v5tVar.f237642v && this.f237643w == v5tVar.f237643w && wj50.m88271j(this.f237644x, v5tVar.f237644x) && this.f237645y == v5tVar.f237645y && this.f237646z == v5tVar.f237646z && this.f237616A == v5tVar.f237616A && wj50.m88271j(this.f237617B, v5tVar.f237617B);
    }

    /* JADX INFO: renamed from: f */
    public final String m84762f() {
        return this.f237628h;
    }

    public final int hashCode() {
        int iHashCode = this.f237621a.hashCode() * 31;
        String str = this.f237622b;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f237623c), 31, this.f237624d), 31, false), 31, this.f237625e), 31, this.f237626f);
        String str2 = this.f237627g;
        int iHashCode2 = (iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f237628h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        aa8 aa8Var = this.f237629i;
        int iHashCode4 = (iHashCode3 + (aa8Var == null ? 0 : aa8Var.hashCode())) * 31;
        Integer num = this.f237630j;
        int iHashCode5 = (this.f237634n.hashCode() + s571.m77245d(mt60.m62800g(this.f237632l, s571.m77245d((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f237631k), 31), 31, this.f237633m)) * 31;
        String str4 = this.f237635o;
        int iM77245d2 = s571.m77245d((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f237636p);
        String str5 = this.f237637q;
        int iM77245d3 = s571.m77245d(s571.m77245d(s571.m77245d((this.f237644x.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77245d2 + (str5 == null ? 0 : str5.hashCode())) * 31, 961, this.f237638r), 31, false), 31, this.f237639s), 31, this.f237640t), 31, this.f237641u), 31, this.f237642v), 31, this.f237643w)) * 31, 31, this.f237645y), 31, this.f237646z), 31, this.f237616A);
        String str6 = this.f237617B;
        return iM77245d3 + (str6 != null ? str6.hashCode() : 0);
    }
}
