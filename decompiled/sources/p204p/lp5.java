package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lp5 {

    /* JADX INFO: renamed from: a */
    public final jo5 f135621a;

    /* JADX INFO: renamed from: b */
    public final ohi f135622b;

    /* JADX INFO: renamed from: c */
    public final mlm0 f135623c;

    /* JADX INFO: renamed from: d */
    public final boolean f135624d;

    /* JADX INFO: renamed from: e */
    public final boolean f135625e;

    /* JADX INFO: renamed from: f */
    public final boolean f135626f;

    /* JADX INFO: renamed from: g */
    public final String f135627g;

    /* JADX INFO: renamed from: h */
    public final String f135628h;

    public /* synthetic */ lp5(jo5 jo5Var, ohi ohiVar, mlm0 mlm0Var, boolean z, int i) {
        this(jo5Var, ohiVar, mlm0Var, (i & 8) != 0 ? false : z, false, false, null, null);
    }

    /* JADX INFO: renamed from: a */
    public static lp5 m59589a(lp5 lp5Var, jo5 jo5Var, boolean z, boolean z2, String str, String str2, int i) {
        if ((i & 1) != 0) {
            jo5Var = lp5Var.f135621a;
        }
        jo5 jo5Var2 = jo5Var;
        ohi ohiVar = lp5Var.f135622b;
        mlm0 mlm0Var = lp5Var.f135623c;
        boolean z3 = lp5Var.f135624d;
        if ((i & 16) != 0) {
            z = lp5Var.f135625e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = lp5Var.f135626f;
        }
        boolean z5 = z2;
        if ((i & 64) != 0) {
            str = lp5Var.f135627g;
        }
        String str3 = str;
        if ((i & 128) != 0) {
            str2 = lp5Var.f135628h;
        }
        lp5Var.getClass();
        return new lp5(jo5Var2, ohiVar, mlm0Var, z3, z4, z5, str3, str2);
    }

    /* JADX INFO: renamed from: b */
    public final jo5 m59590b() {
        return this.f135621a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp5)) {
            return false;
        }
        lp5 lp5Var = (lp5) obj;
        return wj50.m88271j(this.f135621a, lp5Var.f135621a) && this.f135622b == lp5Var.f135622b && this.f135623c == lp5Var.f135623c && this.f135624d == lp5Var.f135624d && this.f135625e == lp5Var.f135625e && this.f135626f == lp5Var.f135626f && wj50.m88271j(this.f135627g, lp5Var.f135627g) && wj50.m88271j(this.f135628h, lp5Var.f135628h);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d((this.f135623c.hashCode() + ((this.f135622b.hashCode() + (this.f135621a.hashCode() * 31)) * 31)) * 31, 31, this.f135624d), 31, this.f135625e), 31, this.f135626f);
        String str = this.f135627g;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f135628h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public lp5(jo5 jo5Var, ohi ohiVar, mlm0 mlm0Var, boolean z, boolean z2, boolean z3, String str, String str2) {
        this.f135621a = jo5Var;
        this.f135622b = ohiVar;
        this.f135623c = mlm0Var;
        this.f135624d = z;
        this.f135625e = z2;
        this.f135626f = z3;
        this.f135627g = str;
        this.f135628h = str2;
    }
}
