package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xxs0 implements ays0 {

    /* JADX INFO: renamed from: a */
    public final String f267059a;

    /* JADX INFO: renamed from: b */
    public final String f267060b;

    /* JADX INFO: renamed from: c */
    public final String f267061c;

    /* JADX INFO: renamed from: d */
    public final String f267062d;

    /* JADX INFO: renamed from: e */
    public final String f267063e;

    public xxs0(String str, String str2, String str3, String str4, String str5) {
        this.f267059a = str;
        this.f267060b = str2;
        this.f267061c = str3;
        this.f267062d = str4;
        this.f267063e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxs0)) {
            return false;
        }
        xxs0 xxs0Var = (xxs0) obj;
        return wj50.m88271j(this.f267059a, xxs0Var.f267059a) && wj50.m88271j(this.f267060b, xxs0Var.f267060b) && wj50.m88271j(this.f267061c, xxs0Var.f267061c) && wj50.m88271j(this.f267062d, xxs0Var.f267062d) && wj50.m88271j(this.f267063e, xxs0Var.f267063e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f267059a.hashCode() * 31, 31, this.f267060b), 31, this.f267061c), 31, this.f267062d);
        String str = this.f267063e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
