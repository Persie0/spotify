package p204p;

import com.spotify.userinteractivityservice.usercomments.p178v1.proto.Comment;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class kmf {

    /* JADX INFO: renamed from: a */
    public final String f124131a;

    /* JADX INFO: renamed from: b */
    public final daa0 f124132b;

    /* JADX INFO: renamed from: c */
    public final daa0 f124133c;

    /* JADX INFO: renamed from: d */
    public final daa0 f124134d;

    /* JADX INFO: renamed from: e */
    public final daa0 f124135e;

    /* JADX INFO: renamed from: f */
    public final daa0 f124136f;

    /* JADX INFO: renamed from: g */
    public final qm70 f124137g;

    /* JADX INFO: renamed from: h */
    public final ejf f124138h;

    /* JADX INFO: renamed from: i */
    public final String f124139i;

    /* JADX INFO: renamed from: j */
    public final boolean f124140j;

    /* JADX INFO: renamed from: k */
    public final String f124141k;

    /* JADX INFO: renamed from: l */
    public final ern0 f124142l;

    /* JADX INFO: renamed from: m */
    public final Set f124143m;

    /* JADX INFO: renamed from: n */
    public final boolean f124144n;

    /* JADX INFO: renamed from: o */
    public final ern0 f124145o;

    /* JADX INFO: renamed from: p */
    public final Comment f124146p;

    /* JADX INFO: renamed from: q */
    public final ern0 f124147q;

    /* JADX INFO: renamed from: r */
    public final ig40 f124148r;

    /* JADX INFO: renamed from: s */
    public final boolean f124149s;

    public kmf(String str, daa0 daa0Var, daa0 daa0Var2, daa0 daa0Var3, daa0 daa0Var4, daa0 daa0Var5, qm70 qm70Var, ejf ejfVar, String str2, boolean z, String str3, ern0 ern0Var, Set set, boolean z2, ern0 ern0Var2, Comment comment, ern0 ern0Var3, ig40 ig40Var, boolean z3) {
        this.f124131a = str;
        this.f124132b = daa0Var;
        this.f124133c = daa0Var2;
        this.f124134d = daa0Var3;
        this.f124135e = daa0Var4;
        this.f124136f = daa0Var5;
        this.f124137g = qm70Var;
        this.f124138h = ejfVar;
        this.f124139i = str2;
        this.f124140j = z;
        this.f124141k = str3;
        this.f124142l = ern0Var;
        this.f124143m = set;
        this.f124144n = z2;
        this.f124145o = ern0Var2;
        this.f124146p = comment;
        this.f124147q = ern0Var3;
        this.f124148r = ig40Var;
        this.f124149s = z3;
    }

    /* JADX INFO: renamed from: a */
    public static kmf m56898a(kmf kmfVar, daa0 daa0Var, daa0 daa0Var2, daa0 daa0Var3, daa0 daa0Var4, daa0 daa0Var5, qm70 qm70Var, ejf ejfVar, String str, boolean z, String str2, ern0 ern0Var, LinkedHashSet linkedHashSet, boolean z2, ern0 ern0Var2, Comment comment, ern0 ern0Var3, ig40 ig40Var, boolean z3, int i) {
        String str3 = kmfVar.f124131a;
        daa0 daa0Var6 = (i & 2) != 0 ? kmfVar.f124132b : daa0Var;
        daa0 daa0Var7 = (i & 4) != 0 ? kmfVar.f124133c : daa0Var2;
        daa0 daa0Var8 = (i & 8) != 0 ? kmfVar.f124134d : daa0Var3;
        daa0 daa0Var9 = (i & 16) != 0 ? kmfVar.f124135e : daa0Var4;
        daa0 daa0Var10 = (i & 32) != 0 ? kmfVar.f124136f : daa0Var5;
        qm70 qm70Var2 = (i & 64) != 0 ? kmfVar.f124137g : qm70Var;
        ejf ejfVar2 = (i & 128) != 0 ? kmfVar.f124138h : ejfVar;
        String str4 = (i & 256) != 0 ? kmfVar.f124139i : str;
        boolean z4 = (i & 512) != 0 ? kmfVar.f124140j : z;
        String str5 = (i & 1024) != 0 ? kmfVar.f124141k : str2;
        ern0 ern0Var4 = (i & 2048) != 0 ? kmfVar.f124142l : ern0Var;
        Set set = (i & 4096) != 0 ? kmfVar.f124143m : linkedHashSet;
        boolean z5 = (i & 8192) != 0 ? kmfVar.f124144n : z2;
        ern0 ern0Var5 = (i & 16384) != 0 ? kmfVar.f124145o : ern0Var2;
        Comment comment2 = (i & 32768) != 0 ? kmfVar.f124146p : comment;
        ern0 ern0Var6 = (i & 65536) != 0 ? kmfVar.f124147q : ern0Var3;
        ig40 ig40Var2 = (i & 131072) != 0 ? kmfVar.f124148r : ig40Var;
        boolean z6 = (i & 262144) != 0 ? kmfVar.f124149s : z3;
        kmfVar.getClass();
        return new kmf(str3, daa0Var6, daa0Var7, daa0Var8, daa0Var9, daa0Var10, qm70Var2, ejfVar2, str4, z4, str5, ern0Var4, set, z5, ern0Var5, comment2, ern0Var6, ig40Var2, z6);
    }

    /* JADX INFO: renamed from: b */
    public final Comment m56899b(String str) {
        qgf qgfVar;
        bh71 bh71Var;
        List list;
        daa0 daa0Var = this.f124132b;
        Object obj = null;
        j9a0 j9a0Var = daa0Var instanceof j9a0 ? (j9a0) daa0Var : null;
        if (j9a0Var == null || (qgfVar = (qgf) j9a0Var.f110131a) == null || (bh71Var = qgfVar.f188458b) == null || (list = bh71Var.f27105a) == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (wj50.m88271j(((Comment) obj2).m22147u(), str)) {
                obj = obj2;
                break;
            }
        }
        return (Comment) obj;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m56900c() {
        return ((this.f124132b instanceof s9a0) || (this.f124133c instanceof s9a0) || (this.f124134d instanceof s9a0) || (this.f124135e instanceof s9a0) || (this.f124136f instanceof s9a0)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmf)) {
            return false;
        }
        kmf kmfVar = (kmf) obj;
        return wj50.m88271j(this.f124131a, kmfVar.f124131a) && wj50.m88271j(this.f124132b, kmfVar.f124132b) && wj50.m88271j(this.f124133c, kmfVar.f124133c) && wj50.m88271j(this.f124134d, kmfVar.f124134d) && wj50.m88271j(this.f124135e, kmfVar.f124135e) && wj50.m88271j(this.f124136f, kmfVar.f124136f) && wj50.m88271j(this.f124137g, kmfVar.f124137g) && wj50.m88271j(this.f124138h, kmfVar.f124138h) && wj50.m88271j(this.f124139i, kmfVar.f124139i) && this.f124140j == kmfVar.f124140j && wj50.m88271j(this.f124141k, kmfVar.f124141k) && wj50.m88271j(this.f124142l, kmfVar.f124142l) && wj50.m88271j(this.f124143m, kmfVar.f124143m) && this.f124144n == kmfVar.f124144n && wj50.m88271j(this.f124145o, kmfVar.f124145o) && wj50.m88271j(this.f124146p, kmfVar.f124146p) && wj50.m88271j(this.f124147q, kmfVar.f124147q) && wj50.m88271j(this.f124148r, kmfVar.f124148r) && this.f124149s == kmfVar.f124149s;
    }

    public final int hashCode() {
        int iHashCode = (this.f124136f.hashCode() + ((this.f124135e.hashCode() + ((this.f124134d.hashCode() + ((this.f124133c.hashCode() + ((this.f124132b.hashCode() + (this.f124131a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        qm70 qm70Var = this.f124137g;
        int iM77245d = s571.m77245d(s571.m77243b((this.f124138h.hashCode() + ((iHashCode + (qm70Var == null ? 0 : qm70Var.hashCode())) * 31)) * 31, 31, this.f124139i), 31, this.f124140j);
        String str = this.f124141k;
        int iHashCode2 = (this.f124145o.hashCode() + s571.m77245d(klh.m56830b((this.f124142l.hashCode() + ((iM77245d + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f124143m), 31, this.f124144n)) * 31;
        Comment comment = this.f124146p;
        return Boolean.hashCode(this.f124149s) + ((this.f124148r.hashCode() + ((this.f124147q.hashCode() + ((iHashCode2 + (comment != null ? comment.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public kmf(String str, qm70 qm70Var, boolean z) {
        s9a0 s9a0Var = new s9a0();
        s9a0 s9a0Var2 = new s9a0();
        s9a0 s9a0Var3 = new s9a0();
        s9a0 s9a0Var4 = new s9a0();
        s9a0 s9a0Var5 = new s9a0();
        grn0 grn0Var = grn0.f83797d;
        this(str, s9a0Var, s9a0Var2, s9a0Var3, s9a0Var4, s9a0Var5, qm70Var, cjf.f38572a, "", false, null, grn0Var, gbu.f78413a, z, grn0Var, null, grn0Var, orn0.f168627d, false);
    }
}
