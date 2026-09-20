package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class k1m0 implements fnj0 {

    /* JADX INFO: renamed from: a */
    public final s0m0 f118389a;

    /* JADX INFO: renamed from: b */
    public final gb31 f118390b;

    /* JADX INFO: renamed from: c */
    public final rtq f118391c;

    /* JADX INFO: renamed from: d */
    public sxj f118392d;

    /* JADX INFO: renamed from: e */
    public final j1m0 f118393e;

    public k1m0(s0m0 s0m0Var, List list) {
        this.f118389a = s0m0Var;
        gb31 gb31Var = new gb31();
        gb31Var.addAll(list);
        this.f118390b = gb31Var;
        this.f118391c = sam.m77674m(new t42(this, 3));
        this.f118392d = vb91.f239444a;
        this.f118393e = new j1m0(this);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m55115a() {
        return !this.f118390b.isEmpty();
    }

    @Override // p204p.fnj0
    public final void dispose() {
    }
}
