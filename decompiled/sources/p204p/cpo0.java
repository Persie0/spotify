package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class cpo0 {

    /* JADX INFO: renamed from: a */
    public final String f40583a;

    /* JADX INFO: renamed from: b */
    public final boolean f40584b;

    /* JADX INFO: renamed from: c */
    public final gpo0 f40585c;

    /* JADX INFO: renamed from: d */
    public final boolean f40586d;

    /* JADX INFO: renamed from: e */
    public final zhe f40587e;

    /* JADX INFO: renamed from: f */
    public final boolean f40588f;

    public cpo0(String str, boolean z, gpo0 gpo0Var, boolean z2, zhe zheVar, boolean z3) {
        this.f40583a = str;
        this.f40584b = z;
        this.f40585c = gpo0Var;
        this.f40586d = z2;
        this.f40587e = zheVar;
        this.f40588f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpo0)) {
            return false;
        }
        cpo0 cpo0Var = (cpo0) obj;
        return wj50.m88271j(this.f40583a, cpo0Var.f40583a) && this.f40584b == cpo0Var.f40584b && wj50.m88271j(this.f40585c, cpo0Var.f40585c) && this.f40586d == cpo0Var.f40586d && wj50.m88271j(this.f40587e, cpo0Var.f40587e) && this.f40588f == cpo0Var.f40588f;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f40585c.hashCode() + s571.m77245d(this.f40583a.hashCode() * 31, 31, this.f40584b)) * 31, 31, this.f40586d);
        zhe zheVar = this.f40587e;
        return Boolean.hashCode(this.f40588f) + ((iM77245d + (zheVar == null ? 0 : Integer.hashCode(zheVar.f282900a))) * 31);
    }

    public /* synthetic */ cpo0(String str, boolean z, gpo0 gpo0Var, int i) {
        this(str, z, (i & 4) != 0 ? dpo0.f51377a : gpo0Var, (i & 8) != 0, null, false);
    }
}
