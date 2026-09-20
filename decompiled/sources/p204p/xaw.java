package p204p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xaw implements ktx {

    /* JADX INFO: renamed from: a */
    public final gf41 f259774a;

    /* JADX INFO: renamed from: b */
    public final String f259775b;

    /* JADX INFO: renamed from: c */
    public final String f259776c;

    /* JADX INFO: renamed from: d */
    public final vaw f259777d;

    /* JADX INFO: renamed from: e */
    public final wzk f259778e;

    /* JADX INFO: renamed from: f */
    public final Object f259779f;

    /* JADX INFO: renamed from: g */
    public final Object f259780g;

    /* JADX INFO: renamed from: h */
    public final List f259781h;

    /* JADX INFO: renamed from: i */
    public final boolean f259782i;

    /* JADX INFO: renamed from: j */
    public final int f259783j;

    /* JADX INFO: renamed from: k */
    public final boolean f259784k;

    /* JADX INFO: renamed from: l */
    public final boolean f259785l;

    /* JADX INFO: renamed from: m */
    public final String f259786m;

    /* JADX INFO: renamed from: n */
    public final long f259787n;

    /* JADX INFO: renamed from: o */
    public final taw f259788o;

    /* JADX INFO: renamed from: p */
    public final Object f259789p;

    /* JADX INFO: renamed from: q */
    public final String f259790q;

    /* JADX INFO: renamed from: r */
    public final String f259791r;

    /* JADX INFO: renamed from: s */
    public final String f259792s;

    /* JADX INFO: renamed from: t */
    public final wg61 f259793t = new wg61(new zyv(this, 5));

    public xaw(gf41 gf41Var, String str, String str2, vaw vawVar, wzk wzkVar, List list, List list2, List list3, boolean z, int i, boolean z2, boolean z3, String str3, long j, taw tawVar, List list4, String str4, String str5, String str6) {
        this.f259774a = gf41Var;
        this.f259775b = str;
        this.f259776c = str2;
        this.f259777d = vawVar;
        this.f259778e = wzkVar;
        this.f259779f = list;
        this.f259780g = list2;
        this.f259781h = list3;
        this.f259782i = z;
        this.f259783j = i;
        this.f259784k = z2;
        this.f259785l = z3;
        this.f259786m = str3;
        this.f259787n = j;
        this.f259788o = tawVar;
        this.f259789p = list4;
        this.f259790q = str4;
        this.f259791r = str5;
        this.f259792s = str6;
    }

    /* JADX INFO: renamed from: a */
    public final Set m90293a() {
        return (Set) this.f259793t.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xaw)) {
            return false;
        }
        xaw xawVar = (xaw) obj;
        return this.f259774a.equals(xawVar.f259774a) && this.f259775b.equals(xawVar.f259775b) && wj50.m88271j(this.f259776c, xawVar.f259776c) && wj50.m88271j(this.f259777d, xawVar.f259777d) && this.f259778e.equals(xawVar.f259778e) && this.f259779f.equals(xawVar.f259779f) && this.f259780g.equals(xawVar.f259780g) && wj50.m88271j(this.f259781h, xawVar.f259781h) && this.f259782i == xawVar.f259782i && this.f259783j == xawVar.f259783j && this.f259784k == xawVar.f259784k && this.f259785l == xawVar.f259785l && wj50.m88271j(this.f259786m, xawVar.f259786m) && this.f259787n == xawVar.f259787n && this.f259788o.equals(xawVar.f259788o) && this.f259789p.equals(xawVar.f259789p) && this.f259790q.equals(xawVar.f259790q) && this.f259791r.equals(xawVar.f259791r) && this.f259792s.equals(xawVar.f259792s);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f259774a.hashCode() * 31, 31, this.f259775b), 31, this.f259776c);
        vaw vawVar = this.f259777d;
        return this.f259792s.hashCode() + s571.m77243b(s571.m77243b(dq60.m36604d((this.f259788o.hashCode() + dq60.m36605e(s571.m77243b(s571.m77245d(s571.m77245d(f710.m40938f(this.f259783j, s571.m77245d(s571.m77244c(dq60.m36604d(dq60.m36604d((this.f259778e.hashCode() + ((iM77243b + (vawVar == null ? 0 : vawVar.hashCode())) * 31)) * 31, 31, this.f259779f), 31, this.f259780g), 31, this.f259781h), 31, this.f259782i), 31), 31, this.f259784k), 31, this.f259785l), 31, this.f259786m), this.f259787n, 31)) * 31, 31, this.f259789p), 31, this.f259790q), 31, this.f259791r);
    }
}
