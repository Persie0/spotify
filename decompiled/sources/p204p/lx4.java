package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class lx4 implements u691 {

    /* JADX INFO: renamed from: a */
    public final c791 f137716a;

    /* JADX INFO: renamed from: b */
    public ob3 f137717b;

    /* JADX INFO: renamed from: c */
    public ko70 f137718c;

    /* JADX INFO: renamed from: d */
    public final yum0 f137719d = sam.m77645B(new g450(0));

    /* JADX INFO: renamed from: e */
    public final cqi0 f137720e;

    /* JADX INFO: renamed from: f */
    public p691 f137721f;

    public lx4(c791 c791Var, ob3 ob3Var, ko70 ko70Var) {
        this.f137716a = c791Var;
        this.f137717b = ob3Var;
        this.f137718c = ko70Var;
        long[] jArr = rdy0.f198228a;
        this.f137720e = new cqi0();
    }

    /* JADX INFO: renamed from: d */
    public static final long m60164d(lx4 lx4Var) {
        p691 p691Var = lx4Var.f137721f;
        return p691Var != null ? ((g450) p691Var.getValue()).f76347a : ((g450) lx4Var.f137719d.getValue()).f76347a;
    }

    /* JADX INFO: renamed from: g */
    public static pbv m60165g(lx4 lx4Var, int i, w9z w9zVar) {
        if (lx4Var.m60169e(i)) {
            return kbv.m55966l(w9zVar, new kx4(lx4Var, 0));
        }
        if (lx4Var.m60170f(i)) {
            return kbv.m55966l(w9zVar, new kx4(lx4Var, 1));
        }
        if (i == 2) {
            return kbv.m55968n(w9zVar, new kx4(lx4Var, 2));
        }
        return i == 3 ? kbv.m55968n(w9zVar, new kx4(lx4Var, 3)) : pbv.f175910b;
    }

    /* JADX INFO: renamed from: h */
    public static whx m60166h(lx4 lx4Var, int i, w9z w9zVar) {
        if (lx4Var.m60169e(i)) {
            return kbv.m55970p(w9zVar, new kx4(lx4Var, 4));
        }
        if (lx4Var.m60170f(i)) {
            return kbv.m55970p(w9zVar, new kx4(lx4Var, 5));
        }
        if (i == 2) {
            return kbv.m55972r(w9zVar, new kx4(lx4Var, 6));
        }
        return i == 3 ? kbv.m55972r(w9zVar, new kx4(lx4Var, 7)) : whx.f251456b;
    }

    @Override // p204p.u691
    /* JADX INFO: renamed from: a */
    public final Object mo60167a() {
        return this.f137716a.m31692f().mo60167a();
    }

    @Override // p204p.u691
    /* JADX INFO: renamed from: c */
    public final Object mo60168c() {
        return this.f137716a.m31692f().mo60168c();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m60169e(int i) {
        if (l0y0.m57830l(i, 0)) {
            return true;
        }
        if (l0y0.m57830l(i, 4) && this.f137718c == ko70.f124556a) {
            return true;
        }
        return l0y0.m57830l(i, 5) && this.f137718c == ko70.f124557b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m60170f(int i) {
        return l0y0.m57830l(i, 1) || (l0y0.m57830l(i, 4) && this.f137718c == ko70.f124557b) || (l0y0.m57830l(i, 5) && this.f137718c == ko70.f124556a);
    }
}
