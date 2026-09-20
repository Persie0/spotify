package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hs90 {

    /* JADX INFO: renamed from: a */
    public final String f94635a;

    /* JADX INFO: renamed from: b */
    public final String f94636b;

    /* JADX INFO: renamed from: c */
    public final String f94637c;

    /* JADX INFO: renamed from: d */
    public final boolean f94638d;

    /* JADX INFO: renamed from: e */
    public final int f94639e;

    /* JADX INFO: renamed from: f */
    public final boolean f94640f;

    public hs90(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.f94635a = str;
        this.f94636b = str2;
        this.f94637c = str3;
        this.f94638d = z;
        this.f94639e = i;
        this.f94640f = z2;
    }

    /* JADX INFO: renamed from: a */
    public static hs90 m48418a(hs90 hs90Var, int i, boolean z, int i2) {
        String str = hs90Var.f94635a;
        String str2 = hs90Var.f94636b;
        String str3 = hs90Var.f94637c;
        boolean z2 = hs90Var.f94638d;
        if ((i2 & 32) != 0) {
            z = hs90Var.f94640f;
        }
        return new hs90(i, str, str2, str3, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs90)) {
            return false;
        }
        hs90 hs90Var = (hs90) obj;
        return wj50.m88271j(this.f94635a, hs90Var.f94635a) && wj50.m88271j(this.f94636b, hs90Var.f94636b) && wj50.m88271j(this.f94637c, hs90Var.f94637c) && this.f94638d == hs90Var.f94638d && this.f94639e == hs90Var.f94639e && this.f94640f == hs90Var.f94640f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94640f) + f710.m40938f(this.f94639e, s571.m77245d(s571.m77243b(s571.m77243b(this.f94635a.hashCode() * 31, 31, this.f94636b), 31, this.f94637c), 31, this.f94638d), 31);
    }
}
