package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dm31 implements em31 {

    /* JADX INFO: renamed from: a */
    public final String f50415a;

    /* JADX INFO: renamed from: b */
    public final String f50416b;

    /* JADX INFO: renamed from: c */
    public final String f50417c;

    /* JADX INFO: renamed from: d */
    public final String f50418d;

    public dm31(String str, String str2, String str3, String str4) {
        this.f50415a = str;
        this.f50416b = str2;
        this.f50417c = str3;
        this.f50418d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm31)) {
            return false;
        }
        dm31 dm31Var = (dm31) obj;
        return wj50.m88271j(this.f50415a, dm31Var.f50415a) && wj50.m88271j(this.f50416b, dm31Var.f50416b) && wj50.m88271j(this.f50417c, dm31Var.f50417c) && wj50.m88271j(this.f50418d, dm31Var.f50418d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f50415a.hashCode() * 31, 31, this.f50416b);
        String str = this.f50417c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50418d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
