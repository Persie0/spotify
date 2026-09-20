package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yca1 {

    /* JADX INFO: renamed from: a */
    public final String f271436a;

    /* JADX INFO: renamed from: b */
    public final boolean f271437b;

    /* JADX INFO: renamed from: c */
    public final boolean f271438c;

    /* JADX INFO: renamed from: d */
    public final boolean f271439d;

    /* JADX INFO: renamed from: e */
    public final boolean f271440e;

    /* JADX INFO: renamed from: f */
    public final boolean f271441f;

    /* JADX INFO: renamed from: g */
    public final boolean f271442g;

    /* JADX INFO: renamed from: h */
    public final boolean f271443h;

    /* JADX INFO: renamed from: i */
    public final boolean f271444i;

    /* JADX INFO: renamed from: j */
    public final boolean f271445j;

    /* JADX INFO: renamed from: k */
    public final xu00 f271446k;

    /* JADX INFO: renamed from: l */
    public final xu00 f271447l;

    public yca1(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, xu00 xu00Var, xu00 xu00Var2) {
        this.f271436a = str;
        this.f271437b = z;
        this.f271438c = z2;
        this.f271439d = z3;
        this.f271440e = z4;
        this.f271441f = z5;
        this.f271442g = z6;
        this.f271443h = z7;
        this.f271444i = z8;
        this.f271445j = z9;
        this.f271446k = xu00Var;
        this.f271447l = xu00Var2;
    }

    /* JADX INFO: renamed from: a */
    public static yca1 m93337a(yca1 yca1Var, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, xu00 xu00Var, xu00 xu00Var2, int i) {
        if ((i & 1) != 0) {
            str = yca1Var.f271436a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = yca1Var.f271437b;
        }
        boolean z10 = z;
        boolean z11 = (i & 4) != 0 ? yca1Var.f271438c : z2;
        boolean z12 = (i & 8) != 0 ? yca1Var.f271439d : z3;
        boolean z13 = (i & 16) != 0 ? yca1Var.f271440e : z4;
        boolean z14 = (i & 32) != 0 ? yca1Var.f271441f : z5;
        boolean z15 = (i & 64) != 0 ? yca1Var.f271442g : z6;
        boolean z16 = (i & 128) != 0 ? yca1Var.f271443h : z7;
        boolean z17 = (i & 256) != 0 ? yca1Var.f271444i : z8;
        boolean z18 = (i & 512) != 0 ? yca1Var.f271445j : z9;
        xu00 xu00Var3 = (i & 1024) != 0 ? yca1Var.f271446k : xu00Var;
        xu00 xu00Var4 = (i & 2048) != 0 ? yca1Var.f271447l : xu00Var2;
        yca1Var.getClass();
        return new yca1(str2, z10, z11, z12, z13, z14, z15, z16, z17, z18, xu00Var3, xu00Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yca1)) {
            return false;
        }
        yca1 yca1Var = (yca1) obj;
        return wj50.m88271j(this.f271436a, yca1Var.f271436a) && this.f271437b == yca1Var.f271437b && this.f271438c == yca1Var.f271438c && this.f271439d == yca1Var.f271439d && this.f271440e == yca1Var.f271440e && this.f271441f == yca1Var.f271441f && this.f271442g == yca1Var.f271442g && this.f271443h == yca1Var.f271443h && this.f271444i == yca1Var.f271444i && this.f271445j == yca1Var.f271445j && wj50.m88271j(this.f271446k, yca1Var.f271446k) && wj50.m88271j(this.f271447l, yca1Var.f271447l);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f271436a.hashCode() * 31, 31, this.f271437b), 31, this.f271438c), 31, this.f271439d), 31, this.f271440e), 31, this.f271441f), 31, this.f271442g), 31, this.f271443h), 31, this.f271444i), 31, this.f271445j);
        xu00 xu00Var = this.f271446k;
        int iHashCode = (iM77245d + (xu00Var == null ? 0 : xu00Var.hashCode())) * 31;
        xu00 xu00Var2 = this.f271447l;
        return iHashCode + (xu00Var2 != null ? xu00Var2.hashCode() : 0);
    }
}
