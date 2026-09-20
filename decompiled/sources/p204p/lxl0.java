package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lxl0 {

    /* JADX INFO: renamed from: a */
    public final ayl0 f137836a;

    /* JADX INFO: renamed from: b */
    public final qfb f137837b;

    /* JADX INFO: renamed from: c */
    public final boolean f137838c;

    /* JADX INFO: renamed from: d */
    public final boolean f137839d;

    public lxl0(ayl0 ayl0Var, qfb qfbVar, boolean z, boolean z2) {
        this.f137836a = ayl0Var;
        this.f137837b = qfbVar;
        this.f137838c = z;
        this.f137839d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxl0)) {
            return false;
        }
        lxl0 lxl0Var = (lxl0) obj;
        return wj50.m88271j(this.f137836a, lxl0Var.f137836a) && wj50.m88271j(this.f137837b, lxl0Var.f137837b) && this.f137838c == lxl0Var.f137838c && this.f137839d == lxl0Var.f137839d;
    }

    public final int hashCode() {
        int iHashCode = this.f137836a.hashCode() * 31;
        qfb qfbVar = this.f137837b;
        return Boolean.hashCode(this.f137839d) + s571.m77245d((iHashCode + (qfbVar == null ? 0 : qfbVar.hashCode())) * 31, 31, this.f137838c);
    }
}
