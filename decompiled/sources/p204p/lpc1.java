package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lpc1 {

    /* JADX INFO: renamed from: a */
    public final zzl0 f135731a;

    /* JADX INFO: renamed from: b */
    public final Float f135732b;

    /* JADX INFO: renamed from: c */
    public final String f135733c;

    /* JADX INFO: renamed from: d */
    public final String f135734d;

    /* JADX INFO: renamed from: e */
    public final mpc1 f135735e;

    public lpc1(zzl0 zzl0Var, Float f, String str, String str2) {
        this.f135731a = zzl0Var;
        this.f135732b = f;
        this.f135733c = str;
        this.f135734d = str2;
        this.f135735e = new mpc1(!zzl0Var.equals(xzl0.f267718a), f != null, str != null, str2 != null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpc1)) {
            return false;
        }
        lpc1 lpc1Var = (lpc1) obj;
        return wj50.m88271j(this.f135731a, lpc1Var.f135731a) && wj50.m88271j(this.f135732b, lpc1Var.f135732b) && wj50.m88271j(this.f135733c, lpc1Var.f135733c) && wj50.m88271j(this.f135734d, lpc1Var.f135734d);
    }

    public final int hashCode() {
        int iHashCode = this.f135731a.hashCode() * 31;
        Float f = this.f135732b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.f135733c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f135734d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
