package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g8e0 {

    /* JADX INFO: renamed from: a */
    public final String f77467a;

    /* JADX INFO: renamed from: b */
    public final String f77468b;

    /* JADX INFO: renamed from: c */
    public final String f77469c;

    /* JADX INFO: renamed from: d */
    public final String f77470d;

    public g8e0(String str, String str2, String str3, String str4) {
        this.f77467a = str;
        this.f77468b = str2;
        this.f77469c = str3;
        this.f77470d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8e0)) {
            return false;
        }
        g8e0 g8e0Var = (g8e0) obj;
        return wj50.m88271j(this.f77467a, g8e0Var.f77467a) && wj50.m88271j(this.f77468b, g8e0Var.f77468b) && wj50.m88271j(this.f77469c, g8e0Var.f77469c) && wj50.m88271j(this.f77470d, g8e0Var.f77470d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f77467a.hashCode() * 31, 31, this.f77468b);
        String str = this.f77469c;
        return this.f77470d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
