package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class q9m0 {

    /* JADX INFO: renamed from: a */
    public final List f186628a;

    /* JADX INFO: renamed from: b */
    public final er40 f186629b;

    /* JADX INFO: renamed from: c */
    public final List f186630c;

    /* JADX INFO: renamed from: d */
    public final er40 f186631d;

    /* JADX INFO: renamed from: e */
    public final List f186632e;

    /* JADX INFO: renamed from: f */
    public final String f186633f;

    /* JADX INFO: renamed from: g */
    public final List f186634g;

    /* JADX INFO: renamed from: h */
    public final List f186635h;

    /* JADX INFO: renamed from: i */
    public final List f186636i;

    public q9m0(List list, er40 er40Var, List list2, er40 er40Var2, List list3, String str, List list4, List list5, List list6) {
        this.f186628a = list;
        this.f186629b = er40Var;
        this.f186630c = list2;
        this.f186631d = er40Var2;
        this.f186632e = list3;
        this.f186633f = str;
        this.f186634g = list4;
        this.f186635h = list5;
        this.f186636i = list6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9m0)) {
            return false;
        }
        q9m0 q9m0Var = (q9m0) obj;
        return wj50.m88271j(this.f186628a, q9m0Var.f186628a) && wj50.m88271j(this.f186629b, q9m0Var.f186629b) && wj50.m88271j(this.f186630c, q9m0Var.f186630c) && wj50.m88271j(this.f186631d, q9m0Var.f186631d) && wj50.m88271j(this.f186632e, q9m0Var.f186632e) && wj50.m88271j(this.f186633f, q9m0Var.f186633f) && wj50.m88271j(this.f186634g, q9m0Var.f186634g) && wj50.m88271j(this.f186635h, q9m0Var.f186635h) && wj50.m88271j(this.f186636i, q9m0Var.f186636i);
    }

    public final int hashCode() {
        int iHashCode = this.f186628a.hashCode() * 31;
        er40 er40Var = this.f186629b;
        int iM77244c = s571.m77244c((iHashCode + (er40Var == null ? 0 : er40Var.hashCode())) * 31, 31, this.f186630c);
        er40 er40Var2 = this.f186631d;
        return this.f186636i.hashCode() + s571.m77244c(s571.m77244c(s571.m77243b(s571.m77244c((iM77244c + (er40Var2 != null ? er40Var2.hashCode() : 0)) * 31, 31, this.f186632e), 31, this.f186633f), 31, this.f186634g), 31, this.f186635h);
    }
}
