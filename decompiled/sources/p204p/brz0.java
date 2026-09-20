package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class brz0 {

    /* JADX INFO: renamed from: a */
    public final String f30193a;

    /* JADX INFO: renamed from: b */
    public final String f30194b;

    /* JADX INFO: renamed from: c */
    public final String f30195c;

    /* JADX INFO: renamed from: d */
    public final int f30196d;

    /* JADX INFO: renamed from: e */
    public final boolean f30197e;

    /* JADX INFO: renamed from: f */
    public final arz0 f30198f;

    /* JADX INFO: renamed from: g */
    public final boolean f30199g;

    public brz0(String str, String str2, String str3, int i, boolean z, arz0 arz0Var, boolean z2) {
        this.f30193a = str;
        this.f30194b = str2;
        this.f30195c = str3;
        this.f30196d = i;
        this.f30197e = z;
        this.f30198f = arz0Var;
        this.f30199g = z2;
    }

    /* JADX INFO: renamed from: a */
    public static brz0 m30340a(brz0 brz0Var, boolean z) {
        String str = brz0Var.f30193a;
        String str2 = brz0Var.f30194b;
        String str3 = brz0Var.f30195c;
        int i = brz0Var.f30196d;
        arz0 arz0Var = brz0Var.f30198f;
        boolean z2 = brz0Var.f30199g;
        brz0Var.getClass();
        return new brz0(str, str2, str3, i, z, arz0Var, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brz0)) {
            return false;
        }
        brz0 brz0Var = (brz0) obj;
        return wj50.m88271j(this.f30193a, brz0Var.f30193a) && wj50.m88271j(this.f30194b, brz0Var.f30194b) && wj50.m88271j(this.f30195c, brz0Var.f30195c) && this.f30196d == brz0Var.f30196d && this.f30197e == brz0Var.f30197e && this.f30198f.equals(brz0Var.f30198f) && this.f30199g == brz0Var.f30199g;
    }

    public final int hashCode() {
        String str = this.f30193a;
        return Boolean.hashCode(this.f30199g) + ((this.f30198f.hashCode() + s571.m77245d(mt60.m62800g(this.f30196d, s571.m77243b(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f30194b), 31, this.f30195c), 31), 31, this.f30197e)) * 31);
    }
}
