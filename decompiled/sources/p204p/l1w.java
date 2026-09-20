package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class l1w {

    /* JADX INFO: renamed from: a */
    public final String f128810a;

    /* JADX INFO: renamed from: b */
    public final String f128811b;

    /* JADX INFO: renamed from: c */
    public final String f128812c;

    /* JADX INFO: renamed from: d */
    public final String f128813d;

    /* JADX INFO: renamed from: e */
    public final String f128814e;

    /* JADX INFO: renamed from: f */
    public final String f128815f;

    /* JADX INFO: renamed from: g */
    public final String f128816g;

    /* JADX INFO: renamed from: h */
    public final String f128817h;

    /* JADX INFO: renamed from: i */
    public final String f128818i;

    /* JADX INFO: renamed from: j */
    public final int f128819j;

    /* JADX INFO: renamed from: k */
    public final String f128820k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f128821l;

    /* JADX INFO: renamed from: m */
    public final String f128822m;

    /* JADX INFO: renamed from: n */
    public final rcm0 f128823n;

    /* JADX INFO: renamed from: o */
    public final boolean f128824o;

    /* JADX INFO: renamed from: p */
    public final int f128825p;

    /* JADX INFO: renamed from: q */
    public final boolean f128826q;

    /* JADX INFO: renamed from: r */
    public final List f128827r;

    /* JADX INFO: renamed from: s */
    public final boolean f128828s;

    /* JADX INFO: renamed from: t */
    public final String f128829t;

    /* JADX INFO: renamed from: u */
    public final Integer f128830u;

    /* JADX INFO: renamed from: v */
    public final String f128831v;

    public l1w(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, ArrayList arrayList, String str11, rcm0 rcm0Var, boolean z, int i2, boolean z2, List list, boolean z3, String str12, Integer num, String str13) {
        this.f128810a = str;
        this.f128811b = str2;
        this.f128812c = str3;
        this.f128813d = str4;
        this.f128814e = str5;
        this.f128815f = str6;
        this.f128816g = str7;
        this.f128817h = str8;
        this.f128818i = str9;
        this.f128819j = i;
        this.f128820k = str10;
        this.f128821l = arrayList;
        this.f128822m = str11;
        this.f128823n = rcm0Var;
        this.f128824o = z;
        this.f128825p = i2;
        this.f128826q = z2;
        this.f128827r = list;
        this.f128828s = z3;
        this.f128829t = str12;
        this.f128830u = num;
        this.f128831v = str13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1w)) {
            return false;
        }
        l1w l1wVar = (l1w) obj;
        return wj50.m88271j(this.f128810a, l1wVar.f128810a) && wj50.m88271j(this.f128811b, l1wVar.f128811b) && wj50.m88271j(this.f128812c, l1wVar.f128812c) && wj50.m88271j(this.f128813d, l1wVar.f128813d) && wj50.m88271j(this.f128814e, l1wVar.f128814e) && wj50.m88271j(this.f128815f, l1wVar.f128815f) && wj50.m88271j(this.f128816g, l1wVar.f128816g) && wj50.m88271j(this.f128817h, l1wVar.f128817h) && wj50.m88271j(this.f128818i, l1wVar.f128818i) && this.f128819j == l1wVar.f128819j && wj50.m88271j(this.f128820k, l1wVar.f128820k) && this.f128821l.equals(l1wVar.f128821l) && wj50.m88271j(this.f128822m, l1wVar.f128822m) && this.f128823n.equals(l1wVar.f128823n) && this.f128824o == l1wVar.f128824o && this.f128825p == l1wVar.f128825p && this.f128826q == l1wVar.f128826q && this.f128827r.equals(l1wVar.f128827r) && this.f128828s == l1wVar.f128828s && this.f128829t.equals(l1wVar.f128829t) && wj50.m88271j(this.f128830u, l1wVar.f128830u) && wj50.m88271j(this.f128831v, l1wVar.f128831v);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f128810a.hashCode() * 31, 31, this.f128811b), 31, this.f128812c), 31, this.f128813d), 31, this.f128814e), 31, this.f128815f);
        String str = this.f128816g;
        int iM77243b2 = s571.m77243b(s571.m77245d(s571.m77244c(s571.m77245d(mt60.m62800g(this.f128825p, s571.m77245d(yds.m93483m(this.f128823n, s571.m77243b(lq51.m59700f(this.f128821l, s571.m77243b(f710.m40938f(this.f128819j, s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f128817h), 31, this.f128818i), 31), 31, this.f128820k), 31), 31, this.f128822m), 31), 31, this.f128824o), 31), 31, this.f128826q), 31, this.f128827r), 31, this.f128828s), 31, this.f128829t);
        Integer num = this.f128830u;
        int iHashCode = (iM77243b2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f128831v;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
