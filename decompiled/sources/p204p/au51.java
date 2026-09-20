package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class au51 {

    /* JADX INFO: renamed from: a */
    public final String f19849a;

    /* JADX INFO: renamed from: b */
    public final String f19850b;

    /* JADX INFO: renamed from: c */
    public final String f19851c;

    /* JADX INFO: renamed from: d */
    public final String f19852d;

    /* JADX INFO: renamed from: e */
    public final String f19853e;

    /* JADX INFO: renamed from: f */
    public final List f19854f;

    /* JADX INFO: renamed from: g */
    public final h50 f19855g;

    /* JADX INFO: renamed from: h */
    public final List f19856h;

    /* JADX INFO: renamed from: i */
    public final int f19857i;

    /* JADX INFO: renamed from: j */
    public final String f19858j;

    /* JADX INFO: renamed from: k */
    public final String f19859k;

    /* JADX INFO: renamed from: l */
    public final String f19860l;

    /* JADX INFO: renamed from: m */
    public final String f19861m;

    /* JADX INFO: renamed from: n */
    public final String f19862n;

    /* JADX INFO: renamed from: o */
    public final String f19863o;

    /* JADX INFO: renamed from: p */
    public final String f19864p;

    /* JADX INFO: renamed from: q */
    public final String f19865q;

    public au51(String str, String str2, String str3, String str4, String str5, List list, h50 h50Var, List list2, int i, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.f19849a = str;
        this.f19850b = str2;
        this.f19851c = str3;
        this.f19852d = str4;
        this.f19853e = str5;
        this.f19854f = list;
        this.f19855g = h50Var;
        this.f19856h = list2;
        this.f19857i = i;
        this.f19858j = str6;
        this.f19859k = str7;
        this.f19860l = str8;
        this.f19861m = str9;
        this.f19862n = str10;
        this.f19863o = str11;
        this.f19864p = str12;
        this.f19865q = str13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au51)) {
            return false;
        }
        au51 au51Var = (au51) obj;
        return wj50.m88271j(this.f19849a, au51Var.f19849a) && this.f19850b.equals(au51Var.f19850b) && this.f19851c.equals(au51Var.f19851c) && wj50.m88271j(this.f19852d, au51Var.f19852d) && this.f19853e.equals(au51Var.f19853e) && wj50.m88271j(this.f19854f, au51Var.f19854f) && this.f19855g.equals(au51Var.f19855g) && wj50.m88271j(this.f19856h, au51Var.f19856h) && this.f19857i == au51Var.f19857i && wj50.m88271j(this.f19858j, au51Var.f19858j) && this.f19859k.equals(au51Var.f19859k) && this.f19860l.equals(au51Var.f19860l) && wj50.m88271j(this.f19861m, au51Var.f19861m) && this.f19862n.equals(au51Var.f19862n) && wj50.m88271j(this.f19863o, au51Var.f19863o) && this.f19864p.equals(au51Var.f19864p) && wj50.m88271j(this.f19865q, au51Var.f19865q);
    }

    public final int hashCode() {
        return this.f19865q.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(f710.m40938f(this.f19857i, s571.m77244c((this.f19855g.hashCode() + s571.m77244c(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f19849a.hashCode() * 31, 31, this.f19850b), 31, this.f19851c), 31, this.f19852d), 31, this.f19853e), 31, this.f19854f)) * 31, 31, this.f19856h), 31), 31, this.f19858j), 31, this.f19859k), 31, this.f19860l), 31, this.f19861m), 31, this.f19862n), 31, this.f19863o), 31, this.f19864p);
    }
}
