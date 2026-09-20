package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class mi21 {

    /* JADX INFO: renamed from: a */
    public static final uxy f143917a = zuj0.m97036A(1.0f);

    /* JADX INFO: renamed from: b */
    public static final uxy f143918b = zuj0.m97057t(1.0f);

    /* JADX INFO: renamed from: c */
    public static final uxy f143919c = zuj0.m97060w(1.0f);

    /* JADX INFO: renamed from: d */
    public static final cbe1 f143920d = fgg1.m41585E(d7f0.f46145P0, false);

    /* JADX INFO: renamed from: e */
    public static final cbe1 f143921e = fgg1.m41585E(d7f0.f46144O0, false);

    /* JADX INFO: renamed from: f */
    public static final cbe1 f143922f = fgg1.m41605t(d7f0.f46142M0, false);

    /* JADX INFO: renamed from: g */
    public static final cbe1 f143923g = fgg1.m41605t(d7f0.f46141L0, false);

    /* JADX INFO: renamed from: h */
    public static final cbe1 f143924h = fgg1.m41582B(d7f0.f46174i, false);

    /* JADX INFO: renamed from: i */
    public static final cbe1 f143925i = fgg1.m41582B(d7f0.f46166e, false);

    /* JADX INFO: renamed from: A */
    public static final fxh0 m61813A(fxh0 fxh0Var, ob3 ob3Var, boolean z) {
        cbe1 cbe1VarM41582B;
        if (!wj50.m88271j(ob3Var, d7f0.f46174i) || z) {
            cbe1VarM41582B = (!wj50.m88271j(ob3Var, d7f0.f46166e) || z) ? fgg1.m41582B(ob3Var, z) : f143925i;
        } else {
            cbe1VarM41582B = f143924h;
        }
        return fxh0Var.mo34315F(cbe1VarM41582B);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ fxh0 m61814B(fxh0 fxh0Var, wb9 wb9Var, int i) {
        if ((i & 1) != 0) {
            wb9Var = d7f0.f46174i;
        }
        return m61813A(fxh0Var, wb9Var, (i & 2) == 0);
    }

    /* JADX INFO: renamed from: C */
    public static final fxh0 m61815C(fxh0 fxh0Var, jb3 jb3Var, boolean z) {
        cbe1 cbe1VarM41585E;
        if (!wj50.m88271j(jb3Var, d7f0.f46145P0) || z) {
            cbe1VarM41585E = (!wj50.m88271j(jb3Var, d7f0.f46144O0) || z) ? fgg1.m41585E(jb3Var, z) : f143921e;
        } else {
            cbe1VarM41585E = f143920d;
        }
        return fxh0Var.mo34315F(cbe1VarM41585E);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ fxh0 m61816D(fxh0 fxh0Var, ub9 ub9Var, int i) {
        if ((i & 1) != 0) {
            ub9Var = d7f0.f46145P0;
        }
        return m61815C(fxh0Var, ub9Var, (i & 2) == 0);
    }

    /* JADX INFO: renamed from: a */
    public static final fxh0 m61817a(fxh0 fxh0Var, float f, float f2) {
        return fxh0Var.mo34315F(new p5a1(f, f2));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ fxh0 m61818b(fxh0 fxh0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return m61817a(fxh0Var, f, f2);
    }

    /* JADX INFO: renamed from: c */
    public static final fxh0 m61819c(float f, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(f == 1.0f ? f143918b : zuj0.m97057t(f));
    }

    /* JADX INFO: renamed from: d */
    public static final fxh0 m61820d(float f, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(f == 1.0f ? f143919c : zuj0.m97060w(f));
    }

    /* JADX INFO: renamed from: f */
    public static final fxh0 m61822f(float f, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(f == 1.0f ? f143917a : zuj0.m97036A(f));
    }

    /* JADX INFO: renamed from: h */
    public static final fxh0 m61824h(float f, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(new ki21(0.0f, f, 0.0f, f, true, 5));
    }

    /* JADX INFO: renamed from: i */
    public static final fxh0 m61825i(fxh0 fxh0Var, float f, float f2) {
        return fxh0Var.mo34315F(new ki21(0.0f, f, 0.0f, f2, true, 5));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ fxh0 m61826j(fxh0 fxh0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return m61825i(fxh0Var, f, f2);
    }

    /* JADX INFO: renamed from: k */
    public static final fxh0 m61827k(float f, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(new ki21(0.0f, f, 0.0f, f, false, 5));
    }

    /* JADX INFO: renamed from: l */
    public static fxh0 m61828l(float f, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(new ki21(0.0f, f, 0.0f, Float.NaN, false, 5));
    }

    /* JADX INFO: renamed from: m */
    public static final fxh0 m61829m(float f, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(new ki21(f, f, f, f, false));
    }

    /* JADX INFO: renamed from: n */
    public static final fxh0 m61830n(fxh0 fxh0Var, float f, float f2) {
        return fxh0Var.mo34315F(new ki21(f, f2, f, f2, false));
    }

    /* JADX INFO: renamed from: o */
    public static fxh0 m61831o(fxh0 fxh0Var, float f, float f2, float f3, float f4, int i) {
        return fxh0Var.mo34315F(new ki21(f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false));
    }

    /* JADX INFO: renamed from: p */
    public static final fxh0 m61832p(float f, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(new ki21(f, 0.0f, f, 0.0f, false, 10));
    }

    /* JADX INFO: renamed from: q */
    public static fxh0 m61833q(fxh0 fxh0Var, float f, float f2, int i) {
        return fxh0Var.mo34315F(new ki21((i & 1) != 0 ? Float.NaN : f, 0.0f, (i & 2) != 0 ? Float.NaN : f2, 0.0f, false, 10));
    }

    /* JADX INFO: renamed from: r */
    public static final fxh0 m61834r(float f, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(new ki21(f, f, f, f, true));
    }

    /* JADX INFO: renamed from: s */
    public static final fxh0 m61835s(fxh0 fxh0Var, float f, float f2) {
        return fxh0Var.mo34315F(new ki21(f, f2, f, f2, true));
    }

    /* JADX INFO: renamed from: t */
    public static final fxh0 m61836t(fxh0 fxh0Var, float f, float f2, float f3, float f4) {
        return fxh0Var.mo34315F(new ki21(f, f2, f3, f4, true));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ fxh0 m61837u(fxh0 fxh0Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 4) != 0) {
            f3 = Float.NaN;
        }
        if ((i & 8) != 0) {
            f4 = Float.NaN;
        }
        return m61836t(fxh0Var, f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: v */
    public static final fxh0 m61838v(float f, fxh0 fxh0Var) {
        return fxh0Var.mo34315F(new ki21(f, 0.0f, f, 0.0f, true, 10));
    }

    /* JADX INFO: renamed from: w */
    public static final fxh0 m61839w(fxh0 fxh0Var, float f, float f2) {
        return fxh0Var.mo34315F(new ki21(f, 0.0f, f2, 0.0f, true, 10));
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ fxh0 m61840x(fxh0 fxh0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return m61839w(fxh0Var, f, f2);
    }

    /* JADX INFO: renamed from: y */
    public static final fxh0 m61841y(fxh0 fxh0Var, vb9 vb9Var, boolean z) {
        cbe1 cbe1VarM41605t;
        if (!wj50.m88271j(vb9Var, d7f0.f46142M0) || z) {
            cbe1VarM41605t = (!wj50.m88271j(vb9Var, d7f0.f46141L0) || z) ? fgg1.m41605t(vb9Var, z) : f143923g;
        } else {
            cbe1VarM41605t = f143922f;
        }
        return fxh0Var.mo34315F(cbe1VarM41605t);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ fxh0 m61842z(fxh0 fxh0Var, vb9 vb9Var, int i) {
        if ((i & 1) != 0) {
            vb9Var = d7f0.f46142M0;
        }
        return m61841y(fxh0Var, vb9Var, (i & 2) == 0);
    }
}
