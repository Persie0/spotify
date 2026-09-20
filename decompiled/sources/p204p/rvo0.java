package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rvo0 implements cwo0 {

    /* JADX INFO: renamed from: a */
    public final String f203110a;

    /* JADX INFO: renamed from: b */
    public final String f203111b;

    /* JADX INFO: renamed from: c */
    public final String f203112c;

    /* JADX INFO: renamed from: d */
    public final int f203113d;

    /* JADX INFO: renamed from: e */
    public final boolean f203114e;

    public rvo0(int i, String str, String str2, boolean z, String str3) {
        this.f203110a = str;
        this.f203111b = str2;
        this.f203112c = str3;
        this.f203113d = i;
        this.f203114e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvo0)) {
            return false;
        }
        rvo0 rvo0Var = (rvo0) obj;
        return wj50.m88271j(this.f203110a, rvo0Var.f203110a) && wj50.m88271j(this.f203111b, rvo0Var.f203111b) && wj50.m88271j(this.f203112c, rvo0Var.f203112c) && this.f203113d == rvo0Var.f203113d && this.f203114e == rvo0Var.f203114e;
    }

    public final int hashCode() {
        int iHashCode = this.f203110a.hashCode() * 31;
        String str = this.f203111b;
        return Boolean.hashCode(this.f203114e) + f710.m40938f(this.f203113d, s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f203112c), 31);
    }
}
