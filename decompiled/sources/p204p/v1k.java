package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v1k {

    /* JADX INFO: renamed from: a */
    public final boolean f236391a;

    /* JADX INFO: renamed from: b */
    public final boolean f236392b;

    /* JADX INFO: renamed from: c */
    public final boolean f236393c;

    /* JADX INFO: renamed from: d */
    public final boolean f236394d;

    /* JADX INFO: renamed from: e */
    public final boolean f236395e;

    /* JADX INFO: renamed from: f */
    public final boolean f236396f;

    /* JADX INFO: renamed from: g */
    public final boolean f236397g;

    /* JADX INFO: renamed from: h */
    public final boolean f236398h;

    /* JADX INFO: renamed from: i */
    public final boolean f236399i;

    /* JADX INFO: renamed from: j */
    public final boolean f236400j;

    /* JADX INFO: renamed from: k */
    public final boolean f236401k;

    /* JADX INFO: renamed from: l */
    public final boolean f236402l;

    /* JADX INFO: renamed from: m */
    public final boolean f236403m;

    /* JADX INFO: renamed from: n */
    public final boolean f236404n;

    public v1k(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i) {
        boolean z14 = (i & 1) != 0 ? false : z;
        boolean z15 = (i & 4) != 0 ? true : z2;
        boolean z16 = (i & 8) != 0 ? true : z3;
        boolean z17 = (i & 16) != 0 ? false : z4;
        boolean z18 = (i & 32) != 0 ? false : z5;
        boolean z19 = (i & 64) != 0 ? false : z6;
        boolean z20 = (i & 128) != 0 ? true : z7;
        boolean z21 = (i & 256) != 0 ? true : z8;
        boolean z22 = (i & 1024) != 0 ? false : z9;
        boolean z23 = (i & 2048) != 0 ? false : z10;
        boolean z24 = (i & 4096) != 0 ? false : z11;
        boolean z25 = (i & 8192) != 0;
        boolean z26 = (i & 16384) != 0 ? false : z12;
        boolean z27 = (i & 32768) == 0 ? z13 : false;
        this.f236391a = z14;
        this.f236392b = z15;
        this.f236393c = z16;
        this.f236394d = z17;
        this.f236395e = z18;
        this.f236396f = z19;
        this.f236397g = z20;
        this.f236398h = z21;
        this.f236399i = z22;
        this.f236400j = z23;
        this.f236401k = z24;
        this.f236402l = z25;
        this.f236403m = z26;
        this.f236404n = z27;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1k)) {
            return false;
        }
        v1k v1kVar = (v1k) obj;
        return this.f236391a == v1kVar.f236391a && this.f236392b == v1kVar.f236392b && this.f236393c == v1kVar.f236393c && this.f236394d == v1kVar.f236394d && this.f236395e == v1kVar.f236395e && this.f236396f == v1kVar.f236396f && this.f236397g == v1kVar.f236397g && this.f236398h == v1kVar.f236398h && this.f236399i == v1kVar.f236399i && this.f236400j == v1kVar.f236400j && this.f236401k == v1kVar.f236401k && this.f236402l == v1kVar.f236402l && this.f236403m == v1kVar.f236403m && this.f236404n == v1kVar.f236404n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236404n) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f236391a) * 31, 31, true), 31, this.f236392b), 31, this.f236393c), 31, this.f236394d), 31, this.f236395e), 31, this.f236396f), 31, this.f236397g), 31, this.f236398h), 31, true), 31, this.f236399i), 31, this.f236400j), 31, this.f236401k), 31, this.f236402l), 31, this.f236403m);
    }
}
