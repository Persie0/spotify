package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class et11 {

    /* JADX INFO: renamed from: a */
    public final String f62581a;

    /* JADX INFO: renamed from: b */
    public final String f62582b;

    /* JADX INFO: renamed from: c */
    public final String f62583c;

    /* JADX INFO: renamed from: d */
    public final String f62584d;

    /* JADX INFO: renamed from: e */
    public final String f62585e;

    /* JADX INFO: renamed from: f */
    public final String f62586f;

    /* JADX INFO: renamed from: g */
    public final String f62587g;

    /* JADX INFO: renamed from: h */
    public final String f62588h;

    public et11(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f62581a = str;
        this.f62582b = str2;
        this.f62583c = str3;
        this.f62584d = str4;
        this.f62585e = str5;
        this.f62586f = str6;
        this.f62587g = str7;
        this.f62588h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et11)) {
            return false;
        }
        et11 et11Var = (et11) obj;
        return wj50.m88271j(this.f62581a, et11Var.f62581a) && wj50.m88271j(this.f62582b, et11Var.f62582b) && wj50.m88271j(this.f62583c, et11Var.f62583c) && wj50.m88271j(this.f62584d, et11Var.f62584d) && wj50.m88271j(this.f62585e, et11Var.f62585e) && wj50.m88271j(this.f62586f, et11Var.f62586f) && wj50.m88271j(this.f62587g, et11Var.f62587g) && wj50.m88271j(this.f62588h, et11Var.f62588h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f62581a.hashCode() * 31, 31, this.f62582b), 31, this.f62583c), 31, this.f62584d), 31, this.f62585e);
        String str = this.f62586f;
        int iM77243b2 = s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f62587g);
        String str2 = this.f62588h;
        return iM77243b2 + (str2 != null ? str2.hashCode() : 0);
    }
}
