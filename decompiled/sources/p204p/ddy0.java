package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ddy0 {

    /* JADX INFO: renamed from: a */
    public final boolean f47914a;

    /* JADX INFO: renamed from: b */
    public final boolean f47915b;

    /* JADX INFO: renamed from: c */
    public final boolean f47916c;

    /* JADX INFO: renamed from: d */
    public final String f47917d;

    /* JADX INFO: renamed from: e */
    public final String f47918e;

    public ddy0(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f47914a = z;
        this.f47915b = z2;
        this.f47916c = z3;
        this.f47917d = str;
        this.f47918e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static ddy0 m35758a(ddy0 ddy0Var, boolean z, boolean z2, String str, String str2, int i) {
        if ((i & 1) != 0) {
            z = ddy0Var.f47914a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = ddy0Var.f47915b;
        }
        boolean z4 = z2;
        boolean z5 = ddy0Var.f47916c;
        if ((i & 8) != 0) {
            str = ddy0Var.f47917d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = ddy0Var.f47918e;
        }
        ddy0Var.getClass();
        return new ddy0(str3, str2, z3, z4, z5);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002b  */
    public final boolean equals(Object obj) {
        boolean zM94808a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddy0)) {
            return false;
        }
        ddy0 ddy0Var = (ddy0) obj;
        if (this.f47914a != ddy0Var.f47914a || this.f47915b != ddy0Var.f47915b || this.f47916c != ddy0Var.f47916c) {
            return false;
        }
        String str = ddy0Var.f47917d;
        String str2 = this.f47917d;
        if (str2 == null) {
            if (str == null) {
                zM94808a = true;
            } else {
                zM94808a = false;
            }
        } else if (str == null) {
            zM94808a = false;
        } else {
            zM94808a = yx50.m94808a(str2, str);
        }
        return zM94808a && wj50.m88271j(this.f47918e, ddy0Var.f47918e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(Boolean.hashCode(this.f47914a) * 31, 31, this.f47915b), 31, this.f47916c);
        String str = this.f47917d;
        int iM94809b = (iM77245d + (str == null ? 0 : yx50.m94809b(str))) * 31;
        String str2 = this.f47918e;
        return iM94809b + (str2 != null ? str2.hashCode() : 0);
    }
}
