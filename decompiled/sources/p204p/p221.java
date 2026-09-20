package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class p221 {

    /* JADX INFO: renamed from: e */
    public static final C1673an f173223e = new C1673an(1, 29, null);

    /* JADX INFO: renamed from: a */
    public final String f173224a;

    /* JADX INFO: renamed from: b */
    public final gh00 f173225b;

    /* JADX INFO: renamed from: c */
    public final boolean f173226c;

    /* JADX INFO: renamed from: d */
    public final int f173227d;

    public p221(int i, int i2, String str, gh00 gh00Var, boolean z) {
        gh00Var = (i2 & 2) != 0 ? f173223e : gh00Var;
        z = (i2 & 4) != 0 ? false : z;
        i = (i2 & 8) != 0 ? 0 : i;
        this.f173224a = str;
        this.f173225b = gh00Var;
        this.f173226c = z;
        this.f173227d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p221)) {
            return false;
        }
        p221 p221Var = (p221) obj;
        return wj50.m88271j(this.f173224a, p221Var.f173224a) && wj50.m88271j(this.f173225b, p221Var.f173225b) && this.f173226c == p221Var.f173226c && this.f173227d == p221Var.f173227d;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(m6b.m60989d(this.f173225b, this.f173224a.hashCode() * 31, 31), 31, this.f173226c);
        int i = this.f173227d;
        return iM77245d + (i == 0 ? 0 : edb.m38547C(i));
    }
}
