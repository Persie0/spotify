package p204p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class gg6 {

    /* JADX INFO: renamed from: a */
    public final fg6 f79536a;

    /* JADX INFO: renamed from: b */
    public final boolean f79537b;

    /* JADX INFO: renamed from: c */
    public final String f79538c;

    /* JADX INFO: renamed from: d */
    public final List f79539d;

    /* JADX INFO: renamed from: e */
    public final List f79540e;

    /* JADX INFO: renamed from: f */
    public final AbstractC2524w8 f79541f;

    /* JADX INFO: renamed from: g */
    public final AbstractC2524w8 f79542g;

    /* JADX INFO: renamed from: h */
    public final bep0 f79543h;

    /* JADX INFO: renamed from: i */
    public final boolean f79544i;

    /* JADX INFO: renamed from: j */
    public final boolean f79545j;

    /* JADX INFO: renamed from: k */
    public final boolean f79546k;

    /* JADX INFO: renamed from: l */
    public final boolean f79547l;

    /* JADX INFO: renamed from: m */
    public final boolean f79548m;

    /* JADX INFO: renamed from: n */
    public final boolean f79549n;

    /* JADX INFO: renamed from: o */
    public final boolean f79550o;

    /* JADX INFO: renamed from: p */
    public final boolean f79551p;

    /* JADX INFO: renamed from: q */
    public final List f79552q;

    /* JADX INFO: renamed from: r */
    public final Map f79553r;

    public gg6(fg6 fg6Var, boolean z, String str, List list, List list2, AbstractC2524w8 abstractC2524w8, AbstractC2524w8 abstractC2524w9, bep0 bep0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, List list3, Map map) {
        this.f79536a = fg6Var;
        this.f79537b = z;
        this.f79538c = str;
        this.f79539d = list;
        this.f79540e = list2;
        this.f79541f = abstractC2524w8;
        this.f79542g = abstractC2524w9;
        this.f79543h = bep0Var;
        this.f79544i = z2;
        this.f79545j = z3;
        this.f79546k = z4;
        this.f79547l = z5;
        this.f79548m = z6;
        this.f79549n = z7;
        this.f79550o = z8;
        this.f79551p = z9;
        this.f79552q = list3;
        this.f79553r = map;
    }

    /* JADX INFO: renamed from: a */
    public static gg6 m44659a(gg6 gg6Var, boolean z, String str, List list, List list2, AbstractC2524w8 abstractC2524w8, AbstractC2524w8 abstractC2524w9, bep0 bep0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, List list3, Map map, int i) {
        fg6 fg6Var = gg6Var.f79536a;
        boolean z10 = (i & 2) != 0 ? gg6Var.f79537b : z;
        String str2 = (i & 4) != 0 ? gg6Var.f79538c : str;
        List list4 = (i & 8) != 0 ? gg6Var.f79539d : list;
        List list5 = (i & 16) != 0 ? gg6Var.f79540e : list2;
        AbstractC2524w8 abstractC2524w10 = (i & 32) != 0 ? gg6Var.f79541f : abstractC2524w8;
        AbstractC2524w8 abstractC2524w11 = (i & 64) != 0 ? gg6Var.f79542g : abstractC2524w9;
        bep0 bep0Var2 = (i & 128) != 0 ? gg6Var.f79543h : bep0Var;
        boolean z11 = (i & 256) != 0 ? gg6Var.f79544i : z2;
        boolean z12 = (i & 512) != 0 ? gg6Var.f79545j : z3;
        boolean z13 = (i & 1024) != 0 ? gg6Var.f79546k : z4;
        boolean z14 = (i & 2048) != 0 ? gg6Var.f79547l : z5;
        boolean z15 = (i & 4096) != 0 ? gg6Var.f79548m : z6;
        boolean z16 = (i & 8192) != 0 ? gg6Var.f79549n : z7;
        boolean z17 = (i & 16384) != 0 ? gg6Var.f79550o : z8;
        boolean z18 = (i & 32768) != 0 ? gg6Var.f79551p : z9;
        List list6 = (i & 65536) != 0 ? gg6Var.f79552q : list3;
        Map map2 = (i & 131072) != 0 ? gg6Var.f79553r : map;
        gg6Var.getClass();
        return new gg6(fg6Var, z10, str2, list4, list5, abstractC2524w10, abstractC2524w11, bep0Var2, z11, z12, z13, z14, z15, z16, z17, z18, list6, map2);
    }

    /* JADX INFO: renamed from: b */
    public final List m44660b() {
        return g6f.m43727j0(g6f.m43700N0(this.f79539d, this.f79540e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg6)) {
            return false;
        }
        gg6 gg6Var = (gg6) obj;
        return this.f79536a == gg6Var.f79536a && this.f79537b == gg6Var.f79537b && wj50.m88271j(this.f79538c, gg6Var.f79538c) && wj50.m88271j(this.f79539d, gg6Var.f79539d) && wj50.m88271j(this.f79540e, gg6Var.f79540e) && wj50.m88271j(this.f79541f, gg6Var.f79541f) && wj50.m88271j(this.f79542g, gg6Var.f79542g) && wj50.m88271j(this.f79543h, gg6Var.f79543h) && this.f79544i == gg6Var.f79544i && this.f79545j == gg6Var.f79545j && this.f79546k == gg6Var.f79546k && this.f79547l == gg6Var.f79547l && this.f79548m == gg6Var.f79548m && this.f79549n == gg6Var.f79549n && this.f79550o == gg6Var.f79550o && this.f79551p == gg6Var.f79551p && wj50.m88271j(this.f79552q, gg6Var.f79552q) && wj50.m88271j(this.f79553r, gg6Var.f79553r);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f79536a.hashCode() * 31, 31, this.f79537b);
        String str = this.f79538c;
        return this.f79553r.hashCode() + s571.m77244c(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((this.f79543h.hashCode() + ((this.f79542g.hashCode() + ((this.f79541f.hashCode() + s571.m77244c(s571.m77244c((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f79539d), 31, this.f79540e)) * 31)) * 31)) * 31, 31, this.f79544i), 31, this.f79545j), 31, this.f79546k), 31, this.f79547l), 31, this.f79548m), 31, this.f79549n), 31, this.f79550o), 31, this.f79551p), 31, this.f79552q);
    }
}
