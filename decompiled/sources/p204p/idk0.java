package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class idk0 implements kwh0 {

    /* JADX INFO: renamed from: a */
    public final boolean f101143a;

    /* JADX INFO: renamed from: b */
    public final boolean f101144b;

    /* JADX INFO: renamed from: c */
    public final boolean f101145c;

    /* JADX INFO: renamed from: d */
    public final wb50 f101146d;

    /* JADX INFO: renamed from: e */
    public final String f101147e;

    /* JADX INFO: renamed from: f */
    public final String f101148f;

    public idk0(boolean z, boolean z2, boolean z3, wb50 wb50Var, String str, String str2) {
        this.f101143a = z;
        this.f101144b = z2;
        this.f101145c = z3;
        this.f101146d = wb50Var;
        this.f101147e = str;
        this.f101148f = str2;
    }

    /* JADX INFO: renamed from: b */
    public static idk0 m50350b(idk0 idk0Var, boolean z, boolean z2, boolean z3, wb50 wb50Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            z = idk0Var.f101143a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = idk0Var.f101144b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = idk0Var.f101145c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            wb50Var = idk0Var.f101146d;
        }
        wb50 wb50Var2 = wb50Var;
        if ((i & 16) != 0) {
            str = idk0Var.f101147e;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = idk0Var.f101148f;
        }
        idk0Var.getClass();
        return new idk0(z4, z5, z6, wb50Var2, str3, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idk0)) {
            return false;
        }
        idk0 idk0Var = (idk0) obj;
        return this.f101143a == idk0Var.f101143a && this.f101144b == idk0Var.f101144b && this.f101145c == idk0Var.f101145c && wj50.m88271j(this.f101146d, idk0Var.f101146d) && wj50.m88271j(this.f101147e, idk0Var.f101147e) && wj50.m88271j(this.f101148f, idk0Var.f101148f);
    }

    public final int hashCode() {
        int iHashCode = (this.f101146d.hashCode() + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f101143a) * 31, 31, this.f101144b), 31, this.f101145c)) * 31;
        String str = this.f101147e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101148f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ idk0(int i) {
        this(false, false, false, sb50.f207357a, null, null);
    }
}
