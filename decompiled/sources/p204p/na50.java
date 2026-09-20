package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class na50 {

    /* JADX INFO: renamed from: a */
    public final String f151936a;

    /* JADX INFO: renamed from: b */
    public final boolean f151937b;

    /* JADX INFO: renamed from: c */
    public final boolean f151938c;

    /* JADX INFO: renamed from: d */
    public final boolean f151939d;

    /* JADX INFO: renamed from: e */
    public final String f151940e;

    /* JADX INFO: renamed from: f */
    public final boolean f151941f;

    /* JADX INFO: renamed from: g */
    public final boolean f151942g;

    /* JADX INFO: renamed from: h */
    public final boolean f151943h;

    /* JADX INFO: renamed from: i */
    public final boolean f151944i;

    /* JADX INFO: renamed from: j */
    public final boolean f151945j;

    /* JADX INFO: renamed from: k */
    public final boolean f151946k;

    /* JADX INFO: renamed from: l */
    public final boolean f151947l;

    /* JADX INFO: renamed from: m */
    public final boolean f151948m;

    /* JADX INFO: renamed from: n */
    public final f6i0 f151949n;

    /* JADX INFO: renamed from: o */
    public final boolean f151950o;

    /* JADX INFO: renamed from: p */
    public final boolean f151951p;

    /* JADX INFO: renamed from: q */
    public final String f151952q;

    public /* synthetic */ na50(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this(str, z, z2, z3, str2, z4, z5, z6, z7, z8, z9, z10, z11, f6i0.f66415a, false, false, null);
    }

    /* JADX INFO: renamed from: a */
    public static na50 m63950a(na50 na50Var, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, f6i0 f6i0Var, boolean z12, boolean z13, String str3, int i) {
        String str4 = (i & 1) != 0 ? na50Var.f151936a : str;
        boolean z14 = (i & 2) != 0 ? na50Var.f151937b : z;
        boolean z15 = (i & 4) != 0 ? na50Var.f151938c : z2;
        boolean z16 = (i & 8) != 0 ? na50Var.f151939d : z3;
        String str5 = (i & 16) != 0 ? na50Var.f151940e : str2;
        boolean z17 = (i & 32) != 0 ? na50Var.f151941f : z4;
        boolean z18 = (i & 64) != 0 ? na50Var.f151942g : z5;
        boolean z19 = (i & 128) != 0 ? na50Var.f151943h : z6;
        boolean z20 = (i & 256) != 0 ? na50Var.f151944i : z7;
        boolean z21 = (i & 512) != 0 ? na50Var.f151945j : z8;
        boolean z22 = (i & 1024) != 0 ? na50Var.f151946k : z9;
        boolean z23 = (i & 2048) != 0 ? na50Var.f151947l : z10;
        boolean z24 = (i & 4096) != 0 ? na50Var.f151948m : z11;
        f6i0 f6i0Var2 = (i & 8192) != 0 ? na50Var.f151949n : f6i0Var;
        String str6 = str4;
        boolean z25 = (i & 16384) != 0 ? na50Var.f151950o : z12;
        boolean z26 = (i & 32768) != 0 ? na50Var.f151951p : z13;
        String str7 = (i & 65536) != 0 ? na50Var.f151952q : str3;
        na50Var.getClass();
        return new na50(str6, z14, z15, z16, str5, z17, z18, z19, z20, z21, z22, z23, z24, f6i0Var2, z25, z26, str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na50)) {
            return false;
        }
        na50 na50Var = (na50) obj;
        return wj50.m88271j(this.f151936a, na50Var.f151936a) && this.f151937b == na50Var.f151937b && this.f151938c == na50Var.f151938c && this.f151939d == na50Var.f151939d && wj50.m88271j(this.f151940e, na50Var.f151940e) && this.f151941f == na50Var.f151941f && this.f151942g == na50Var.f151942g && this.f151943h == na50Var.f151943h && this.f151944i == na50Var.f151944i && this.f151945j == na50Var.f151945j && this.f151946k == na50Var.f151946k && this.f151947l == na50Var.f151947l && this.f151948m == na50Var.f151948m && this.f151949n == na50Var.f151949n && this.f151950o == na50Var.f151950o && this.f151951p == na50Var.f151951p && wj50.m88271j(this.f151952q, na50Var.f151952q);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d((this.f151949n.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(this.f151936a.hashCode() * 31, 31, this.f151937b), 31, this.f151938c), 31, this.f151939d), 31, this.f151940e), 31, this.f151941f), 31, this.f151942g), 31, this.f151943h), 31, this.f151944i), 31, this.f151945j), 31, this.f151946k), 31, this.f151947l), 31, this.f151948m)) * 31, 31, this.f151950o), 31, this.f151951p);
        String str = this.f151952q;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }

    public na50(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, f6i0 f6i0Var, boolean z12, boolean z13, String str3) {
        this.f151936a = str;
        this.f151937b = z;
        this.f151938c = z2;
        this.f151939d = z3;
        this.f151940e = str2;
        this.f151941f = z4;
        this.f151942g = z5;
        this.f151943h = z6;
        this.f151944i = z7;
        this.f151945j = z8;
        this.f151946k = z9;
        this.f151947l = z10;
        this.f151948m = z11;
        this.f151949n = f6i0Var;
        this.f151950o = z12;
        this.f151951p = z13;
        this.f151952q = str3;
    }
}
