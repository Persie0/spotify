package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zj6 implements dk6 {

    /* JADX INFO: renamed from: a */
    public final String f283368a;

    /* JADX INFO: renamed from: b */
    public final String f283369b;

    /* JADX INFO: renamed from: c */
    public final boolean f283370c;

    /* JADX INFO: renamed from: d */
    public final boolean f283371d;

    /* JADX INFO: renamed from: e */
    public final boolean f283372e;

    /* JADX INFO: renamed from: f */
    public final z650 f283373f;

    public zj6(String str, String str2, boolean z, boolean z2, boolean z3, z650 z650Var) {
        this.f283368a = str;
        this.f283369b = str2;
        this.f283370c = z;
        this.f283371d = z2;
        this.f283372e = z3;
        this.f283373f = z650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj6)) {
            return false;
        }
        zj6 zj6Var = (zj6) obj;
        return wj50.m88271j(this.f283368a, zj6Var.f283368a) && wj50.m88271j(this.f283369b, zj6Var.f283369b) && this.f283370c == zj6Var.f283370c && this.f283371d == zj6Var.f283371d && this.f283372e == zj6Var.f283372e && wj50.m88271j(this.f283373f, zj6Var.f283373f);
    }

    public final int hashCode() {
        return this.f283373f.f279709a.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(this.f283368a.hashCode() * 31, 31, this.f283369b), 31, this.f283370c), 31, this.f283371d), 31, this.f283372e);
    }
}
