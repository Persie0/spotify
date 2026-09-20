package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hkt implements xmt {

    /* JADX INFO: renamed from: a */
    public final String f92513a;

    /* JADX INFO: renamed from: b */
    public final String f92514b;

    /* JADX INFO: renamed from: c */
    public final nt81 f92515c;

    /* JADX INFO: renamed from: d */
    public final String f92516d;

    /* JADX INFO: renamed from: e */
    public final String f92517e;

    /* JADX INFO: renamed from: f */
    public final String f92518f;

    /* JADX INFO: renamed from: g */
    public final ern0 f92519g;

    /* JADX INFO: renamed from: h */
    public final String f92520h;

    /* JADX INFO: renamed from: i */
    public final String f92521i;

    public hkt(String str, String str2, nt81 nt81Var, String str3, String str4, String str5, ern0 ern0Var, String str6, String str7) {
        this.f92513a = str;
        this.f92514b = str2;
        this.f92515c = nt81Var;
        this.f92516d = str3;
        this.f92517e = str4;
        this.f92518f = str5;
        this.f92519g = ern0Var;
        this.f92520h = str6;
        this.f92521i = str7;
    }

    /* JADX INFO: renamed from: b */
    public final String m47852b() {
        return this.f92521i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkt)) {
            return false;
        }
        hkt hktVar = (hkt) obj;
        if (!wj50.m88271j(this.f92513a, hktVar.f92513a) || !wj50.m88271j(this.f92514b, hktVar.f92514b) || !wj50.m88271j(this.f92515c, hktVar.f92515c) || !wj50.m88271j(this.f92516d, hktVar.f92516d) || !wj50.m88271j(this.f92517e, hktVar.f92517e) || !wj50.m88271j(this.f92518f, hktVar.f92518f) || !wj50.m88271j(this.f92519g, hktVar.f92519g) || !wj50.m88271j(this.f92520h, hktVar.f92520h)) {
            return false;
        }
        String str = hktVar.f92521i;
        wp6 wp6Var = jvw0.f116535b;
        return wj50.m88271j(this.f92521i, str);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b((this.f92519g.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((this.f92515c.hashCode() + s571.m77243b(this.f92513a.hashCode() * 31, 31, this.f92514b)) * 31, 31, this.f92516d), 31, this.f92517e), 31, this.f92518f)) * 31, 31, this.f92520h);
        wp6 wp6Var = jvw0.f116535b;
        return this.f92521i.hashCode() + iM77243b;
    }
}
