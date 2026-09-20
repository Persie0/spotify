package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class k1j0 {

    /* JADX INFO: renamed from: a */
    public final String f118360a;

    /* JADX INFO: renamed from: b */
    public final String f118361b;

    /* JADX INFO: renamed from: c */
    public final String f118362c;

    /* JADX INFO: renamed from: d */
    public final int f118363d;

    /* JADX INFO: renamed from: e */
    public final boolean f118364e;

    /* JADX INFO: renamed from: f */
    public final boolean f118365f;

    /* JADX INFO: renamed from: g */
    public final boolean f118366g;

    public k1j0(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.f118360a = str;
        this.f118361b = str2;
        this.f118362c = str3;
        this.f118363d = i;
        this.f118364e = z;
        this.f118365f = z2;
        this.f118366g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1j0)) {
            return false;
        }
        k1j0 k1j0Var = (k1j0) obj;
        return wj50.m88271j(this.f118360a, k1j0Var.f118360a) && wj50.m88271j(this.f118361b, k1j0Var.f118361b) && wj50.m88271j(this.f118362c, k1j0Var.f118362c) && this.f118363d == k1j0Var.f118363d && this.f118364e == k1j0Var.f118364e && this.f118365f == k1j0Var.f118365f && this.f118366g == k1j0Var.f118366g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f118360a.hashCode() * 31, 31, this.f118361b);
        String str = this.f118362c;
        return Boolean.hashCode(this.f118366g) + s571.m77245d(s571.m77245d(mt60.m62800g(this.f118363d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f118364e), 31, this.f118365f);
    }
}
