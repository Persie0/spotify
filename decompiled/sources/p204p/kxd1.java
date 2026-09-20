package p204p;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes3.dex */
public final class kxd1 implements vfj0, WindowInsetsAnimationControlListener {

    /* JADX INFO: renamed from: a */
    public final nv4 f127458a;

    /* JADX INFO: renamed from: b */
    public final View f127459b;

    /* JADX INFO: renamed from: c */
    public final hw11 f127460c;

    /* JADX INFO: renamed from: d */
    public final yqq f127461d;

    /* JADX INFO: renamed from: e */
    public WindowInsetsAnimationController f127462e;

    /* JADX INFO: renamed from: f */
    public boolean f127463f;

    /* JADX INFO: renamed from: g */
    public final CancellationSignal f127464g = new CancellationSignal();

    /* JADX INFO: renamed from: h */
    public float f127465h;

    /* JADX INFO: renamed from: i */
    public di41 f127466i;

    /* JADX INFO: renamed from: t */
    public hqb f127467t;

    public kxd1(nv4 nv4Var, View view, hw11 hw11Var, yqq yqqVar) {
        this.f127458a = nv4Var;
        this.f127459b = view;
        this.f127460c = hw11Var;
        this.f127461d = yqqVar;
    }

    /* JADX INFO: renamed from: a */
    public static final void m57592a(kxd1 kxd1Var, float f) {
        WindowInsetsAnimationController windowInsetsAnimationController = kxd1Var.f127462e;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(kxd1Var.f127460c.mo47253b(windowInsetsAnimationController.getCurrentInsets(), Math.round(f)), 1.0f, 0.0f);
        }
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: P */
    public final long mo25861P(int i, long j) {
        float fMo47252a = this.f127460c.mo47252a(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
        if (fMo47252a > 0.0f) {
            fMo47252a = 0.0f;
        }
        return m57596e(j, fMo47252a);
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) {
        float fMo47252a = this.f127460c.mo47252a(m5b1.m60854d(j2), m5b1.m60855e(j2));
        return m57595d(j2, fMo47252a < 0.0f ? 0.0f : fMo47252a, true, (ibk) fbkVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m57593b() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.f127462e;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.f127462e) != null) {
            windowInsetsAnimationController.finish(this.f127458a.m65722f());
        }
        this.f127462e = null;
        hqb hqbVar = this.f127467t;
        if (hqbVar != null) {
            hqbVar.mo42414g(null, a2g.f11667i);
        }
        this.f127467t = null;
        di41 di41Var = this.f127466i;
        if (di41Var != null) {
            di41Var.mo38779R(new tbz());
        }
        this.f127466i = null;
        this.f127465h = 0.0f;
        this.f127463f = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m57594c() {
        hqb hqbVar = this.f127467t;
        if (hqbVar != null) {
            hqbVar.mo42414g(null, a2g.f11668t);
        }
        di41 di41Var = this.f127466i;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f127462e;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!wj50.m88271j(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: d */
    public final Object m57595d(long j, float f, boolean z, ibk ibkVar) {
        exd1 exd1Var;
        yuk yukVar;
        Object objM48221p;
        long j2;
        Object obj;
        float f2;
        olv0 olv0Var;
        long j3;
        long j4;
        kxd1 kxd1Var = this;
        if (ibkVar instanceof exd1) {
            exd1Var = (exd1) ibkVar;
            int i = exd1Var.f63748f;
            if ((i & Integer.MIN_VALUE) != 0) {
                exd1Var.f63748f = i - Integer.MIN_VALUE;
            } else {
                exd1Var = new exd1(kxd1Var, ibkVar);
            }
        } else {
            exd1Var = new exd1(kxd1Var, ibkVar);
        }
        exd1 exd1Var2 = exd1Var;
        Object obj2 = exd1Var2.f63746d;
        int i2 = exd1Var2.f63748f;
        yuk yukVar2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            di41 di41Var = kxd1Var.f127466i;
            if (di41Var != null) {
                di41Var.mo38779R(new tbz());
            }
            kxd1Var.f127466i = null;
            kxd1Var.f127465h = 0.0f;
            if ((f == 0.0f && !z) || (kxd1Var.f127462e == null && kxd1Var.f127458a.m65722f() == z)) {
                return new m5b1(0L);
            }
            exd1Var2.f63743a = j;
            exd1Var2.f63744b = f;
            exd1Var2.f63748f = 1;
            WindowInsetsAnimationController windowInsetsAnimationController = kxd1Var.f127462e;
            if (windowInsetsAnimationController == null) {
                hqb hqbVar = new hqb(1, seg1.m77914f(exd1Var2));
                hqbVar.m48222q();
                kxd1Var.f127467t = hqbVar;
                if (kxd1Var.f127463f) {
                    yukVar = yukVar2;
                } else {
                    kxd1Var.f127463f = true;
                    WindowInsetsController windowInsetsController = kxd1Var.f127459b.getWindowInsetsController();
                    if (windowInsetsController != null) {
                        yukVar = yukVar2;
                        windowInsetsController.controlWindowInsetsAnimation(kxd1Var.f127458a.f158781a, -1L, null, kxd1Var.f127464g, kxd1Var);
                    } else {
                        yukVar = yukVar2;
                    }
                }
                objM48221p = hqbVar.m48221p();
            } else {
                yukVar = yukVar2;
                objM48221p = windowInsetsAnimationController;
            }
            if (objM48221p != yukVar) {
                j2 = j;
                obj = objM48221p;
                f2 = f;
            }
            return yukVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                j3 = exd1Var2.f63743a;
                olv0Var = exd1Var2.f63745c;
                bga.m29073P(obj2);
                return new m5b1(kxd1Var.f127460c.mo47256f(j3, olv0Var.f166933a));
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j4 = exd1Var2.f63743a;
            bga.m29073P(obj2);
            return new m5b1(kxd1Var.f127460c.mo47256f(j4, 0.0f));
        }
        float f3 = exd1Var2.f63744b;
        j2 = exd1Var2.f63743a;
        bga.m29073P(obj2);
        f2 = f3;
        obj = obj2;
        yukVar = yukVar2;
        WindowInsetsAnimationController windowInsetsAnimationController2 = (WindowInsetsAnimationController) obj;
        if (windowInsetsAnimationController2 == null) {
            return new m5b1(0L);
        }
        int iMo47254c = kxd1Var.f127460c.mo47254c(windowInsetsAnimationController2.getHiddenStateInsets());
        int iMo47254c2 = kxd1Var.f127460c.mo47254c(windowInsetsAnimationController2.getShownStateInsets());
        int iMo47254c3 = kxd1Var.f127460c.mo47254c(windowInsetsAnimationController2.getCurrentInsets());
        if ((f2 <= 0.0f && iMo47254c3 == iMo47254c) || (f2 >= 0.0f && iMo47254c3 == iMo47254c2)) {
            windowInsetsAnimationController2.finish(iMo47254c3 == iMo47254c2);
            kxd1Var.f127462e = null;
            return new m5b1(0L);
        }
        vi5 vi5Var = new vi5(kxd1Var.f127461d);
        float fM85587c = vi5Var.m85587c(f2) + iMo47254c3;
        float f4 = iMo47254c;
        boolean z2 = (fM85587c - f4) / ((float) (iMo47254c2 - iMo47254c)) > 0.5f;
        if (z2) {
            iMo47254c = iMo47254c2;
        }
        if (fM85587c > iMo47254c2 || fM85587c < f4) {
            olv0 olv0Var2 = new olv0();
            hxd1 hxd1Var = new hxd1(f2, iMo47254c3, iMo47254c, iMo47254c2, windowInsetsAnimationController2, vi5Var, null, olv0Var2, this, z2);
            kxd1Var = this;
            exd1Var2.f63745c = olv0Var2;
            exd1Var2.f63743a = j2;
            exd1Var2.f63748f = 2;
            if (kk40.m56684z(hxd1Var, exd1Var2) != yukVar) {
                olv0Var = olv0Var2;
                j3 = j2;
                return new m5b1(kxd1Var.f127460c.mo47256f(j3, olv0Var.f166933a));
            }
        } else {
            long j5 = j2;
            jxd1 jxd1Var = new jxd1(f2, iMo47254c3, iMo47254c, windowInsetsAnimationController2, null, kxd1Var, z2);
            exd1Var2.f63743a = j5;
            exd1Var2.f63748f = 3;
            if (kk40.m56684z(jxd1Var, exd1Var2) != yukVar) {
                j4 = j5;
                return new m5b1(kxd1Var.f127460c.mo47256f(j4, 0.0f));
            }
        }
        return yukVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX INFO: renamed from: e */
    public final long m57596e(long j, float f) {
        kxd1 kxd1Var;
        di41 di41Var = this.f127466i;
        if (di41Var != null) {
            di41Var.mo38779R(new tbz());
            this.f127466i = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f127462e;
        if (f != 0.0f) {
            if (this.f127458a.m65722f() != (f > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.f127465h = 0.0f;
                    if (this.f127463f) {
                        kxd1Var = this;
                    } else {
                        this.f127463f = true;
                        WindowInsetsController windowInsetsController = this.f127459b.getWindowInsetsController();
                        if (windowInsetsController != null) {
                            kxd1Var = this;
                            windowInsetsController.controlWindowInsetsAnimation(this.f127458a.f158781a, -1L, null, this.f127464g, kxd1Var);
                        } else {
                            kxd1Var = this;
                        }
                    }
                    return kxd1Var.f127460c.mo47255e(j);
                }
                int iMo47254c = this.f127460c.mo47254c(windowInsetsAnimationController.getHiddenStateInsets());
                int iMo47254c2 = this.f127460c.mo47254c(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iMo47254c3 = this.f127460c.mo47254c(currentInsets);
                if (iMo47254c3 == (f > 0.0f ? iMo47254c2 : iMo47254c)) {
                    this.f127465h = 0.0f;
                    return 0L;
                }
                float f2 = iMo47254c3 + f + this.f127465h;
                int iM63437n = n0e1.m63437n(Math.round(f2), iMo47254c, iMo47254c2);
                this.f127465h = f2 - Math.round(f2);
                if (iM63437n != iMo47254c3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f127460c.mo47253b(currentInsets, iM63437n), 1.0f, 0.0f);
                }
                return this.f127460c.mo47255e(j);
            }
        }
        return 0L;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: k0 */
    public final long mo25863k0(int i, long j, long j2) {
        float fMo47252a = this.f127460c.mo47252a(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)));
        if (fMo47252a < 0.0f) {
            fMo47252a = 0.0f;
        }
        return m57596e(j2, fMo47252a);
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: m0 */
    public final Object mo25864m0(long j, fbk fbkVar) {
        float fMo47252a = this.f127460c.mo47252a(m5b1.m60854d(j), m5b1.m60855e(j));
        return m57595d(j, fMo47252a > 0.0f ? 0.0f : fMo47252a, false, (ibk) fbkVar);
    }

    public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        m57593b();
    }

    public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        m57593b();
    }

    public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        this.f127462e = windowInsetsAnimationController;
        this.f127463f = false;
        hqb hqbVar = this.f127467t;
        if (hqbVar != null) {
            hqbVar.mo42414g(windowInsetsAnimationController, new dxd1());
        }
        this.f127467t = null;
    }
}
