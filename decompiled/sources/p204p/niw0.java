package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class niw0 {

    /* JADX INFO: renamed from: a */
    public final String f154360a;

    /* JADX INFO: renamed from: b */
    public final String f154361b;

    /* JADX INFO: renamed from: c */
    public final String f154362c;

    /* JADX INFO: renamed from: d */
    public final String f154363d;

    /* JADX INFO: renamed from: e */
    public final boolean f154364e;

    /* JADX INFO: renamed from: f */
    public final boolean f154365f;

    /* JADX INFO: renamed from: g */
    public final boolean f154366g;

    /* JADX INFO: renamed from: h */
    public final ciw0 f154367h;

    public niw0(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, ciw0 ciw0Var) {
        this.f154360a = str;
        this.f154361b = str2;
        this.f154362c = str3;
        this.f154363d = str4;
        this.f154364e = z;
        this.f154365f = z2;
        this.f154366g = z3;
        this.f154367h = ciw0Var;
    }

    /* JADX INFO: renamed from: a */
    public static niw0 m64586a(niw0 niw0Var, boolean z, boolean z2, int i) {
        String str = niw0Var.f154360a;
        String str2 = niw0Var.f154361b;
        String str3 = niw0Var.f154362c;
        String str4 = niw0Var.f154363d;
        if ((i & 16) != 0) {
            z = niw0Var.f154364e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = niw0Var.f154365f;
        }
        boolean z4 = niw0Var.f154366g;
        ciw0 ciw0Var = niw0Var.f154367h;
        niw0Var.getClass();
        return new niw0(str, str2, str3, str4, z3, z2, z4, ciw0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof niw0)) {
            return false;
        }
        niw0 niw0Var = (niw0) obj;
        return wj50.m88271j(this.f154360a, niw0Var.f154360a) && wj50.m88271j(this.f154361b, niw0Var.f154361b) && wj50.m88271j(this.f154362c, niw0Var.f154362c) && wj50.m88271j(this.f154363d, niw0Var.f154363d) && this.f154364e == niw0Var.f154364e && this.f154365f == niw0Var.f154365f && this.f154366g == niw0Var.f154366g && wj50.m88271j(this.f154367h, niw0Var.f154367h);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f154360a.hashCode() * 31, 31, this.f154361b), 31, this.f154362c), 31, this.f154363d), 31, this.f154364e), 31, this.f154365f), 31, this.f154366g);
        ciw0 ciw0Var = this.f154367h;
        return iM77245d + (ciw0Var == null ? 0 : ciw0Var.hashCode());
    }
}
