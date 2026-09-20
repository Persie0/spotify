package p204p;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vb40 {

    /* JADX INFO: renamed from: a */
    public final Context f239399a;

    /* JADX INFO: renamed from: b */
    public final Object f239400b;

    /* JADX INFO: renamed from: c */
    public final iu61 f239401c;

    /* JADX INFO: renamed from: d */
    public final ub40 f239402d;

    /* JADX INFO: renamed from: e */
    public final Map f239403e;

    /* JADX INFO: renamed from: f */
    public final ywy f239404f;

    /* JADX INFO: renamed from: g */
    public final juk f239405g;

    /* JADX INFO: renamed from: h */
    public final juk f239406h;

    /* JADX INFO: renamed from: i */
    public final juk f239407i;

    /* JADX INFO: renamed from: j */
    public final h4b f239408j;

    /* JADX INFO: renamed from: k */
    public final h4b f239409k;

    /* JADX INFO: renamed from: l */
    public final h4b f239410l;

    /* JADX INFO: renamed from: m */
    public final gh00 f239411m;

    /* JADX INFO: renamed from: n */
    public final gh00 f239412n;

    /* JADX INFO: renamed from: o */
    public final gh00 f239413o;

    /* JADX INFO: renamed from: p */
    public final ri21 f239414p;

    /* JADX INFO: renamed from: q */
    public final ray0 f239415q;

    /* JADX INFO: renamed from: r */
    public final int f239416r;

    /* JADX INFO: renamed from: s */
    public final h5y f239417s;

    /* JADX INFO: renamed from: t */
    public final tb40 f239418t;

    /* JADX INFO: renamed from: u */
    public final sb40 f239419u;

    public vb40(Context context, Object obj, iu61 iu61Var, ub40 ub40Var, Map map, ywy ywyVar, juk jukVar, juk jukVar2, juk jukVar3, h4b h4bVar, h4b h4bVar2, h4b h4bVar3, gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3, ri21 ri21Var, ray0 ray0Var, int i, h5y h5yVar, tb40 tb40Var, sb40 sb40Var) {
        this.f239399a = context;
        this.f239400b = obj;
        this.f239401c = iu61Var;
        this.f239402d = ub40Var;
        this.f239403e = map;
        this.f239404f = ywyVar;
        this.f239405g = jukVar;
        this.f239406h = jukVar2;
        this.f239407i = jukVar3;
        this.f239408j = h4bVar;
        this.f239409k = h4bVar2;
        this.f239410l = h4bVar3;
        this.f239411m = gh00Var;
        this.f239412n = gh00Var2;
        this.f239413o = gh00Var3;
        this.f239414p = ri21Var;
        this.f239415q = ray0Var;
        this.f239416r = i;
        this.f239417s = h5yVar;
        this.f239418t = tb40Var;
        this.f239419u = sb40Var;
    }

    /* JADX INFO: renamed from: a */
    public static rb40 m85111a(vb40 vb40Var) {
        Context context = vb40Var.f239399a;
        vb40Var.getClass();
        return new rb40(vb40Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb40)) {
            return false;
        }
        vb40 vb40Var = (vb40) obj;
        return wj50.m88271j(this.f239399a, vb40Var.f239399a) && this.f239400b.equals(vb40Var.f239400b) && wj50.m88271j(this.f239401c, vb40Var.f239401c) && wj50.m88271j(this.f239402d, vb40Var.f239402d) && this.f239403e.equals(vb40Var.f239403e) && wj50.m88271j(this.f239404f, vb40Var.f239404f) && wj50.m88271j(this.f239405g, vb40Var.f239405g) && wj50.m88271j(this.f239406h, vb40Var.f239406h) && wj50.m88271j(this.f239407i, vb40Var.f239407i) && this.f239408j == vb40Var.f239408j && this.f239409k == vb40Var.f239409k && this.f239410l == vb40Var.f239410l && wj50.m88271j(this.f239411m, vb40Var.f239411m) && wj50.m88271j(this.f239412n, vb40Var.f239412n) && wj50.m88271j(this.f239413o, vb40Var.f239413o) && wj50.m88271j(this.f239414p, vb40Var.f239414p) && this.f239415q == vb40Var.f239415q && this.f239416r == vb40Var.f239416r && this.f239417s.equals(vb40Var.f239417s) && this.f239418t.equals(vb40Var.f239418t) && wj50.m88271j(this.f239419u, vb40Var.f239419u);
    }

    public final int hashCode() {
        int iM36604d = dq60.m36604d(this.f239399a.hashCode() * 31, 31, this.f239400b);
        iu61 iu61Var = this.f239401c;
        int iHashCode = (iM36604d + (iu61Var == null ? 0 : iu61Var.hashCode())) * 31;
        ub40 ub40Var = this.f239402d;
        return this.f239419u.hashCode() + ((this.f239418t.hashCode() + edb.m38557f(f710.m40938f(this.f239416r, (this.f239415q.hashCode() + ((this.f239414p.hashCode() + m6b.m60989d(this.f239413o, m6b.m60989d(this.f239412n, m6b.m60989d(this.f239411m, (this.f239410l.hashCode() + ((this.f239409k.hashCode() + ((this.f239408j.hashCode() + ((this.f239407i.hashCode() + ((this.f239406h.hashCode() + ((this.f239405g.hashCode() + ((this.f239404f.hashCode() + edb.m38557f((iHashCode + (ub40Var != null ? ub40Var.hashCode() : 0)) * 961, 961, this.f239403e)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961, 31), 31), 31)) * 31)) * 31, 31), 31, this.f239417s.f87925a)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.f239399a + ", data=" + this.f239400b + ", target=" + this.f239401c + ", listener=" + this.f239402d + ", memoryCacheKey=null, memoryCacheKeyExtras=" + this.f239403e + ", diskCacheKey=null, fileSystem=" + this.f239404f + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f239405g + ", fetcherCoroutineContext=" + this.f239406h + ", decoderCoroutineContext=" + this.f239407i + ", memoryCachePolicy=" + this.f239408j + ", diskCachePolicy=" + this.f239409k + ", networkCachePolicy=" + this.f239410l + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.f239411m + ", errorFactory=" + this.f239412n + ", fallbackFactory=" + this.f239413o + ", sizeResolver=" + this.f239414p + ", scale=" + this.f239415q + ", precision=" + m5p0.m60879k(this.f239416r) + ", extras=" + this.f239417s + ", defined=" + this.f239418t + ", defaults=" + this.f239419u + ')';
    }
}
