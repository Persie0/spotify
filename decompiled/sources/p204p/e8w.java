package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class e8w {

    /* JADX INFO: renamed from: a */
    public final String f57284a;

    /* JADX INFO: renamed from: b */
    public final String f57285b;

    /* JADX INFO: renamed from: c */
    public final String f57286c;

    /* JADX INFO: renamed from: d */
    public final String f57287d;

    /* JADX INFO: renamed from: e */
    public final String f57288e;

    /* JADX INFO: renamed from: f */
    public final String f57289f;

    /* JADX INFO: renamed from: g */
    public final int f57290g;

    /* JADX INFO: renamed from: h */
    public final rcm0 f57291h;

    /* JADX INFO: renamed from: i */
    public final String f57292i;

    /* JADX INFO: renamed from: j */
    public final String f57293j;

    /* JADX INFO: renamed from: k */
    public final boolean f57294k;

    /* JADX INFO: renamed from: l */
    public final List f57295l;

    /* JADX INFO: renamed from: m */
    public final boolean f57296m;

    /* JADX INFO: renamed from: n */
    public final String f57297n;

    public e8w(String str, String str2, String str3, String str4, String str5, String str6, int i, rcm0 rcm0Var, String str7, String str8, boolean z, List list, boolean z2, String str9) {
        this.f57284a = str;
        this.f57285b = str2;
        this.f57286c = str3;
        this.f57287d = str4;
        this.f57288e = str5;
        this.f57289f = str6;
        this.f57290g = i;
        this.f57291h = rcm0Var;
        this.f57292i = str7;
        this.f57293j = str8;
        this.f57294k = z;
        this.f57295l = list;
        this.f57296m = z2;
        this.f57297n = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8w)) {
            return false;
        }
        e8w e8wVar = (e8w) obj;
        return wj50.m88271j(this.f57284a, e8wVar.f57284a) && wj50.m88271j(this.f57285b, e8wVar.f57285b) && wj50.m88271j(this.f57286c, e8wVar.f57286c) && wj50.m88271j(this.f57287d, e8wVar.f57287d) && wj50.m88271j(this.f57288e, e8wVar.f57288e) && wj50.m88271j(this.f57289f, e8wVar.f57289f) && this.f57290g == e8wVar.f57290g && this.f57291h.equals(e8wVar.f57291h) && wj50.m88271j(this.f57292i, e8wVar.f57292i) && this.f57293j.equals(e8wVar.f57293j) && this.f57294k == e8wVar.f57294k && this.f57295l.equals(e8wVar.f57295l) && this.f57296m == e8wVar.f57296m && this.f57297n.equals(e8wVar.f57297n);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f57284a.hashCode() * 31, 31, this.f57285b), 31, this.f57286c), 31, this.f57287d), 31, this.f57288e);
        String str = this.f57289f;
        return this.f57297n.hashCode() + s571.m77245d(s571.m77244c(s571.m77245d(s571.m77243b(s571.m77243b(yds.m93483m(this.f57291h, f710.m40938f(this.f57290g, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f57292i), 31, this.f57293j), 31, this.f57294k), 31, this.f57295l), 31, this.f57296m);
    }
}
