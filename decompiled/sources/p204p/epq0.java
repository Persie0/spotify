package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class epq0 {

    /* JADX INFO: renamed from: a */
    public final String f61696a;

    /* JADX INFO: renamed from: b */
    public final String f61697b;

    /* JADX INFO: renamed from: c */
    public final lpq0 f61698c;

    /* JADX INFO: renamed from: d */
    public final x9r0 f61699d;

    /* JADX INFO: renamed from: e */
    public final boolean f61700e;

    /* JADX INFO: renamed from: f */
    public final boolean f61701f;

    public epq0(String str, String str2, lpq0 lpq0Var, x9r0 x9r0Var, boolean z, boolean z2) {
        this.f61696a = str;
        this.f61697b = str2;
        this.f61698c = lpq0Var;
        this.f61699d = x9r0Var;
        this.f61700e = z;
        this.f61701f = z2;
    }

    /* JADX INFO: renamed from: a */
    public static epq0 m39663a(epq0 epq0Var, String str, lpq0 lpq0Var, boolean z, int i) {
        String str2 = epq0Var.f61696a;
        if ((i & 2) != 0) {
            str = epq0Var.f61697b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            lpq0Var = epq0Var.f61698c;
        }
        lpq0 lpq0Var2 = lpq0Var;
        x9r0 x9r0Var = (i & 8) != 0 ? epq0Var.f61699d : null;
        if ((i & 16) != 0) {
            z = epq0Var.f61700e;
        }
        boolean z2 = epq0Var.f61701f;
        epq0Var.getClass();
        return new epq0(str2, str3, lpq0Var2, x9r0Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epq0)) {
            return false;
        }
        epq0 epq0Var = (epq0) obj;
        return wj50.m88271j(this.f61696a, epq0Var.f61696a) && wj50.m88271j(this.f61697b, epq0Var.f61697b) && wj50.m88271j(this.f61698c, epq0Var.f61698c) && wj50.m88271j(this.f61699d, epq0Var.f61699d) && this.f61700e == epq0Var.f61700e && this.f61701f == epq0Var.f61701f;
    }

    public final int hashCode() {
        String str = this.f61696a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61697b;
        int iHashCode2 = (this.f61698c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        x9r0 x9r0Var = this.f61699d;
        return Boolean.hashCode(this.f61701f) + s571.m77245d((iHashCode2 + (x9r0Var != null ? x9r0Var.hashCode() : 0)) * 31, 31, this.f61700e);
    }

    public /* synthetic */ epq0(String str, lpq0 lpq0Var, x9r0 x9r0Var, boolean z, int i) {
        this(str, null, lpq0Var, (i & 8) != 0 ? null : x9r0Var, true, z);
    }
}
