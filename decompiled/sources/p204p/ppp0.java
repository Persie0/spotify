package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ppp0 {

    /* JADX INFO: renamed from: a */
    public final String f180090a;

    /* JADX INFO: renamed from: b */
    public final String f180091b;

    /* JADX INFO: renamed from: c */
    public final boolean f180092c;

    /* JADX INFO: renamed from: d */
    public final String f180093d;

    /* JADX INFO: renamed from: e */
    public final lpp0 f180094e;

    public ppp0(String str, String str2, boolean z, String str3, lpp0 lpp0Var) {
        this.f180090a = str;
        this.f180091b = str2;
        this.f180092c = z;
        this.f180093d = str3;
        this.f180094e = lpp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppp0)) {
            return false;
        }
        ppp0 ppp0Var = (ppp0) obj;
        return wj50.m88271j(this.f180090a, ppp0Var.f180090a) && wj50.m88271j(this.f180091b, ppp0Var.f180091b) && this.f180092c == ppp0Var.f180092c && wj50.m88271j(this.f180093d, ppp0Var.f180093d) && wj50.m88271j(this.f180094e, ppp0Var.f180094e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(this.f180090a.hashCode() * 31, 31, this.f180091b), 31, this.f180092c);
        String str = this.f180093d;
        int iHashCode = (iM77245d + (str == null ? 0 : str.hashCode())) * 31;
        lpp0 lpp0Var = this.f180094e;
        return iHashCode + (lpp0Var != null ? lpp0Var.hashCode() : 0);
    }
}
