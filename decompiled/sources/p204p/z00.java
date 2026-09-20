package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z00 {

    /* JADX INFO: renamed from: a */
    public final String f277924a;

    /* JADX INFO: renamed from: b */
    public final String f277925b;

    /* JADX INFO: renamed from: c */
    public final String f277926c;

    /* JADX INFO: renamed from: d */
    public final String f277927d;

    /* JADX INFO: renamed from: e */
    public final String f277928e;

    /* JADX INFO: renamed from: f */
    public final boolean f277929f;

    /* JADX INFO: renamed from: g */
    public final boolean f277930g;

    public /* synthetic */ z00(String str, int i, String str2, String str3, boolean z, String str4) {
        this((i & 1) != 0 ? "" : "TIME", (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? false : z, false);
    }

    /* JADX INFO: renamed from: a */
    public static z00 m95000a(z00 z00Var) {
        return new z00(z00Var.f277924a, z00Var.f277925b, z00Var.f277926c, z00Var.f277927d, z00Var.f277928e, z00Var.f277929f, true);
    }

    /* JADX INFO: renamed from: b */
    public final String m95001b() {
        return this.f277926c;
    }

    /* JADX INFO: renamed from: c */
    public final String m95002c() {
        return this.f277925b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z00)) {
            return false;
        }
        z00 z00Var = (z00) obj;
        return wj50.m88271j(this.f277924a, z00Var.f277924a) && wj50.m88271j(this.f277925b, z00Var.f277925b) && wj50.m88271j(this.f277926c, z00Var.f277926c) && wj50.m88271j(this.f277927d, z00Var.f277927d) && wj50.m88271j(this.f277928e, z00Var.f277928e) && this.f277929f == z00Var.f277929f && this.f277930g == z00Var.f277930g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f277930g) + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f277924a.hashCode() * 31, 31, this.f277925b), 31, this.f277926c), 31, this.f277927d), 31, this.f277928e), 31, this.f277929f);
    }

    public z00(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        this.f277924a = str;
        this.f277925b = str2;
        this.f277926c = str3;
        this.f277927d = str4;
        this.f277928e = str5;
        this.f277929f = z;
        this.f277930g = z2;
    }
}
