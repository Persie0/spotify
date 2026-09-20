package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cp81 {

    /* JADX INFO: renamed from: a */
    public final String f40495a;

    /* JADX INFO: renamed from: b */
    public final String f40496b;

    /* JADX INFO: renamed from: c */
    public final String f40497c;

    /* JADX INFO: renamed from: d */
    public final lp81 f40498d;

    /* JADX INFO: renamed from: e */
    public final String f40499e;

    public cp81(String str, String str2, String str3, lp81 lp81Var, String str4, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        lp81Var = (i & 8) != 0 ? kp81.f125011a : lp81Var;
        this.f40495a = str;
        this.f40496b = str2;
        this.f40497c = str3;
        this.f40498d = lp81Var;
        this.f40499e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp81)) {
            return false;
        }
        cp81 cp81Var = (cp81) obj;
        return wj50.m88271j(this.f40495a, cp81Var.f40495a) && wj50.m88271j(this.f40496b, cp81Var.f40496b) && wj50.m88271j(this.f40497c, cp81Var.f40497c) && wj50.m88271j(this.f40498d, cp81Var.f40498d) && wj50.m88271j(this.f40499e, cp81Var.f40499e);
    }

    public final int hashCode() {
        int iHashCode = this.f40495a.hashCode() * 31;
        String str = this.f40496b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f40497c;
        return this.f40499e.hashCode() + ((this.f40498d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
