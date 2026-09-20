package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m5g0 {

    /* JADX INFO: renamed from: a */
    public final String f140222a;

    /* JADX INFO: renamed from: b */
    public final b791 f140223b;

    /* JADX INFO: renamed from: c */
    public final boolean f140224c;

    /* JADX INFO: renamed from: d */
    public final Float f140225d;

    /* JADX INFO: renamed from: e */
    public final int f140226e;

    /* JADX INFO: renamed from: f */
    public final boolean f140227f;

    public /* synthetic */ m5g0(String str) {
        this(str, null, true, null, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5g0)) {
            return false;
        }
        m5g0 m5g0Var = (m5g0) obj;
        return wj50.m88271j(this.f140222a, m5g0Var.f140222a) && wj50.m88271j(this.f140223b, m5g0Var.f140223b) && this.f140224c == m5g0Var.f140224c && wj50.m88271j(this.f140225d, m5g0Var.f140225d) && this.f140226e == m5g0Var.f140226e && this.f140227f == m5g0Var.f140227f;
    }

    public final int hashCode() {
        int iHashCode = this.f140222a.hashCode() * 31;
        b791 b791Var = this.f140223b;
        int iM77245d = s571.m77245d((iHashCode + (b791Var == null ? 0 : b791Var.hashCode())) * 31, 31, this.f140224c);
        Float f = this.f140225d;
        int iHashCode2 = (iM77245d + (f == null ? 0 : f.hashCode())) * 31;
        int i = this.f140226e;
        return Boolean.hashCode(this.f140227f) + ((iHashCode2 + (i != 0 ? edb.m38547C(i) : 0)) * 31);
    }

    public m5g0(String str, b791 b791Var, boolean z, Float f, int i, boolean z2) {
        this.f140222a = str;
        this.f140223b = b791Var;
        this.f140224c = z;
        this.f140225d = f;
        this.f140226e = i;
        this.f140227f = z2;
    }
}
