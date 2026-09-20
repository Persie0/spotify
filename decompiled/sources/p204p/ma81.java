package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ma81 {

    /* JADX INFO: renamed from: a */
    public final String f141499a;

    /* JADX INFO: renamed from: b */
    public final String f141500b;

    /* JADX INFO: renamed from: c */
    public final String f141501c;

    public ma81(String str, String str2, String str3) {
        this.f141499a = str;
        this.f141500b = str2;
        this.f141501c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma81)) {
            return false;
        }
        ma81 ma81Var = (ma81) obj;
        return wj50.m88271j(this.f141499a, ma81Var.f141499a) && wj50.m88271j(this.f141500b, ma81Var.f141500b) && wj50.m88271j(this.f141501c, ma81Var.f141501c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f141499a.hashCode() * 31, 31, this.f141500b);
        String str = this.f141501c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
