package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dq2 {

    /* JADX INFO: renamed from: a */
    public final String f51793a;

    /* JADX INFO: renamed from: b */
    public final String f51794b;

    /* JADX INFO: renamed from: c */
    public final h6z0 f51795c;

    /* JADX INFO: renamed from: d */
    public final h6z0 f51796d;

    /* JADX INFO: renamed from: e */
    public final String f51797e;

    public dq2(String str, String str2, h6z0 h6z0Var, h6z0 h6z0Var2, String str3) {
        this.f51793a = str;
        this.f51794b = str2;
        this.f51795c = h6z0Var;
        this.f51796d = h6z0Var2;
        this.f51797e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq2)) {
            return false;
        }
        dq2 dq2Var = (dq2) obj;
        return wj50.m88271j(this.f51793a, dq2Var.f51793a) && wj50.m88271j(this.f51794b, dq2Var.f51794b) && wj50.m88271j(this.f51795c, dq2Var.f51795c) && wj50.m88271j(this.f51796d, dq2Var.f51796d) && wj50.m88271j(this.f51797e, dq2Var.f51797e);
    }

    public final int hashCode() {
        int iHashCode = (this.f51795c.hashCode() + s571.m77243b(this.f51793a.hashCode() * 31, 31, this.f51794b)) * 31;
        h6z0 h6z0Var = this.f51796d;
        int iHashCode2 = (iHashCode + (h6z0Var == null ? 0 : h6z0Var.hashCode())) * 31;
        String str = this.f51797e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
