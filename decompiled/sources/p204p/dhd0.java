package p204p;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaConstants;
import com.spotify.base.java.logging.Logger;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class dhd0 extends rpd0 {

    /* JADX INFO: renamed from: H */
    public final ggd0 f49060H;

    /* JADX INFO: renamed from: I */
    public final qgd0 f49061I;

    /* JADX INFO: renamed from: J */
    public final qd20 f49062J;

    /* JADX INFO: renamed from: K */
    public final qd20 f49063K;

    /* JADX INFO: renamed from: L */
    public final int f49064L;

    public dhd0(ggd0 ggd0Var, Context context, String str, g7p0 g7p0Var, pf40 pf40Var, pf40 pf40Var2, pf40 pf40Var3, qgd0 qgd0Var, Bundle bundle, Bundle bundle2, uh9 uh9Var, boolean z, boolean z2, int i) {
        super(ggd0Var, context, str, g7p0Var, pf40Var, pf40Var2, pf40Var3, qgd0Var, bundle, bundle2, uh9Var, z, z2);
        this.f49060H = ggd0Var;
        this.f49061I = qgd0Var;
        this.f49064L = i;
        this.f49062J = new qd20();
        this.f49063K = new qd20();
    }

    /* JADX INFO: renamed from: F */
    public static ca80 m36011F(egd0 egd0Var, und0 und0Var) {
        pf40 pf40Var = und0Var.f232151a;
        return pf40Var.isEmpty() ? new ca80(-2, SystemClock.elapsedRealtime(), egd0Var, new h001("no error message provided", -2, Bundle.EMPTY), null, 4) : ca80.m32010d(pf40.m69794t((ufd0) pf40Var.get(Math.max(0, Math.min(und0Var.f232152b, pf40Var.size() - 1)))), egd0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static Object m36012Q(Future future) {
        c95.m31855u(future.isDone());
        try {
            return future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            yif1.m93821x0("Library operation failed", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m36013R(int i, ca80 ca80Var) {
        if (ca80Var.f35772a == 0) {
            pf40 pf40Var = (pf40) ca80Var.f35774c;
            pf40Var.getClass();
            if (pf40Var.size() <= i) {
                return;
            }
            throw new IllegalStateException("Invalid size=" + pf40Var.size() + ", pageSize=" + i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0047  */
    /* JADX INFO: renamed from: G */
    public final void m36014G(tnd0 tnd0Var, ca80 ca80Var) {
        int i = this.f49064L;
        if (i == 0 || tnd0Var.f221947b != 0) {
            return;
        }
        int i2 = ca80Var.f35772a;
        pqd0 pqd0Var = this.f201548h;
        if (i2 == -102 || i2 == -105) {
            boolean z = i == 1;
            pqd0Var.getClass();
            egd0 egd0Var = ca80Var.f35776e;
            h001 h001Var = ca80Var.f35777f;
            int iM89721c = x280.m89721c(i2);
            h9p h9pVar = pqd0Var.f180283r;
            if (h9pVar == null || h9pVar.f89013a != iM89721c) {
                String str = h001Var != null ? h001Var.f86094b : "no error message provided";
                Bundle bundle = Bundle.EMPTY;
                if (egd0Var != null) {
                    Bundle bundle2 = egd0Var.f59310a;
                    if (bundle2.containsKey(MediaConstants.PLAYBACK_STATE_EXTRAS_KEY_ERROR_RESOLUTION_ACTION_INTENT)) {
                        bundle = bundle2;
                    } else if (h001Var != null) {
                        bundle = h001Var.f86095c;
                    }
                } else if (h001Var != null) {
                    bundle = h001Var.f86095c;
                }
                pqd0Var.f180283r = new h9p(z, iM89721c, str, bundle);
                rpd0 rpd0Var = pqd0Var.f180269d;
                rpd0Var.m76119E();
                pqd0Var.m70646n(rpd0Var.f201560t);
            }
        }
        if (i2 != 0 || pqd0Var.f180283r == null) {
            return;
        }
        pqd0Var.f180283r = null;
        rpd0 rpd0Var2 = pqd0Var.f180269d;
        rpd0Var2.m76119E();
        pqd0Var.m70646n(rpd0Var2.f201560t);
    }

    /* JADX INFO: renamed from: H */
    public final u790 m36015H(tnd0 tnd0Var, String str, int i, int i2, final egd0 egd0Var) {
        boolean zEquals = Objects.equals(str, "androidx.media3.session.recent.root");
        qgd0 qgd0Var = this.f49061I;
        if (!zEquals) {
            tnd0 tnd0VarM76117C = m76117C(tnd0Var);
            qgd0Var.getClass();
            Logger.m3965a("MLS: onGetChildren: parentId=%s, package=%s, isRecent=%s", str, tnd0VarM76117C.f221946a.getPackageName(), egd0Var != null ? Boolean.valueOf(egd0Var.f59311b) : null);
            u790 u790VarMo13466f = qgd0Var.f188448c.m85429a().mo13466f(this.f49060H, str, egd0Var);
            u790VarMo13466f.mo28322a(new zgd0(this, u790VarMo13466f, tnd0Var, i2, 0), new xgi(this, 4));
            return u790VarMo13466f;
        }
        if (this.f201548h.f180277l == null) {
            return vgg1.m85445A(ca80.m32008b(-6));
        }
        m76119E();
        final int i3 = 1;
        if (this.f201560t.getPlaybackState() == 1) {
            if (this.f201537B) {
                m76125j();
            }
            qgd0Var.getClass();
            qe40 qe40Var = new qe40(new UnsupportedOperationException());
            final int i4 = 0;
            qh00 qh00Var = new qh00() { // from class: p.chd0
                @Override // p204p.qh00
                public final Object apply(Object obj) {
                    switch (i4) {
                        case 0:
                            return dhd0.m36011F(egd0Var, (und0) obj);
                        default:
                            yif1.m93810s("Failed fetching recent media item at boot time.", (Throwable) obj);
                            return new ca80(-1, SystemClock.elapsedRealtime(), egd0Var, new h001("no error message provided", -1, Bundle.EMPTY), null, 4);
                    }
                }
            };
            ckr ckrVar = ckr.f39074a;
            return AbstractRunnableC1730c6.m31496y(AbstractRunnableC2605y9.m93136y(qe40Var, qh00Var, ckrVar), new qh00() { // from class: p.chd0
                @Override // p204p.qh00
                public final Object apply(Object obj) {
                    switch (i3) {
                        case 0:
                            return dhd0.m36011F(egd0Var, (und0) obj);
                        default:
                            yif1.m93810s("Failed fetching recent media item at boot time.", (Throwable) obj);
                            return new ca80(-1, SystemClock.elapsedRealtime(), egd0Var, new h001("no error message provided", -1, Bundle.EMPTY), null, 4);
                    }
                }
            }, ckrVar);
        }
        gfd0 gfd0Var = new gfd0();
        kf40 kf40Var = pf40.f176960b;
        wsv0 wsv0Var = wsv0.f254763e;
        List list = Collections.EMPTY_LIST;
        wsv0 wsv0Var2 = wsv0.f254763e;
        mfd0 mfd0Var = new mfd0();
        pfd0 pfd0Var = pfd0.f177032d;
        nhd0 nhd0Var = new nhd0();
        nhd0Var.f153981r = Boolean.FALSE;
        nhd0Var.f153982s = Boolean.TRUE;
        return vgg1.m85445A(ca80.m32010d(pf40.m69794t(new ufd0("androidx.media3.session.recent.item", new ifd0(gfd0Var), null, new nfd0(mfd0Var), new phd0(nhd0Var), pfd0Var)), egd0Var));
    }

    /* JADX INFO: renamed from: I */
    public final te40 m36016I(tnd0 tnd0Var) {
        m76117C(tnd0Var);
        this.f49061I.getClass();
        te40 te40VarM85445A = vgg1.m85445A(ca80.m32008b(-6));
        te40VarM85445A.mo28322a(new bhd0(this, te40VarM85445A, tnd0Var, 0), new xgi(this, 4));
        return te40VarM85445A;
    }

    /* JADX INFO: renamed from: J */
    public final u790 m36017J(tnd0 tnd0Var, egd0 egd0Var) {
        if (egd0Var == null || !egd0Var.f59311b || !rpd0.m76114t(tnd0Var)) {
            return this.f49061I.f188448c.m85429a().mo13465d(this.f49060H, m76117C(tnd0Var), egd0Var);
        }
        if (this.f201548h.f180277l == null) {
            return vgg1.m85445A(ca80.m32008b(-6));
        }
        gfd0 gfd0Var = new gfd0();
        kf40 kf40Var = pf40.f176960b;
        wsv0 wsv0Var = wsv0.f254763e;
        List list = Collections.EMPTY_LIST;
        wsv0 wsv0Var2 = wsv0.f254763e;
        mfd0 mfd0Var = new mfd0();
        pfd0 pfd0Var = pfd0.f177032d;
        nhd0 nhd0Var = new nhd0();
        nhd0Var.f153981r = Boolean.TRUE;
        nhd0Var.f153982s = Boolean.FALSE;
        return vgg1.m85445A(ca80.m32009c(new ufd0("androidx.media3.session.recent.root", new ifd0(gfd0Var), null, new nfd0(mfd0Var), new phd0(nhd0Var), pfd0Var), egd0Var));
    }

    /* JADX INFO: renamed from: K */
    public final u790 m36018K(tnd0 tnd0Var, String str, int i, int i2, egd0 egd0Var) {
        u790 u790VarMo13464b = this.f49061I.f188448c.m85429a().mo13464b(this.f49060H, m76117C(tnd0Var), str, egd0Var);
        u790VarMo13464b.mo28322a(new zgd0(this, u790VarMo13464b, tnd0Var, i2, 1), new xgi(this, 4));
        return u790VarMo13464b;
    }

    /* JADX INFO: renamed from: L */
    public final te40 m36019L(tnd0 tnd0Var, String str, egd0 egd0Var) {
        tnd0 tnd0VarM76117C = m76117C(tnd0Var);
        this.f49061I.getClass();
        ggd0 ggd0Var = this.f49060H;
        ggd0Var.getClass();
        c95.m31843i(!TextUtils.isEmpty(str));
        dhd0 dhd0Var = ggd0Var.f79643a;
        tnd0VarM76117C.getClass();
        dhd0Var.getClass();
        dhd0Var.m36022O(new feb(dhd0Var, tnd0VarM76117C, str, egd0Var, 11));
        te40 te40VarM85445A = vgg1.m85445A(ca80.m32011e());
        te40VarM85445A.mo28322a(new bhd0(this, te40VarM85445A, tnd0Var, 1), new xgi(this, 4));
        return te40VarM85445A;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005f */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final te40 m36020M(tnd0 tnd0Var, String str, egd0 egd0Var) {
        snd0 snd0Var = tnd0Var.f221950e;
        snd0Var.getClass();
        synchronized (this) {
            try {
                this.f49063K.m43936j(snd0Var, str);
                this.f49062J.m43936j(str, tnd0Var);
            } catch (Throwable th) {
                th = th;
                while (true) {
                    throw th;
                }
            }
        }
        qgd0 qgd0Var = this.f49061I;
        ggd0 ggd0Var = this.f49060H;
        tnd0 tnd0VarM76117C = m76117C(tnd0Var);
        qgd0Var.getClass();
        Logger.m3965a("MLS: onSubscribe: parentId=%s, package=%s, uid=%d", str, tnd0VarM76117C.f221946a.getPackageName(), Integer.valueOf(tnd0VarM76117C.f221946a.getUid()));
        qgd0Var.f188448c.m85429a().mo13467h(ggd0Var, str);
        te40 te40VarM85445A = vgg1.m85445A(ca80.m32011e());
        te40VarM85445A.mo28322a(new feb(this, te40VarM85445A, tnd0Var, str, 10), new xgi(this, 4));
        return te40VarM85445A;
    }

    /* JADX INFO: renamed from: N */
    public final te40 m36021N(tnd0 tnd0Var, String str) {
        m76117C(tnd0Var);
        this.f49061I.f188448c.m85429a().mo13463a(this.f49060H, str);
        te40 te40VarM85445A = vgg1.m85445A(ca80.m32011e());
        te40VarM85445A.mo28322a(new kgd0(this, tnd0Var, str, 1), new xgi(this, 4));
        return te40VarM85445A;
    }

    /* JADX INFO: renamed from: O */
    public final void m36022O(Runnable runnable) {
        h0b1.m46304c0(this.f201552l, runnable);
    }

    /* JADX INFO: renamed from: P */
    public final synchronized void m36023P(tnd0 tnd0Var, String str) {
        snd0 snd0Var = tnd0Var.f221950e;
        snd0Var.getClass();
        this.f49062J.remove(str, tnd0Var);
        this.f49063K.remove(snd0Var, str);
    }

    @Override // p204p.rpd0
    /* JADX INFO: renamed from: i */
    public final wsv0 mo36024i() {
        pgd0 pgd0Var;
        wsv0 wsv0VarMo36024i = super.mo36024i();
        synchronized (this.f201541a) {
            pgd0Var = this.f201565y;
        }
        if (pgd0Var == null) {
            return wsv0VarMo36024i;
        }
        pf40 pf40VarM30807u = pgd0Var.f157497c.m30807u();
        jf40 jf40VarM69789n = pf40.m69789n(pf40VarM30807u.size() + wsv0VarMo36024i.f254765d);
        jf40VarM69789n.m28987e(wsv0VarMo36024i);
        jf40VarM69789n.m28987e(pf40VarM30807u);
        return jf40VarM69789n.m53150g();
    }

    @Override // p204p.rpd0
    /* JADX INFO: renamed from: q */
    public final boolean mo36025q(tnd0 tnd0Var) {
        pgd0 pgd0Var;
        if (this.f201547g.f180820m.m30770A(tnd0Var) || this.f201548h.f180266a.m30770A(tnd0Var)) {
            return true;
        }
        synchronized (this.f201541a) {
            pgd0Var = this.f201565y;
        }
        return pgd0Var != null && pgd0Var.f157497c.m30770A(tnd0Var);
    }
}
