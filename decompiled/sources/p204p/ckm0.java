package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ckm0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final String f39042a;

    /* JADX INFO: renamed from: b */
    public final String f39043b;

    /* JADX INFO: renamed from: c */
    public final b450 f39044c;

    /* JADX INFO: renamed from: d */
    public final boolean f39045d;

    /* JADX INFO: renamed from: e */
    public final gkm0 f39046e;

    public ckm0(String str, String str2, b450 b450Var, boolean z, gkm0 gkm0Var) {
        this.f39042a = str;
        this.f39043b = str2;
        this.f39044c = b450Var;
        this.f39045d = z;
        this.f39046e = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckm0)) {
            return false;
        }
        ckm0 ckm0Var = (ckm0) obj;
        return wj50.m88271j(this.f39042a, ckm0Var.f39042a) && wj50.m88271j(this.f39043b, ckm0Var.f39043b) && wj50.m88271j(this.f39044c, ckm0Var.f39044c) && this.f39045d == ckm0Var.f39045d && wj50.m88271j(this.f39046e, ckm0Var.f39046e);
    }

    public final int hashCode() {
        return this.f39046e.hashCode() + s571.m77245d(stz0.m79353g(s571.m77243b(this.f39042a.hashCode() * 31, 31, this.f39043b), 31, this.f39044c), 31, this.f39045d);
    }
}
