package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f3i {

    /* JADX INFO: renamed from: a */
    public final String f65506a;

    /* JADX INFO: renamed from: b */
    public final String f65507b;

    /* JADX INFO: renamed from: c */
    public final String f65508c;

    /* JADX INFO: renamed from: d */
    public final String f65509d;

    /* JADX INFO: renamed from: e */
    public final String f65510e;

    /* JADX INFO: renamed from: f */
    public final String f65511f;

    /* JADX INFO: renamed from: g */
    public final boolean f65512g;

    /* JADX INFO: renamed from: h */
    public final String f65513h;

    /* JADX INFO: renamed from: i */
    public final rcm0 f65514i;

    public f3i(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, rcm0 rcm0Var) {
        this.f65506a = str;
        this.f65507b = str2;
        this.f65508c = str3;
        this.f65509d = str4;
        this.f65510e = str5;
        this.f65511f = str6;
        this.f65512g = z;
        this.f65513h = str7;
        this.f65514i = rcm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3i)) {
            return false;
        }
        f3i f3iVar = (f3i) obj;
        return wj50.m88271j(this.f65506a, f3iVar.f65506a) && wj50.m88271j(this.f65507b, f3iVar.f65507b) && wj50.m88271j(this.f65508c, f3iVar.f65508c) && wj50.m88271j(this.f65509d, f3iVar.f65509d) && wj50.m88271j(this.f65510e, f3iVar.f65510e) && wj50.m88271j(this.f65511f, f3iVar.f65511f) && this.f65512g == f3iVar.f65512g && wj50.m88271j(this.f65513h, f3iVar.f65513h) && this.f65514i.equals(f3iVar.f65514i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f65506a.hashCode() * 31, 31, this.f65507b);
        String str = this.f65508c;
        return this.f65514i.hashCode() + s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f65509d), 31, this.f65510e), 31, this.f65511f), 31, true), 31, this.f65512g), 31, false), 31, this.f65513h);
    }
}
