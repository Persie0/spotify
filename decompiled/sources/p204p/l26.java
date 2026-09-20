package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class l26 {

    /* JADX INFO: renamed from: a */
    public final String f128929a;

    /* JADX INFO: renamed from: b */
    public final String f128930b;

    /* JADX INFO: renamed from: c */
    public final String f128931c;

    public l26(String str, String str2, String str3) {
        this.f128929a = str;
        this.f128930b = str2;
        this.f128931c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l26)) {
            return false;
        }
        l26 l26Var = (l26) obj;
        return wj50.m88271j(this.f128929a, l26Var.f128929a) && wj50.m88271j(this.f128930b, l26Var.f128930b) && wj50.m88271j(this.f128931c, l26Var.f128931c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f128929a.hashCode() * 31, 31, this.f128930b);
        String str = this.f128931c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
