package p204p;

/* JADX INFO: renamed from: p.xx */
/* JADX INFO: loaded from: classes6.dex */
public final class C2592xx {

    /* JADX INFO: renamed from: a */
    public final String f266772a;

    /* JADX INFO: renamed from: b */
    public final String f266773b;

    /* JADX INFO: renamed from: c */
    public final String f266774c;

    /* JADX INFO: renamed from: d */
    public final String f266775d;

    /* JADX INFO: renamed from: e */
    public final String f266776e;

    /* JADX INFO: renamed from: f */
    public final String f266777f;

    /* JADX INFO: renamed from: g */
    public final boolean f266778g;

    /* JADX INFO: renamed from: h */
    public final boolean f266779h;

    /* JADX INFO: renamed from: i */
    public final boolean f266780i;

    public C2592xx(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        this.f266772a = str;
        this.f266773b = str2;
        this.f266774c = str3;
        this.f266775d = str4;
        this.f266776e = str5;
        this.f266777f = str6;
        this.f266778g = z;
        this.f266779h = z2;
        this.f266780i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2592xx)) {
            return false;
        }
        C2592xx c2592xx = (C2592xx) obj;
        return wj50.m88271j(this.f266772a, c2592xx.f266772a) && wj50.m88271j(this.f266773b, c2592xx.f266773b) && wj50.m88271j(this.f266774c, c2592xx.f266774c) && wj50.m88271j(this.f266775d, c2592xx.f266775d) && wj50.m88271j(this.f266776e, c2592xx.f266776e) && wj50.m88271j(this.f266777f, c2592xx.f266777f) && this.f266778g == c2592xx.f266778g && this.f266779h == c2592xx.f266779h && this.f266780i == c2592xx.f266780i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f266780i) + s571.m77245d(s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f266772a.hashCode() * 31, 31, this.f266773b), 31, this.f266774c), 31, this.f266775d), 31, this.f266776e), 31, this.f266777f), 31, this.f266778g), 31, this.f266779h);
    }
}
