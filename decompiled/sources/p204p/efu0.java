package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class efu0 implements hfu0 {

    /* JADX INFO: renamed from: a */
    public final String f59124a;

    /* JADX INFO: renamed from: b */
    public final boolean f59125b;

    /* JADX INFO: renamed from: c */
    public final boolean f59126c;

    /* JADX INFO: renamed from: d */
    public final dfu0 f59127d;

    /* JADX INFO: renamed from: e */
    public final String f59128e;

    /* JADX INFO: renamed from: f */
    public final String f59129f;

    /* JADX INFO: renamed from: g */
    public final weu0 f59130g;

    public efu0(String str, boolean z, boolean z2, dfu0 dfu0Var, String str2, String str3, weu0 weu0Var) {
        this.f59124a = str;
        this.f59125b = z;
        this.f59126c = z2;
        this.f59127d = dfu0Var;
        this.f59128e = str2;
        this.f59129f = str3;
        this.f59130g = weu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efu0)) {
            return false;
        }
        efu0 efu0Var = (efu0) obj;
        return wj50.m88271j(this.f59124a, efu0Var.f59124a) && this.f59125b == efu0Var.f59125b && this.f59126c == efu0Var.f59126c && wj50.m88271j(this.f59127d, efu0Var.f59127d) && wj50.m88271j(this.f59128e, efu0Var.f59128e) && wj50.m88271j(this.f59129f, efu0Var.f59129f) && wj50.m88271j(this.f59130g, efu0Var.f59130g);
    }

    public final int hashCode() {
        return this.f59130g.hashCode() + s571.m77243b(s571.m77243b((this.f59127d.hashCode() + s571.m77245d(s571.m77245d(this.f59124a.hashCode() * 31, 31, this.f59125b), 31, this.f59126c)) * 31, 31, this.f59128e), 31, this.f59129f);
    }
}
