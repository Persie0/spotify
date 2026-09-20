package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fs90 {

    /* JADX INFO: renamed from: a */
    public final String f72808a;

    /* JADX INFO: renamed from: b */
    public final long f72809b;

    /* JADX INFO: renamed from: c */
    public final boolean f72810c;

    /* JADX INFO: renamed from: d */
    public final String f72811d;

    /* JADX INFO: renamed from: e */
    public final boolean f72812e;

    /* JADX INFO: renamed from: f */
    public final boolean f72813f;

    /* JADX INFO: renamed from: g */
    public final boolean f72814g;

    public fs90(String str, long j, boolean z, String str2, boolean z2, boolean z3, boolean z4) {
        this.f72808a = str;
        this.f72809b = j;
        this.f72810c = z;
        this.f72811d = str2;
        this.f72812e = z2;
        this.f72813f = z3;
        this.f72814g = z4;
    }

    /* JADX INFO: renamed from: a */
    public static fs90 m42554a(fs90 fs90Var, boolean z, boolean z2, int i) {
        String str = fs90Var.f72808a;
        long j = fs90Var.f72809b;
        if ((i & 4) != 0) {
            z = fs90Var.f72810c;
        }
        boolean z3 = z;
        String str2 = fs90Var.f72811d;
        boolean z4 = fs90Var.f72812e;
        boolean z5 = fs90Var.f72813f;
        if ((i & 128) != 0) {
            z2 = fs90Var.f72814g;
        }
        return new fs90(str, j, z3, str2, z4, z5, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs90)) {
            return false;
        }
        fs90 fs90Var = (fs90) obj;
        return wj50.m88271j(this.f72808a, fs90Var.f72808a) && this.f72809b == fs90Var.f72809b && this.f72810c == fs90Var.f72810c && wj50.m88271j(this.f72811d, fs90Var.f72811d) && this.f72812e == fs90Var.f72812e && this.f72813f == fs90Var.f72813f && this.f72814g == fs90Var.f72814g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f72814g) + s571.m77245d(s571.m77245d(s571.m77243b(xl81.m91401j(qsj.f192130d, s571.m77245d(dq60.m36605e(this.f72808a.hashCode() * 31, this.f72809b, 31), 31, this.f72810c), 31), 31, this.f72811d), 31, this.f72812e), 31, this.f72813f);
    }
}
