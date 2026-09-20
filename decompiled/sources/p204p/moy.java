package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class moy {

    /* JADX INFO: renamed from: a */
    public final koy f145778a;

    /* JADX INFO: renamed from: b */
    public final String f145779b;

    /* JADX INFO: renamed from: c */
    public final Long f145780c;

    /* JADX INFO: renamed from: d */
    public final boolean f145781d;

    /* JADX INFO: renamed from: e */
    public final uqj0 f145782e;

    /* JADX INFO: renamed from: f */
    public final boolean f145783f;

    /* JADX INFO: renamed from: g */
    public final boolean f145784g;

    /* JADX INFO: renamed from: h */
    public final boolean f145785h;

    /* JADX INFO: renamed from: i */
    public final String f145786i;

    /* JADX INFO: renamed from: j */
    public final boolean f145787j;

    /* JADX INFO: renamed from: k */
    public final boolean f145788k;

    /* JADX INFO: renamed from: l */
    public final int f145789l;

    /* JADX INFO: renamed from: m */
    public final int f145790m;

    /* JADX INFO: renamed from: n */
    public final String f145791n;

    /* JADX INFO: renamed from: o */
    public final boolean f145792o;

    /* JADX INFO: renamed from: p */
    public final String f145793p;

    /* JADX INFO: renamed from: q */
    public final boolean f145794q;

    /* JADX INFO: renamed from: r */
    public final boolean f145795r;

    /* JADX INFO: renamed from: s */
    public final boolean f145796s;

    public moy(koy koyVar, String str, Long l, boolean z, uqj0 uqj0Var, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, int i, int i2, String str3, boolean z7, String str4, boolean z8, boolean z9, boolean z10) {
        this.f145778a = koyVar;
        this.f145779b = str;
        this.f145780c = l;
        this.f145781d = z;
        this.f145782e = uqj0Var;
        this.f145783f = z2;
        this.f145784g = z3;
        this.f145785h = z4;
        this.f145786i = str2;
        this.f145787j = z5;
        this.f145788k = z6;
        this.f145789l = i;
        this.f145790m = i2;
        this.f145791n = str3;
        this.f145792o = z7;
        this.f145793p = str4;
        this.f145794q = z8;
        this.f145795r = z9;
        this.f145796s = z10;
    }

    /* JADX INFO: renamed from: a */
    public static moy m62423a(moy moyVar, koy koyVar, String str, Long l, boolean z, uqj0 uqj0Var, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, int i, int i2, String str3, boolean z7, String str4, boolean z8, boolean z9, boolean z10, int i3) {
        koy koyVar2 = (i3 & 1) != 0 ? moyVar.f145778a : koyVar;
        String str5 = (i3 & 2) != 0 ? moyVar.f145779b : str;
        Long l2 = (i3 & 4) != 0 ? moyVar.f145780c : l;
        boolean z11 = (i3 & 8) != 0 ? moyVar.f145781d : z;
        uqj0 uqj0Var2 = (i3 & 16) != 0 ? moyVar.f145782e : uqj0Var;
        boolean z12 = (i3 & 32) != 0 ? moyVar.f145783f : z2;
        boolean z13 = (i3 & 64) != 0 ? moyVar.f145784g : z3;
        boolean z14 = (i3 & 128) != 0 ? moyVar.f145785h : z4;
        String str6 = (i3 & 256) != 0 ? moyVar.f145786i : str2;
        boolean z15 = (i3 & 512) != 0 ? moyVar.f145787j : z5;
        boolean z16 = (i3 & 1024) != 0 ? moyVar.f145788k : z6;
        int i4 = (i3 & 2048) != 0 ? moyVar.f145789l : i;
        int i5 = (i3 & 4096) != 0 ? moyVar.f145790m : i2;
        String str7 = (i3 & 8192) != 0 ? moyVar.f145791n : str3;
        koy koyVar3 = koyVar2;
        boolean z17 = (i3 & 16384) != 0 ? moyVar.f145792o : z7;
        String str8 = (i3 & 32768) != 0 ? moyVar.f145793p : str4;
        boolean z18 = (i3 & 65536) != 0 ? moyVar.f145794q : z8;
        boolean z19 = (i3 & 131072) != 0 ? moyVar.f145795r : z9;
        boolean z20 = (i3 & 262144) != 0 ? moyVar.f145796s : z10;
        moyVar.getClass();
        return new moy(koyVar3, str5, l2, z11, uqj0Var2, z12, z13, z14, str6, z15, z16, i4, i5, str7, z17, str8, z18, z19, z20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moy)) {
            return false;
        }
        moy moyVar = (moy) obj;
        return wj50.m88271j(this.f145778a, moyVar.f145778a) && wj50.m88271j(this.f145779b, moyVar.f145779b) && wj50.m88271j(this.f145780c, moyVar.f145780c) && this.f145781d == moyVar.f145781d && wj50.m88271j(this.f145782e, moyVar.f145782e) && this.f145783f == moyVar.f145783f && this.f145784g == moyVar.f145784g && this.f145785h == moyVar.f145785h && wj50.m88271j(this.f145786i, moyVar.f145786i) && this.f145787j == moyVar.f145787j && this.f145788k == moyVar.f145788k && this.f145789l == moyVar.f145789l && this.f145790m == moyVar.f145790m && wj50.m88271j(this.f145791n, moyVar.f145791n) && this.f145792o == moyVar.f145792o && wj50.m88271j(this.f145793p, moyVar.f145793p) && this.f145794q == moyVar.f145794q && this.f145795r == moyVar.f145795r && this.f145796s == moyVar.f145796s;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f145778a.hashCode() * 31, 31, this.f145779b);
        Long l = this.f145780c;
        int iM77245d = s571.m77245d((iM77243b + (l == null ? 0 : l.hashCode())) * 31, 31, this.f145781d);
        uqj0 uqj0Var = this.f145782e;
        int iM77245d2 = s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (uqj0Var == null ? 0 : uqj0Var.hashCode())) * 31, 31, this.f145783f), 31, this.f145784g), 31, this.f145785h);
        String str = this.f145786i;
        int iM62800g = mt60.m62800g(this.f145790m, mt60.m62800g(this.f145789l, s571.m77245d(s571.m77245d((iM77245d2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f145787j), 31, this.f145788k), 31), 31);
        String str2 = this.f145791n;
        return Boolean.hashCode(this.f145796s) + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77245d((iM62800g + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f145792o), 31, this.f145793p), 31, this.f145794q), 31, this.f145795r);
    }
}
