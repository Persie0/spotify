package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r8b1 {

    /* JADX INFO: renamed from: a */
    public final String f196759a;

    /* JADX INFO: renamed from: b */
    public final String f196760b;

    /* JADX INFO: renamed from: c */
    public final String f196761c;

    public r8b1(String str, String str2, String str3) {
        this.f196759a = str;
        this.f196760b = str2;
        this.f196761c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8b1)) {
            return false;
        }
        r8b1 r8b1Var = (r8b1) obj;
        return wj50.m88271j(this.f196759a, r8b1Var.f196759a) && wj50.m88271j(this.f196760b, r8b1Var.f196760b) && wj50.m88271j(this.f196761c, r8b1Var.f196761c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f196759a.hashCode() * 31, 31, this.f196760b);
        String str = this.f196761c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
