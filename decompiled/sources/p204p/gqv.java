package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class gqv {

    /* JADX INFO: renamed from: a */
    public final String f83534a;

    /* JADX INFO: renamed from: b */
    public final String f83535b;

    /* JADX INFO: renamed from: c */
    public final mgz0 f83536c;

    /* JADX INFO: renamed from: d */
    public final String f83537d;

    /* JADX INFO: renamed from: e */
    public final mgz0 f83538e;

    /* JADX INFO: renamed from: f */
    public final String f83539f;

    /* JADX INFO: renamed from: g */
    public final String f83540g;

    /* JADX INFO: renamed from: h */
    public final String f83541h;

    /* JADX INFO: renamed from: i */
    public final String f83542i;

    /* JADX INFO: renamed from: j */
    public final String f83543j;

    /* JADX INFO: renamed from: k */
    public final String f83544k;

    /* JADX INFO: renamed from: l */
    public final String f83545l;

    /* JADX INFO: renamed from: m */
    public final String f83546m;

    /* JADX INFO: renamed from: n */
    public final boolean f83547n;

    /* JADX INFO: renamed from: o */
    public final int f83548o;

    /* JADX INFO: renamed from: p */
    public final boolean f83549p;

    /* JADX INFO: renamed from: q */
    public final drj0 f83550q;

    /* JADX INFO: renamed from: r */
    public final Object f83551r;

    /* JADX INFO: renamed from: s */
    public final int f83552s;

    public gqv(String str, String str2, mgz0 mgz0Var, String str3, mgz0 mgz0Var2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, int i, boolean z2, drj0 drj0Var, List list, int i2) {
        this.f83534a = str;
        this.f83535b = str2;
        this.f83536c = mgz0Var;
        this.f83537d = str3;
        this.f83538e = mgz0Var2;
        this.f83539f = str4;
        this.f83540g = str5;
        this.f83541h = str6;
        this.f83542i = str7;
        this.f83543j = str8;
        this.f83544k = str9;
        this.f83545l = str10;
        this.f83546m = str11;
        this.f83547n = z;
        this.f83548o = i;
        this.f83549p = z2;
        this.f83550q = drj0Var;
        this.f83551r = list;
        this.f83552s = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqv)) {
            return false;
        }
        gqv gqvVar = (gqv) obj;
        return this.f83534a.equals(gqvVar.f83534a) && this.f83535b.equals(gqvVar.f83535b) && wj50.m88271j(this.f83536c, gqvVar.f83536c) && this.f83537d.equals(gqvVar.f83537d) && wj50.m88271j(this.f83538e, gqvVar.f83538e) && this.f83539f.equals(gqvVar.f83539f) && this.f83540g.equals(gqvVar.f83540g) && this.f83541h.equals(gqvVar.f83541h) && this.f83542i.equals(gqvVar.f83542i) && wj50.m88271j(this.f83543j, gqvVar.f83543j) && wj50.m88271j(this.f83544k, gqvVar.f83544k) && wj50.m88271j(this.f83545l, gqvVar.f83545l) && wj50.m88271j(this.f83546m, gqvVar.f83546m) && this.f83547n == gqvVar.f83547n && this.f83548o == gqvVar.f83548o && this.f83549p == gqvVar.f83549p && wj50.m88271j(this.f83550q, gqvVar.f83550q) && this.f83551r.equals(gqvVar.f83551r) && this.f83552s == gqvVar.f83552s;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f83534a.hashCode() * 31, 31, this.f83535b);
        mgz0 mgz0Var = this.f83536c;
        int iM77243b2 = s571.m77243b((iM77243b + (mgz0Var == null ? 0 : mgz0Var.hashCode())) * 31, 31, this.f83537d);
        mgz0 mgz0Var2 = this.f83538e;
        int iM77243b3 = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((iM77243b2 + (mgz0Var2 == null ? 0 : mgz0Var2.hashCode())) * 31, 31, this.f83539f), 31, this.f83540g), 31, this.f83541h), 31, this.f83542i);
        String str = this.f83543j;
        int iHashCode = (iM77243b3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83544k;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f83545l;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f83546m;
        int iM77245d = s571.m77245d(f710.m40938f(this.f83548o, s571.m77245d((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f83547n), 31), 31, this.f83549p);
        drj0 drj0Var = this.f83550q;
        int iM36604d = dq60.m36604d((iM77245d + (drj0Var == null ? 0 : drj0Var.hashCode())) * 31, 31, this.f83551r);
        int i = this.f83552s;
        return iM36604d + (i != 0 ? edb.m38547C(i) : 0);
    }
}
