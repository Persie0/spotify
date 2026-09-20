package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jmz0 extends d6a0 {

    /* JADX INFO: renamed from: d */
    public final pgo f113967d;

    /* JADX INFO: renamed from: e */
    public final u091 f113968e;

    /* JADX INFO: renamed from: f */
    public final rnz0 f113969f;

    /* JADX INFO: renamed from: g */
    public final boolean f113970g;

    /* JADX INFO: renamed from: h */
    public final c9k f113971h;

    /* JADX INFO: renamed from: i */
    public vy81 f113972i = new vy81();

    public jmz0(pgo pgoVar, u091 u091Var, rnz0 rnz0Var, boolean z, luk lukVar) {
        this.f113967d = pgoVar;
        this.f113968e = u091Var;
        this.f113969f = rnz0Var;
        this.f113970g = z;
        this.f113971h = p3n0.m69075f(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public static final Object m53803k(jmz0 jmz0Var, ibk ibkVar) {
        fmz0 fmz0Var;
        if (ibkVar instanceof fmz0) {
            fmz0Var = (fmz0) ibkVar;
            int i = fmz0Var.f71136c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fmz0Var.f71136c = i - Integer.MIN_VALUE;
            } else {
                fmz0Var = new fmz0(jmz0Var, ibkVar);
            }
        } else {
            fmz0Var = new fmz0(jmz0Var, ibkVar);
        }
        Object objM86755t = fmz0Var.f71134a;
        int i2 = fmz0Var.f71136c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            phw0 phw0Var = new phw0(fag1.m41173v(jmz0Var.f113967d, pag1.m69487w(new rko(oyq0.f171866f, 1, vgz0.f241348P0, new pko(vgz0.f241350R0), vgz0.f241349Q0), vgz0.f241351S0), new qpu0(jmz0Var.f113969f.f201027a, null, false, 10)), 2);
            fmz0Var.f71136c = 1;
            objM86755t = vyf1.m86755t(phw0Var, fmz0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        qho qhoVar = (qho) objM86755t;
        if (qhoVar instanceof oho) {
            return (vy81) ((oho) qhoVar).f165512a;
        }
        if (qhoVar instanceof nho) {
            throw new IllegalStateException(((nho) qhoVar).f154041a.getMessage());
        }
        throw new IllegalStateException(("Unexpected DataResult state: " + qhoVar).toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public static final Object m53804l(jmz0 jmz0Var, ibk ibkVar) {
        imz0 imz0Var;
        if (ibkVar instanceof imz0) {
            imz0Var = (imz0) ibkVar;
            int i = imz0Var.f103796c;
            if ((i & Integer.MIN_VALUE) != 0) {
                imz0Var.f103796c = i - Integer.MIN_VALUE;
            } else {
                imz0Var = new imz0(jmz0Var, ibkVar);
            }
        } else {
            imz0Var = new imz0(jmz0Var, ibkVar);
        }
        Object objM86755t = imz0Var.f103794a;
        int i2 = imz0Var.f103796c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            ia2 ia2Var = new ia2(xtm0.m92074U(new lcu0(22, jmz0Var.f113968e.m82113a(jmz0Var.f113969f.f201027a), jmz0Var), new sb90((fbk) null, jmz0Var, pag1.m69487w(new rko(oyq0.f171866f, 1, vgz0.f241352T0, new pko(vgz0.f241354V0), vgz0.f241353U0), vgz0.f241355W0), 24)), 22);
            imz0Var.f103796c = 1;
            objM86755t = vyf1.m86755t(ia2Var, imz0Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        qho qhoVar = (qho) objM86755t;
        if (qhoVar instanceof oho) {
            return (vy81) ((oho) qhoVar).f165512a;
        }
        if (qhoVar instanceof nho) {
            throw new IllegalStateException(((nho) qhoVar).f154041a.getMessage());
        }
        throw new IllegalStateException(("Unexpected DataResult state: " + qhoVar).toString());
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        if (this.f113972i.f246009a.length() > 0) {
            m35106i();
            return;
        }
        m35107j();
        x0h1.m89578u(this.f113971h, null, 0, new xay0(this, (fbk) null, 10), 3);
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        kk40.m56680v(this.f113971h, null);
    }
}
