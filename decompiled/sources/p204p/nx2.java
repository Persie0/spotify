package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class nx2 {

    /* JADX INFO: renamed from: a */
    public final String f159323a;

    /* JADX INFO: renamed from: b */
    public final String f159324b;

    /* JADX INFO: renamed from: c */
    public final String f159325c;

    /* JADX INFO: renamed from: d */
    public final String f159326d;

    /* JADX INFO: renamed from: e */
    public final String f159327e;

    /* JADX INFO: renamed from: f */
    public final String f159328f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f159329g;

    /* JADX INFO: renamed from: h */
    public final is9 f159330h;

    /* JADX INFO: renamed from: i */
    public final String f159331i;

    /* JADX INFO: renamed from: j */
    public final rcm0 f159332j;

    /* JADX INFO: renamed from: k */
    public final int f159333k;

    /* JADX INFO: renamed from: l */
    public final boolean f159334l;

    /* JADX INFO: renamed from: m */
    public final int f159335m;

    /* JADX INFO: renamed from: n */
    public final String f159336n;

    /* JADX INFO: renamed from: o */
    public final Integer f159337o;

    /* JADX INFO: renamed from: p */
    public final String f159338p;

    public nx2(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, is9 is9Var, String str7, rcm0 rcm0Var, int i, boolean z, int i2, String str8, Integer num, String str9) {
        this.f159323a = str;
        this.f159324b = str2;
        this.f159325c = str3;
        this.f159326d = str4;
        this.f159327e = str5;
        this.f159328f = str6;
        this.f159329g = arrayList;
        this.f159330h = is9Var;
        this.f159331i = str7;
        this.f159332j = rcm0Var;
        this.f159333k = i;
        this.f159334l = z;
        this.f159335m = i2;
        this.f159336n = str8;
        this.f159337o = num;
        this.f159338p = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx2)) {
            return false;
        }
        nx2 nx2Var = (nx2) obj;
        return wj50.m88271j(this.f159323a, nx2Var.f159323a) && wj50.m88271j(this.f159324b, nx2Var.f159324b) && wj50.m88271j(this.f159325c, nx2Var.f159325c) && wj50.m88271j(this.f159326d, nx2Var.f159326d) && wj50.m88271j(this.f159327e, nx2Var.f159327e) && wj50.m88271j(this.f159328f, nx2Var.f159328f) && this.f159329g.equals(nx2Var.f159329g) && this.f159330h.equals(nx2Var.f159330h) && wj50.m88271j(this.f159331i, nx2Var.f159331i) && this.f159332j.equals(nx2Var.f159332j) && this.f159333k == nx2Var.f159333k && this.f159334l == nx2Var.f159334l && this.f159335m == nx2Var.f159335m && wj50.m88271j(this.f159336n, nx2Var.f159336n) && wj50.m88271j(this.f159337o, nx2Var.f159337o) && wj50.m88271j(this.f159338p, nx2Var.f159338p);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f159323a.hashCode() * 31, 31, this.f159324b), 31, this.f159325c), 31, this.f159326d), 31, this.f159327e);
        String str = this.f159328f;
        int iM77243b2 = s571.m77243b(f710.m40938f(this.f159335m, s571.m77245d(mt60.m62800g(this.f159333k, yds.m93483m(this.f159332j, s571.m77243b((this.f159330h.hashCode() + lq51.m59700f(this.f159329g, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f159331i), 31), 31), 31, this.f159334l), 31), 31, this.f159336n);
        Integer num = this.f159337o;
        int iHashCode = (iM77243b2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f159338p;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
