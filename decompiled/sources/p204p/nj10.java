package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nj10 {

    /* JADX INFO: renamed from: a */
    public final String f154415a;

    /* JADX INFO: renamed from: b */
    public final String f154416b;

    /* JADX INFO: renamed from: c */
    public final boolean f154417c;

    /* JADX INFO: renamed from: d */
    public final String f154418d;

    public nj10(String str, String str2, boolean z, String str3) {
        this.f154415a = str;
        this.f154416b = str2;
        this.f154417c = z;
        this.f154418d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nj10)) {
            return false;
        }
        nj10 nj10Var = (nj10) obj;
        return wj50.m88271j(this.f154415a, nj10Var.f154415a) && wj50.m88271j(this.f154416b, nj10Var.f154416b) && this.f154417c == nj10Var.f154417c && wj50.m88271j(this.f154418d, nj10Var.f154418d);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(this.f154415a.hashCode() * 31, 31, this.f154416b), 31, this.f154417c);
        String str = this.f154418d;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
