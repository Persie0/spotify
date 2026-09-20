package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ch3 {

    /* JADX INFO: renamed from: a */
    public final String f37884a;

    /* JADX INFO: renamed from: b */
    public final String f37885b;

    /* JADX INFO: renamed from: c */
    public final String f37886c;

    public ch3(String str, String str2, String str3) {
        this.f37884a = str;
        this.f37885b = str2;
        this.f37886c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch3)) {
            return false;
        }
        ch3 ch3Var = (ch3) obj;
        return wj50.m88271j(this.f37884a, ch3Var.f37884a) && wj50.m88271j(this.f37885b, ch3Var.f37885b) && wj50.m88271j(this.f37886c, ch3Var.f37886c);
    }

    public final int hashCode() {
        String str = this.f37884a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f37885b);
        String str2 = this.f37886c;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }
}
