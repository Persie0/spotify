package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ciz0 {

    /* JADX INFO: renamed from: a */
    public final String f38451a;

    /* JADX INFO: renamed from: b */
    public final long f38452b;

    /* JADX INFO: renamed from: c */
    public final long f38453c;

    /* JADX INFO: renamed from: d */
    public final long f38454d;

    /* JADX INFO: renamed from: e */
    public final boolean f38455e;

    /* JADX INFO: renamed from: f */
    public final boolean f38456f;

    /* JADX INFO: renamed from: g */
    public final boolean f38457g;

    /* JADX INFO: renamed from: h */
    public final boolean f38458h;

    /* JADX INFO: renamed from: i */
    public final boolean f38459i;

    /* JADX INFO: renamed from: j */
    public final List f38460j;

    /* JADX INFO: renamed from: k */
    public final long f38461k;

    /* JADX INFO: renamed from: l */
    public final long f38462l;

    /* JADX INFO: renamed from: m */
    public final boolean f38463m;

    /* JADX INFO: renamed from: n */
    public final uks f38464n;

    public ciz0(String str, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, long j4, long j5, boolean z6, uks uksVar) {
        this.f38451a = str;
        this.f38452b = j;
        this.f38453c = j2;
        this.f38454d = j3;
        this.f38455e = z;
        this.f38456f = z2;
        this.f38457g = z3;
        this.f38458h = z4;
        this.f38459i = z5;
        this.f38460j = list;
        this.f38461k = j4;
        this.f38462l = j5;
        this.f38463m = z6;
        this.f38464n = uksVar;
    }

    /* JADX INFO: renamed from: a */
    public static ciz0 m32908a(ciz0 ciz0Var, String str, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, long j4, long j5, boolean z6, uks uksVar, int i) {
        String str2 = (i & 1) != 0 ? ciz0Var.f38451a : str;
        long j6 = (i & 2) != 0 ? ciz0Var.f38452b : j;
        long j7 = (i & 4) != 0 ? ciz0Var.f38453c : j2;
        long j8 = (i & 8) != 0 ? ciz0Var.f38454d : j3;
        boolean z7 = (i & 16) != 0 ? ciz0Var.f38455e : z;
        boolean z8 = (i & 32) != 0 ? ciz0Var.f38456f : z2;
        boolean z9 = (i & 64) != 0 ? ciz0Var.f38457g : z3;
        boolean z10 = (i & 128) != 0 ? ciz0Var.f38458h : z4;
        boolean z11 = (i & 256) != 0 ? ciz0Var.f38459i : z5;
        List list2 = (i & 512) != 0 ? ciz0Var.f38460j : list;
        String str3 = str2;
        long j9 = j6;
        long j10 = (i & 1024) != 0 ? ciz0Var.f38461k : j4;
        long j11 = (i & 2048) != 0 ? ciz0Var.f38462l : j5;
        boolean z12 = (i & 4096) != 0 ? ciz0Var.f38463m : z6;
        uks uksVar2 = (i & 8192) != 0 ? ciz0Var.f38464n : uksVar;
        ciz0Var.getClass();
        return new ciz0(str3, j9, j7, j8, z7, z8, z9, z10, z11, list2, j10, j11, z12, uksVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ciz0)) {
            return false;
        }
        ciz0 ciz0Var = (ciz0) obj;
        return wj50.m88271j(this.f38451a, ciz0Var.f38451a) && this.f38452b == ciz0Var.f38452b && this.f38453c == ciz0Var.f38453c && this.f38454d == ciz0Var.f38454d && this.f38455e == ciz0Var.f38455e && this.f38456f == ciz0Var.f38456f && this.f38457g == ciz0Var.f38457g && this.f38458h == ciz0Var.f38458h && this.f38459i == ciz0Var.f38459i && wj50.m88271j(this.f38460j, ciz0Var.f38460j) && this.f38461k == ciz0Var.f38461k && this.f38462l == ciz0Var.f38462l && this.f38463m == ciz0Var.f38463m && this.f38464n == ciz0Var.f38464n;
    }

    public final int hashCode() {
        return this.f38464n.hashCode() + s571.m77245d(dq60.m36605e(dq60.m36605e(s571.m77244c(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(dq60.m36605e(dq60.m36605e(dq60.m36605e(this.f38451a.hashCode() * 31, this.f38452b, 31), this.f38453c, 31), this.f38454d, 31), 31, this.f38455e), 31, this.f38456f), 31, this.f38457g), 31, this.f38458h), 31, this.f38459i), 31, this.f38460j), this.f38461k, 31), this.f38462l, 31), 31, this.f38463m);
    }

    public /* synthetic */ ciz0(String str, boolean z, boolean z2, boolean z3, uks uksVar, int i) {
        this((i & 1) != 0 ? "" : str, 0L, 0L, 0L, (i & 16) != 0 ? false : z, false, false, false, (i & 256) != 0 ? false : z2, lau.f131415a, -1L, -1L, (i & 4096) != 0 ? false : z3, (i & 8192) != 0 ? uks.f231357a : uksVar);
    }
}
