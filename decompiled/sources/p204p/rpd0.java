package p204p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media3.session.legacy.MediaSessionManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.metadata.classic.proto.Metadata$Episode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rpd0 {

    /* JADX INFO: renamed from: F */
    public static final r201 f201534F = new r201(1);

    /* JADX INFO: renamed from: G */
    public static final j561 f201535G = kgg1.m56358u(new j77(7));

    /* JADX INFO: renamed from: A */
    public final long f201536A;

    /* JADX INFO: renamed from: B */
    public boolean f201537B;

    /* JADX INFO: renamed from: C */
    public final pf40 f201538C;

    /* JADX INFO: renamed from: D */
    public pf40 f201539D;

    /* JADX INFO: renamed from: E */
    public Bundle f201540E;

    /* JADX INFO: renamed from: a */
    public final Object f201541a = new Object();

    /* JADX INFO: renamed from: b */
    public final Uri f201542b;

    /* JADX INFO: renamed from: c */
    public final opd0 f201543c;

    /* JADX INFO: renamed from: d */
    public final npd0 f201544d;

    /* JADX INFO: renamed from: e */
    public final qgd0 f201545e;

    /* JADX INFO: renamed from: f */
    public final Context f201546f;

    /* JADX INFO: renamed from: g */
    public final psd0 f201547g;

    /* JADX INFO: renamed from: h */
    public final pqd0 f201548h;

    /* JADX INFO: renamed from: i */
    public final String f201549i;

    /* JADX INFO: renamed from: j */
    public final n301 f201550j;

    /* JADX INFO: renamed from: k */
    public final ggd0 f201551k;

    /* JADX INFO: renamed from: l */
    public final Handler f201552l;

    /* JADX INFO: renamed from: m */
    public final uh9 f201553m;

    /* JADX INFO: renamed from: n */
    public final kpd0 f201554n;

    /* JADX INFO: renamed from: o */
    public final Handler f201555o;

    /* JADX INFO: renamed from: p */
    public final boolean f201556p;

    /* JADX INFO: renamed from: q */
    public final boolean f201557q;

    /* JADX INFO: renamed from: r */
    public final pf40 f201558r;

    /* JADX INFO: renamed from: s */
    public cap0 f201559s;

    /* JADX INFO: renamed from: t */
    public pdp0 f201560t;

    /* JADX INFO: renamed from: u */
    public PendingIntent f201561u;

    /* JADX INFO: renamed from: v */
    public ppd0 f201562v;

    /* JADX INFO: renamed from: w */
    public esa0 f201563w;

    /* JADX INFO: renamed from: x */
    public tnd0 f201564x;

    /* JADX INFO: renamed from: y */
    public pgd0 f201565y;

    /* JADX INFO: renamed from: z */
    public boolean f201566z;

    public rpd0(ggd0 ggd0Var, Context context, String str, g7p0 g7p0Var, pf40 pf40Var, pf40 pf40Var2, pf40 pf40Var3, qgd0 qgd0Var, Bundle bundle, Bundle bundle2, uh9 uh9Var, boolean z, boolean z2) {
        yif1.m93818w("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + h0b1.f86200a + "]");
        this.f201551k = ggd0Var;
        this.f201546f = context;
        this.f201549i = str;
        this.f201561u = null;
        this.f201538C = pf40Var;
        this.f201539D = pf40Var2;
        this.f201558r = pf40Var3;
        this.f201545e = qgd0Var;
        this.f201540E = bundle2;
        this.f201553m = uh9Var;
        this.f201556p = z;
        this.f201557q = z2;
        psd0 psd0Var = new psd0(this);
        this.f201547g = psd0Var;
        this.f201555o = new Handler(Looper.getMainLooper());
        Looper looperMo43878c0 = g7p0Var.mo43878c0();
        Handler handler = new Handler(looperMo43878c0);
        this.f201552l = handler;
        this.f201559s = cap0.f35848H;
        this.f201543c = new opd0(this, looperMo43878c0);
        this.f201544d = new npd0(this, looperMo43878c0);
        Uri uriBuild = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str == null ? "" : str).build();
        this.f201542b = uriBuild;
        pqd0 pqd0Var = new pqd0(this, uriBuild, handler, bundle, z, pf40Var, pf40Var2, rnd0.f200893g, rnd0.f200894h, bundle2);
        this.f201548h = pqd0Var;
        this.f201550j = new n301(Process.myUid(), 1011000300, 10, context.getPackageName(), psd0Var, bundle, pqd0Var.f180275j.getSessionToken().getToken(), null);
        pdp0 pdp0Var = new pdp0(g7p0Var);
        this.f201560t = pdp0Var;
        h0b1.m46304c0(handler, new zaz(28, this, pdp0Var));
        this.f201536A = 3000L;
        this.f201554n = new kpd0(this, 0);
        h0b1.m46304c0(handler, new kpd0(this, 1));
    }

    /* JADX INFO: renamed from: a */
    public static void m76110a(rpd0 rpd0Var, PendingIntent pendingIntent) {
        rpd0Var.f201561u = pendingIntent;
        psd0 psd0Var = rpd0Var.f201547g;
        pf40 pf40VarM30807u = psd0Var.f180820m.m30807u();
        for (int i = 0; i < pf40VarM30807u.size(); i++) {
            tnd0 tnd0Var = (tnd0) pf40VarM30807u.get(i);
            if (tnd0Var.f221947b >= 3 && psd0Var.f180820m.m30770A(tnd0Var)) {
                rpd0Var.m76122f(tnd0Var, new mcd0(pendingIntent));
                if (rpd0Var.m76131r(tnd0Var)) {
                    try {
                        rpd0Var.f201548h.f180271f.mo51506c(0, pendingIntent);
                    } catch (RemoteException e) {
                        yif1.m93810s("Exception in using media1 API", e);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m76111b(rpd0 rpd0Var, h001 h001Var) {
        pqd0 pqd0Var = rpd0Var.f201548h;
        pf40 pf40VarM30807u = rpd0Var.f201547g.f180820m.m30807u();
        for (int i = 0; i < pf40VarM30807u.size(); i++) {
            tnd0 tnd0Var = (tnd0) pf40VarM30807u.get(i);
            boolean zM76131r = rpd0Var.m76131r(tnd0Var);
            int i2 = tnd0Var.f221947b;
            if (!zM76131r && (i2 == 0 || tnd0Var.f221948c >= 4)) {
                if (rpd0Var.m76131r(tnd0Var) || i2 == 0) {
                    try {
                        pqd0Var.f180271f.mo51510g(0, h001Var);
                    } catch (RemoteException e) {
                        yif1.m93810s("Exception in using media1 API", e);
                    }
                } else {
                    rpd0Var.m76122f(tnd0Var, new zca0(h001Var, 16));
                }
            }
        }
        try {
            pqd0Var.f180271f.mo51510g(0, h001Var);
        } catch (RemoteException e2) {
            yif1.m93810s("Exception in using media1 API", e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m76112c(rpd0 rpd0Var) {
        synchronized (rpd0Var.f201541a) {
            try {
                if (rpd0Var.f201566z) {
                    return;
                }
                final n201 n201VarM69694c1 = rpd0Var.f201560t.m69694c1();
                if (!rpd0Var.f201543c.hasMessages(1) && dzd0.m37446a(n201VarM69694c1, rpd0Var.f201559s.f35892c)) {
                    bxb bxbVar = rpd0Var.f201547g.f180820m;
                    pf40 pf40VarM30807u = bxbVar.m30807u();
                    for (int i = 0; i < pf40VarM30807u.size(); i++) {
                        final tnd0 tnd0Var = (tnd0) pf40VarM30807u.get(i);
                        bxbVar.m30786R();
                        final boolean zM30771B = bxbVar.m30771B(tnd0Var, 16);
                        final boolean zM30771B2 = bxbVar.m30771B(tnd0Var, 17);
                        rpd0Var.m76122f(tnd0Var, new qpd0() { // from class: p.lpd0
                            @Override // p204p.qpd0
                            /* JADX INFO: renamed from: e */
                            public final void mo25926e(snd0 snd0Var, int i2) {
                                snd0Var.mo51505b(i2, n201VarM69694c1, zM30771B, zM30771B2, tnd0Var.f221948c);
                            }
                        });
                    }
                    try {
                        rpd0Var.f201548h.f180271f.mo51505b(0, n201VarM69694c1, true, true, 0);
                    } catch (RemoteException e) {
                        yif1.m93810s("Exception in using media1 API", e);
                    }
                }
                rpd0Var.m76118D();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m76113l(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        return (Objects.equals(uri.getScheme(), "androidx") && Objects.equals(uri.getAuthority(), "media3.session") && !pathSegments.isEmpty()) ? pathSegments.get(0) : "";
    }

    /* JADX INFO: renamed from: t */
    public static boolean m76114t(tnd0 tnd0Var) {
        return tnd0Var != null && Objects.equals(tnd0Var.f221946a.getPackageName(), "com.android.systemui");
    }

    /* JADX INFO: renamed from: A */
    public final void m76115A(Runnable runnable) {
        h0b1.m46304c0(this.f201552l, runnable);
    }

    /* JADX INFO: renamed from: B */
    public final void m76116B() {
        boolean zAwait;
        yif1.m93818w("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + h0b1.f86200a + "] [" + dgd0.m35921b() + "]");
        synchronized (this.f201541a) {
            try {
                if (this.f201566z) {
                    return;
                }
                this.f201566z = true;
                npd0 npd0Var = this.f201544d;
                kgd0 kgd0Var = npd0Var.f156950a;
                if (kgd0Var != null) {
                    npd0Var.removeCallbacks(kgd0Var);
                    npd0Var.f156950a = null;
                }
                this.f201552l.removeCallbacksAndMessages(null);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                try {
                    if (this.f201552l.getLooper().getThread().isAlive()) {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        m76115A(new kgd0((dhd0) this, atomicBoolean, countDownLatch, 3));
                        zAwait = countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                    } else {
                        zAwait = false;
                    }
                } catch (Exception e) {
                    yif1.m93821x0("Exception thrown while closing", e);
                }
                if (zAwait || !atomicBoolean.compareAndSet(false, true)) {
                    return;
                }
                try {
                    this.f201548h.m70642j();
                    this.f201547g.m70786i2();
                } catch (RuntimeException e2) {
                    yif1.m93821x0("Exception thrown during emergency main thread release fallback", e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final tnd0 m76117C(tnd0 tnd0Var) {
        tnd0 tnd0VarM76125j;
        return (this.f201537B && m76114t(tnd0Var) && (tnd0VarM76125j = m76125j()) != null) ? tnd0VarM76125j : tnd0Var;
    }

    /* JADX INFO: renamed from: D */
    public final void m76118D() {
        Handler handler = this.f201552l;
        kpd0 kpd0Var = this.f201554n;
        handler.removeCallbacks(kpd0Var);
        if (this.f201557q) {
            long j = this.f201536A;
            if (j > 0) {
                if (this.f201560t.mo43888i() || this.f201560t.mo43877c()) {
                    handler.postDelayed(kpd0Var, j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m76119E() {
        if (Looper.myLooper() != this.f201552l.getLooper()) {
            throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX INFO: renamed from: d */
    public final boolean m76120d(KeyEvent keyEvent, boolean z, boolean z2) {
        pxi pxiVar;
        rpd0 rpd0Var;
        tnd0 tnd0VarM76125j = this.f201551k.f79643a.m76125j();
        if (tnd0VarM76125j == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 85 || keyCode == 79) && z) {
            keyCode = 87;
        }
        if (keyCode == 79) {
            m76119E();
            if (!this.f201560t.mo43899o()) {
                pxiVar = new pxi(this, tnd0VarM76125j, 2);
            } else {
                pxiVar = new pxi(this, tnd0VarM76125j, 3);
            }
        } else if (keyCode == 126) {
            pxiVar = new pxi(this, tnd0VarM76125j, 4);
        } else if (keyCode == 127) {
            pxiVar = new pxi(this, tnd0VarM76125j, 5);
        } else if (keyCode == 272) {
            pxiVar = new pxi(this, tnd0VarM76125j, 6);
        } else if (keyCode != 273) {
            switch (keyCode) {
                case 85:
                    m76119E();
                    if (!this.f201560t.mo43899o()) {
                        pxiVar = new pxi(this, tnd0VarM76125j, 3);
                    } else {
                        pxiVar = new pxi(this, tnd0VarM76125j, 2);
                    }
                    break;
                case Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                    pxiVar = new pxi(this, tnd0VarM76125j, 1);
                    break;
                case 87:
                    pxiVar = new pxi(this, tnd0VarM76125j, 6);
                    break;
                case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                    pxiVar = new pxi(this, tnd0VarM76125j, 7);
                    break;
                case 89:
                    pxiVar = new pxi(this, tnd0VarM76125j, 9);
                    break;
                case 90:
                    pxiVar = new pxi(this, tnd0VarM76125j, 8);
                    break;
                default:
                    return false;
            }
        } else {
            pxiVar = new pxi(this, tnd0VarM76125j, 7);
        }
        if (z2) {
            zca0 zca0Var = new zca0(new mxz0("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY));
            if (this.f201552l.getLooper() == Looper.myLooper()) {
                m76121e(tnd0VarM76125j, zca0Var);
                rpd0Var = this;
            } else {
                rpd0Var = this;
                m76115A(new feb(rpd0Var, new syw0(), tnd0VarM76125j, zca0Var, 14));
            }
        } else {
            rpd0Var = this;
        }
        pxiVar.run();
        rpd0Var.f201547g.f180820m.m30803q(tnd0VarM76125j);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final u790 m76121e(tnd0 tnd0Var, zca0 zca0Var) {
        int i;
        u790 u790VarM85445A;
        psd0 psd0Var = this.f201547g;
        try {
            mqi0 mqi0VarM30809x = psd0Var.f180820m.m30809x(tnd0Var);
            if (mqi0VarM30809x != null) {
                atz0 atz0VarM62564c = mqi0VarM30809x.m62564c(f201534F);
                i = atz0VarM62564c.f19770e;
                u790VarM85445A = atz0VarM62564c;
            } else {
                if (!mo36025q(tnd0Var)) {
                    return vgg1.m85445A(new r201(-100));
                }
                i = 0;
                u790VarM85445A = vgg1.m85445A(new r201(0));
            }
            snd0 snd0Var = tnd0Var.f221950e;
            if (snd0Var != null) {
                mxz0 mxz0Var = (mxz0) zca0Var.f281486b;
                Bundle bundle = Bundle.EMPTY;
                snd0Var.mo51513j(i, mxz0Var);
            }
            return u790VarM85445A;
        } catch (DeadObjectException unused) {
            psd0Var.f180820m.m30781L(tnd0Var);
            return vgg1.m85445A(new r201(-100));
        } catch (RemoteException e) {
            yif1.m93821x0("Exception in " + tnd0Var, e);
            return vgg1.m85445A(new r201(-1));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m76122f(tnd0 tnd0Var, qpd0 qpd0Var) {
        int iM62565e;
        psd0 psd0Var = this.f201547g;
        try {
            mqi0 mqi0VarM30809x = psd0Var.f180820m.m30809x(tnd0Var);
            if (mqi0VarM30809x != null) {
                iM62565e = mqi0VarM30809x.m62565e();
            } else if (!mo36025q(tnd0Var)) {
                return;
            } else {
                iM62565e = 0;
            }
            snd0 snd0Var = tnd0Var.f221950e;
            if (snd0Var != null) {
                qpd0Var.mo25926e(snd0Var, iM62565e);
            }
        } catch (DeadObjectException unused) {
            psd0Var.f180820m.m30781L(tnd0Var);
        } catch (RemoteException e) {
            yif1.m93821x0("Exception in " + tnd0Var, e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m76123g(qpd0 qpd0Var) {
        pf40 pf40VarM30807u = this.f201547g.f180820m.m30807u();
        for (int i = 0; i < pf40VarM30807u.size(); i++) {
            m76122f((tnd0) pf40VarM30807u.get(i), qpd0Var);
        }
        try {
            qpd0Var.mo25926e(this.f201548h.f180271f, 0);
        } catch (RemoteException e) {
            yif1.m93810s("Exception in using media1 API", e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final Handler m76124h() {
        return this.f201552l;
    }

    /* JADX INFO: renamed from: i */
    public wsv0 mo36024i() {
        m76119E();
        pf40 pf40VarM30807u = this.f201547g.f180820m.m30807u();
        pf40 pf40VarM30807u2 = this.f201548h.f180266a.m30807u();
        jf40 jf40VarM69789n = pf40.m69789n(pf40VarM30807u2.size() + pf40VarM30807u.size());
        if (!this.f201537B) {
            jf40VarM69789n.m28987e(pf40VarM30807u);
            jf40VarM69789n.m28987e(pf40VarM30807u2);
            return jf40VarM69789n.m53150g();
        }
        for (int i = 0; i < pf40VarM30807u.size(); i++) {
            tnd0 tnd0Var = (tnd0) pf40VarM30807u.get(i);
            if (!m76114t(tnd0Var)) {
                jf40VarM69789n.m28985c(tnd0Var);
            }
        }
        for (int i2 = 0; i2 < pf40VarM30807u2.size(); i2++) {
            tnd0 tnd0Var2 = (tnd0) pf40VarM30807u2.get(i2);
            if (!m76114t(tnd0Var2)) {
                jf40VarM69789n.m28985c(tnd0Var2);
            }
        }
        return jf40VarM69789n.m53150g();
    }

    /* JADX INFO: renamed from: j */
    public final tnd0 m76125j() {
        m76119E();
        pf40 pf40VarM30807u = this.f201547g.f180820m.m30807u();
        for (int i = 0; i < pf40VarM30807u.size(); i++) {
            tnd0 tnd0Var = (tnd0) pf40VarM30807u.get(i);
            if (m76131r(tnd0Var)) {
                return tnd0Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final MediaSession.Token m76126k() {
        return this.f201548h.f180275j.getSessionToken().getToken();
    }

    /* JADX INFO: renamed from: m */
    public final tnd0 m76127m() {
        pf40 pf40VarM30807u = this.f201548h.f180266a.m30807u();
        for (int i = 0; i < pf40VarM30807u.size(); i++) {
            tnd0 tnd0Var = (tnd0) pf40VarM30807u.get(i);
            if (m76114t(tnd0Var)) {
                return tnd0Var;
            }
        }
        pf40 pf40VarM30807u2 = this.f201547g.f180820m.m30807u();
        for (int i2 = 0; i2 < pf40VarM30807u2.size(); i2++) {
            tnd0 tnd0Var2 = (tnd0) pf40VarM30807u2.get(i2);
            if (m76114t(tnd0Var2)) {
                return tnd0Var2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final Uri m76128n() {
        return this.f201542b;
    }

    /* JADX INFO: renamed from: o */
    public final void m76129o(b7p0 b7p0Var) {
        this.f201543c.m67525a(false, false);
        m76123g(new kcd0(b7p0Var));
        try {
            nqd0 nqd0Var = this.f201548h.f180271f;
            x6r x6rVar = this.f201559s.f35908s;
            nqd0Var.m65405p();
        } catch (RemoteException e) {
            yif1.m93810s("Exception in using media1 API", e);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m76130p(tnd0 tnd0Var, boolean z) {
        esa0 esa0Var = this.f201563w;
        u790 u790VarM39902c = esa0Var != null ? esa0Var.m39902c(this.f201551k) : vgg1.m85445A(Boolean.TRUE);
        u790VarM39902c.mo28322a(new lk00(22, u790VarM39902c, new fmd0(this, tnd0Var, z)), new xgi(this, 6));
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo36025q(tnd0 tnd0Var);

    /* JADX INFO: renamed from: r */
    public final boolean m76131r(tnd0 tnd0Var) {
        return Objects.equals(tnd0Var.f221946a.getPackageName(), this.f201546f.getPackageName()) && tnd0Var.f221947b != 0 && tnd0Var.m81173b().getBoolean("androidx.media3.session.MediaNotificationManager", false);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m76132s() {
        boolean z;
        synchronized (this.f201541a) {
            z = this.f201566z;
        }
        return z;
    }

    /* JADX INFO: renamed from: u */
    public final u790 m76133u(tnd0 tnd0Var, wsv0 wsv0Var) {
        u790 u790VarM85445A;
        m76117C(tnd0Var);
        this.f201545e.getClass();
        kf40 kf40VarListIterator = wsv0Var.listIterator(0);
        while (kf40VarListIterator.hasNext()) {
            if (((ufd0) kf40VarListIterator.next()).f229763b == null) {
                u790VarM85445A = new qe40(new UnsupportedOperationException());
                return u790VarM85445A;
            }
        }
        u790VarM85445A = vgg1.m85445A(wsv0Var);
        return u790VarM85445A;
    }

    /* JADX INFO: renamed from: v */
    public final te40 m76134v(tnd0 tnd0Var) {
        pf40 pf40VarM69791p;
        pf40 pf40VarM69791p2;
        MediaSessionManager.RemoteUserInfo remoteUserInfo = tnd0Var.f221946a;
        boolean z = this.f201537B;
        pqd0 pqd0Var = this.f201548h;
        if (z && m76114t(tnd0Var)) {
            pqd0Var.getClass();
            nxz0 nxz0Var = nxz0.f159651b;
            b7p0 b7p0Var = b7p0.f24366b;
            nxz0 nxz0Var2 = pqd0Var.f180287v;
            nxz0Var2.getClass();
            b7p0 b7p0Var2 = pqd0Var.f180288w;
            b7p0Var2.getClass();
            if (pqd0Var.f180286u.isEmpty()) {
                pf40 pf40Var = pqd0Var.f180285t;
                pf40VarM69791p = pf40Var == null ? null : pf40.m69791p(pf40Var);
                pf40VarM69791p2 = null;
            } else {
                pf40 pf40Var2 = pqd0Var.f180286u;
                pf40VarM69791p2 = pf40Var2 == null ? null : pf40.m69791p(pf40Var2);
                pf40VarM69791p = null;
            }
            return vgg1.m85445A(new rnd0(true, nxz0Var2, b7p0Var2, pf40VarM69791p, pf40VarM69791p2, null));
        }
        this.f201545e.getClass();
        Logger.m3965a("MLS: onConnect: package=%s, uid=%d", remoteUserInfo.getPackageName(), Integer.valueOf(remoteUserInfo.getUid()));
        nxz0 nxz0Var3 = rnd0.f200893g;
        nxz0Var3.getClass();
        HashSet hashSet = new HashSet(nxz0Var3.f159653a);
        ggd0 ggd0Var = this.f201551k;
        pf40 pf40VarM44691e = ggd0Var.m44691e();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = pf40VarM44691e.iterator();
        while (it.hasNext()) {
            mxz0 mxz0Var = ((bcf) it.next()).f25866a;
            if (mxz0Var != null) {
                arrayList.add(mxz0Var);
            }
        }
        hashSet.addAll(arrayList);
        nxz0 nxz0Var4 = new nxz0(hashSet);
        a7p0 a7p0Var = new a7p0();
        a7p0Var.m24988b();
        rnd0 rnd0VarM76000a = rnd0.m76000a(nxz0Var4, a7p0Var.m24990d());
        if (m76131r(tnd0Var)) {
            this.f201537B = true;
            pf40 pf40VarM44691e2 = ggd0Var.m44691e();
            if (pf40VarM44691e2.isEmpty()) {
                dhd0 dhd0Var = ggd0Var.f79643a;
                dhd0Var.m76119E();
                pqd0Var.f180285t = dhd0Var.f201538C;
            } else {
                pqd0Var.f180286u = pf40VarM44691e2;
                pqd0Var.m70645m();
            }
            pqd0Var.m70643k(rnd0VarM76000a.f200896b, rnd0VarM76000a.f200897c);
        }
        return vgg1.m85445A(rnd0VarM76000a);
    }

    /* JADX INFO: renamed from: w */
    public final y790 m76135w(tnd0 tnd0Var, mxz0 mxz0Var, Bundle bundle) {
        tnd0 tnd0VarM76117C = m76117C(tnd0Var);
        qgd0 qgd0Var = this.f201545e;
        qgd0Var.getClass();
        return qgd0Var.f188446a.m78050c(tnd0VarM76117C.f221946a.getPackageName(), mxz0Var.f148234b, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: x */
    public final boolean m76136x(tnd0 tnd0Var, Intent intent) {
        boolean z;
        pqd0 pqd0Var;
        int i = tnd0Var.f221947b;
        KeyEvent keyEventM80900C = ti5.m80900C(intent);
        ComponentName component = intent.getComponent();
        if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON")) {
            Context context = this.f201546f;
            if ((component == null || Objects.equals(component.getPackageName(), context.getPackageName())) && keyEventM80900C != null) {
                m76119E();
                this.f201545e.getClass();
                if (keyEventM80900C.getAction() != 0) {
                    int keyCode = keyEventM80900C.getKeyCode();
                    if (keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 272 && keyCode != 273) {
                        switch (keyCode) {
                        }
                    }
                    return true;
                }
                int keyCode2 = keyEventM80900C.getKeyCode();
                boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.software.leanback");
                kgd0 kgd0Var = null;
                npd0 npd0Var = this.f201544d;
                if (keyCode2 == 79 || keyCode2 == 85) {
                    if (!zHasSystemFeature && i == 0 && keyEventM80900C.getRepeatCount() == 0) {
                        kgd0 kgd0Var2 = npd0Var.f156950a;
                        if (kgd0Var2 == null) {
                            kgd0 kgd0Var3 = new kgd0(npd0Var, tnd0Var, keyEventM80900C, 5);
                            npd0Var.f156950a = kgd0Var3;
                            npd0Var.postDelayed(kgd0Var3, ViewConfiguration.getDoubleTapTimeout());
                            return true;
                        }
                        if (kgd0Var2 != null) {
                            npd0Var.removeCallbacks(kgd0Var2);
                            npd0Var.f156950a = null;
                        }
                        z = true;
                    } else {
                        kgd0 kgd0Var4 = npd0Var.f156950a;
                        if (kgd0Var4 != null) {
                            npd0Var.removeCallbacks(kgd0Var4);
                            kgd0 kgd0Var5 = npd0Var.f156950a;
                            npd0Var.f156950a = null;
                            kgd0Var = kgd0Var5;
                        }
                        if (kgd0Var != null) {
                            h0b1.m46304c0(npd0Var, kgd0Var);
                        }
                    }
                    if (!this.f201537B) {
                        boolean booleanExtra = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                        if (keyEventM80900C.getRepeatCount() <= 0 || m76120d(keyEventM80900C, z, booleanExtra)) {
                            return true;
                        }
                    } else {
                        pqd0Var = this.f201548h;
                        if ((keyCode2 != 85 || keyCode2 == 79) && z) {
                            pqd0Var.onSkipToNext();
                            return true;
                        }
                        if (i != 0) {
                            pqd0Var.f180275j.getController().dispatchMediaButtonEvent(keyEventM80900C);
                            return true;
                        }
                    }
                } else {
                    kgd0 kgd0Var6 = npd0Var.f156950a;
                    if (kgd0Var6 != null) {
                        npd0Var.removeCallbacks(kgd0Var6);
                        kgd0 kgd0Var7 = npd0Var.f156950a;
                        npd0Var.f156950a = null;
                        kgd0Var = kgd0Var7;
                    }
                    if (kgd0Var != null) {
                        h0b1.m46304c0(npd0Var, kgd0Var);
                    }
                }
                z = false;
                if (!this.f201537B) {
                    boolean booleanExtra2 = intent.getBooleanExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", false);
                    if (keyEventM80900C.getRepeatCount() <= 0) {
                    }
                    return true;
                }
                pqd0Var = this.f201548h;
                if (keyCode2 != 85) {
                    pqd0Var.onSkipToNext();
                    return true;
                }
                pqd0Var.onSkipToNext();
                return true;
                if (i != 0) {
                    pqd0Var.f180275j.getController().dispatchMediaButtonEvent(keyEventM80900C);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m76137y(tnd0 tnd0Var, b7p0 b7p0Var) {
        tnd0 tnd0VarM76117C = m76117C(tnd0Var);
        qgd0 qgd0Var = this.f201545e;
        sgd0 sgd0Var = qgd0Var.f188446a;
        ljn0 ljn0Var = qgd0Var.f188447b;
        List list = ljn0Var.f134106a;
        if (list != null && !list.isEmpty()) {
            if (list.size() != 1) {
                throw new IllegalArgumentException("Adding multiple media items is not supported");
            }
            boolean zM28393a = b7p0Var.m28393a(1);
            if (!b7p0Var.m28393a(2) && !zM28393a) {
                throw new IllegalArgumentException("Play and/or prepare is required when setting media items");
            }
            ufd0 ufd0Var = (ufd0) list.get(0);
            String str = ufd0Var.f229762a;
            pfd0 pfd0Var = ufd0Var.f229767f;
            Uri uri = pfd0Var.f177036a;
            String str2 = pfd0Var.f177037b;
            Bundle bundle = pfd0Var.f177038c;
            int i = bundle != null ? bundle.getInt("android.media.session.extra.LEGACY_STREAM_TYPE", 3) : 3;
            if (!wl51.m88460J0(str)) {
                String packageName = tnd0VarM76117C.f221946a.getPackageName();
                if (!zM28393a) {
                    throw new IllegalArgumentException("Play must be executed when setting media id");
                }
                sgd0Var.getClass();
                sgd0Var.m78049b(packageName, vnd0.f243073h, new rla0(str, i, bundle));
            } else if (uri != null) {
                String packageName2 = tnd0VarM76117C.f221946a.getPackageName();
                if (zM28393a) {
                    sgd0Var.getClass();
                    sgd0Var.m78049b(packageName2, vnd0.f243063X, new rgd0(uri, bundle, 0));
                } else {
                    sgd0Var.getClass();
                    sgd0Var.m78049b(packageName2, vnd0.f243064Y, new rgd0(uri, bundle, 1));
                }
            } else {
                if (str2 == null) {
                    throw new IllegalArgumentException("Set media item without playing is not supported.");
                }
                String packageName3 = tnd0VarM76117C.f221946a.getPackageName();
                if (!zM28393a) {
                    throw new IllegalArgumentException("Play not executed when setting media item with search");
                }
                sgd0Var.getClass();
                sgd0Var.m78049b(packageName3, vnd0.f243074i, new hgb0(22, str2, bundle));
            }
        }
        ljn0Var.f134106a = null;
    }

    /* JADX INFO: renamed from: z */
    public final te40 m76138z(tnd0 tnd0Var, wsv0 wsv0Var, int i, long j) {
        m76117C(tnd0Var);
        this.f201545e.f188447b.f134106a = wsv0Var;
        return vgg1.m85445A(new und0(wsv0Var, i, j));
    }
}
