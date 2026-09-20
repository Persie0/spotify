package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class r1d1 {

    /* JADX INFO: renamed from: a */
    public final String f194827a;

    /* JADX INFO: renamed from: b */
    public final String f194828b;

    /* JADX INFO: renamed from: c */
    public final String f194829c;

    /* JADX INFO: renamed from: d */
    public final String f194830d;

    /* JADX INFO: renamed from: e */
    public final boolean f194831e;

    public r1d1(String str, String str2, String str3, String str4, boolean z) {
        this.f194827a = str;
        this.f194828b = str2;
        this.f194829c = str3;
        this.f194830d = str4;
        this.f194831e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1d1)) {
            return false;
        }
        r1d1 r1d1Var = (r1d1) obj;
        return wj50.m88271j(this.f194827a, r1d1Var.f194827a) && wj50.m88271j(this.f194828b, r1d1Var.f194828b) && wj50.m88271j(this.f194829c, r1d1Var.f194829c) && wj50.m88271j(this.f194830d, r1d1Var.f194830d) && this.f194831e == r1d1Var.f194831e;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f194827a.hashCode() * 31, 31, this.f194828b), 31, this.f194829c);
        String str = this.f194830d;
        return Boolean.hashCode(this.f194831e) + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }
}
