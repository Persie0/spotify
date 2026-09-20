package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cqv {

    /* JADX INFO: renamed from: a */
    public final String f40998a;

    /* JADX INFO: renamed from: b */
    public final boolean f40999b;

    /* JADX INFO: renamed from: c */
    public final boolean f41000c;

    /* JADX INFO: renamed from: d */
    public final boolean f41001d;

    /* JADX INFO: renamed from: e */
    public final boolean f41002e;

    /* JADX INFO: renamed from: f */
    public final boolean f41003f;

    /* JADX INFO: renamed from: g */
    public final boolean f41004g;

    /* JADX INFO: renamed from: h */
    public final boolean f41005h;

    /* JADX INFO: renamed from: i */
    public final mr20 f41006i;

    /* JADX INFO: renamed from: j */
    public final cqj0 f41007j;

    /* JADX INFO: renamed from: k */
    public final uhw0 f41008k;

    /* JADX INFO: renamed from: l */
    public final String f41009l;

    /* JADX INFO: renamed from: m */
    public final waz0 f41010m;

    /* JADX INFO: renamed from: n */
    public final boolean f41011n;

    public cqv(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, mr20 mr20Var, cqj0 cqj0Var, uhw0 uhw0Var, String str2, waz0 waz0Var, boolean z8, int i) {
        str = (i & 1) != 0 ? null : str;
        boolean z9 = (i & 64) != 0 ? false : z6;
        boolean z10 = (i & 128) != 0 ? false : z7;
        mr20 mr20Var2 = (i & 256) != 0 ? null : mr20Var;
        cqj0 cqj0Var2 = (i & 512) != 0 ? null : cqj0Var;
        uhw0 uhw0Var2 = (i & 1024) != 0 ? thw0.f220511a : uhw0Var;
        String str3 = (i & 2048) != 0 ? null : str2;
        waz0 waz0Var2 = (i & 4096) == 0 ? waz0Var : null;
        boolean z11 = (i & 8192) == 0 ? z8 : false;
        this.f40998a = str;
        this.f40999b = z;
        this.f41000c = z2;
        this.f41001d = z3;
        this.f41002e = z4;
        this.f41003f = z5;
        this.f41004g = z9;
        this.f41005h = z10;
        this.f41006i = mr20Var2;
        this.f41007j = cqj0Var2;
        this.f41008k = uhw0Var2;
        this.f41009l = str3;
        this.f41010m = waz0Var2;
        this.f41011n = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqv)) {
            return false;
        }
        cqv cqvVar = (cqv) obj;
        return wj50.m88271j(this.f40998a, cqvVar.f40998a) && this.f40999b == cqvVar.f40999b && this.f41000c == cqvVar.f41000c && this.f41001d == cqvVar.f41001d && this.f41002e == cqvVar.f41002e && this.f41003f == cqvVar.f41003f && this.f41004g == cqvVar.f41004g && this.f41005h == cqvVar.f41005h && wj50.m88271j(this.f41006i, cqvVar.f41006i) && wj50.m88271j(this.f41007j, cqvVar.f41007j) && wj50.m88271j(this.f41008k, cqvVar.f41008k) && wj50.m88271j(this.f41009l, cqvVar.f41009l) && wj50.m88271j(this.f41010m, cqvVar.f41010m) && this.f41011n == cqvVar.f41011n;
    }

    public final int hashCode() {
        String str = this.f40998a;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((str == null ? 0 : str.hashCode()) * 31, 31, this.f40999b), 31, this.f41000c), 31, this.f41001d), 31, this.f41002e), 31, this.f41003f), 31, this.f41004g), 31, this.f41005h);
        mr20 mr20Var = this.f41006i;
        int iHashCode = (iM77245d + (mr20Var == null ? 0 : mr20Var.hashCode())) * 31;
        cqj0 cqj0Var = this.f41007j;
        int iHashCode2 = (this.f41008k.hashCode() + ((iHashCode + (cqj0Var == null ? 0 : cqj0Var.hashCode())) * 31)) * 31;
        String str2 = this.f41009l;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        waz0 waz0Var = this.f41010m;
        return Boolean.hashCode(this.f41011n) + ((iHashCode3 + (waz0Var != null ? waz0Var.hashCode() : 0)) * 31);
    }
}
