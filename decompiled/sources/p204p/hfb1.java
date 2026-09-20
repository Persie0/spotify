package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
public final class hfb1 implements cvb0 {

    /* JADX INFO: renamed from: a */
    public final z9j0 f90665a;

    /* JADX INFO: renamed from: b */
    public final ifb1 f90666b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f90667c;

    /* JADX INFO: renamed from: d */
    public final luk f90668d;

    /* JADX INFO: renamed from: e */
    public final i4t0 f90669e;

    /* JADX INFO: renamed from: f */
    public final c9k f90670f;

    /* JADX INFO: renamed from: g */
    public di41 f90671g;

    /* JADX INFO: renamed from: h */
    public boolean f90672h;

    public hfb1(z9j0 z9j0Var, ifb1 ifb1Var, zpn zpnVar, luk lukVar, luk lukVar2, zpn zpnVar2) {
        this.f90665a = z9j0Var;
        this.f90666b = ifb1Var;
        this.f90667c = zpnVar;
        this.f90668d = lukVar;
        this.f90669e = zpnVar2;
        this.f90670f = kk40.m56661c(opo.m67570t(qlg1.m73202g(), lukVar2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m47337a(hfb1 hfb1Var, neb1 neb1Var, ibk ibkVar) throws Throwable {
        gfb1 gfb1Var;
        ifb1 ifb1Var = hfb1Var.f90666b;
        if (ibkVar instanceof gfb1) {
            gfb1Var = (gfb1) ibkVar;
            int i = gfb1Var.f79323c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gfb1Var.f79323c = i - Integer.MIN_VALUE;
            } else {
                gfb1Var = new gfb1(hfb1Var, ibkVar);
            }
        } else {
            gfb1Var = new gfb1(hfb1Var, ibkVar);
        }
        Object obj = gfb1Var.f79321a;
        int i2 = gfb1Var.f79323c;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (!ifb1Var.f101741a) {
                luk lukVar = hfb1Var.f90668d;
                wm81 wm81Var = new wm81(neb1Var, null, 25);
                gfb1Var.f79323c = 1;
                Object objM89557A = x0h1.m89557A(lukVar, wm81Var, gfb1Var);
                yuk yukVar = yuk.f276404a;
                if (objM89557A == yukVar) {
                    return yukVar;
                }
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        ifb1Var.f101741a = true;
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m47338b(hfb1 hfb1Var, boolean z, boolean z2) {
        z9j0 z9j0Var = hfb1Var.f90665a;
        String str = z ? jfb1.f111875b.f243453a : jfb1.f111874a.f243453a;
        if (str == null) {
            throw new IllegalStateException("uri was not set!");
        }
        z9j0Var.mo47348i(new p6j0(str, "", z, false, 0, 0, false, null, null, null), pp91.m70529j(new pqm0("has_expired", Boolean.valueOf(z2))));
        hfb1Var.f90666b.f101742b = true;
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: c */
    public final void mo25302c() {
        if (this.f90672h) {
            return;
        }
        this.f90671g = x0h1.m89578u(this.f90670f, null, 0, new w9a1(this, null, 7), 3);
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: d */
    public final void mo25303d() {
        di41 di41Var = this.f90671g;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
    }

    @Override // p204p.cvb0
    /* JADX INFO: renamed from: g */
    public final void mo25304g(ViewGroup viewGroup) {
    }
}
