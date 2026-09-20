package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d1w0 {

    /* JADX INFO: renamed from: a */
    public final String f44370a;

    /* JADX INFO: renamed from: b */
    public final String f44371b;

    /* JADX INFO: renamed from: c */
    public final String f44372c;

    public d1w0(String str, String str2, String str3) {
        this.f44370a = str;
        this.f44371b = str2;
        this.f44372c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1w0)) {
            return false;
        }
        d1w0 d1w0Var = (d1w0) obj;
        return wj50.m88271j(this.f44370a, d1w0Var.f44370a) && wj50.m88271j(this.f44371b, d1w0Var.f44371b) && wj50.m88271j(this.f44372c, d1w0Var.f44372c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f44370a.hashCode() * 31, 31, this.f44371b);
        String str = this.f44372c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
