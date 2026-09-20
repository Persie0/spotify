package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class blc0 {

    /* JADX INFO: renamed from: a */
    public final String f28161a;

    /* JADX INFO: renamed from: b */
    public final String f28162b;

    /* JADX INFO: renamed from: c */
    public final String f28163c;

    /* JADX INFO: renamed from: d */
    public final boolean f28164d;

    /* JADX INFO: renamed from: e */
    public final boolean f28165e;

    /* JADX INFO: renamed from: f */
    public final boolean f28166f;

    /* JADX INFO: renamed from: g */
    public final boolean f28167g;

    public blc0(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f28161a = str;
        this.f28162b = str2;
        this.f28163c = str3;
        this.f28164d = z;
        this.f28165e = z2;
        this.f28166f = z3;
        this.f28167g = z4;
    }

    /* JADX INFO: renamed from: a */
    public static blc0 m29757a(blc0 blc0Var, boolean z, boolean z2) {
        String str = blc0Var.f28161a;
        String str2 = blc0Var.f28162b;
        String str3 = blc0Var.f28163c;
        boolean z3 = blc0Var.f28166f;
        boolean z4 = blc0Var.f28167g;
        blc0Var.getClass();
        return new blc0(str, str2, str3, z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blc0)) {
            return false;
        }
        blc0 blc0Var = (blc0) obj;
        return wj50.m88271j(this.f28161a, blc0Var.f28161a) && wj50.m88271j(this.f28162b, blc0Var.f28162b) && wj50.m88271j(this.f28163c, blc0Var.f28163c) && this.f28164d == blc0Var.f28164d && this.f28165e == blc0Var.f28165e && this.f28166f == blc0Var.f28166f && this.f28167g == blc0Var.f28167g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28167g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(this.f28161a.hashCode() * 31, 31, this.f28162b), 31, this.f28163c), 31, this.f28164d), 31, this.f28165e), 31, this.f28166f);
    }
}
