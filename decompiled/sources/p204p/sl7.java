package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sl7 implements fnj0 {

    /* JADX INFO: renamed from: a */
    public final kkr0 f210305a;

    /* JADX INFO: renamed from: b */
    public final g301 f210306b;

    /* JADX INFO: renamed from: c */
    public final w201 f210307c;

    /* JADX INFO: renamed from: d */
    public final ig40 f210308d;

    /* JADX INFO: renamed from: e */
    public final c9k f210309e;

    /* JADX INFO: renamed from: f */
    public final zl7 f210310f;

    /* JADX INFO: renamed from: g */
    public final yum0 f210311g;

    public sl7(kkr0 kkr0Var, g301 g301Var, w201 w201Var, zl7 zl7Var, ig40 ig40Var) {
        this.f210305a = kkr0Var;
        this.f210306b = g301Var;
        this.f210307c = w201Var;
        this.f210308d = ig40Var;
        n5q n5qVar = xsr.f265651a;
        rb20 rb20Var = pvb0.f181680a;
        x461 x461VarM64613f = njg1.m64613f();
        rb20Var.getClass();
        c9k c9kVarM56661c = kk40.m56661c(opo.m67570t(rb20Var, x461VarM64613f));
        this.f210309e = c9kVarM56661c;
        zl7Var = zl7Var instanceof wl7 ? yl7.f273926a : zl7Var;
        this.f210310f = zl7Var;
        this.f210311g = sam.m77645B(zl7Var);
        x0h1.m89578u(c9kVarM56661c, null, 0, new cg5(this, (fbk) null, 3), 3);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m78440a(e301 e301Var) {
        return (!e301Var.f55572b || e301Var.f55573c || e301Var.f55574d) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m78441b(e301 e301Var) {
        return (e301Var.f55572b || e301Var.f55573c || e301Var.f55574d) ? false : true;
    }

    @Override // p204p.fnj0
    public final void dispose() {
        kk40.m56680v(this.f210309e, null);
    }
}
