package p204p;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class nw80 {

    /* JADX INFO: renamed from: a */
    public final String f159047a;

    /* JADX INFO: renamed from: b */
    public final int f159048b;

    /* JADX INFO: renamed from: c */
    public final String f159049c;

    /* JADX INFO: renamed from: d */
    public final qla1 f159050d;

    /* JADX INFO: renamed from: e */
    public final boolean f159051e;

    /* JADX INFO: renamed from: f */
    public final List f159052f;

    /* JADX INFO: renamed from: g */
    public final Map f159053g;

    /* JADX INFO: renamed from: h */
    public final g7y0 f159054h;

    /* JADX INFO: renamed from: i */
    public final String f159055i;

    /* JADX INFO: renamed from: j */
    public final boolean f159056j;

    /* JADX INFO: renamed from: k */
    public final boolean f159057k;

    /* JADX INFO: renamed from: l */
    public final boolean f159058l;

    /* JADX INFO: renamed from: m */
    public final boolean f159059m;

    /* JADX INFO: renamed from: n */
    public final ehf1 f159060n;

    /* JADX INFO: renamed from: o */
    public final j7f0 f159061o;

    /* JADX INFO: renamed from: p */
    public final dpx f159062p;

    /* JADX INFO: renamed from: q */
    public final wg61 f159063q;

    /* JADX INFO: renamed from: r */
    public final wg61 f159064r;

    /* JADX INFO: renamed from: s */
    public final wg61 f159065s;

    /* JADX INFO: renamed from: t */
    public final wg61 f159066t;

    /* JADX INFO: renamed from: u */
    public final wg61 f159067u;

    /* JADX INFO: renamed from: v */
    public final wg61 f159068v;

    public nw80(String str, int i, String str2, qla1 qla1Var, boolean z, List list, Map map, g7y0 g7y0Var, String str3, boolean z2, boolean z3, boolean z4, boolean z5, ehf1 ehf1Var, j7f0 j7f0Var, dpx dpxVar) {
        this.f159047a = str;
        this.f159048b = i;
        this.f159049c = str2;
        this.f159050d = qla1Var;
        this.f159051e = z;
        this.f159052f = list;
        this.f159053g = map;
        this.f159054h = g7y0Var;
        this.f159055i = str3;
        this.f159056j = z2;
        this.f159057k = z3;
        this.f159058l = z4;
        this.f159059m = z5;
        this.f159060n = ehf1Var;
        this.f159061o = j7f0Var;
        this.f159062p = dpxVar;
        this.f159063q = new wg61(new mw80(4, this));
        this.f159064r = new wg61(new ias(this, 29));
        this.f159065s = new wg61(new mw80(1, this));
        this.f159066t = new wg61(new mw80(2, this));
        this.f159067u = new wg61(new mw80(0, this));
        this.f159068v = new wg61(new mw80(3, this));
    }

    /* JADX INFO: renamed from: a */
    public final String m65750a(int i) {
        j7f0 j7f0Var = this.f159061o;
        if (j7f0Var instanceof f7f0) {
            return "";
        }
        if (j7f0Var instanceof ib81) {
            return ((ib81) j7f0Var).f100471a.m28628a().m84311c(i);
        }
        if (j7f0Var instanceof f0w) {
            return ((f0w) j7f0Var).m40508a(i);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final hto0 m65751b() {
        return (hto0) this.f159068v.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final String m65752c() {
        return (String) this.f159063q.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m65753d() {
        return ((Boolean) this.f159064r.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m65754e() {
        return ((Boolean) this.f159067u.getValue()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw80)) {
            return false;
        }
        nw80 nw80Var = (nw80) obj;
        return wj50.m88271j(this.f159047a, nw80Var.f159047a) && this.f159048b == nw80Var.f159048b && wj50.m88271j(this.f159049c, nw80Var.f159049c) && wj50.m88271j(this.f159050d, nw80Var.f159050d) && this.f159051e == nw80Var.f159051e && wj50.m88271j(this.f159052f, nw80Var.f159052f) && wj50.m88271j(this.f159053g, nw80Var.f159053g) && wj50.m88271j(this.f159054h, nw80Var.f159054h) && wj50.m88271j(this.f159055i, nw80Var.f159055i) && this.f159056j == nw80Var.f159056j && this.f159057k == nw80Var.f159057k && this.f159058l == nw80Var.f159058l && this.f159059m == nw80Var.f159059m && wj50.m88271j(this.f159060n, nw80Var.f159060n) && wj50.m88271j(this.f159061o, nw80Var.f159061o) && wj50.m88271j(this.f159062p, nw80Var.f159062p);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m65755f() {
        return ((Boolean) this.f159065s.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m65756g() {
        return ((Boolean) this.f159066t.getValue()).booleanValue();
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f159048b, this.f159047a.hashCode() * 31, 31), 31, this.f159049c);
        qla1 qla1Var = this.f159050d;
        int iM38557f = edb.m38557f(s571.m77244c(s571.m77245d((iM77243b + (qla1Var == null ? 0 : qla1Var.hashCode())) * 31, 31, this.f159051e), 31, this.f159052f), 31, this.f159053g);
        g7y0 g7y0Var = this.f159054h;
        return this.f159062p.hashCode() + ((this.f159061o.hashCode() + ((this.f159060n.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b((iM38557f + (g7y0Var != null ? g7y0Var.hashCode() : 0)) * 31, 31, this.f159055i), 31, this.f159056j), 31, this.f159057k), 31, this.f159058l), 31, this.f159059m)) * 31)) * 31);
    }

    public /* synthetic */ nw80(String str, String str2, String str3, boolean z, boolean z2, ehf1 ehf1Var, ib81 ib81Var, int i) {
        this(str, 0, str2, null, false, lau.f131415a, nau.f152117a, null, (i & 256) != 0 ? "" : str3, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? false : z2, false, false, (i & 8192) != 0 ? u2l0.f226115b : ehf1Var, (i & 16384) != 0 ? f7f0.f66670a : ib81Var, dpx.f51759a);
    }
}
