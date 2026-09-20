package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class k031 {

    /* JADX INFO: renamed from: a */
    public final gys0 f117868a;

    /* JADX INFO: renamed from: b */
    public final ubp0 f117869b;

    /* JADX INFO: renamed from: c */
    public final Map f117870c;

    /* JADX INFO: renamed from: d */
    public final Map f117871d;

    /* JADX INFO: renamed from: e */
    public final Map f117872e;

    /* JADX INFO: renamed from: f */
    public final jf31 f117873f;

    /* JADX INFO: renamed from: g */
    public final Boolean f117874g;

    /* JADX INFO: renamed from: h */
    public final Boolean f117875h;

    /* JADX INFO: renamed from: i */
    public final boolean f117876i;

    /* JADX INFO: renamed from: j */
    public final boolean f117877j;

    /* JADX INFO: renamed from: k */
    public final int f117878k;

    /* JADX INFO: renamed from: l */
    public final List f117879l;

    /* JADX INFO: renamed from: m */
    public final Map f117880m;

    /* JADX INFO: renamed from: n */
    public final Map f117881n;

    /* JADX INFO: renamed from: o */
    public final Set f117882o;

    /* JADX INFO: renamed from: p */
    public final int f117883p;

    /* JADX INFO: renamed from: q */
    public final int f117884q;

    /* JADX INFO: renamed from: r */
    public final Map f117885r;

    /* JADX INFO: renamed from: s */
    public final boolean f117886s;

    public k031(gys0 gys0Var, ubp0 ubp0Var, Map map, Map map2, Map map3, jf31 jf31Var, Boolean bool, Boolean bool2, boolean z, boolean z2, int i, List list, Map map4, Map map5, Set set, int i2, int i3, Map map6, boolean z3) {
        this.f117868a = gys0Var;
        this.f117869b = ubp0Var;
        this.f117870c = map;
        this.f117871d = map2;
        this.f117872e = map3;
        this.f117873f = jf31Var;
        this.f117874g = bool;
        this.f117875h = bool2;
        this.f117876i = z;
        this.f117877j = z2;
        this.f117878k = i;
        this.f117879l = list;
        this.f117880m = map4;
        this.f117881n = map5;
        this.f117882o = set;
        this.f117883p = i2;
        this.f117884q = i3;
        this.f117885r = map6;
        this.f117886s = z3;
    }

    /* JADX INFO: renamed from: a */
    public static k031 m54893a(k031 k031Var, ubp0 ubp0Var, Map map, Map map2, Map map3, jf31 jf31Var, Boolean bool, Boolean bool2, boolean z, boolean z2, int i, ArrayList arrayList, Map map4, Map map5, Set set, int i2, int i3, Map map6, boolean z3, int i4) {
        gys0 gys0Var = k031Var.f117868a;
        ubp0 ubp0Var2 = (i4 & 2) != 0 ? k031Var.f117869b : ubp0Var;
        Map map7 = (i4 & 4) != 0 ? k031Var.f117870c : map;
        Map map8 = (i4 & 8) != 0 ? k031Var.f117871d : map2;
        Map map9 = (i4 & 16) != 0 ? k031Var.f117872e : map3;
        jf31 jf31Var2 = (i4 & 32) != 0 ? k031Var.f117873f : jf31Var;
        Boolean bool3 = (i4 & 64) != 0 ? k031Var.f117874g : bool;
        Boolean bool4 = (i4 & 128) != 0 ? k031Var.f117875h : bool2;
        boolean z4 = (i4 & 256) != 0 ? k031Var.f117876i : z;
        boolean z5 = (i4 & 512) != 0 ? k031Var.f117877j : z2;
        int i5 = (i4 & 1024) != 0 ? k031Var.f117878k : i;
        List list = (i4 & 2048) != 0 ? k031Var.f117879l : arrayList;
        Map map10 = (i4 & 4096) != 0 ? k031Var.f117880m : map4;
        Map map11 = (i4 & 8192) != 0 ? k031Var.f117881n : map5;
        Set set2 = (i4 & 16384) != 0 ? k031Var.f117882o : set;
        int i6 = (i4 & 32768) != 0 ? k031Var.f117883p : i2;
        int i7 = (i4 & 65536) != 0 ? k031Var.f117884q : i3;
        Map map12 = (i4 & 131072) != 0 ? k031Var.f117885r : map6;
        boolean z6 = (i4 & 262144) != 0 ? k031Var.f117886s : z3;
        k031Var.getClass();
        return new k031(gys0Var, ubp0Var2, map7, map8, map9, jf31Var2, bool3, bool4, z4, z5, i5, list, map10, map11, set2, i6, i7, map12, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k031)) {
            return false;
        }
        k031 k031Var = (k031) obj;
        return wj50.m88271j(this.f117868a, k031Var.f117868a) && wj50.m88271j(this.f117869b, k031Var.f117869b) && wj50.m88271j(this.f117870c, k031Var.f117870c) && wj50.m88271j(this.f117871d, k031Var.f117871d) && wj50.m88271j(this.f117872e, k031Var.f117872e) && wj50.m88271j(this.f117873f, k031Var.f117873f) && wj50.m88271j(this.f117874g, k031Var.f117874g) && wj50.m88271j(this.f117875h, k031Var.f117875h) && this.f117876i == k031Var.f117876i && this.f117877j == k031Var.f117877j && this.f117878k == k031Var.f117878k && wj50.m88271j(this.f117879l, k031Var.f117879l) && wj50.m88271j(this.f117880m, k031Var.f117880m) && wj50.m88271j(this.f117881n, k031Var.f117881n) && wj50.m88271j(this.f117882o, k031Var.f117882o) && this.f117883p == k031Var.f117883p && this.f117884q == k031Var.f117884q && wj50.m88271j(this.f117885r, k031Var.f117885r) && this.f117886s == k031Var.f117886s;
    }

    public final int hashCode() {
        int iHashCode = (this.f117873f.hashCode() + edb.m38557f(edb.m38557f(edb.m38557f((this.f117869b.hashCode() + (this.f117868a.hashCode() * 31)) * 31, 31, this.f117870c), 31, this.f117871d), 31, this.f117872e)) * 31;
        Boolean bool = this.f117874g;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f117875h;
        return Boolean.hashCode(this.f117886s) + edb.m38557f(mt60.m62800g(this.f117884q, mt60.m62800g(this.f117883p, klh.m56830b(edb.m38557f(edb.m38557f(s571.m77244c(mt60.m62800g(this.f117878k, s571.m77245d(s571.m77245d((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31, this.f117876i), 31, this.f117877j), 31), 31, this.f117879l), 31, this.f117880m), 31, this.f117881n), 31, this.f117882o), 31), 31), 31, this.f117885r);
    }
}
