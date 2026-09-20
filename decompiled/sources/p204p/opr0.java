package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class opr0 {

    /* JADX INFO: renamed from: a */
    public final String f168003a;

    /* JADX INFO: renamed from: b */
    public final String f168004b;

    /* JADX INFO: renamed from: c */
    public final String f168005c;

    /* JADX INFO: renamed from: d */
    public final int f168006d;

    /* JADX INFO: renamed from: e */
    public final String f168007e;

    /* JADX INFO: renamed from: f */
    public final String f168008f;

    /* JADX INFO: renamed from: g */
    public final boolean f168009g;

    /* JADX INFO: renamed from: h */
    public final boolean f168010h;

    /* JADX INFO: renamed from: i */
    public final boolean f168011i;

    /* JADX INFO: renamed from: j */
    public final boolean f168012j;

    public opr0(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f168003a = str;
        this.f168004b = str2;
        this.f168005c = str3;
        this.f168006d = i;
        this.f168007e = str4;
        this.f168008f = str5;
        this.f168009g = z;
        this.f168010h = z2;
        this.f168011i = z3;
        this.f168012j = z4;
    }

    /* JADX INFO: renamed from: a */
    public static opr0 m67578a(opr0 opr0Var, int i, String str, String str2, boolean z, boolean z2, boolean z3, int i2) {
        String str3 = opr0Var.f168003a;
        String str4 = opr0Var.f168004b;
        String str5 = opr0Var.f168005c;
        if ((i2 & 8) != 0) {
            i = opr0Var.f168006d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str = opr0Var.f168007e;
        }
        String str6 = str;
        if ((i2 & 32) != 0) {
            str2 = opr0Var.f168008f;
        }
        String str7 = str2;
        boolean z4 = (i2 & 64) != 0 ? opr0Var.f168009g : z;
        boolean z5 = (i2 & 128) != 0 ? opr0Var.f168010h : z2;
        boolean z6 = (i2 & 256) != 0 ? opr0Var.f168011i : z3;
        boolean z7 = opr0Var.f168012j;
        opr0Var.getClass();
        return new opr0(i3, str3, str4, str5, str6, str7, z4, z5, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opr0)) {
            return false;
        }
        opr0 opr0Var = (opr0) obj;
        return wj50.m88271j(this.f168003a, opr0Var.f168003a) && wj50.m88271j(this.f168004b, opr0Var.f168004b) && wj50.m88271j(this.f168005c, opr0Var.f168005c) && this.f168006d == opr0Var.f168006d && wj50.m88271j(this.f168007e, opr0Var.f168007e) && wj50.m88271j(this.f168008f, opr0Var.f168008f) && this.f168009g == opr0Var.f168009g && this.f168010h == opr0Var.f168010h && this.f168011i == opr0Var.f168011i && this.f168012j == opr0Var.f168012j;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f168003a.hashCode() * 31, 31, this.f168004b);
        String str = this.f168005c;
        int iM40938f = f710.m40938f(this.f168006d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f168007e;
        int iHashCode = (iM40938f + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f168008f;
        return Boolean.hashCode(this.f168012j) + s571.m77245d(s571.m77245d(s571.m77245d((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f168009g), 31, this.f168010h), 31, this.f168011i);
    }

    public /* synthetic */ opr0(String str, String str2, String str3, boolean z) {
        this(1, str, str2, str3, null, null, false, false, false, z);
    }
}
