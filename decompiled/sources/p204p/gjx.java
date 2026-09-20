package p204p;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class gjx extends ox8 implements ExoPlayer {

    /* JADX INFO: renamed from: A */
    public final mwt0 f80577A;

    /* JADX INFO: renamed from: B */
    public final long f80578B;

    /* JADX INFO: renamed from: C */
    public final dy0 f80579C;

    /* JADX INFO: renamed from: D */
    public final ykn f80580D;

    /* JADX INFO: renamed from: E */
    public final fjx f80581E;

    /* JADX INFO: renamed from: F */
    public final nps f80582F;

    /* JADX INFO: renamed from: G */
    public final nps f80583G;

    /* JADX INFO: renamed from: H */
    public int f80584H;

    /* JADX INFO: renamed from: I */
    public boolean f80585I;

    /* JADX INFO: renamed from: J */
    public int f80586J;

    /* JADX INFO: renamed from: K */
    public int f80587K;

    /* JADX INFO: renamed from: L */
    public boolean f80588L;

    /* JADX INFO: renamed from: M */
    public boolean f80589M;

    /* JADX INFO: renamed from: N */
    public hg40 f80590N;

    /* JADX INFO: renamed from: O */
    public final loy0 f80591O;

    /* JADX INFO: renamed from: P */
    public qv11 f80592P;

    /* JADX INFO: renamed from: Q */
    public b7p0 f80593Q;

    /* JADX INFO: renamed from: R */
    public phd0 f80594R;

    /* JADX INFO: renamed from: S */
    public phd0 f80595S;

    /* JADX INFO: renamed from: T */
    public Object f80596T;

    /* JADX INFO: renamed from: U */
    public Surface f80597U;

    /* JADX INFO: renamed from: V */
    public SurfaceHolder f80598V;

    /* JADX INFO: renamed from: W */
    public y541 f80599W;

    /* JADX INFO: renamed from: X */
    public boolean f80600X;

    /* JADX INFO: renamed from: Y */
    public TextureView f80601Y;

    /* JADX INFO: renamed from: Z */
    public int f80602Z;

    /* JADX INFO: renamed from: a0 */
    public di21 f80603a0;

    /* JADX INFO: renamed from: b */
    public final hr81 f80604b;

    /* JADX INFO: renamed from: b0 */
    public hro f80605b0;

    /* JADX INFO: renamed from: c */
    public final b7p0 f80606c;

    /* JADX INFO: renamed from: c0 */
    public xs6 f80607c0;

    /* JADX INFO: renamed from: d */
    public final fhi f80608d = new fhi();

    /* JADX INFO: renamed from: d0 */
    public float f80609d0;

    /* JADX INFO: renamed from: e */
    public final Context f80610e;

    /* JADX INFO: renamed from: e0 */
    public float f80611e0;

    /* JADX INFO: renamed from: f */
    public final g7p0 f80612f;

    /* JADX INFO: renamed from: f0 */
    public boolean f80613f0;

    /* JADX INFO: renamed from: g */
    public final o09[] f80614g;

    /* JADX INFO: renamed from: g0 */
    public o0m f80615g0;

    /* JADX INFO: renamed from: h */
    public final o09[] f80616h;

    /* JADX INFO: renamed from: h0 */
    public final boolean f80617h0;

    /* JADX INFO: renamed from: i */
    public final ckc0 f80618i;

    /* JADX INFO: renamed from: i0 */
    public boolean f80619i0;

    /* JADX INFO: renamed from: j */
    public final kh61 f80620j;

    /* JADX INFO: renamed from: j0 */
    public final int f80621j0;

    /* JADX INFO: renamed from: k */
    public final rix f80622k;

    /* JADX INFO: renamed from: k0 */
    public boolean f80623k0;

    /* JADX INFO: renamed from: l */
    public final qjx f80624l;

    /* JADX INFO: renamed from: l0 */
    public final x6r f80625l0;

    /* JADX INFO: renamed from: m */
    public final n890 f80626m;

    /* JADX INFO: renamed from: m0 */
    public k9c1 f80627m0;

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArraySet f80628n;

    /* JADX INFO: renamed from: n0 */
    public final long f80629n0;

    /* JADX INFO: renamed from: o */
    public final bp71 f80630o;

    /* JADX INFO: renamed from: o0 */
    public final long f80631o0;

    /* JADX INFO: renamed from: p */
    public final ArrayList f80632p;

    /* JADX INFO: renamed from: p0 */
    public final long f80633p0;

    /* JADX INFO: renamed from: q */
    public final boolean f80634q;

    /* JADX INFO: renamed from: q0 */
    public phd0 f80635q0;

    /* JADX INFO: renamed from: r */
    public final usd0 f80636r;

    /* JADX INFO: renamed from: r0 */
    public a0p0 f80637r0;

    /* JADX INFO: renamed from: s */
    public final xwo f80638s;

    /* JADX INFO: renamed from: s0 */
    public int f80639s0;

    /* JADX INFO: renamed from: t */
    public final Looper f80640t;

    /* JADX INFO: renamed from: t0 */
    public long f80641t0;

    /* JADX INFO: renamed from: u */
    public final at8 f80642u;

    /* JADX INFO: renamed from: v */
    public final gh61 f80643v;

    /* JADX INFO: renamed from: w */
    public final bjx f80644w;

    /* JADX INFO: renamed from: x */
    public final cjx f80645x;

    /* JADX INFO: renamed from: y */
    public final m12 f80646y;

    /* JADX INFO: renamed from: z */
    public final ey9 f80647z;

    static {
        dgd0.m35920a("media3.exoplayer");
    }

    public gjx(kix kixVar, pc21 pc21Var) {
        fjx fjxVar;
        try {
            yif1.m93818w("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + h0b1.f86200a + "]");
            Context context = kixVar.f123107a;
            this.f80610e = context.getApplicationContext();
            qg9 qg9Var = kixVar.f123114h;
            gh61 gh61Var = kixVar.f123108b;
            qg9Var.getClass();
            this.f80638s = new xwo(gh61Var);
            this.f80621j0 = kixVar.f123116j;
            this.f80607c0 = kixVar.f123117k;
            this.f80602Z = kixVar.f123118l;
            this.f80613f0 = false;
            this.f80578B = kixVar.f123127u;
            bjx bjxVar = new bjx(this);
            this.f80644w = bjxVar;
            this.f80645x = new cjx();
            Handler handler = new Handler(kixVar.f123115i);
            wkw0 wkw0Var = (wkw0) kixVar.f123109c.get();
            o09[] o09VarArrMo34786b = wkw0Var.mo34786b(handler, bjxVar, bjxVar, bjxVar, bjxVar);
            this.f80614g = o09VarArrMo34786b;
            c95.m31855u(o09VarArrMo34786b.length > 0);
            this.f80616h = new o09[o09VarArrMo34786b.length];
            int i = 0;
            while (true) {
                o09[] o09VarArr = this.f80616h;
                if (i >= o09VarArr.length) {
                    break;
                }
                wkw0Var.mo34785a(this.f80614g[i]);
                o09VarArr[i] = null;
                i++;
            }
            ckc0 ckc0Var = (ckc0) kixVar.f123111e.get();
            this.f80618i = ckc0Var;
            this.f80636r = (usd0) kixVar.f123110d.get();
            at8 at8Var = (at8) kixVar.f123113g.get();
            this.f80642u = at8Var;
            this.f80634q = kixVar.f123119m;
            mdz0 mdz0Var = kixVar.f123120n;
            this.f80629n0 = kixVar.f123122p;
            this.f80631o0 = kixVar.f123123q;
            this.f80633p0 = kixVar.f123124r;
            this.f80591O = kixVar.f123121o;
            Looper looper = kixVar.f123115i;
            this.f80640t = looper;
            gh61 gh61Var2 = kixVar.f123108b;
            this.f80643v = gh61Var2;
            g7p0 g7p0Var = pc21Var == null ? this : pc21Var;
            this.f80612f = g7p0Var;
            this.f80626m = new n890(looper, gh61Var2, new eqp(this));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f80628n = copyOnWriteArraySet;
            this.f80632p = new ArrayList();
            this.f80592P = new qv11();
            o09[] o09VarArr2 = this.f80614g;
            hr81 hr81Var = new hr81(new qkw0[o09VarArr2.length], new xjx[o09VarArr2.length], tt81.f223553b, (Object) null);
            this.f80604b = hr81Var;
            this.f80630o = new bp71();
            a7p0 a7p0Var = new a7p0();
            a7p0Var.f13116a.m96476i(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            ckc0Var.getClass();
            a7p0Var.m24989c(29, true);
            a7p0Var.m24989c(23, false);
            a7p0Var.m24989c(25, false);
            a7p0Var.m24989c(33, false);
            a7p0Var.m24989c(26, false);
            a7p0Var.m24989c(34, false);
            b7p0 b7p0VarM24990d = a7p0Var.m24990d();
            this.f80606c = b7p0VarM24990d;
            a7p0 a7p0Var2 = new a7p0();
            zmn0 zmn0Var = a7p0Var2.f13116a;
            zmn0Var.m96475h(b7p0VarM24990d.f24368a);
            zmn0Var.m96474f(4);
            zmn0Var.m96474f(10);
            this.f80593Q = a7p0Var2.m24990d();
            this.f80620j = gh61Var2.m44723a(looper, null);
            rix rixVar = new rix(this, 0);
            this.f80622k = rixVar;
            this.f80637r0 = a0p0.m24372k(hr81Var);
            this.f80638s.m92298b0(g7p0Var, looper);
            w9p0 w9p0Var = new w9p0(kixVar.f123104B);
            qjx qjxVar = new qjx(this.f80610e, this.f80614g, this.f80616h, ckc0Var, hr81Var, (j0a0) kixVar.f123112f.get(), at8Var, this.f80584H, this.f80585I, this.f80638s, mdz0Var, kixVar.f123125s, kixVar.f123126t, kixVar.f123105C, looper, gh61Var2, rixVar, w9p0Var, this.f80645x, kixVar.f123106D);
            kh61 kh61Var = qjxVar.f189355g;
            this.f80624l = qjxVar;
            Looper looper2 = qjxVar.f189359i;
            this.f80609d0 = 1.0f;
            this.f80584H = 0;
            phd0 phd0Var = phd0.f177558M;
            this.f80594R = phd0Var;
            this.f80595S = phd0Var;
            this.f80635q0 = phd0Var;
            this.f80639s0 = -1;
            this.f80615g0 = o0m.f160423d;
            this.f80617h0 = true;
            mo43839I(this.f80638s);
            at8Var.mo27124c(new Handler(looper), this.f80638s);
            copyOnWriteArraySet.add(this.f80644w);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                Context context2 = this.f80610e;
                boolean z = kixVar.f123132z;
                Looper looper3 = qjxVar.f189359i;
                fjxVar = null;
                gh61Var2.m44723a(looper3, null).m56388f(new zix(context2, z, this, w9p0Var));
            } else {
                fjxVar = null;
            }
            dy0 dy0Var = new dy0(0, looper2, looper, gh61Var2, new rix(this, 1));
            this.f80579C = dy0Var;
            dy0Var.m37284F(new kep(this, 19));
            fjx fjxVar2 = fjxVar;
            m12 m12Var = new m12(kixVar.f123107a, looper2, kixVar.f123115i, this.f80644w, gh61Var2);
            this.f80646y = m12Var;
            m12Var.m60508W();
            boolean z2 = (kixVar.f123128v == Integer.MAX_VALUE || kixVar.f123129w == Integer.MAX_VALUE || kixVar.f123130x == Integer.MAX_VALUE || kixVar.f123131y == Integer.MAX_VALUE) ? false : true;
            ey9 ey9Var = new ey9(context, looper2, gh61Var2);
            this.f80647z = ey9Var;
            if (ey9Var.f63990a != z2) {
                ey9Var.f63990a = z2;
                ey9Var.m40300m(z2, ey9Var.f63991b);
            }
            this.f80577A = new mwt0(context, looper2, gh61Var2);
            this.f80625l0 = x6r.f258724e;
            this.f80627m0 = k9c1.f120559d;
            this.f80603a0 = di21.f49218c;
            this.f80581E = i2 >= 34 ? new fjx(this, context) : fjxVar2;
            this.f80582F = new nps();
            this.f80583G = new nps();
            this.f80580D = new ykn(this, this.f80644w, gh61Var2, kixVar.f123128v, kixVar.f123129w, kixVar.f123130x, kixVar.f123131y);
            kh61Var.m56387d(38, this.f80591O).m53364b();
            kh61Var.m56386c(31, 0, this.f80607c0, 0).m53364b();
            m45013w1(1, 3, this.f80607c0);
            m45013w1(2, 4, Integer.valueOf(this.f80602Z));
            m45013w1(2, 5, 0);
            m45013w1(1, 9, Boolean.valueOf(this.f80613f0));
            m45013w1(6, 8, this.f80645x);
            m45013w1(-1, 16, Integer.valueOf(this.f80621j0));
        } finally {
            this.f80608d.m41672f();
        }
    }

    /* JADX INFO: renamed from: o1 */
    public static long m44990o1(a0p0 a0p0Var) {
        mp71 mp71Var = new mp71();
        bp71 bp71Var = new bp71();
        a0p0Var.f11132a.mo46978g(a0p0Var.f11133b.f244408a, bp71Var);
        long j = a0p0Var.f11134c;
        return j == -9223372036854775807L ? a0p0Var.f11132a.mo26654n(bp71Var.f29345c, mp71Var, 0L).f145937l : bp71Var.f29347e + j;
    }

    /* JADX INFO: renamed from: p1 */
    public static a0p0 m44991p1(a0p0 a0p0Var, int i) {
        a0p0 a0p0VarM24380h = a0p0Var.m24380h(i);
        return (i == 1 || i == 4) ? a0p0VarM24380h.m24374b(false) : a0p0VarM24380h;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: A */
    public final void mo43825A() {
        m44996E1();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: A0 */
    public final int mo43826A0() {
        m44996E1();
        if (mo43901p()) {
            return this.f80637r0.f11133b.f244410c;
        }
        return -1;
    }

    /* JADX INFO: renamed from: A1 */
    public final void m44992A1() {
        b7p0 b7p0Var = this.f80593Q;
        String str = h0b1.f86200a;
        g7p0 g7p0Var = this.f80612f;
        boolean zMo43901p = g7p0Var.mo43901p();
        boolean zMo43844K0 = g7p0Var.mo43844K0();
        boolean zMo43917y0 = g7p0Var.mo43917y0();
        boolean zMo43859T = g7p0Var.mo43859T();
        boolean zMo43874a1 = g7p0Var.mo43874a1();
        boolean zMo43870Z = g7p0Var.mo43870Z();
        boolean zM73436p = g7p0Var.mo43876b0().m73436p();
        a7p0 a7p0Var = new a7p0();
        a7p0Var.f13116a.m96475h(this.f80606c.f24368a);
        boolean z = !zMo43901p;
        a7p0Var.m24989c(4, z);
        boolean z2 = false;
        a7p0Var.m24989c(5, zMo43844K0 && !zMo43901p);
        a7p0Var.m24989c(6, zMo43917y0 && !zMo43901p);
        a7p0Var.m24989c(7, !zM73436p && (zMo43917y0 || !zMo43874a1 || zMo43844K0) && !zMo43901p);
        a7p0Var.m24989c(8, zMo43859T && !zMo43901p);
        a7p0Var.m24989c(9, !zM73436p && (zMo43859T || (zMo43874a1 && zMo43870Z)) && !zMo43901p);
        a7p0Var.m24989c(10, z);
        a7p0Var.m24989c(11, zMo43844K0 && !zMo43901p);
        if (zMo43844K0 && !zMo43901p) {
            z2 = true;
        }
        a7p0Var.m24989c(12, z2);
        b7p0 b7p0VarM24990d = a7p0Var.m24990d();
        this.f80593Q = b7p0VarM24990d;
        if (b7p0VarM24990d.equals(b7p0Var)) {
            return;
        }
        this.f80626m.m63834e(13, new rix(this, 2));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: B */
    public final void mo43827B(int i) {
        m44996E1();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: B0 */
    public final void mo43828B0(dr81 dr81Var) {
        dr81 dr81VarMo33726b;
        m44996E1();
        ckc0 ckc0Var = this.f80618i;
        ckc0Var.getClass();
        dr81 dr81VarMo43882e0 = mo43882e0();
        if (this.f80589M) {
            this.f80590N = dr81Var.f52240I;
            hg40 hg40Var = this.f80591O.f135574a;
            cr81 cr81VarMo36707a = dr81Var.mo36707a();
            o3a1 it = hg40Var.iterator();
            while (it.hasNext()) {
                cr81VarMo36707a.m33732i(((Integer) it.next()).intValue(), true);
            }
            dr81VarMo33726b = cr81VarMo36707a.mo33726b();
        } else {
            dr81VarMo33726b = dr81Var;
        }
        if (!dr81VarMo33726b.equals(((req) ckc0Var).f198409f)) {
            ckc0Var.mo33116c(dr81VarMo33726b);
        }
        if (dr81VarMo43882e0.equals(dr81Var)) {
            return;
        }
        this.f80626m.m63839j(19, new wix(dr81Var, 0));
    }

    /* JADX INFO: renamed from: B1 */
    public final void m44993B1(int i, boolean z) {
        int i2;
        if (this.f80589M) {
            i2 = 4;
        } else {
            i2 = (this.f80637r0.f11145n != 1 || z) ? 0 : 1;
        }
        a0p0 a0p0VarM24373a = this.f80637r0;
        if (a0p0VarM24373a.f11143l == z && a0p0VarM24373a.f11145n == i2 && a0p0VarM24373a.f11144m == i) {
            return;
        }
        this.f80586J++;
        if (a0p0VarM24373a.f11147p) {
            a0p0VarM24373a = a0p0VarM24373a.m24373a();
        }
        a0p0 a0p0VarM24377e = a0p0VarM24373a.m24377e(i, i2, z);
        this.f80624l.f189355g.m56385b(1, z ? 1 : 0, i | (i2 << 4)).m53364b();
        m44994C1(a0p0VarM24377e, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: C */
    public final void mo43829C(int i, int i2, List list) {
        m44996E1();
        c95.m31843i(i >= 0 && i2 >= i);
        ArrayList arrayList = this.f80632p;
        int size = arrayList.size();
        if (i > size) {
            return;
        }
        int iMin = Math.min(i2, size);
        if (iMin - i == list.size()) {
            int i3 = i;
            while (true) {
                if (i3 >= iMin) {
                    this.f80586J++;
                    this.f80624l.f189355g.m56386c(27, i, list, iMin).m53364b();
                    for (int i4 = i; i4 < iMin; i4++) {
                        djx djxVar = (djx) arrayList.get(i4);
                        qp71 qp71Var = djxVar.f49767c;
                        ufd0 ufd0Var = (ufd0) list.get(i4 - i);
                        djxVar.f49767c = qp71Var instanceof yt71 ? new yt71(((yt71) qp71Var).f247672e, ufd0Var) : new yt71(qp71Var, ufd0Var);
                    }
                    m44994C1(this.f80637r0.m24382j(new jtp0(arrayList, this.f80592P)), 0, false, 4, -9223372036854775807L, -1, false);
                    return;
                }
                if (!((djx) arrayList.get(i3)).f49766b.f79345X.mo27866c((ufd0) list.get(i3 - i))) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        ArrayList arrayListM45000h1 = m45000h1(list);
        if (!this.f80637r0.f11132a.m73436p()) {
            a0p0 a0p0VarM45011u1 = m45011u1(m44998f1(this.f80637r0, iMin, arrayListM45000h1), i, iMin);
            m44994C1(a0p0VarM45011u1, 0, !a0p0VarM45011u1.f11133b.f244408a.equals(this.f80637r0.f11133b.f244408a), 4, m45003k1(a0p0VarM45011u1), -1, false);
        } else {
            boolean z = this.f80639s0 == -1;
            m44996E1();
            m45014x1(arrayListM45000h1, -1, -9223372036854775807L, z);
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final void m44994C1(final a0p0 a0p0Var, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        ufd0 ufd0Var;
        int i5;
        int i6;
        Object obj;
        ufd0 ufd0Var2;
        Object obj2;
        long jM44990o1;
        long jM44990o2;
        Object obj3;
        ufd0 ufd0Var3;
        Object obj4;
        a0p0 a0p0Var2 = this.f80637r0;
        this.f80637r0 = a0p0Var;
        if (!a0p0Var.f11132a.m73436p()) {
            c95.m31856v(a0p0Var.f11132a.mo26650b(a0p0Var.f11133b.f244408a) != -1, String.format(Locale.US, "periodUid %s not found in timeline %s with size %d", a0p0Var.f11133b.f244408a, a0p0Var.f11132a.getClass().getName(), Integer.valueOf(a0p0Var.f11132a.mo26655o())));
        }
        boolean zEquals = a0p0Var2.f11132a.equals(a0p0Var.f11132a);
        mp71 mp71Var = (mp71) this.f170906a;
        bp71 bp71Var = this.f80630o;
        qp71 qp71Var = a0p0Var2.f11132a;
        vsd0 vsd0Var = a0p0Var2.f11133b;
        qp71 qp71Var2 = a0p0Var.f11132a;
        vsd0 vsd0Var2 = a0p0Var.f11133b;
        if (qp71Var2.m73436p() && qp71Var.m73436p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (qp71Var2.m73436p() != qp71Var.m73436p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!qp71Var.mo26654n(qp71Var.mo46978g(vsd0Var.f244408a, bp71Var).f29345c, mp71Var, 0L).f145926a.equals(qp71Var2.mo26654n(qp71Var2.mo46978g(vsd0Var2.f244408a, bp71Var).f29345c, mp71Var, 0L).f145926a)) {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i2 == 0 && vsd0Var.f244411d < vsd0Var2.f244411d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            ufd0Var = a0p0Var.f11132a.m73436p() ? null : a0p0Var.f11132a.mo26654n(a0p0Var.f11132a.mo46978g(a0p0Var.f11133b.f244408a, this.f80630o).f29345c, (mp71) this.f170906a, 0L).f145928c;
            this.f80635q0 = phd0.f177558M;
        } else {
            ufd0Var = null;
        }
        if (zBooleanValue || !a0p0Var2.f11141j.equals(a0p0Var.f11141j)) {
            nhd0 nhd0VarM69979a = this.f80635q0.m69979a();
            List list = a0p0Var.f11141j;
            for (int i7 = 0; i7 < list.size(); i7++) {
                j6f0 j6f0Var = (j6f0) list.get(i7);
                int i8 = 0;
                while (true) {
                    s5f0[] s5f0VarArr = j6f0Var.f109303a;
                    if (i8 < s5f0VarArr.length) {
                        s5f0VarArr[i8].mo35404b(nhd0VarM69979a);
                        i8++;
                    }
                }
            }
            this.f80635q0 = new phd0(nhd0VarM69979a);
        }
        phd0 phd0VarM44999g1 = m44999g1();
        boolean zEquals2 = phd0VarM44999g1.equals(this.f80594R);
        this.f80594R = phd0VarM44999g1;
        boolean z3 = a0p0Var2.f11143l != a0p0Var.f11143l;
        boolean z4 = a0p0Var2.f11136e != a0p0Var.f11136e;
        if (z4 || z3) {
            m44995D1();
        }
        boolean z5 = a0p0Var2.f11138g != a0p0Var.f11138g;
        if (!zEquals) {
            this.f80626m.m63834e(0, new mc5(a0p0Var, i, 3));
        }
        if (z) {
            bp71 bp71Var2 = new bp71();
            if (a0p0Var2.f11132a.m73436p()) {
                i5 = i3;
                i6 = i5;
                obj = null;
                ufd0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = a0p0Var2.f11133b.f244408a;
                a0p0Var2.f11132a.mo46978g(obj5, bp71Var2);
                int i9 = bp71Var2.f29345c;
                int iMo26650b = a0p0Var2.f11132a.mo26650b(obj5);
                obj = a0p0Var2.f11132a.mo26654n(i9, (mp71) this.f170906a, 0L).f145926a;
                ufd0Var2 = ((mp71) this.f170906a).f145928c;
                obj2 = obj5;
                i5 = i9;
                i6 = iMo26650b;
            }
            if (i2 == 0) {
                if (a0p0Var2.f11133b.m86309c()) {
                    vsd0 vsd0Var3 = a0p0Var2.f11133b;
                    jM44990o1 = bp71Var2.m30104a(vsd0Var3.f244409b, vsd0Var3.f244410c);
                    jM44990o2 = m44990o1(a0p0Var2);
                } else {
                    jM44990o1 = a0p0Var2.f11133b.f244412e != -1 ? m44990o1(this.f80637r0) : bp71Var2.f29347e + bp71Var2.f29346d;
                    jM44990o2 = jM44990o1;
                }
            } else if (a0p0Var2.f11133b.m86309c()) {
                jM44990o1 = a0p0Var2.f11150s;
                jM44990o2 = m44990o1(a0p0Var2);
            } else {
                jM44990o1 = bp71Var2.f29347e + a0p0Var2.f11150s;
                jM44990o2 = jM44990o1;
            }
            long jM46326n0 = h0b1.m46326n0(jM44990o1);
            long jM46326n1 = h0b1.m46326n0(jM44990o2);
            vsd0 vsd0Var4 = a0p0Var2.f11133b;
            e7p0 e7p0Var = new e7p0(obj, i5, ufd0Var2, obj2, i6, jM46326n0, jM46326n1, vsd0Var4.f244409b, vsd0Var4.f244410c);
            mp71 mp71Var2 = (mp71) this.f170906a;
            int iMo43847M0 = mo43847M0();
            int iMo43908t0 = mo43908t0();
            if (this.f80637r0.f11132a.m73436p()) {
                obj3 = null;
                ufd0Var3 = null;
                obj4 = null;
            } else {
                a0p0 a0p0Var3 = this.f80637r0;
                Object obj6 = a0p0Var3.f11133b.f244408a;
                a0p0Var3.f11132a.mo46978g(obj6, this.f80630o);
                iMo43908t0 = this.f80637r0.f11132a.mo26650b(obj6);
                Object obj7 = this.f80637r0.f11132a.mo26654n(iMo43847M0, mp71Var2, 0L).f145926a;
                ufd0Var3 = mp71Var2.f145928c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i10 = iMo43908t0;
            long jM46326n2 = h0b1.m46326n0(j);
            long jM46326n3 = this.f80637r0.f11133b.m86309c() ? h0b1.m46326n0(m44990o1(this.f80637r0)) : jM46326n2;
            vsd0 vsd0Var5 = this.f80637r0.f11133b;
            this.f80626m.m63834e(11, new xix(i2, e7p0Var, new e7p0(obj3, iMo43847M0, ufd0Var3, obj4, i10, jM46326n2, jM46326n3, vsd0Var5.f244409b, vsd0Var5.f244410c), 0));
        } else {
            z3 = z3;
            zEquals2 = zEquals2;
            zBooleanValue = zBooleanValue;
        }
        if (zBooleanValue) {
            this.f80626m.m63834e(1, new yix(ufd0Var, iIntValue, 0));
        }
        if (a0p0Var2.f11137f != a0p0Var.f11137f) {
            final int i11 = 7;
            this.f80626m.m63834e(10, new k890() { // from class: p.qix
                @Override // p204p.k890
                public final void invoke(Object obj8) {
                    d7p0 d7p0Var = (d7p0) obj8;
                    switch (i11) {
                        case 0:
                            a0p0 a0p0Var4 = a0p0Var;
                            d7p0Var.mo35228w(a0p0Var4.f11138g);
                            d7p0Var.mo35213a0(a0p0Var4.f11138g);
                            break;
                        case 1:
                            a0p0 a0p0Var5 = a0p0Var;
                            d7p0Var.mo35222q0(a0p0Var5.f11136e, a0p0Var5.f11143l);
                            break;
                        case 2:
                            d7p0Var.mo34736F(a0p0Var.f11136e);
                            break;
                        case 3:
                            a0p0 a0p0Var6 = a0p0Var;
                            d7p0Var.mo34765c0(a0p0Var6.f11144m, a0p0Var6.f11143l);
                            break;
                        case 4:
                            d7p0Var.mo35227v(a0p0Var.f11145n);
                            break;
                        case 5:
                            d7p0Var.mo34783y0(a0p0Var.m24384m());
                            break;
                        case 6:
                            d7p0Var.mo35220m0(a0p0Var.f11146o);
                            break;
                        case 7:
                            d7p0Var.mo35224s0(a0p0Var.f11137f);
                            break;
                        case 8:
                            d7p0Var.mo34772k(a0p0Var.f11137f);
                            break;
                        default:
                            d7p0Var.mo34730A((tt81) a0p0Var.f11140i.f94378e);
                            break;
                    }
                }
            });
            if (a0p0Var.f11137f != null) {
                final int i12 = 8;
                this.f80626m.m63834e(10, new k890() { // from class: p.qix
                    @Override // p204p.k890
                    public final void invoke(Object obj8) {
                        d7p0 d7p0Var = (d7p0) obj8;
                        switch (i12) {
                            case 0:
                                a0p0 a0p0Var4 = a0p0Var;
                                d7p0Var.mo35228w(a0p0Var4.f11138g);
                                d7p0Var.mo35213a0(a0p0Var4.f11138g);
                                break;
                            case 1:
                                a0p0 a0p0Var5 = a0p0Var;
                                d7p0Var.mo35222q0(a0p0Var5.f11136e, a0p0Var5.f11143l);
                                break;
                            case 2:
                                d7p0Var.mo34736F(a0p0Var.f11136e);
                                break;
                            case 3:
                                a0p0 a0p0Var6 = a0p0Var;
                                d7p0Var.mo34765c0(a0p0Var6.f11144m, a0p0Var6.f11143l);
                                break;
                            case 4:
                                d7p0Var.mo35227v(a0p0Var.f11145n);
                                break;
                            case 5:
                                d7p0Var.mo34783y0(a0p0Var.m24384m());
                                break;
                            case 6:
                                d7p0Var.mo35220m0(a0p0Var.f11146o);
                                break;
                            case 7:
                                d7p0Var.mo35224s0(a0p0Var.f11137f);
                                break;
                            case 8:
                                d7p0Var.mo34772k(a0p0Var.f11137f);
                                break;
                            default:
                                d7p0Var.mo34730A((tt81) a0p0Var.f11140i.f94378e);
                                break;
                        }
                    }
                });
            }
        }
        hr81 hr81Var = a0p0Var2.f11140i;
        hr81 hr81Var2 = a0p0Var.f11140i;
        if (hr81Var != hr81Var2) {
            ckc0 ckc0Var = this.f80618i;
            Object obj8 = hr81Var2.f94379f;
            ckc0Var.getClass();
            ckc0Var.f38918c = (bkc0) obj8;
            final int i13 = 9;
            this.f80626m.m63834e(2, new k890() { // from class: p.qix
                @Override // p204p.k890
                public final void invoke(Object obj9) {
                    d7p0 d7p0Var = (d7p0) obj9;
                    switch (i13) {
                        case 0:
                            a0p0 a0p0Var4 = a0p0Var;
                            d7p0Var.mo35228w(a0p0Var4.f11138g);
                            d7p0Var.mo35213a0(a0p0Var4.f11138g);
                            break;
                        case 1:
                            a0p0 a0p0Var5 = a0p0Var;
                            d7p0Var.mo35222q0(a0p0Var5.f11136e, a0p0Var5.f11143l);
                            break;
                        case 2:
                            d7p0Var.mo34736F(a0p0Var.f11136e);
                            break;
                        case 3:
                            a0p0 a0p0Var6 = a0p0Var;
                            d7p0Var.mo34765c0(a0p0Var6.f11144m, a0p0Var6.f11143l);
                            break;
                        case 4:
                            d7p0Var.mo35227v(a0p0Var.f11145n);
                            break;
                        case 5:
                            d7p0Var.mo34783y0(a0p0Var.m24384m());
                            break;
                        case 6:
                            d7p0Var.mo35220m0(a0p0Var.f11146o);
                            break;
                        case 7:
                            d7p0Var.mo35224s0(a0p0Var.f11137f);
                            break;
                        case 8:
                            d7p0Var.mo34772k(a0p0Var.f11137f);
                            break;
                        default:
                            d7p0Var.mo34730A((tt81) a0p0Var.f11140i.f94378e);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f80626m.m63834e(14, new pix(this.f80594R, 0));
        }
        if (z5) {
            final int i14 = 0;
            this.f80626m.m63834e(3, new k890() { // from class: p.qix
                @Override // p204p.k890
                public final void invoke(Object obj9) {
                    d7p0 d7p0Var = (d7p0) obj9;
                    switch (i14) {
                        case 0:
                            a0p0 a0p0Var4 = a0p0Var;
                            d7p0Var.mo35228w(a0p0Var4.f11138g);
                            d7p0Var.mo35213a0(a0p0Var4.f11138g);
                            break;
                        case 1:
                            a0p0 a0p0Var5 = a0p0Var;
                            d7p0Var.mo35222q0(a0p0Var5.f11136e, a0p0Var5.f11143l);
                            break;
                        case 2:
                            d7p0Var.mo34736F(a0p0Var.f11136e);
                            break;
                        case 3:
                            a0p0 a0p0Var6 = a0p0Var;
                            d7p0Var.mo34765c0(a0p0Var6.f11144m, a0p0Var6.f11143l);
                            break;
                        case 4:
                            d7p0Var.mo35227v(a0p0Var.f11145n);
                            break;
                        case 5:
                            d7p0Var.mo34783y0(a0p0Var.m24384m());
                            break;
                        case 6:
                            d7p0Var.mo35220m0(a0p0Var.f11146o);
                            break;
                        case 7:
                            d7p0Var.mo35224s0(a0p0Var.f11137f);
                            break;
                        case 8:
                            d7p0Var.mo34772k(a0p0Var.f11137f);
                            break;
                        default:
                            d7p0Var.mo34730A((tt81) a0p0Var.f11140i.f94378e);
                            break;
                    }
                }
            });
        }
        if (z4 || z3) {
            final int i15 = 1;
            this.f80626m.m63834e(-1, new k890() { // from class: p.qix
                @Override // p204p.k890
                public final void invoke(Object obj9) {
                    d7p0 d7p0Var = (d7p0) obj9;
                    switch (i15) {
                        case 0:
                            a0p0 a0p0Var4 = a0p0Var;
                            d7p0Var.mo35228w(a0p0Var4.f11138g);
                            d7p0Var.mo35213a0(a0p0Var4.f11138g);
                            break;
                        case 1:
                            a0p0 a0p0Var5 = a0p0Var;
                            d7p0Var.mo35222q0(a0p0Var5.f11136e, a0p0Var5.f11143l);
                            break;
                        case 2:
                            d7p0Var.mo34736F(a0p0Var.f11136e);
                            break;
                        case 3:
                            a0p0 a0p0Var6 = a0p0Var;
                            d7p0Var.mo34765c0(a0p0Var6.f11144m, a0p0Var6.f11143l);
                            break;
                        case 4:
                            d7p0Var.mo35227v(a0p0Var.f11145n);
                            break;
                        case 5:
                            d7p0Var.mo34783y0(a0p0Var.m24384m());
                            break;
                        case 6:
                            d7p0Var.mo35220m0(a0p0Var.f11146o);
                            break;
                        case 7:
                            d7p0Var.mo35224s0(a0p0Var.f11137f);
                            break;
                        case 8:
                            d7p0Var.mo34772k(a0p0Var.f11137f);
                            break;
                        default:
                            d7p0Var.mo34730A((tt81) a0p0Var.f11140i.f94378e);
                            break;
                    }
                }
            });
        }
        if (z4) {
            final int i16 = 2;
            this.f80626m.m63834e(4, new k890() { // from class: p.qix
                @Override // p204p.k890
                public final void invoke(Object obj9) {
                    d7p0 d7p0Var = (d7p0) obj9;
                    switch (i16) {
                        case 0:
                            a0p0 a0p0Var4 = a0p0Var;
                            d7p0Var.mo35228w(a0p0Var4.f11138g);
                            d7p0Var.mo35213a0(a0p0Var4.f11138g);
                            break;
                        case 1:
                            a0p0 a0p0Var5 = a0p0Var;
                            d7p0Var.mo35222q0(a0p0Var5.f11136e, a0p0Var5.f11143l);
                            break;
                        case 2:
                            d7p0Var.mo34736F(a0p0Var.f11136e);
                            break;
                        case 3:
                            a0p0 a0p0Var6 = a0p0Var;
                            d7p0Var.mo34765c0(a0p0Var6.f11144m, a0p0Var6.f11143l);
                            break;
                        case 4:
                            d7p0Var.mo35227v(a0p0Var.f11145n);
                            break;
                        case 5:
                            d7p0Var.mo34783y0(a0p0Var.m24384m());
                            break;
                        case 6:
                            d7p0Var.mo35220m0(a0p0Var.f11146o);
                            break;
                        case 7:
                            d7p0Var.mo35224s0(a0p0Var.f11137f);
                            break;
                        case 8:
                            d7p0Var.mo34772k(a0p0Var.f11137f);
                            break;
                        default:
                            d7p0Var.mo34730A((tt81) a0p0Var.f11140i.f94378e);
                            break;
                    }
                }
            });
        }
        if (z3 || a0p0Var2.f11144m != a0p0Var.f11144m) {
            final int i17 = 3;
            this.f80626m.m63834e(5, new k890() { // from class: p.qix
                @Override // p204p.k890
                public final void invoke(Object obj9) {
                    d7p0 d7p0Var = (d7p0) obj9;
                    switch (i17) {
                        case 0:
                            a0p0 a0p0Var4 = a0p0Var;
                            d7p0Var.mo35228w(a0p0Var4.f11138g);
                            d7p0Var.mo35213a0(a0p0Var4.f11138g);
                            break;
                        case 1:
                            a0p0 a0p0Var5 = a0p0Var;
                            d7p0Var.mo35222q0(a0p0Var5.f11136e, a0p0Var5.f11143l);
                            break;
                        case 2:
                            d7p0Var.mo34736F(a0p0Var.f11136e);
                            break;
                        case 3:
                            a0p0 a0p0Var6 = a0p0Var;
                            d7p0Var.mo34765c0(a0p0Var6.f11144m, a0p0Var6.f11143l);
                            break;
                        case 4:
                            d7p0Var.mo35227v(a0p0Var.f11145n);
                            break;
                        case 5:
                            d7p0Var.mo34783y0(a0p0Var.m24384m());
                            break;
                        case 6:
                            d7p0Var.mo35220m0(a0p0Var.f11146o);
                            break;
                        case 7:
                            d7p0Var.mo35224s0(a0p0Var.f11137f);
                            break;
                        case 8:
                            d7p0Var.mo34772k(a0p0Var.f11137f);
                            break;
                        default:
                            d7p0Var.mo34730A((tt81) a0p0Var.f11140i.f94378e);
                            break;
                    }
                }
            });
        }
        if (a0p0Var2.f11145n != a0p0Var.f11145n) {
            final int i18 = 4;
            this.f80626m.m63834e(6, new k890() { // from class: p.qix
                @Override // p204p.k890
                public final void invoke(Object obj9) {
                    d7p0 d7p0Var = (d7p0) obj9;
                    switch (i18) {
                        case 0:
                            a0p0 a0p0Var4 = a0p0Var;
                            d7p0Var.mo35228w(a0p0Var4.f11138g);
                            d7p0Var.mo35213a0(a0p0Var4.f11138g);
                            break;
                        case 1:
                            a0p0 a0p0Var5 = a0p0Var;
                            d7p0Var.mo35222q0(a0p0Var5.f11136e, a0p0Var5.f11143l);
                            break;
                        case 2:
                            d7p0Var.mo34736F(a0p0Var.f11136e);
                            break;
                        case 3:
                            a0p0 a0p0Var6 = a0p0Var;
                            d7p0Var.mo34765c0(a0p0Var6.f11144m, a0p0Var6.f11143l);
                            break;
                        case 4:
                            d7p0Var.mo35227v(a0p0Var.f11145n);
                            break;
                        case 5:
                            d7p0Var.mo34783y0(a0p0Var.m24384m());
                            break;
                        case 6:
                            d7p0Var.mo35220m0(a0p0Var.f11146o);
                            break;
                        case 7:
                            d7p0Var.mo35224s0(a0p0Var.f11137f);
                            break;
                        case 8:
                            d7p0Var.mo34772k(a0p0Var.f11137f);
                            break;
                        default:
                            d7p0Var.mo34730A((tt81) a0p0Var.f11140i.f94378e);
                            break;
                    }
                }
            });
        }
        if (a0p0Var2.m24384m() != a0p0Var.m24384m()) {
            final int i19 = 5;
            this.f80626m.m63834e(7, new k890() { // from class: p.qix
                @Override // p204p.k890
                public final void invoke(Object obj9) {
                    d7p0 d7p0Var = (d7p0) obj9;
                    switch (i19) {
                        case 0:
                            a0p0 a0p0Var4 = a0p0Var;
                            d7p0Var.mo35228w(a0p0Var4.f11138g);
                            d7p0Var.mo35213a0(a0p0Var4.f11138g);
                            break;
                        case 1:
                            a0p0 a0p0Var5 = a0p0Var;
                            d7p0Var.mo35222q0(a0p0Var5.f11136e, a0p0Var5.f11143l);
                            break;
                        case 2:
                            d7p0Var.mo34736F(a0p0Var.f11136e);
                            break;
                        case 3:
                            a0p0 a0p0Var6 = a0p0Var;
                            d7p0Var.mo34765c0(a0p0Var6.f11144m, a0p0Var6.f11143l);
                            break;
                        case 4:
                            d7p0Var.mo35227v(a0p0Var.f11145n);
                            break;
                        case 5:
                            d7p0Var.mo34783y0(a0p0Var.m24384m());
                            break;
                        case 6:
                            d7p0Var.mo35220m0(a0p0Var.f11146o);
                            break;
                        case 7:
                            d7p0Var.mo35224s0(a0p0Var.f11137f);
                            break;
                        case 8:
                            d7p0Var.mo34772k(a0p0Var.f11137f);
                            break;
                        default:
                            d7p0Var.mo34730A((tt81) a0p0Var.f11140i.f94378e);
                            break;
                    }
                }
            });
        }
        if (!a0p0Var2.f11146o.equals(a0p0Var.f11146o)) {
            final int i20 = 6;
            this.f80626m.m63834e(12, new k890() { // from class: p.qix
                @Override // p204p.k890
                public final void invoke(Object obj9) {
                    d7p0 d7p0Var = (d7p0) obj9;
                    switch (i20) {
                        case 0:
                            a0p0 a0p0Var4 = a0p0Var;
                            d7p0Var.mo35228w(a0p0Var4.f11138g);
                            d7p0Var.mo35213a0(a0p0Var4.f11138g);
                            break;
                        case 1:
                            a0p0 a0p0Var5 = a0p0Var;
                            d7p0Var.mo35222q0(a0p0Var5.f11136e, a0p0Var5.f11143l);
                            break;
                        case 2:
                            d7p0Var.mo34736F(a0p0Var.f11136e);
                            break;
                        case 3:
                            a0p0 a0p0Var6 = a0p0Var;
                            d7p0Var.mo34765c0(a0p0Var6.f11144m, a0p0Var6.f11143l);
                            break;
                        case 4:
                            d7p0Var.mo35227v(a0p0Var.f11145n);
                            break;
                        case 5:
                            d7p0Var.mo34783y0(a0p0Var.m24384m());
                            break;
                        case 6:
                            d7p0Var.mo35220m0(a0p0Var.f11146o);
                            break;
                        case 7:
                            d7p0Var.mo35224s0(a0p0Var.f11137f);
                            break;
                        case 8:
                            d7p0Var.mo34772k(a0p0Var.f11137f);
                            break;
                        default:
                            d7p0Var.mo34730A((tt81) a0p0Var.f11140i.f94378e);
                            break;
                    }
                }
            });
        }
        m44992A1();
        this.f80626m.m63832c();
        if (a0p0Var2.f11147p != a0p0Var.f11147p) {
            Iterator it = this.f80628n.iterator();
            while (it.hasNext()) {
                ((bjx) it.next()).f27780a.m44995D1();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: D0 */
    public final void mo43832D0(List list, int i, long j) {
        m44996E1();
        ArrayList arrayListM45000h1 = m45000h1(list);
        m44996E1();
        m45014x1(arrayListM45000h1, i, j, false);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m44995D1() {
        int playbackState = getPlaybackState();
        mwt0 mwt0Var = this.f80577A;
        ey9 ey9Var = this.f80647z;
        boolean z = false;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                m44996E1();
                boolean z2 = this.f80637r0.f11147p;
                if (mo43899o() && !z2) {
                    z = true;
                }
                ey9Var.m40301n(z);
                mwt0Var.m63067d(mo43899o());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        ey9Var.m40301n(false);
        mwt0Var.m63067d(false);
    }

    /* JADX INFO: renamed from: E1 */
    public final void m44996E1() {
        this.f80608d.m41668b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f80640t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = h0b1.f86200a;
            Locale locale = Locale.US;
            String strM36615o = dq60.m36615o("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f80617h0) {
                throw new IllegalStateException(strM36615o);
            }
            yif1.m93821x0(strM36615o, this.f80619i0 ? null : new IllegalStateException());
            this.f80619i0 = true;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: F */
    public final jap0 mo760F(iap0 iap0Var) {
        m44996E1();
        return m45001i1(iap0Var);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: F0 */
    public final long mo43835F0() {
        m44996E1();
        return this.f80631o0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: G */
    public final void mo43836G(int i, int i2) {
        m44996E1();
        c95.m31843i(i >= 0 && i2 >= i);
        int size = this.f80632p.size();
        int iMin = Math.min(i2, size);
        if (i >= size || i == iMin) {
            return;
        }
        a0p0 a0p0VarM45011u1 = m45011u1(this.f80637r0, i, iMin);
        m44994C1(a0p0VarM45011u1, 0, !a0p0VarM45011u1.f11133b.f244408a.equals(this.f80637r0.f11133b.f244408a), 4, m45003k1(a0p0VarM45011u1), -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: G0 */
    public final hro mo761G0() {
        m44996E1();
        return this.f80605b0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: H */
    public final void mo43837H(SurfaceHolder surfaceHolder) {
        m44996E1();
        if (surfaceHolder == null) {
            m44996E1();
            m45012v1();
            m45015y1(null);
            m45009s1(0, 0);
            return;
        }
        m45012v1();
        this.f80600X = true;
        this.f80598V = surfaceHolder;
        surfaceHolder.addCallback(this.f80644w);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            m45015y1(null);
            m45009s1(0, 0);
        } else {
            m45015y1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            m45009s1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: H0 */
    public final long mo43838H0() {
        m44996E1();
        return m45002j1(this.f80637r0);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: I */
    public final void mo43839I(d7p0 d7p0Var) {
        d7p0Var.getClass();
        this.f80626m.m63831b(d7p0Var);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: I0 */
    public final void mo43840I0(int i, List list) {
        m44996E1();
        ArrayList arrayListM45000h1 = m45000h1(list);
        m44996E1();
        c95.m31843i(i >= 0);
        int iMin = Math.min(i, this.f80632p.size());
        if (!this.f80637r0.f11132a.m73436p()) {
            m44994C1(m44998f1(this.f80637r0, iMin, arrayListM45000h1), 0, false, 5, -9223372036854775807L, -1, false);
            return;
        }
        boolean z = this.f80639s0 == -1;
        m44996E1();
        m45014x1(arrayListM45000h1, -1, -9223372036854775807L, z);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: J0 */
    public final long mo43842J0() {
        m44996E1();
        if (!mo43901p()) {
            return mo43860T0();
        }
        a0p0 a0p0Var = this.f80637r0;
        return a0p0Var.f11142k.equals(a0p0Var.f11133b) ? h0b1.m46326n0(this.f80637r0.f11148q) : getDuration();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: K */
    public final PlaybackException mo43843K() {
        m44996E1();
        return this.f80637r0.f11137f;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: L */
    public final void mo43845L(boolean z) {
        m44996E1();
        m44993B1(1, z);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: L0 */
    public final phd0 mo43846L0() {
        m44996E1();
        return this.f80595S;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: M */
    public final void mo762M(wz8 wz8Var, long j) {
        m44996E1();
        List listSingletonList = Collections.singletonList(wz8Var);
        m44996E1();
        m45014x1(listSingletonList, 0, j, false);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: M0 */
    public final int mo43847M0() {
        m44996E1();
        int iM45004l1 = m45004l1(this.f80637r0);
        if (iM45004l1 == -1) {
            return 0;
        }
        return iM45004l1;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: N */
    public final void mo43848N() {
        m44996E1();
        if (this.f80609d0 == 0.0f) {
            float f = this.f80611e0;
            if (f != 0.0f) {
                mo43904r(f);
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: O */
    public final void mo43850O(d7p0 d7p0Var) {
        m44996E1();
        d7p0Var.getClass();
        this.f80626m.m63836g(d7p0Var);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: O0 */
    public final void mo43851O0(int i, int i2, int i3) {
        m44996E1();
        c95.m31843i(i >= 0 && i <= i2 && i3 >= 0);
        ArrayList arrayList = this.f80632p;
        int size = arrayList.size();
        int iMin = Math.min(i2, size);
        int iMin2 = Math.min(i3, size - (iMin - i));
        if (i >= size || i == iMin || i == iMin2) {
            return;
        }
        qp71 qp71VarMo43876b0 = mo43876b0();
        this.f80586J++;
        h0b1.m46294V(i, iMin, iMin2, arrayList);
        qv11 qv11Var = this.f80592P;
        qv11Var.getClass();
        this.f80592P = qv11Var;
        jtp0 jtp0Var = new jtp0(arrayList, this.f80592P);
        a0p0 a0p0Var = this.f80637r0;
        a0p0 a0p0VarM45007q1 = m45007q1(a0p0Var, jtp0Var, m45005m1(qp71VarMo43876b0, jtp0Var, m45004l1(a0p0Var), m45002j1(this.f80637r0)));
        qv11 qv11Var2 = this.f80592P;
        qjx qjxVar = this.f80624l;
        qjxVar.getClass();
        qjxVar.f189355g.m56387d(19, new ljx(i, iMin, iMin2, qv11Var2)).m53364b();
        m44994C1(a0p0VarM45007q1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Q0 */
    public final boolean mo43855Q0() {
        m44996E1();
        return false;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: R */
    public final void mo43856R(int i) {
        m44996E1();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: R0 */
    public final boolean mo43857R0() {
        m44996E1();
        return this.f80585I;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: S */
    public final tt81 mo43858S() {
        m44996E1();
        return (tt81) this.f80637r0.f11140i.f94378e;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: S0 */
    public final void mo763S0(wz8 wz8Var) {
        m44996E1();
        List listSingletonList = Collections.singletonList(wz8Var);
        m44996E1();
        m44996E1();
        m45014x1(listSingletonList, -1, -9223372036854775807L, true);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: T0 */
    public final long mo43860T0() {
        m44996E1();
        if (this.f80637r0.f11132a.m73436p()) {
            return this.f80641t0;
        }
        a0p0 a0p0Var = this.f80637r0;
        if (a0p0Var.f11142k.f244411d != a0p0Var.f11133b.f244411d) {
            return h0b1.m46326n0(a0p0Var.f11132a.mo26654n(mo43847M0(), (mp71) this.f170906a, 0L).f145938m);
        }
        long j = a0p0Var.f11148q;
        if (this.f80637r0.f11142k.m86309c()) {
            a0p0 a0p0Var2 = this.f80637r0;
            bp71 bp71VarMo46978g = a0p0Var2.f11132a.mo46978g(a0p0Var2.f11142k.f244408a, this.f80630o);
            long jM30107d = bp71VarMo46978g.m30107d(this.f80637r0.f11142k.f244409b);
            j = jM30107d == Long.MIN_VALUE ? bp71VarMo46978g.f29346d : jM30107d;
        }
        a0p0 a0p0Var3 = this.f80637r0;
        qp71 qp71Var = a0p0Var3.f11132a;
        Object obj = a0p0Var3.f11142k.f244408a;
        bp71 bp71Var = this.f80630o;
        qp71Var.mo46978g(obj, bp71Var);
        return h0b1.m46326n0(j + bp71Var.f29347e);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: U */
    public final o0m mo43861U() {
        m44996E1();
        return this.f80615g0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: U0 */
    public final void mo43862U0(int i) {
        m44996E1();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: V */
    public final int mo43863V() {
        m44996E1();
        if (mo43901p()) {
            return this.f80637r0.f11133b.f244409b;
        }
        return -1;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: X */
    public final void mo43867X(boolean z) {
        m44996E1();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: X0 */
    public final phd0 mo43868X0() {
        m44996E1();
        return this.f80594R;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: Y */
    public final void mo764Y(wz8 wz8Var) {
        m44996E1();
        mo770z0(wz8Var);
        mo43875b();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Y0 */
    public final void mo43869Y0(List list) {
        m44996E1();
        ArrayList arrayListM45000h1 = m45000h1(list);
        m44996E1();
        m45014x1(arrayListM45000h1, -1, -9223372036854775807L, true);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: Z0 */
    public final long mo43871Z0() {
        m44996E1();
        return this.f80629n0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: a0 */
    public final int mo43873a0() {
        m44996E1();
        return this.f80637r0.f11145n;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: b */
    public final void mo43875b() {
        m44996E1();
        a0p0 a0p0Var = this.f80637r0;
        if (a0p0Var.f11136e != 1) {
            return;
        }
        a0p0 a0p0VarM24378f = a0p0Var.m24378f(null);
        a0p0 a0p0VarM44991p1 = m44991p1(a0p0VarM24378f, a0p0VarM24378f.f11132a.m73436p() ? 4 : 2);
        this.f80586J++;
        this.f80624l.f189355g.m56384a(29).m53364b();
        m44994C1(a0p0VarM44991p1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: b0 */
    public final qp71 mo43876b0() {
        m44996E1();
        return this.f80637r0.f11132a;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: c */
    public final boolean mo43877c() {
        m44996E1();
        return this.f80637r0.f11138g;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: c0 */
    public final Looper mo43878c0() {
        return this.f80640t;
    }

    @Override // p204p.ox8
    /* JADX INFO: renamed from: c1 */
    public final void mo44997c1(int i, int i2, long j, boolean z) {
        m44996E1();
        if (i == -1) {
            return;
        }
        c95.m31843i(i >= 0);
        qp71 qp71Var = this.f80637r0.f11132a;
        if (qp71Var.m73436p() || i < qp71Var.mo26655o()) {
            xwo xwoVar = this.f80638s;
            if (!xwoVar.f266718i) {
                np3 np3VarM92292G = xwoVar.m92292G();
                xwoVar.f266718i = true;
                xwoVar.m92297Z(np3VarM92292G, -1, new pwo(8));
            }
            this.f80586J++;
            if (mo43901p()) {
                yif1.m93819w0("seekTo ignored because an ad is playing");
                njx njxVar = new njx(this.f80637r0, 0);
                njxVar.m64650e(1);
                gjx gjxVar = this.f80622k.f199647b;
                gjxVar.f80620j.m56388f(new fxf(24, gjxVar, njxVar));
                return;
            }
            a0p0 a0p0VarM24380h = this.f80637r0;
            int i3 = a0p0VarM24380h.f11136e;
            if (i3 == 3 || (i3 == 4 && !qp71Var.m73436p())) {
                a0p0VarM24380h = this.f80637r0.m24380h(2);
            }
            int iMo43847M0 = mo43847M0();
            a0p0 a0p0VarM45007q1 = m45007q1(a0p0VarM24380h, qp71Var, m45008r1(qp71Var, i, j));
            this.f80624l.f189355g.m56387d(3, new pjx(qp71Var, i, h0b1.m46295W(j))).m53364b();
            m44994C1(a0p0VarM45007q1, 0, true, 1, m45003k1(a0p0VarM45007q1), iMo43847M0, z);
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: d */
    public final float mo43879d() {
        m44996E1();
        return this.f80609d0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: d0 */
    public final void mo43880d0() {
        m44996E1();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: e0 */
    public final dr81 mo43882e0() {
        m44996E1();
        meq meqVar = ((req) this.f80618i).f198409f;
        if (!this.f80589M) {
            return meqVar;
        }
        meqVar.getClass();
        leq leqVar = new leq(meqVar);
        leqVar.m58811j(this.f80590N);
        return new meq(leqVar);
    }

    /* JADX INFO: renamed from: f1 */
    public final a0p0 m44998f1(a0p0 a0p0Var, int i, ArrayList arrayList) {
        qp71 qp71Var = a0p0Var.f11132a;
        this.f80586J++;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList3 = this.f80632p;
            if (i2 >= size) {
                this.f80592P = this.f80592P.m73959b(i, arrayList2.size());
                jtp0 jtp0Var = new jtp0(arrayList3, this.f80592P);
                a0p0 a0p0VarM45007q1 = m45007q1(a0p0Var, jtp0Var, m45005m1(qp71Var, jtp0Var, m45004l1(a0p0Var), m45002j1(a0p0Var)));
                this.f80624l.f189355g.m56386c(18, i, new kjx(arrayList2, this.f80592P, -1, -9223372036854775807L), 0).m53364b();
                return a0p0VarM45007q1;
            }
            ltd0 ltd0Var = new ltd0((wz8) arrayList.get(i2), this.f80634q);
            arrayList2.add(ltd0Var);
            arrayList3.add(i2 + i, new djx(ltd0Var.f136760b, ltd0Var.f136759a));
            i2++;
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: g0 */
    public final void mo43886g0(phd0 phd0Var) {
        m44996E1();
        phd0Var.getClass();
        if (phd0Var.equals(this.f80595S)) {
            return;
        }
        this.f80595S = phd0Var;
        this.f80626m.m63839j(15, new rix(this, 3));
    }

    /* JADX INFO: renamed from: g1 */
    public final phd0 m44999g1() {
        qp71 qp71VarMo43876b0 = mo43876b0();
        if (qp71VarMo43876b0.m73436p()) {
            return this.f80635q0;
        }
        ufd0 ufd0Var = qp71VarMo43876b0.mo26654n(mo43847M0(), (mp71) this.f170906a, 0L).f145928c;
        nhd0 nhd0VarM69979a = this.f80635q0.m69979a();
        nhd0VarM69979a.m64471b(ufd0Var.f229765d);
        return new phd0(nhd0VarM69979a);
    }

    @Override // p204p.g7p0
    public final long getDuration() {
        m44996E1();
        if (!mo43901p()) {
            return mo43906s0();
        }
        a0p0 a0p0Var = this.f80637r0;
        vsd0 vsd0Var = a0p0Var.f11133b;
        qp71 qp71Var = a0p0Var.f11132a;
        Object obj = vsd0Var.f244408a;
        bp71 bp71Var = this.f80630o;
        qp71Var.mo46978g(obj, bp71Var);
        return h0b1.m46326n0(bp71Var.m30104a(vsd0Var.f244409b, vsd0Var.f244410c));
    }

    @Override // p204p.g7p0
    public final int getPlaybackState() {
        m44996E1();
        return this.f80637r0.f11136e;
    }

    @Override // p204p.g7p0
    public final int getRepeatMode() {
        m44996E1();
        return this.f80584H;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: h */
    public final void mo765h(int i) {
        m44996E1();
        this.f80602Z = i;
        m45013w1(2, 4, Integer.valueOf(i));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: h0 */
    public final int mo43887h0() {
        m44996E1();
        return 0;
    }

    /* JADX INFO: renamed from: h1 */
    public final ArrayList m45000h1(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.f80636r.mo771a((ufd0) list.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i1 */
    public final jap0 m45001i1(iap0 iap0Var) {
        int iM45004l1 = m45004l1(this.f80637r0);
        qp71 qp71Var = this.f80637r0.f11132a;
        if (iM45004l1 == -1) {
            iM45004l1 = 0;
        }
        qjx qjxVar = this.f80624l;
        return new jap0(qjxVar, iap0Var, qp71Var, iM45004l1, qjxVar.f189359i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        m44996E1();
        return this.f80589M;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: j */
    public final h1p0 mo43890j() {
        m44996E1();
        return this.f80637r0.f11146o;
    }

    /* JADX INFO: renamed from: j1 */
    public final long m45002j1(a0p0 a0p0Var) {
        vsd0 vsd0Var = a0p0Var.f11133b;
        long j = a0p0Var.f11134c;
        qp71 qp71Var = a0p0Var.f11132a;
        if (!vsd0Var.m86309c()) {
            return h0b1.m46326n0(m45003k1(a0p0Var));
        }
        Object obj = a0p0Var.f11133b.f244408a;
        bp71 bp71Var = this.f80630o;
        qp71Var.mo46978g(obj, bp71Var);
        if (j == -9223372036854775807L) {
            return h0b1.m46326n0(qp71Var.mo26654n(m45004l1(a0p0Var), (mp71) this.f170906a, 0L).f145937l);
        }
        return h0b1.m46326n0(j) + h0b1.m46326n0(bp71Var.f29347e);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: k */
    public final void mo43892k() {
        m44996E1();
        if (this.f80609d0 != 0.0f) {
            mo43904r(0.0f);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final long m45003k1(a0p0 a0p0Var) {
        if (a0p0Var.f11132a.m73436p()) {
            return h0b1.m46295W(this.f80641t0);
        }
        long jM24383l = a0p0Var.f11147p ? a0p0Var.m24383l() : a0p0Var.f11150s;
        if (a0p0Var.f11133b.m86309c()) {
            return jM24383l;
        }
        qp71 qp71Var = a0p0Var.f11132a;
        Object obj = a0p0Var.f11133b.f244408a;
        bp71 bp71Var = this.f80630o;
        qp71Var.mo46978g(obj, bp71Var);
        return jM24383l + bp71Var.f29347e;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: l */
    public final void mo43894l(h1p0 h1p0Var) {
        m44996E1();
        if (this.f80637r0.f11146o.equals(h1p0Var)) {
            return;
        }
        a0p0 a0p0VarM24379g = this.f80637r0.m24379g(h1p0Var);
        this.f80586J++;
        this.f80624l.f189355g.m56387d(4, h1p0Var).m53364b();
        m44994C1(a0p0VarM24379g, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: l0 */
    public final b7p0 mo43895l0() {
        m44996E1();
        return this.f80593Q;
    }

    /* JADX INFO: renamed from: l1 */
    public final int m45004l1(a0p0 a0p0Var) {
        return a0p0Var.f11132a.m73436p() ? this.f80639s0 : a0p0Var.f11132a.mo46978g(a0p0Var.f11133b.f244408a, this.f80630o).f29345c;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: m */
    public final x6r mo43896m() {
        m44996E1();
        return this.f80625l0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: m0 */
    public final void mo43897m0(boolean z) {
        m44996E1();
        if (this.f80585I != z) {
            this.f80585I = z;
            this.f80624l.f189355g.m56385b(12, z ? 1 : 0, 0).m53364b();
            vix vixVar = new vix(z, 0);
            n890 n890Var = this.f80626m;
            n890Var.m63834e(9, vixVar);
            m44992A1();
            n890Var.m63832c();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final Pair m45005m1(qp71 qp71Var, jtp0 jtp0Var, int i, long j) {
        if (qp71Var.m73436p() || jtp0Var.m73436p()) {
            boolean z = !qp71Var.m73436p() && jtp0Var.m73436p();
            return m45008r1(jtp0Var, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        Pair pairM73433i = qp71Var.m73433i((mp71) this.f170906a, this.f80630o, i, h0b1.m46295W(j));
        Object obj = pairM73433i.first;
        if (jtp0Var.mo26650b(obj) != -1) {
            return pairM73433i;
        }
        int iM72956Y = qjx.m72956Y((mp71) this.f170906a, this.f80630o, this.f80584H, this.f80585I, obj, qp71Var, jtp0Var);
        if (iM72956Y == -1) {
            return m45008r1(jtp0Var, -1, -9223372036854775807L);
        }
        mp71 mp71Var = (mp71) this.f170906a;
        jtp0Var.mo26654n(iM72956Y, mp71Var, 0L);
        return m45008r1(jtp0Var, iM72956Y, h0b1.m46326n0(mp71Var.f145937l));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: n */
    public final void mo43898n(Surface surface) {
        m44996E1();
        m45012v1();
        m45015y1(surface);
        int i = surface == null ? 0 : -1;
        m45009s1(i, i);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: n0 */
    public final int mo766n0() {
        m44996E1();
        return this.f80614g.length;
    }

    /* JADX INFO: renamed from: n1 */
    public final int m45006n1(int i) {
        m44996E1();
        return this.f80614g[i].f160288b;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: o */
    public final boolean mo43899o() {
        m44996E1();
        return this.f80637r0.f11143l;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: o0 */
    public final long mo43900o0() {
        m44996E1();
        return this.f80633p0;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: p */
    public final boolean mo43901p() {
        m44996E1();
        return this.f80637r0.f11133b.m86309c();
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: q */
    public final long mo43903q() {
        m44996E1();
        return h0b1.m46326n0(this.f80637r0.f11149r);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: q0 */
    public final o09 mo767q0(int i) {
        m44996E1();
        return this.f80614g[i];
    }

    /* JADX INFO: renamed from: q1 */
    public final a0p0 m45007q1(a0p0 a0p0Var, qp71 qp71Var, Pair pair) {
        List list;
        c95.m31843i(qp71Var.m73436p() || pair != null);
        qp71 qp71Var2 = a0p0Var.f11132a;
        long jM45002j1 = m45002j1(a0p0Var);
        a0p0 a0p0VarM24382j = a0p0Var.m24382j(qp71Var);
        if (qp71Var.m73436p()) {
            vsd0 vsd0Var = a0p0.f11131u;
            long jM46295W = h0b1.m46295W(this.f80641t0);
            a0p0 a0p0VarM24375c = a0p0VarM24382j.m24376d(vsd0Var, jM46295W, jM46295W, jM46295W, 0L, lf81.f132851d, this.f80604b, wsv0.f254763e).m24375c(vsd0Var);
            a0p0VarM24375c.f11148q = a0p0VarM24375c.f11150s;
            return a0p0VarM24375c;
        }
        Object obj = a0p0VarM24382j.f11133b.f244408a;
        String str = h0b1.f86200a;
        boolean zEquals = obj.equals(pair.first);
        vsd0 vsd0Var2 = !zEquals ? new vsd0(pair.first) : a0p0VarM24382j.f11133b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM46295W2 = h0b1.m46295W(jM45002j1);
        if (!qp71Var2.m73436p()) {
            jM46295W2 -= qp71Var2.mo46978g(obj, this.f80630o).f29347e;
            if (zEquals && jM46295W2 - jLongValue == 1 && jM46295W2 == qp71Var2.mo46978g(obj, this.f80630o).f29346d) {
                jM46295W2--;
            }
        }
        if (!zEquals || jLongValue < jM46295W2) {
            vsd0 vsd0Var3 = vsd0Var2;
            c95.m31855u(!vsd0Var3.m86309c());
            lf81 lf81Var = !zEquals ? lf81.f132851d : a0p0VarM24382j.f11139h;
            hr81 hr81Var = !zEquals ? this.f80604b : a0p0VarM24382j.f11140i;
            if (zEquals) {
                list = a0p0VarM24382j.f11141j;
            } else {
                kf40 kf40Var = pf40.f176960b;
                list = wsv0.f254763e;
            }
            a0p0 a0p0VarM24375c2 = a0p0VarM24382j.m24376d(vsd0Var3, jLongValue, jLongValue, jLongValue, 0L, lf81Var, hr81Var, list).m24375c(vsd0Var3);
            a0p0VarM24375c2.f11148q = jLongValue;
            return a0p0VarM24375c2;
        }
        if (jLongValue != jM46295W2) {
            vsd0 vsd0Var4 = vsd0Var2;
            c95.m31855u(!vsd0Var4.m86309c());
            long jMax = Math.max(0L, a0p0VarM24382j.f11149r - (jLongValue - jM46295W2));
            long j = a0p0VarM24382j.f11148q;
            if (a0p0VarM24382j.f11142k.equals(a0p0VarM24382j.f11133b)) {
                j = jLongValue + jMax;
            }
            a0p0 a0p0VarM24376d = a0p0VarM24382j.m24376d(vsd0Var4, jLongValue, jLongValue, jLongValue, jMax, a0p0VarM24382j.f11139h, a0p0VarM24382j.f11140i, a0p0VarM24382j.f11141j);
            a0p0VarM24376d.f11148q = j;
            return a0p0VarM24376d;
        }
        int iMo26650b = qp71Var.mo26650b(a0p0VarM24382j.f11142k.f244408a);
        if (iMo26650b != -1 && qp71Var.mo26651f(iMo26650b, this.f80630o, false).f29345c == qp71Var.mo46978g(vsd0Var2.f244408a, this.f80630o).f29345c) {
            return a0p0VarM24382j;
        }
        qp71Var.mo46978g(vsd0Var2.f244408a, this.f80630o);
        long jM30104a = vsd0Var2.m86309c() ? this.f80630o.m30104a(vsd0Var2.f244409b, vsd0Var2.f244410c) : this.f80630o.f29346d;
        vsd0 vsd0Var5 = vsd0Var2;
        a0p0 a0p0VarM24375c3 = a0p0VarM24382j.m24376d(vsd0Var5, a0p0VarM24382j.f11150s, a0p0VarM24382j.f11150s, a0p0VarM24382j.f11135d, jM30104a - a0p0VarM24382j.f11150s, a0p0VarM24382j.f11139h, a0p0VarM24382j.f11140i, a0p0VarM24382j.f11141j).m24375c(vsd0Var5);
        a0p0VarM24375c3.f11148q = jM30104a;
        return a0p0VarM24375c3;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: r */
    public final void mo43904r(float f) {
        m44996E1();
        float fM46315i = h0b1.m46315i(f, 0.0f, 1.0f);
        float f2 = this.f80609d0;
        if (f2 == fM46315i) {
            return;
        }
        if (fM46315i != 0.0f) {
            f2 = fM46315i;
        }
        this.f80611e0 = f2;
        this.f80609d0 = fM46315i;
        this.f80624l.f189355g.m56387d(32, Float.valueOf(fM46315i)).m53364b();
        this.f80626m.m63839j(22, new tix(fM46315i, 0));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: r0 */
    public final void mo768r0(op3 op3Var) {
        m44996E1();
        op3Var.getClass();
        this.f80638s.f266715f.m63836g(op3Var);
    }

    /* JADX INFO: renamed from: r1 */
    public final Pair m45008r1(qp71 qp71Var, int i, long j) {
        if (qp71Var.m73436p()) {
            this.f80639s0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f80641t0 = j;
            return null;
        }
        if (i == -1 || i >= qp71Var.mo26655o()) {
            i = qp71Var.mo33542a(this.f80585I);
            j = h0b1.m46326n0(qp71Var.mo26654n(i, (mp71) this.f170906a, 0L).f145937l);
        }
        return qp71Var.m73433i((mp71) this.f170906a, this.f80630o, i, h0b1.m46295W(j));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: s */
    public final void mo43905s(xs6 xs6Var, boolean z) {
        m44996E1();
        if (this.f80623k0) {
            return;
        }
        boolean zEquals = Objects.equals(this.f80607c0, xs6Var);
        n890 n890Var = this.f80626m;
        if (!zEquals) {
            this.f80607c0 = xs6Var;
            m45013w1(1, 3, xs6Var);
            n890Var.m63834e(20, new six(xs6Var, 0));
        }
        this.f80624l.f189355g.m56386c(31, z ? 1 : 0, this.f80607c0, 0).m53364b();
        n890Var.m63832c();
    }

    /* JADX INFO: renamed from: s1 */
    public final void m45009s1(int i, int i2) {
        di21 di21Var = this.f80603a0;
        if (i == di21Var.f49219a && i2 == di21Var.f49220b) {
            return;
        }
        this.f80603a0 = new di21(i, i2);
        this.f80626m.m63839j(24, new uix(i, i2, 0));
        m45013w1(2, 14, new di21(i, i2));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        m44996E1();
        m45013w1(4, 15, imageOutput);
    }

    @Override // p204p.g7p0
    public final void setRepeatMode(int i) {
        m44996E1();
        if (this.f80584H != i) {
            this.f80584H = i;
            this.f80624l.f189355g.m56385b(11, i, 0).m53364b();
            vwo vwoVar = new vwo(i, 1);
            n890 n890Var = this.f80626m;
            n890Var.m63834e(8, vwoVar);
            m44992A1();
            n890Var.m63832c();
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        dr81 dr81VarMo33726b;
        m44996E1();
        if (z == this.f80589M) {
            return;
        }
        this.f80589M = z;
        loy0 loy0Var = this.f80591O;
        if (!loy0Var.f135574a.isEmpty()) {
            ckc0 ckc0Var = this.f80618i;
            ckc0Var.getClass();
            meq meqVar = ((req) ckc0Var).f198409f;
            if (z) {
                this.f80590N = meqVar.f52240I;
                hg40 hg40Var = loy0Var.f135574a;
                cr81 cr81VarMo36707a = meqVar.mo36707a();
                o3a1 it = hg40Var.iterator();
                while (it.hasNext()) {
                    cr81VarMo36707a.m33732i(((Integer) it.next()).intValue(), true);
                }
                dr81VarMo33726b = cr81VarMo36707a.mo33726b();
            } else {
                meqVar.getClass();
                leq leqVar = new leq(meqVar);
                leqVar.m58811j(this.f80590N);
                meq meqVar2 = new meq(leqVar);
                this.f80590N = null;
                dr81VarMo33726b = meqVar2;
            }
            if (!dr81VarMo33726b.equals(meqVar)) {
                ckc0Var.mo33116c(dr81VarMo33726b);
            }
        }
        this.f80624l.f189355g.m56387d(36, Boolean.valueOf(z)).m53364b();
        a0p0 a0p0Var = this.f80637r0;
        m44993B1(a0p0Var.f11144m, a0p0Var.f11143l);
    }

    @Override // p204p.g7p0
    public final void stop() {
        m44996E1();
        m45016z1(null);
        this.f80615g0 = new o0m(this.f80637r0.f11150s, wsv0.f254763e);
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: t0 */
    public final int mo43908t0() {
        m44996E1();
        if (!this.f80637r0.f11132a.m73436p()) {
            a0p0 a0p0Var = this.f80637r0;
            return a0p0Var.f11132a.mo26650b(a0p0Var.f11133b.f244408a);
        }
        int i = this.f80639s0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: t1 */
    public final void m45010t1() {
        boolean zM41669c;
        yif1.m93818w("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.11.0] [" + h0b1.f86200a + "] [" + dgd0.m35921b() + "]");
        m44996E1();
        this.f80646y.m60508W();
        this.f80647z.m40301n(false);
        this.f80577A.m63067d(false);
        fjx fjxVar = this.f80581E;
        if (fjxVar != null && Build.VERSION.SDK_INT >= 34) {
            fjx.m41859a(fjxVar);
        }
        ykn yknVar = this.f80580D;
        ((kh61) yknVar.f273761g).m56390h();
        ((gjx) yknVar.f273756b).mo43850O((eq51) yknVar.f273757c);
        qjx qjxVar = this.f80624l;
        if (qjxVar.f189358h1 || !qjxVar.f189359i.getThread().isAlive()) {
            zM41669c = true;
        } else {
            qjxVar.f189358h1 = true;
            fhi fhiVar = new fhi(qjxVar.f189326M0);
            qjxVar.f189355g.m56387d(7, fhiVar).m53364b();
            zM41669c = fhiVar.m41669c(qjxVar.f189331R0);
        }
        if (!zM41669c) {
            this.f80626m.m63839j(10, new eqp(21));
        }
        this.f80626m.m63835f();
        this.f80620j.m56390h();
        this.f80642u.mo27123a(this.f80638s);
        a0p0 a0p0Var = this.f80637r0;
        if (a0p0Var.f11147p) {
            this.f80637r0 = a0p0Var.m24373a();
        }
        a0p0 a0p0VarM44991p1 = m44991p1(this.f80637r0, 1);
        this.f80637r0 = a0p0VarM44991p1;
        a0p0 a0p0VarM24375c = a0p0VarM44991p1.m24375c(a0p0VarM44991p1.f11133b);
        this.f80637r0 = a0p0VarM24375c;
        a0p0VarM24375c.f11148q = a0p0VarM24375c.f11150s;
        this.f80637r0.f11149r = 0L;
        xwo xwoVar = this.f80638s;
        kh61 kh61Var = xwoVar.f266717h;
        kh61Var.getClass();
        kh61Var.m56388f(new RunnableC2210od(xwoVar, 27));
        m45012v1();
        Surface surface = this.f80597U;
        if (surface != null) {
            surface.release();
            this.f80597U = null;
        }
        this.f80615g0 = o0m.f160423d;
        this.f80623k0 = true;
        if (this.f80637r0.f11132a.m73436p()) {
            return;
        }
        a0p0 a0p0Var2 = this.f80637r0;
        boolean z = a0p0Var2.f11132a.mo26650b(a0p0Var2.f11133b.f244408a) != -1;
        Locale locale = Locale.US;
        a0p0 a0p0Var3 = this.f80637r0;
        c95.m31856v(z, String.format(locale, "periodUid %s not found in timeline %s with size %d", a0p0Var3.f11133b.f244408a, a0p0Var3.f11132a.getClass().getName(), Integer.valueOf(this.f80637r0.f11132a.mo26655o())));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: u */
    public final long mo43909u() {
        m44996E1();
        return h0b1.m46326n0(m45003k1(this.f80637r0));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: u0 */
    public final k9c1 mo43910u0() {
        m44996E1();
        return this.f80627m0;
    }

    /* JADX INFO: renamed from: u1 */
    public final a0p0 m45011u1(a0p0 a0p0Var, int i, int i2) {
        ArrayList arrayList;
        int iM45004l1 = m45004l1(a0p0Var);
        long jM45002j1 = m45002j1(a0p0Var);
        qp71 qp71Var = a0p0Var.f11132a;
        this.f80586J++;
        int i3 = i2 - 1;
        while (true) {
            arrayList = this.f80632p;
            if (i3 < i) {
                break;
            }
            arrayList.remove(i3);
            i3--;
        }
        qv11 qv11Var = this.f80592P;
        int i4 = i2 - i;
        int[] iArr = qv11Var.f192856b;
        int[] iArr2 = new int[iArr.length - i4];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < i || i7 >= i2) {
                int i8 = i6 - i5;
                if (i7 >= i) {
                    i7 -= i4;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.f80592P = new qv11(iArr2, new Random(qv11Var.f192855a.nextLong()));
        jtp0 jtp0Var = new jtp0(arrayList, this.f80592P);
        a0p0 a0p0VarM45007q1 = m45007q1(a0p0Var, jtp0Var, m45005m1(qp71Var, jtp0Var, iM45004l1, jM45002j1));
        int i9 = a0p0VarM45007q1.f11136e;
        if (i9 != 1 && i9 != 4 && iM45004l1 >= i && iM45004l1 < i2) {
            if (qjx.m72956Y((mp71) this.f170906a, this.f80630o, this.f80584H, this.f80585I, a0p0Var.f11133b.f244408a, qp71Var, jtp0Var) == -1) {
                a0p0VarM45007q1 = m44991p1(a0p0VarM45007q1, 4);
            }
        }
        this.f80624l.f189355g.m56386c(20, i, this.f80592P, i2).m53364b();
        return a0p0VarM45007q1;
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: v0 */
    public final xs6 mo43912v0() {
        m44996E1();
        return this.f80607c0;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m45012v1() {
        y541 y541Var = this.f80599W;
        bjx bjxVar = this.f80644w;
        if (y541Var != null) {
            jap0 jap0VarM45001i1 = m45001i1(this.f80645x);
            jap0VarM45001i1.m52850d(10000);
            jap0VarM45001i1.m52849c(null);
            jap0VarM45001i1.m52848b();
            this.f80599W.f269339a.remove(bjxVar);
            this.f80599W = null;
        }
        TextureView textureView = this.f80601Y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != bjxVar) {
                yif1.m93819w0("SurfaceTextureListener already unset or replaced.");
            } else {
                this.f80601Y.setSurfaceTextureListener(null);
            }
            this.f80601Y = null;
        }
        SurfaceHolder surfaceHolder = this.f80598V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(bjxVar);
            this.f80598V = null;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: w0 */
    public final void mo769w0(op3 op3Var) {
        xwo xwoVar = this.f80638s;
        xwoVar.getClass();
        xwoVar.f266715f.m63831b(op3Var);
    }

    /* JADX INFO: renamed from: w1 */
    public final void m45013w1(int i, int i2, Object obj) {
        for (o09 o09Var : this.f80614g) {
            if (i == -1 || o09Var.f160288b == i) {
                jap0 jap0VarM45001i1 = m45001i1(o09Var);
                jap0VarM45001i1.m52850d(i2);
                jap0VarM45001i1.m52849c(obj);
                jap0VarM45001i1.m52848b();
            }
        }
        for (o09 o09Var2 : this.f80616h) {
            if (o09Var2 != null && (i == -1 || o09Var2.f160288b == i)) {
                jap0 jap0VarM45001i2 = m45001i1(o09Var2);
                jap0VarM45001i2.m52850d(i2);
                jap0VarM45001i2.m52849c(obj);
                jap0VarM45001i2.m52848b();
            }
        }
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: x0 */
    public final void mo43915x0(int i, int i2) {
        m44996E1();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    /* JADX WARN: Code duplicated, block: B:22:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX INFO: renamed from: x1 */
    public final void m45014x1(List list, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        a0p0 a0p0VarM44991p1;
        boolean z2;
        int iMo33542a = i;
        int iM45004l1 = m45004l1(this.f80637r0);
        long jMo43909u = mo43909u();
        this.f80586J++;
        ArrayList arrayList = this.f80632p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < list.size(); i4++) {
            ltd0 ltd0Var = new ltd0((wz8) list.get(i4), this.f80634q);
            arrayList2.add(ltd0Var);
            arrayList.add(i4, new djx(ltd0Var.f136760b, ltd0Var.f136759a));
        }
        this.f80592P = this.f80592P.m73958a().m73959b(0, arrayList2.size());
        jtp0 jtp0Var = new jtp0(arrayList, this.f80592P);
        boolean zM73436p = jtp0Var.m73436p();
        int i5 = jtp0Var.f115940g;
        if (!zM73436p && iMo33542a >= i5) {
            throw new IllegalSeekPositionException();
        }
        if (!z) {
            if (iMo33542a == -1) {
                i2 = iM45004l1;
                j2 = jMo43909u;
            } else {
                j2 = j;
            }
            a0p0 a0p0VarM45007q1 = m45007q1(this.f80637r0, jtp0Var, m45008r1(jtp0Var, i2, j2));
            i3 = a0p0VarM45007q1.f11136e;
            if (i3 == 1) {
                i3 = 1;
            } else if (!jtp0Var.m73436p()) {
                i3 = 4;
            } else if (i2 != -1) {
                if (i2 >= i5) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
            }
            a0p0VarM44991p1 = m44991p1(a0p0VarM45007q1, i3);
            this.f80624l.f189355g.m56387d(17, new kjx(arrayList2, this.f80592P, i2, h0b1.m46295W(j2))).m53364b();
            if (!this.f80637r0.f11133b.f244408a.equals(a0p0VarM44991p1.f11133b.f244408a) || this.f80637r0.f11132a.m73436p()) {
                z2 = false;
            } else {
                z2 = true;
            }
            m44994C1(a0p0VarM44991p1, 0, z2, 4, m45003k1(a0p0VarM44991p1), -1, false);
        }
        iMo33542a = jtp0Var.mo33542a(this.f80585I);
        j2 = -9223372036854775807L;
        i2 = iMo33542a;
        a0p0 a0p0VarM45007q2 = m45007q1(this.f80637r0, jtp0Var, m45008r1(jtp0Var, i2, j2));
        i3 = a0p0VarM45007q2.f11136e;
        if (i3 == 1) {
            i3 = 1;
        } else if (!jtp0Var.m73436p()) {
            i3 = 4;
        } else if (i2 != -1) {
            if (i2 >= i5) {
                i3 = 4;
            } else {
                i3 = 2;
            }
        }
        a0p0VarM44991p1 = m44991p1(a0p0VarM45007q2, i3);
        this.f80624l.f189355g.m56387d(17, new kjx(arrayList2, this.f80592P, i2, h0b1.m46295W(j2))).m53364b();
        if (this.f80637r0.f11133b.f244408a.equals(a0p0VarM44991p1.f11133b.f244408a)) {
            z2 = false;
        } else {
            z2 = false;
        }
        m44994C1(a0p0VarM44991p1, 0, z2, 4, m45003k1(a0p0VarM44991p1), -1, false);
    }

    /* JADX INFO: renamed from: y1 */
    public final void m45015y1(Surface surface) {
        Object obj = this.f80596T;
        boolean zM41669c = true;
        boolean z = (obj == null || obj == surface) ? false : true;
        long j = z ? this.f80578B : -9223372036854775807L;
        qjx qjxVar = this.f80624l;
        if (!qjxVar.f189358h1 && qjxVar.f189359i.getThread().isAlive()) {
            fhi fhiVar = new fhi(qjxVar.f189326M0);
            qjxVar.f189355g.m56387d(30, new Pair(surface, fhiVar)).m53364b();
            if (j != -9223372036854775807L) {
                zM41669c = fhiVar.m41669c(j);
            }
        }
        if (z) {
            Object obj2 = this.f80596T;
            Surface surface2 = this.f80597U;
            if (obj2 == surface2) {
                surface2.release();
                this.f80597U = null;
            }
        }
        this.f80596T = surface;
        if (zM41669c) {
            return;
        }
        m45016z1(new ExoPlaybackException(2, new ExoTimeoutException(3), 1003));
    }

    @Override // p204p.g7p0
    /* JADX INFO: renamed from: z */
    public final void mo43918z(int i, boolean z) {
        m44996E1();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    /* JADX INFO: renamed from: z0 */
    public final void mo770z0(wz8 wz8Var) {
        m44996E1();
        List listSingletonList = Collections.singletonList(wz8Var);
        m44996E1();
        m45014x1(listSingletonList, -1, -9223372036854775807L, true);
    }

    /* JADX INFO: renamed from: z1 */
    public final void m45016z1(ExoPlaybackException exoPlaybackException) {
        a0p0 a0p0Var = this.f80637r0;
        a0p0 a0p0VarM24375c = a0p0Var.m24375c(a0p0Var.f11133b);
        a0p0VarM24375c.f11148q = a0p0VarM24375c.f11150s;
        a0p0VarM24375c.f11149r = 0L;
        a0p0 a0p0VarM44991p1 = m44991p1(a0p0VarM24375c, 1);
        if (exoPlaybackException != null) {
            a0p0VarM44991p1 = a0p0VarM44991p1.m24378f(exoPlaybackException);
        }
        this.f80586J++;
        this.f80624l.f189355g.m56384a(6).m53364b();
        m44994C1(a0p0VarM44991p1, 0, false, 5, -9223372036854775807L, -1, false);
    }
}
