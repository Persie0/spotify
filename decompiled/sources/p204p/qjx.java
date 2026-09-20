package p204p;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.spotify.searchview.proto.AudioEpisode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class qjx implements Handler.Callback, whd0, gr81, hap0, oxb1 {

    /* JADX INFO: renamed from: E1 */
    public static final long f189320E1 = h0b1.m46326n0(10000);

    /* JADX INFO: renamed from: A1 */
    public lix f189321A1;

    /* JADX INFO: renamed from: B1 */
    public long f189322B1;

    /* JADX INFO: renamed from: C1 */
    public boolean f189323C1;

    /* JADX INFO: renamed from: D1 */
    public float f189324D1;

    /* JADX INFO: renamed from: L0 */
    public final ArrayList f189325L0;

    /* JADX INFO: renamed from: M0 */
    public final gh61 f189326M0;

    /* JADX INFO: renamed from: N0 */
    public final rix f189327N0;

    /* JADX INFO: renamed from: O0 */
    public final aid0 f189328O0;

    /* JADX INFO: renamed from: P0 */
    public final mtd0 f189329P0;

    /* JADX INFO: renamed from: Q0 */
    public final lop f189330Q0;

    /* JADX INFO: renamed from: R0 */
    public final long f189331R0;

    /* JADX INFO: renamed from: S0 */
    public final w9p0 f189332S0;

    /* JADX INFO: renamed from: T0 */
    public final boolean f189333T0;

    /* JADX INFO: renamed from: U0 */
    public final xwo f189334U0;

    /* JADX INFO: renamed from: V0 */
    public final kh61 f189335V0;

    /* JADX INFO: renamed from: W0 */
    public final boolean f189336W0;

    /* JADX INFO: renamed from: X */
    public final bp71 f189337X;

    /* JADX INFO: renamed from: X0 */
    public final jx6 f189338X0;

    /* JADX INFO: renamed from: Y */
    public final long f189339Y;

    /* JADX INFO: renamed from: Y0 */
    public boolean f189340Y0;

    /* JADX INFO: renamed from: Z */
    public final vpp f189341Z;

    /* JADX INFO: renamed from: Z0 */
    public mdz0 f189342Z0;

    /* JADX INFO: renamed from: a */
    public final vkw0[] f189343a;

    /* JADX INFO: renamed from: a1 */
    public loy0 f189344a1;

    /* JADX INFO: renamed from: b */
    public final o09[] f189345b;

    /* JADX INFO: renamed from: b1 */
    public boolean f189346b1;

    /* JADX INFO: renamed from: c */
    public final boolean[] f189347c;

    /* JADX INFO: renamed from: c1 */
    public boolean f189348c1;

    /* JADX INFO: renamed from: d */
    public final ckc0 f189349d;

    /* JADX INFO: renamed from: d1 */
    public pjx f189350d1;

    /* JADX INFO: renamed from: e */
    public final hr81 f189351e;

    /* JADX INFO: renamed from: e1 */
    public int f189352e1;

    /* JADX INFO: renamed from: f */
    public final j0a0 f189353f;

    /* JADX INFO: renamed from: f1 */
    public a0p0 f189354f1;

    /* JADX INFO: renamed from: g */
    public final kh61 f189355g;

    /* JADX INFO: renamed from: g1 */
    public njx f189356g1;

    /* JADX INFO: renamed from: h */
    public final t0h1 f189357h;

    /* JADX INFO: renamed from: h1 */
    public boolean f189358h1;

    /* JADX INFO: renamed from: i */
    public final Looper f189359i;

    /* JADX INFO: renamed from: i1 */
    public boolean f189360i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f189361j1;

    /* JADX INFO: renamed from: k1 */
    public boolean f189362k1;

    /* JADX INFO: renamed from: l1 */
    public long f189363l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f189364m1;

    /* JADX INFO: renamed from: n1 */
    public int f189365n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f189366o1;

    /* JADX INFO: renamed from: p1 */
    public boolean f189367p1;

    /* JADX INFO: renamed from: q1 */
    public boolean f189368q1;

    /* JADX INFO: renamed from: r1 */
    public boolean f189369r1;

    /* JADX INFO: renamed from: s1 */
    public int f189370s1;

    /* JADX INFO: renamed from: t */
    public final mp71 f189371t;

    /* JADX INFO: renamed from: t1 */
    public pjx f189372t1;

    /* JADX INFO: renamed from: u1 */
    public long f189373u1;

    /* JADX INFO: renamed from: v1 */
    public long f189374v1;

    /* JADX INFO: renamed from: w1 */
    public int f189375w1;

    /* JADX INFO: renamed from: x1 */
    public boolean f189376x1;

    /* JADX INFO: renamed from: y1 */
    public ExoPlaybackException f189377y1;

    /* JADX INFO: renamed from: z1 */
    public long f189378z1;

    public qjx(Context context, o09[] o09VarArr, o09[] o09VarArr2, ckc0 ckc0Var, hr81 hr81Var, j0a0 j0a0Var, at8 at8Var, int i, boolean z, xwo xwoVar, mdz0 mdz0Var, lop lopVar, long j, boolean z2, Looper looper, gh61 gh61Var, rix rixVar, w9p0 w9p0Var, final oxb1 oxb1Var, boolean z3) {
        Looper looper2;
        lix lixVar = lix.f133902a;
        this.f189322B1 = -9223372036854775807L;
        this.f189327N0 = rixVar;
        this.f189349d = ckc0Var;
        this.f189351e = hr81Var;
        this.f189353f = j0a0Var;
        this.f189365n1 = i;
        this.f189366o1 = z;
        this.f189342Z0 = mdz0Var;
        this.f189330Q0 = lopVar;
        this.f189331R0 = j;
        boolean z4 = false;
        this.f189360i1 = false;
        this.f189333T0 = z2;
        this.f189326M0 = gh61Var;
        this.f189332S0 = w9p0Var;
        this.f189321A1 = lixVar;
        this.f189334U0 = xwoVar;
        this.f189324D1 = 1.0f;
        this.f189344a1 = loy0.f135573g;
        this.f189340Y0 = z3;
        this.f189378z1 = -9223372036854775807L;
        this.f189363l1 = -9223372036854775807L;
        this.f189339Y = ((top) j0a0Var).f222307n;
        ap71 ap71Var = qp71.f191180a;
        a0p0 a0p0VarM24372k = a0p0.m24372k(hr81Var);
        this.f189354f1 = a0p0VarM24372k;
        this.f189356g1 = new njx(a0p0VarM24372k, 0);
        this.f189345b = new o09[o09VarArr.length];
        this.f189347c = new boolean[o09VarArr.length];
        req reqVar = (req) ckc0Var;
        reqVar.getClass();
        this.f189343a = new vkw0[o09VarArr.length];
        boolean z5 = false;
        for (int i2 = 0; i2 < o09VarArr.length; i2++) {
            o09VarArr[i2].m66005r(i2, w9p0Var, gh61Var);
            o09[] o09VarArr3 = this.f189345b;
            o09 o09Var = o09VarArr[i2];
            o09Var.getClass();
            o09VarArr3[i2] = o09Var;
            o09 o09Var2 = this.f189345b[i2];
            synchronized (o09Var2.f160287a) {
                o09Var2.f160283Q0 = reqVar;
            }
            o09 o09Var3 = o09VarArr2[i2];
            if (o09Var3 != null) {
                o09Var3.m66005r(i2, w9p0Var, gh61Var);
                z5 = true;
            }
            this.f189343a[i2] = new vkw0(o09VarArr[i2], o09VarArr2[i2], i2);
        }
        this.f189336W0 = z5;
        vpp vppVar = new vpp();
        vppVar.f243740d = this;
        vppVar.f243739c = new fi41(gh61Var);
        vppVar.f243737a = true;
        this.f189341Z = vppVar;
        this.f189325L0 = new ArrayList();
        this.f189371t = new mp71();
        this.f189337X = new bp71();
        c95.m31855u(reqVar.f38916a == null);
        reqVar.f38916a = this;
        reqVar.f38917b = at8Var;
        reqVar.f198410g = reqVar.f198409f;
        this.f189376x1 = true;
        kh61 kh61VarM44723a = gh61Var.m44723a(looper, null);
        this.f189335V0 = kh61VarM44723a;
        this.f189328O0 = new aid0(xwoVar, kh61VarM44723a, new its(this, 24), o09VarArr.length);
        this.f189329P0 = new mtd0(this, xwoVar, kh61VarM44723a, w9p0Var, at8Var);
        t0h1 t0h1Var = new t0h1(17, (byte) 0);
        this.f189357h = t0h1Var;
        synchronized (t0h1Var.f215890c) {
            try {
                if (((Looper) t0h1Var.f215891d) == null) {
                    if (t0h1Var.f215889b == 0 && ((HandlerThread) t0h1Var.f215892e) == null) {
                        z4 = true;
                    }
                    c95.m31855u(z4);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    t0h1Var.f215892e = handlerThread;
                    handlerThread.start();
                    t0h1Var.f215891d = ((HandlerThread) t0h1Var.f215892e).getLooper();
                }
                t0h1Var.f215889b++;
                looper2 = (Looper) t0h1Var.f215891d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f189359i = looper2;
        kh61 kh61VarM44723a2 = gh61Var.m44723a(looper2, this);
        this.f189355g = kh61VarM44723a2;
        this.f189338X0 = new jx6(context, looper2, this);
        kh61VarM44723a2.m56387d(35, new oxb1() { // from class: p.hjx
            @Override // p204p.oxb1
            /* JADX INFO: renamed from: a */
            public final void mo33002a(long j2, long j3, r300 r300Var, MediaFormat mediaFormat) {
                qjx qjxVar = this.f92285a;
                qjxVar.getClass();
                oxb1Var.mo33002a(j2, j3, r300Var, mediaFormat);
                qjxVar.mo33002a(j2, j3, r300Var, mediaFormat);
            }
        }).m53364b();
        kh61VarM44723a2.m56387d(39, new ijx(this)).m53364b();
    }

    /* JADX INFO: renamed from: B */
    public static boolean m72952B(yhd0 yhd0Var) {
        if (yhd0Var != null) {
            try {
                m1d0 m1d0Var = yhd0Var.f272821a;
                if (yhd0Var.f272825e) {
                    for (p1y0 p1y0Var : yhd0Var.f272823c) {
                        if (p1y0Var != null) {
                            p1y0Var.mo41645d();
                        }
                    }
                } else {
                    m1d0Var.mo26786q();
                }
                if ((!yhd0Var.f272825e ? 0L : m1d0Var.mo26774b()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static void m72953U(qp71 qp71Var, mjx mjxVar, mp71 mp71Var, bp71 bp71Var) {
        int i = qp71Var.mo26654n(qp71Var.mo46978g(mjxVar.f144413d, bp71Var).f29345c, mp71Var, 0L).f145940o;
        Object obj = qp71Var.mo26651f(i, bp71Var, true).f29344b;
        long j = bp71Var.f29346d;
        long j2 = j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE;
        mjxVar.f144411b = i;
        mjxVar.f144412c = j2;
        mjxVar.f144413d = obj;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m72954V(mjx mjxVar, qp71 qp71Var, qp71 qp71Var2, int i, boolean z, mp71 mp71Var, bp71 bp71Var) {
        Object obj = mjxVar.f144413d;
        jap0 jap0Var = mjxVar.f144410a;
        if (obj == null) {
            long j = jap0Var.f110511h;
            Pair pairM72955X = m72955X(qp71Var, new pjx(jap0Var.f110506c, jap0Var.f110510g, j == Long.MIN_VALUE ? -9223372036854775807L : h0b1.m46295W(j)), false, i, z, mp71Var, bp71Var);
            if (pairM72955X == null) {
                return false;
            }
            int iMo26650b = qp71Var.mo26650b(pairM72955X.first);
            long jLongValue = ((Long) pairM72955X.second).longValue();
            Object obj2 = pairM72955X.first;
            mjxVar.f144411b = iMo26650b;
            mjxVar.f144412c = jLongValue;
            mjxVar.f144413d = obj2;
            if (jap0Var.f110511h == Long.MIN_VALUE) {
                m72953U(qp71Var, mjxVar, mp71Var, bp71Var);
                return true;
            }
        } else {
            int iMo26650b2 = qp71Var.mo26650b(obj);
            if (iMo26650b2 == -1) {
                return false;
            }
            if (jap0Var.f110511h == Long.MIN_VALUE) {
                m72953U(qp71Var, mjxVar, mp71Var, bp71Var);
                return true;
            }
            mjxVar.f144411b = iMo26650b2;
            qp71Var2.mo46978g(mjxVar.f144413d, bp71Var);
            if (bp71Var.f29348f && qp71Var2.mo26654n(bp71Var.f29345c, mp71Var, 0L).f145939n == qp71Var2.mo26650b(mjxVar.f144413d)) {
                Pair pairM73433i = qp71Var.m73433i(mp71Var, bp71Var, qp71Var.mo46978g(mjxVar.f144413d, bp71Var).f29345c, mjxVar.f144412c + bp71Var.f29347e);
                int iMo26650b3 = qp71Var.mo26650b(pairM73433i.first);
                long jLongValue2 = ((Long) pairM73433i.second).longValue();
                Object obj3 = pairM73433i.first;
                mjxVar.f144411b = iMo26650b3;
                mjxVar.f144412c = jLongValue2;
                mjxVar.f144413d = obj3;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: X */
    public static Pair m72955X(qp71 qp71Var, pjx pjxVar, boolean z, int i, boolean z2, mp71 mp71Var, bp71 bp71Var) {
        int iM72956Y;
        qp71 qp71Var2 = pjxVar.f178318a;
        if (qp71Var.m73436p()) {
            return null;
        }
        qp71 qp71Var3 = qp71Var2.m73436p() ? qp71Var : qp71Var2;
        try {
            Pair pairM73433i = qp71Var3.m73433i(mp71Var, bp71Var, pjxVar.f178319b, pjxVar.f178320c);
            if (!qp71Var.equals(qp71Var3)) {
                if (qp71Var.mo26650b(pairM73433i.first) == -1) {
                    if (!z || (iM72956Y = m72956Y(mp71Var, bp71Var, i, z2, pairM73433i.first, qp71Var3, qp71Var)) == -1) {
                        return null;
                    }
                    return qp71Var.m73433i(mp71Var, bp71Var, iM72956Y, -9223372036854775807L);
                }
                if (qp71Var3.mo46978g(pairM73433i.first, bp71Var).f29348f && qp71Var3.mo26654n(bp71Var.f29345c, mp71Var, 0L).f145939n == qp71Var3.mo26650b(pairM73433i.first)) {
                    return qp71Var.m73433i(mp71Var, bp71Var, qp71Var.mo46978g(pairM73433i.first, bp71Var).f29345c, pjxVar.f178320c);
                }
            }
            return pairM73433i;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static int m72956Y(mp71 mp71Var, bp71 bp71Var, int i, boolean z, Object obj, qp71 qp71Var, qp71 qp71Var2) {
        qp71 qp71Var3 = qp71Var;
        Object obj2 = qp71Var3.mo26654n(qp71Var3.mo46978g(obj, bp71Var).f29345c, mp71Var, 0L).f145926a;
        for (int i2 = 0; i2 < qp71Var2.mo26655o(); i2++) {
            if (qp71Var2.mo26654n(i2, mp71Var, 0L).f145926a.equals(obj2)) {
                return i2;
            }
        }
        int iMo26650b = qp71Var3.mo26650b(obj);
        int iMo26652h = qp71Var3.mo26652h();
        int iMo26650b2 = -1;
        int i3 = 0;
        while (i3 < iMo26652h && iMo26650b2 == -1) {
            qp71 qp71Var4 = qp71Var3;
            int iM73432d = qp71Var4.m73432d(iMo26650b, bp71Var, mp71Var, i, z);
            if (iM73432d == -1) {
                break;
            }
            iMo26650b2 = qp71Var2.mo26650b(qp71Var4.mo26653l(iM73432d));
            i3++;
            qp71Var3 = qp71Var4;
            iMo26650b = iM73432d;
        }
        if (iMo26650b2 == -1) {
            return -1;
        }
        return qp71Var2.mo26651f(iMo26650b2, bp71Var, false).f29345c;
    }

    /* JADX INFO: renamed from: h */
    public static void m72957h(jap0 jap0Var) {
        boolean z;
        synchronized (jap0Var) {
            z = jap0Var.f110514k;
        }
        if (z) {
            return;
        }
        try {
            jap0Var.f110504a.mo827c(jap0Var.f110507d, jap0Var.f110508e);
        } finally {
            jap0Var.m52847a(true);
        }
    }

    /* JADX INFO: renamed from: A */
    public final a0p0 m72958A(vsd0 vsd0Var, long j, long j2, long j3, boolean z, int i) {
        wsv0 wsv0VarM53150g;
        yhd0 yhd0Var;
        boolean z2;
        this.f189376x1 = (!this.f189376x1 && j == this.f189354f1.f11150s && vsd0Var.equals(this.f189354f1.f11133b)) ? false : true;
        m72987S();
        a0p0 a0p0Var = this.f189354f1;
        lf81 lf81Var = a0p0Var.f11139h;
        hr81 hr81Var = a0p0Var.f11140i;
        List list = a0p0Var.f11141j;
        if (this.f189329P0.f147056l) {
            yhd0 yhd0Var2 = this.f189328O0.f15958i;
            lf81Var = yhd0Var2 == null ? lf81.f132851d : yhd0Var2.f272834n;
            hr81Var = yhd0Var2 == null ? this.f189351e : yhd0Var2.f272835o;
            xjx[] xjxVarArr = (xjx[]) hr81Var.f94377d;
            jf40 jf40Var = new jf40(4);
            boolean z3 = false;
            for (xjx xjxVar : xjxVarArr) {
                if (xjxVar != null) {
                    j6f0 j6f0Var = xjxVar.mo34613e(0).f195384m;
                    if (j6f0Var == null) {
                        jf40Var.m28985c(new j6f0(new s5f0[0]));
                    } else {
                        jf40Var.m28985c(j6f0Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                wsv0VarM53150g = jf40Var.m53150g();
            } else {
                kf40 kf40Var = pf40.f176960b;
                wsv0VarM53150g = wsv0.f254763e;
            }
            list = wsv0VarM53150g;
            if (yhd0Var2 != null) {
                zhd0 zhd0Var = yhd0Var2.f272827g;
                if (zhd0Var.f282886d != j2) {
                    yhd0Var2.f272827g = zhd0Var.m96124a(j2);
                }
            }
            vkw0[] vkw0VarArr = this.f189343a;
            if (!m72961C() && (yhd0Var = this.f189328O0.f15958i) != null) {
                hr81 hr81Var2 = yhd0Var.f272835o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= vkw0VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (hr81Var2.m48340p(i2)) {
                        if (vkw0VarArr[i2].f242300a.f160288b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((qkw0[]) hr81Var2.f94376c)[i2].f189661a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f189369r1) {
                    this.f189369r1 = z5;
                    if (!z5 && this.f189354f1.f11147p) {
                        this.f189355g.m56392j(2);
                    }
                }
            }
        } else if (!vsd0Var.equals(a0p0Var.f11133b)) {
            lf81Var = lf81.f132851d;
            hr81Var = this.f189351e;
            list = wsv0.f254763e;
        }
        lf81 lf81Var2 = lf81Var;
        hr81 hr81Var3 = hr81Var;
        List list2 = list;
        if (z) {
            njx njxVar = this.f189356g1;
            if (!njxVar.f154667e || njxVar.f154665c == 5) {
                njxVar.f154666d = true;
                njxVar.f154667e = true;
                njxVar.f154665c = i;
            } else {
                c95.m31843i(i == 5);
            }
        }
        a0p0 a0p0Var2 = this.f189354f1;
        return a0p0Var2.m24376d(vsd0Var, j, j2, j3, m73020r(a0p0Var2.f11148q), lf81Var2, hr81Var3, list2);
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m72959A0() {
        a0p0 a0p0Var = this.f189354f1;
        return a0p0Var.f11143l && a0p0Var.f11145n == 0;
    }

    /* JADX INFO: renamed from: B0 */
    public final boolean m72960B0(qp71 qp71Var, vsd0 vsd0Var) {
        if (vsd0Var.m86309c() || qp71Var.m73436p()) {
            return false;
        }
        int i = qp71Var.mo46978g(vsd0Var.f244408a, this.f189337X).f29345c;
        mp71 mp71Var = this.f189371t;
        qp71Var.m73435m(i, mp71Var);
        return mp71Var.m62446c() && mp71Var.f145934i && mp71Var.f145931f != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m72961C() {
        for (int i = 0; i < this.f189343a.length; i++) {
            aid0 aid0Var = this.f189328O0;
            if (!Objects.equals(aid0Var.f15958i, aid0Var.f15959j[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C0 */
    public final void m72962C0() {
        yhd0 yhd0Var = this.f189328O0.f15958i;
        if (yhd0Var == null) {
            return;
        }
        hr81 hr81Var = yhd0Var.f272835o;
        int i = 0;
        while (true) {
            vkw0[] vkw0VarArr = this.f189343a;
            if (i >= vkw0VarArr.length) {
                return;
            }
            if (hr81Var.m48340p(i)) {
                vkw0VarArr[i].m85933o();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m72963D(int i, vsd0 vsd0Var) {
        aid0 aid0Var = this.f189328O0;
        yhd0 yhd0Var = aid0Var.f15960k[i];
        if (yhd0Var == null || !yhd0Var.f272827g.f282883a.equals(vsd0Var)) {
            return false;
        }
        return this.f189343a[i].m85927g(aid0Var.f15960k[i]);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m72964D0(boolean z, boolean z2) {
        m72986R(z || !this.f189367p1, false, true, false);
        this.f189356g1.m64650e(z2 ? 1 : 0);
        this.f189353f.mo41359e(this.f189332S0);
        this.f189338X0.m54500d(1, this.f189354f1.f11143l);
        m73031w0(1);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m72965E() {
        yhd0 yhd0Var = this.f189328O0.f15958i;
        long j = yhd0Var.f272827g.f282887e;
        if (yhd0Var.f272825e) {
            return j == -9223372036854775807L || this.f189354f1.f11150s < j || !m72959A0();
        }
        return false;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m72966E0() {
        vpp vppVar = this.f189341Z;
        vppVar.f243738b = false;
        fi41 fi41Var = (fi41) vppVar.f243739c;
        if (fi41Var.f69777b) {
            fi41Var.m41692a(fi41Var.mo41696q());
            fi41Var.f69777b = false;
        }
        for (vkw0 vkw0Var : this.f189343a) {
            o09 o09Var = vkw0Var.f242302c;
            o09 o09Var2 = vkw0Var.f242300a;
            if (vkw0.m85919j(o09Var2) && o09Var2.m66002n() == 2) {
                o09Var2.m65995Q();
            }
            if (o09Var != null && vkw0.m85919j(o09Var) && o09Var.m66002n() == 2) {
                o09Var.m65995Q();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m72967F() {
        long j;
        long j2;
        boolean zMo41356a;
        if (m72952B(this.f189328O0.f15961l)) {
            yhd0 yhd0Var = this.f189328O0.f15961l;
            long jM73020r = m73020r(!yhd0Var.f272825e ? 0L : yhd0Var.f272821a.mo26774b());
            if (yhd0Var == this.f189328O0.f15958i) {
                j = this.f189373u1;
                j2 = yhd0Var.f272836p;
            } else {
                j = this.f189373u1 - yhd0Var.f272836p;
                j2 = yhd0Var.f272827g.f282884b;
            }
            long j3 = j - j2;
            long j4 = m72960B0(this.f189354f1.f11132a, yhd0Var.f272827g.f282883a) ? this.f189330Q0.f135495i : -9223372036854775807L;
            w9p0 w9p0Var = this.f189332S0;
            qp71 qp71Var = this.f189354f1.f11132a;
            vsd0 vsd0Var = yhd0Var.f272827g.f282883a;
            float f = this.f189341Z.mo41694j().f86674a;
            boolean z = this.f189354f1.f11143l;
            i0a0 i0a0Var = new i0a0(w9p0Var, qp71Var, vsd0Var, j3, jM73020r, f, this.f189362k1, j4);
            zMo41356a = this.f189353f.mo41356a(i0a0Var);
            yhd0 yhd0Var2 = this.f189328O0.f15958i;
            if (!zMo41356a && yhd0Var2.f272825e && jM73020r < 500000 && this.f189339Y > 0) {
                yhd0Var2.f272821a.mo26787r(this.f189354f1.f11150s);
                zMo41356a = this.f189353f.mo41356a(i0a0Var);
            }
        } else {
            zMo41356a = false;
        }
        this.f189364m1 = zMo41356a;
        if (zMo41356a) {
            yhd0 yhd0Var3 = this.f189328O0.f15961l;
            yhd0Var3.getClass();
            kop kopVar = new kop(1);
            kopVar.f124839a = this.f189373u1 - yhd0Var3.f272836p;
            float f2 = this.f189341Z.mo41694j().f86674a;
            c95.m31843i(f2 > 0.0f || f2 == -3.4028235E38f);
            kopVar.f124840b = f2;
            long j5 = this.f189363l1;
            c95.m31843i(j5 >= 0 || j5 == -9223372036854775807L);
            kopVar.f124841c = j5;
            m8a0 m8a0Var = new m8a0(kopVar);
            c95.m31855u(yhd0Var3.f272833m == null);
            yhd0Var3.f272821a.mo26780h(m8a0Var);
        }
        m72968F0();
    }

    /* JADX INFO: renamed from: F0 */
    public final void m72968F0() {
        yhd0 yhd0Var = this.f189328O0.f15961l;
        boolean z = this.f189364m1 || (yhd0Var != null && yhd0Var.f272821a.mo26775c());
        a0p0 a0p0Var = this.f189354f1;
        if (z != a0p0Var.f11138g) {
            this.f189354f1 = a0p0Var.m24374b(z);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m72969G() {
        aid0 aid0Var = this.f189328O0;
        aid0Var.m26088r();
        yhd0 yhd0Var = aid0Var.f15962m;
        if (yhd0Var != null) {
            m1d0 m1d0Var = yhd0Var.f272821a;
            if ((!yhd0Var.f272824d || yhd0Var.f272825e) && !m1d0Var.mo26775c()) {
                qp71 qp71Var = this.f189354f1.f11132a;
                if (yhd0Var.f272825e) {
                    m1d0Var.mo26791y();
                }
                Iterator it = ((top) this.f189353f).f222309p.values().iterator();
                while (it.hasNext()) {
                    if (((sop) it.next()).f212625b) {
                        return;
                    }
                }
                if (!yhd0Var.f272824d) {
                    long j = yhd0Var.f272827g.f282884b;
                    yhd0Var.f272824d = true;
                    m1d0Var.mo26790w(this, j);
                    return;
                }
                kop kopVar = new kop(1);
                kopVar.f124839a = this.f189373u1 - yhd0Var.f272836p;
                float f = this.f189341Z.mo41694j().f86674a;
                c95.m31843i(f > 0.0f || f == -3.4028235E38f);
                kopVar.f124840b = f;
                long j2 = this.f189363l1;
                c95.m31843i(j2 >= 0 || j2 == -9223372036854775807L);
                kopVar.f124841c = j2;
                m8a0 m8a0Var = new m8a0(kopVar);
                c95.m31855u(yhd0Var.f272833m == null);
                m1d0Var.mo26780h(m8a0Var);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m72970G0(vsd0 vsd0Var, lf81 lf81Var, hr81 hr81Var) {
        long j;
        long j2;
        aid0 aid0Var = this.f189328O0;
        yhd0 yhd0Var = aid0Var.f15961l;
        yhd0Var.getClass();
        if (yhd0Var == aid0Var.f15958i) {
            j = this.f189373u1;
            j2 = yhd0Var.f272836p;
        } else {
            j = this.f189373u1 - yhd0Var.f272836p;
            j2 = yhd0Var.f272827g.f282884b;
        }
        long j3 = j - j2;
        long jM73020r = m73020r(yhd0Var.m93641d());
        long j4 = m72960B0(this.f189354f1.f11132a, yhd0Var.f272827g.f282883a) ? this.f189330Q0.f135495i : -9223372036854775807L;
        qp71 qp71Var = this.f189354f1.f11132a;
        float f = this.f189341Z.mo41694j().f86674a;
        boolean z = this.f189354f1.f11143l;
        this.f189353f.mo41360f(new i0a0(this.f189332S0, qp71Var, vsd0Var, j3, jM73020r, f, this.f189362k1, j4), lf81Var, (xjx[]) hr81Var.f94377d);
    }

    /* JADX INFO: renamed from: H */
    public final void m72971H(int i) {
        njx njxVar = this.f189356g1;
        a0p0 a0p0Var = this.f189354f1;
        boolean z = njxVar.f154666d | (((a0p0) njxVar.f154668f) != a0p0Var);
        njxVar.f154666d = z;
        njxVar.f154668f = a0p0Var;
        if (z) {
            if (!a0p0Var.f11132a.m73436p()) {
                a0p0 a0p0Var2 = this.f189354f1;
                boolean z2 = a0p0Var2.f11132a.mo26650b(a0p0Var2.f11133b.f244408a) != -1;
                Locale locale = Locale.US;
                a0p0 a0p0Var3 = this.f189354f1;
                c95.m31856v(z2, String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", a0p0Var3.f11133b.f244408a, a0p0Var3.f11132a.getClass().getName(), Integer.valueOf(this.f189354f1.f11132a.mo26655o()), Integer.valueOf(i)));
            }
            njx njxVar2 = this.f189356g1;
            gjx gjxVar = this.f189327N0.f199647b;
            gjxVar.f80620j.m56388f(new fxf(24, gjxVar, njxVar2));
            this.f189356g1 = new njx(this.f189354f1, 0);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m72972H0(int i, int i2, List list) throws Throwable {
        this.f189356g1.m64650e(1);
        mtd0 mtd0Var = this.f189329P0;
        mtd0Var.getClass();
        ArrayList arrayList = mtd0Var.f147047c;
        c95.m31843i(i >= 0 && i <= i2 && i2 <= arrayList.size());
        c95.m31843i(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((ltd0) arrayList.get(i3)).f136759a.mo27864A((ufd0) list.get(i3 - i));
        }
        m73032x(mtd0Var.m62816b(), false);
    }

    /* JADX INFO: renamed from: I */
    public final void m72973I(int i) {
        vkw0 vkw0Var = this.f189343a[i];
        try {
            yhd0 yhd0Var = this.f189328O0.f15958i;
            yhd0Var.getClass();
            o09 o09VarM85923c = vkw0Var.m85923c(yhd0Var);
            o09VarM85923c.getClass();
            o09VarM85923c.m66007w();
        } catch (IOException | RuntimeException e) {
            int i2 = vkw0Var.f242300a.f160288b;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            hr81 hr81Var = this.f189328O0.f15958i.f272835o;
            yif1.m93810s("Disabling track due to error: " + r300.m74563e(((xjx[]) hr81Var.f94377d)[i].mo34621s()), e);
            hr81 hr81Var2 = new hr81((qkw0[]) ((qkw0[]) hr81Var.f94376c).clone(), (xjx[]) ((xjx[]) hr81Var.f94377d).clone(), (tt81) hr81Var.f94378e, hr81Var.f94379f);
            ((qkw0[]) hr81Var2.f94376c)[i] = null;
            ((xjx[]) hr81Var2.f94377d)[i] = null;
            m73006k(i);
            yhd0 yhd0Var2 = this.f189328O0.f15958i;
            yhd0Var2.m93638a(hr81Var2, this.f189354f1.f11150s, false, new boolean[yhd0Var2.f272830j.length]);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m72974I0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.f189346b1;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        a0p0 a0p0Var = this.f189354f1;
        if (a0p0Var.f11143l == z2 && a0p0Var.f11145n == i2 && a0p0Var.f11144m == i3) {
            return;
        }
        this.f189354f1 = a0p0Var.m24377e(i3, i2, z2);
        m72980L0(false, false);
        aid0 aid0Var = this.f189328O0;
        for (yhd0 yhd0Var = aid0Var.f15958i; yhd0Var != null; yhd0Var = yhd0Var.f272833m) {
            for (xjx xjxVar : (xjx[]) yhd0Var.f272835o.f94377d) {
                if (xjxVar != null) {
                    xjxVar.mo34619o(z2);
                }
            }
        }
        if (!m72959A0()) {
            m72966E0();
            m72976J0();
            a0p0 a0p0Var2 = this.f189354f1;
            if (a0p0Var2.f11147p) {
                this.f189354f1 = a0p0Var2.m24381i(false);
            }
            aid0Var.m26090t(this.f189373u1);
            return;
        }
        int i4 = this.f189354f1.f11136e;
        kh61 kh61Var = this.f189355g;
        if (i4 != 3) {
            if (i4 == 2) {
                kh61Var.m56392j(2);
            }
        } else {
            vpp vppVar = this.f189341Z;
            vppVar.f243738b = true;
            ((fi41) vppVar.f243739c).m41693b();
            m72962C0();
            kh61Var.m56392j(2);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m72975J(int i, boolean z) {
        boolean[] zArr = this.f189347c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.f189335V0.m56388f(new lx6(this, i, z));
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:127:0x01df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: J0 */
    public final void m72976J0() {
        long j;
        ?? r0;
        boolean z;
        h1p0 h1p0VarMo41694j;
        float f;
        yhd0 yhd0Var = this.f189328O0.f15958i;
        if (yhd0Var == null) {
            return;
        }
        long jMo26779g = yhd0Var.f272825e ? yhd0Var.f272821a.mo26779g() : -9223372036854775807L;
        if (jMo26779g != -9223372036854775807L) {
            if (!yhd0Var.m93646i()) {
                this.f189328O0.m26091u(yhd0Var);
                m73004j();
                m73030w(false);
                m72967F();
            }
            m72988T(jMo26779g, true);
            if (jMo26779g != this.f189354f1.f11150s) {
                a0p0 a0p0Var = this.f189354f1;
                vsd0 vsd0Var = a0p0Var.f11133b;
                long j2 = a0p0Var.f11134c;
                r0 = 0;
                this.f189354f1 = m72958A(vsd0Var, jMo26779g, j2, jMo26779g, true, 5);
            } else {
                r0 = 0;
            }
        } else {
            vpp vppVar = this.f189341Z;
            boolean zM72961C = m72961C();
            fi41 fi41Var = (fi41) vppVar.f243739c;
            o09 o09Var = (o09) vppVar.f243741e;
            if (o09Var == null || o09Var.mo847t() || ((zM72961C && ((o09) vppVar.f243741e).f160294h != 2) || (!((o09) vppVar.f243741e).mo850v() && (zM72961C || ((o09) vppVar.f243741e).m66004p())))) {
                vppVar.f243737a = true;
                if (vppVar.f243738b) {
                    fi41Var.m41693b();
                }
            } else {
                oad0 oad0Var = (oad0) vppVar.f243742f;
                oad0Var.getClass();
                long jMo41696q = oad0Var.mo41696q();
                if (!vppVar.f243737a) {
                    fi41Var.m41692a(jMo41696q);
                    h1p0VarMo41694j = oad0Var.mo41694j();
                    if (!h1p0VarMo41694j.equals(fi41Var.f69780e)) {
                        fi41Var.mo41695l(h1p0VarMo41694j);
                        ((qjx) vppVar.f243740d).f189355g.m56387d(16, h1p0VarMo41694j).m53364b();
                    }
                } else if (jMo41696q >= fi41Var.mo41696q()) {
                    vppVar.f243737a = false;
                    if (vppVar.f243738b) {
                        fi41Var.m41693b();
                    }
                    fi41Var.m41692a(jMo41696q);
                    h1p0VarMo41694j = oad0Var.mo41694j();
                    if (!h1p0VarMo41694j.equals(fi41Var.f69780e)) {
                        fi41Var.mo41695l(h1p0VarMo41694j);
                        ((qjx) vppVar.f243740d).f189355g.m56387d(16, h1p0VarMo41694j).m53364b();
                    }
                } else if (fi41Var.f69777b) {
                    fi41Var.m41692a(fi41Var.mo41696q());
                    fi41Var.f69777b = false;
                }
            }
            long jMo41696q2 = vppVar.mo41696q();
            this.f189373u1 = jMo41696q2;
            long j3 = jMo41696q2 - yhd0Var.f272836p;
            long j4 = this.f189354f1.f11150s;
            ArrayList arrayList = this.f189325L0;
            if (arrayList.isEmpty() || this.f189354f1.f11133b.m86309c()) {
                j = j3;
            } else {
                if (this.f189376x1) {
                    j4--;
                    this.f189376x1 = false;
                }
                a0p0 a0p0Var2 = this.f189354f1;
                int iMo26650b = a0p0Var2.f11132a.mo26650b(a0p0Var2.f11133b.f244408a);
                int iMin = Math.min(this.f189375w1, arrayList.size());
                mjx mjxVar = iMin > 0 ? (mjx) arrayList.get(iMin - 1) : null;
                while (mjxVar != null) {
                    int i = mjxVar.f144411b;
                    if (i <= iMo26650b && (i != iMo26650b || mjxVar.f144412c <= j4)) {
                        break;
                    }
                    int i2 = iMin - 1;
                    mjxVar = i2 > 0 ? (mjx) arrayList.get(iMin - 2) : null;
                    iMin = i2;
                }
                mjx mjxVar2 = iMin < arrayList.size() ? (mjx) arrayList.get(iMin) : null;
                while (true) {
                    if (mjxVar2 != null && mjxVar2.f144413d != null) {
                        int i3 = mjxVar2.f144411b;
                        if (i3 < iMo26650b) {
                            j = j3;
                        } else if (i3 == iMo26650b) {
                            j = j3;
                            if (mjxVar2.f144412c > j4) {
                                break;
                            }
                        }
                        iMin++;
                        mjxVar2 = iMin < arrayList.size() ? (mjx) arrayList.get(iMin) : null;
                        j3 = j;
                    }
                    j = j3;
                    break;
                }
                while (mjxVar2 != null) {
                    jap0 jap0Var = mjxVar2.f144410a;
                    if (mjxVar2.f144413d == null || mjxVar2.f144411b != iMo26650b) {
                        break;
                    }
                    long j5 = mjxVar2.f144412c;
                    if (j5 <= j4 || j5 > j) {
                        break;
                    }
                    try {
                        m72998e0(jap0Var);
                        if (jap0Var.f110512i) {
                            arrayList.remove(iMin);
                        } else {
                            synchronized (jap0Var) {
                                z = jap0Var.f110514k;
                            }
                            if (z) {
                                arrayList.remove(iMin);
                            } else {
                                iMin++;
                            }
                        }
                        mjxVar2 = iMin < arrayList.size() ? (mjx) arrayList.get(iMin) : null;
                    } catch (Throwable th) {
                        if (jap0Var.f110512i) {
                            arrayList.remove(iMin);
                        } else {
                            synchronized (jap0Var) {
                                if (jap0Var.f110514k) {
                                    arrayList.remove(iMin);
                                }
                            }
                        }
                        throw th;
                    }
                }
                this.f189375w1 = iMin;
            }
            if (this.f189341Z.mo66547m()) {
                boolean z2 = !this.f189356g1.f154667e;
                a0p0 a0p0Var3 = this.f189354f1;
                r0 = 0;
                this.f189354f1 = m72958A(a0p0Var3.f11133b, j, a0p0Var3.f11134c, j, z2, 6);
            } else {
                r0 = 0;
                a0p0 a0p0Var4 = this.f189354f1;
                a0p0Var4.f11150s = j;
                a0p0Var4.f11151t = SystemClock.elapsedRealtime();
            }
        }
        this.f189354f1.f11148q = this.f189328O0.f15961l.m93641d();
        a0p0 a0p0Var5 = this.f189354f1;
        a0p0Var5.f11149r = m73020r(a0p0Var5.f11148q);
        a0p0 a0p0Var6 = this.f189354f1;
        if (a0p0Var6.f11143l && a0p0Var6.f11136e == 3 && m72960B0(a0p0Var6.f11132a, a0p0Var6.f11133b)) {
            a0p0 a0p0Var7 = this.f189354f1;
            float f2 = 1.0f;
            if (a0p0Var7.f11146o.f86674a == 1.0f) {
                lop lopVar = this.f189330Q0;
                long jM73014o = m73014o(a0p0Var7.f11132a, a0p0Var7.f11133b.f244408a, a0p0Var7.f11150s);
                long j6 = this.f189354f1.f11149r;
                if (lopVar.f135490d != -9223372036854775807L) {
                    float f3 = lopVar.f135489c;
                    long j7 = jM73014o - j6;
                    long j8 = lopVar.f135500n;
                    if (j8 == -9223372036854775807L) {
                        lopVar.f135500n = j7;
                        lopVar.f135501o = 0L;
                    } else {
                        float f4 = 1.0f - f3;
                        long jMax = Math.max(j7, (long) ((j7 * f4) + (j8 * f3)));
                        lopVar.f135500n = jMax;
                        lopVar.f135501o = (long) ((f4 * Math.abs(j7 - jMax)) + (f3 * lopVar.f135501o));
                    }
                    if (lopVar.f135499m == -9223372036854775807L || SystemClock.elapsedRealtime() - lopVar.f135499m >= 1000) {
                        lopVar.f135499m = SystemClock.elapsedRealtime();
                        long j9 = (lopVar.f135501o * 3) + lopVar.f135500n;
                        if (lopVar.f135495i > j9) {
                            float fM46295W = h0b1.m46295W(1000L);
                            long j10 = ((long) ((lopVar.f135498l - 1.0f) * fM46295W)) + ((long) ((lopVar.f135496j - 1.0f) * fM46295W));
                            long j11 = lopVar.f135492f;
                            f = 1.0E-7f;
                            long j12 = lopVar.f135495i - j10;
                            long[] jArr = new long[3];
                            jArr[r0] = j9;
                            jArr[1] = j11;
                            jArr[2] = j12;
                            long j13 = jArr[r0];
                            for (int i4 = 1; i4 < 3; i4++) {
                                long j14 = jArr[i4];
                                if (j14 > j13) {
                                    j13 = j14;
                                }
                            }
                            lopVar.f135495i = j13;
                        } else {
                            f = 1.0E-7f;
                            long jM46319k = h0b1.m46319k(jM73014o - ((long) (Math.max(0.0f, lopVar.f135498l - 1.0f) / 1.0E-7f)), lopVar.f135495i, j9);
                            lopVar.f135495i = jM46319k;
                            long j15 = lopVar.f135494h;
                            if (j15 != -9223372036854775807L && jM46319k > j15) {
                                lopVar.f135495i = j15;
                            }
                        }
                        long j16 = jM73014o - lopVar.f135495i;
                        if (Math.abs(j16) < lopVar.f135487a) {
                            lopVar.f135498l = 1.0f;
                        } else {
                            lopVar.f135498l = h0b1.m46315i((f * j16) + 1.0f, lopVar.f135497k, lopVar.f135496j);
                        }
                        f2 = lopVar.f135498l;
                    } else {
                        f2 = lopVar.f135498l;
                    }
                }
                if (this.f189341Z.mo41694j().f86674a != f2) {
                    h1p0 h1p0VarM46464b = this.f189354f1.f11146o.m46464b(f2);
                    this.f189355g.m56391i(16);
                    this.f189341Z.mo41695l(h1p0VarM46464b);
                    m73036z(this.f189354f1.f11146o, this.f189341Z.mo41694j().f86674a, r0, r0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m72977K() throws Throwable {
        m73032x(this.f189329P0.m62816b(), true);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m72978K0(qp71 qp71Var, vsd0 vsd0Var, qp71 qp71Var2, vsd0 vsd0Var2, long j, boolean z) {
        boolean zM72960B0 = m72960B0(qp71Var, vsd0Var);
        Object obj = vsd0Var.f244408a;
        if (!zM72960B0) {
            h1p0 h1p0Var = vsd0Var.m86309c() ? h1p0.f86671d : this.f189354f1.f11146o;
            vpp vppVar = this.f189341Z;
            if (vppVar.mo41694j().equals(h1p0Var)) {
                return;
            }
            this.f189355g.m56391i(16);
            vppVar.mo41695l(h1p0Var);
            m73036z(this.f189354f1.f11146o, h1p0Var.f86674a, false, false);
            return;
        }
        bp71 bp71Var = this.f189337X;
        int i = qp71Var.mo46978g(obj, bp71Var).f29345c;
        mp71 mp71Var = this.f189371t;
        qp71Var.m73435m(i, mp71Var);
        nfd0 nfd0Var = mp71Var.f145935j;
        lop lopVar = this.f189330Q0;
        lopVar.getClass();
        lopVar.f135490d = h0b1.m46295W(nfd0Var.f153328a);
        lopVar.f135493g = h0b1.m46295W(nfd0Var.f153329b);
        lopVar.f135494h = h0b1.m46295W(nfd0Var.f153330c);
        float f = nfd0Var.f153331d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        lopVar.f135497k = f;
        float f2 = nfd0Var.f153332e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        lopVar.f135496j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            lopVar.f135490d = -9223372036854775807L;
        }
        lopVar.m59577a();
        if (j != -9223372036854775807L) {
            lopVar.f135491e = m73014o(qp71Var, obj, j);
            lopVar.m59577a();
            return;
        }
        if (!Objects.equals(!qp71Var2.m73436p() ? qp71Var2.mo26654n(qp71Var2.mo46978g(vsd0Var2.f244408a, bp71Var).f29345c, mp71Var, 0L).f145926a : null, mp71Var.f145926a) || z) {
            lopVar.f135491e = -9223372036854775807L;
            lopVar.m59577a();
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m72979L(ljx ljxVar) throws Throwable {
        qp71 qp71VarM62816b;
        this.f189356g1.m64650e(1);
        int i = ljxVar.f134160a;
        int i2 = ljxVar.f134161b;
        int i3 = ljxVar.f134162c;
        qv11 qv11Var = ljxVar.f134163d;
        mtd0 mtd0Var = this.f189329P0;
        ArrayList arrayList = mtd0Var.f147047c;
        c95.m31843i(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        mtd0Var.f147055k = qv11Var;
        if (i == i2 || i == i3) {
            qp71VarM62816b = mtd0Var.m62816b();
        } else {
            int iMin = Math.min(i, i3);
            int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int iMo26655o = ((ltd0) arrayList.get(iMin)).f136762d;
            h0b1.m46294V(i, i2, i3, arrayList);
            while (iMin <= iMax) {
                ltd0 ltd0Var = (ltd0) arrayList.get(iMin);
                ltd0Var.f136762d = iMo26655o;
                iMo26655o += ltd0Var.f136759a.f173053M0.f247672e.mo26655o();
                iMin++;
            }
            qp71VarM62816b = mtd0Var.m62816b();
        }
        m73032x(qp71VarM62816b, false);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m72980L0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.f189362k1 = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f189326M0.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f189363l1 = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: M */
    public final void m72981M() {
        this.f189356g1.m64650e(1);
        m72986R(false, false, false, true);
        this.f189353f.mo41357b(this.f189332S0);
        m73031w0(this.f189354f1.f11132a.m73436p() ? 4 : 2);
        a0p0 a0p0Var = this.f189354f1;
        boolean z = a0p0Var.f11143l;
        m72974I0(this.f189338X0.m54500d(a0p0Var.f11136e, z), a0p0Var.f11145n, a0p0Var.f11144m, z);
        mtd0 mtd0Var = this.f189329P0;
        ArrayList arrayList = mtd0Var.f147047c;
        c95.m31855u(!mtd0Var.f147056l);
        for (int i = 0; i < arrayList.size(); i++) {
            ltd0 ltd0Var = (ltd0) arrayList.get(i);
            mtd0Var.m62819e(ltd0Var);
            mtd0Var.f147052h.add(ltd0Var);
        }
        mtd0Var.f147056l = true;
        this.f189355g.m56392j(2);
    }

    /* JADX INFO: renamed from: N */
    public final void m72982N(fhi fhiVar) {
        t0h1 t0h1Var = this.f189357h;
        kh61 kh61Var = this.f189355g;
        try {
            m72986R(true, false, true, false);
            m72983O();
            this.f189353f.mo41358d(this.f189332S0);
            jx6 jx6Var = this.f189338X0;
            jx6Var.f116812c = null;
            jx6Var.m54497a();
            jx6Var.m54499c(0);
            this.f189349d.mo33114a();
            m73031w0(1);
        } finally {
            kh61Var.m56390h();
            t0h1Var.m79818y();
            fhiVar.m41672f();
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m72983O() {
        for (int i = 0; i < this.f189343a.length; i++) {
            o09 o09Var = this.f189345b[i];
            synchronized (o09Var.f160287a) {
                o09Var.f160283Q0 = null;
            }
            vkw0 vkw0Var = this.f189343a[i];
            vkw0Var.f242300a.m65988H();
            vkw0Var.f242304e = false;
            o09 o09Var2 = vkw0Var.f242302c;
            if (o09Var2 != null) {
                o09Var2.m65988H();
                vkw0Var.f242305f = false;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m72984P(int i, int i2, qv11 qv11Var) throws Throwable {
        this.f189356g1.m64650e(1);
        mtd0 mtd0Var = this.f189329P0;
        mtd0Var.getClass();
        c95.m31843i(i >= 0 && i <= i2 && i2 <= mtd0Var.f147047c.size());
        mtd0Var.f147055k = qv11Var;
        mtd0Var.m62820f(i, i2);
        m73032x(mtd0Var.m62816b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0184  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Q */
    public final void m72985Q() {
        int i;
        int i2;
        float f = this.f189341Z.mo41694j().f86674a;
        aid0 aid0Var = this.f189328O0;
        yhd0 yhd0Var = aid0Var.f15958i;
        yhd0 yhd0VarM26078g = aid0Var.m26078g();
        hr81 hr81Var = null;
        yhd0 yhd0Var2 = yhd0Var;
        boolean z = true;
        while (yhd0Var2 != null && yhd0Var2.f272825e) {
            a0p0 a0p0Var = this.f189354f1;
            hr81 hr81VarM93649l = yhd0Var2.m93649l(f, a0p0Var.f11132a, a0p0Var.f11143l);
            hr81 hr81Var2 = yhd0Var2 == this.f189328O0.f15958i ? hr81VarM93649l : hr81Var;
            hr81 hr81Var3 = yhd0Var2.f272835o;
            xjx[] xjxVarArr = (xjx[]) hr81VarM93649l.f94377d;
            if (hr81Var3 != null && ((xjx[]) hr81Var3.f94377d).length == xjxVarArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= xjxVarArr.length) {
                        if (yhd0Var2 == yhd0VarM26078g) {
                            z = false;
                        }
                        yhd0Var2 = yhd0Var2.f272833m;
                        hr81Var = hr81Var2;
                    } else if (hr81VarM93649l.m48339o(hr81Var3, i3)) {
                        i3++;
                    }
                }
            }
            if (!z) {
                i = 4;
                this.f189328O0.m26091u(yhd0Var2);
                if (yhd0Var2.f272825e) {
                    long jMax = Math.max(yhd0Var2.f272827g.f282884b, this.f189373u1 - yhd0Var2.f272836p);
                    if (this.f189336W0) {
                        for (int i4 = 0; i4 < this.f189343a.length; i4++) {
                            if (Objects.equals(this.f189328O0.f15960k[i4], yhd0Var2) && this.f189343a[i4].m85927g(yhd0Var2)) {
                                m73004j();
                                break;
                            }
                        }
                    }
                    i2 = 4;
                    yhd0Var2.m93638a(hr81VarM93649l, jMax, false, new boolean[yhd0Var2.f272830j.length]);
                }
                m73030w(true);
                if (this.f189354f1.f11136e != i2) {
                    m72967F();
                    m72976J0();
                    this.f189355g.m56392j(2);
                    return;
                }
                return;
            }
            aid0 aid0Var2 = this.f189328O0;
            yhd0 yhd0Var3 = aid0Var2.f15958i;
            boolean z2 = (aid0Var2.m26091u(yhd0Var3) & 1) != 0;
            boolean[] zArr = new boolean[this.f189343a.length];
            hr81Var2.getClass();
            long jM93638a = yhd0Var3.m93638a(hr81Var2, this.f189354f1.f11150s, z2, zArr);
            a0p0 a0p0Var2 = this.f189354f1;
            boolean z3 = (a0p0Var2.f11136e == 4 || jM93638a == a0p0Var2.f11150s) ? false : true;
            a0p0 a0p0Var3 = this.f189354f1;
            i = 4;
            this.f189354f1 = m72958A(a0p0Var3.f11133b, jM93638a, a0p0Var3.f11134c, a0p0Var3.f11135d, z3, 5);
            if (z3) {
                m72988T(jM93638a, true);
            }
            m73004j();
            boolean[] zArr2 = new boolean[this.f189343a.length];
            int i5 = 0;
            while (true) {
                vkw0[] vkw0VarArr = this.f189343a;
                if (i5 >= vkw0VarArr.length) {
                    break;
                }
                int iM85922b = vkw0VarArr[i5].m85922b();
                zArr2[i5] = this.f189343a[i5].m85929i();
                vkw0 vkw0Var = this.f189343a[i5];
                p1y0 p1y0Var = yhd0Var3.f272823c[i5];
                vpp vppVar = this.f189341Z;
                long j = this.f189373u1;
                boolean z4 = zArr[i5];
                o09 o09Var = vkw0Var.f242300a;
                if (vkw0.m85919j(o09Var)) {
                    if (p1y0Var != o09Var.m66003o()) {
                        vkw0Var.m85921a(o09Var, vppVar);
                    } else if (z4) {
                        o09Var.m65991L(j, true);
                    }
                }
                o09 o09Var2 = vkw0Var.f242302c;
                if (o09Var2 != null && vkw0.m85919j(o09Var2)) {
                    if (p1y0Var != o09Var2.m66003o()) {
                        vkw0Var.m85921a(o09Var2, vppVar);
                    } else if (z4) {
                        o09Var2.m65991L(j, true);
                    }
                }
                if (iM85922b - this.f189343a[i5].m85922b() > 0) {
                    m72975J(i5, false);
                }
                this.f189370s1 -= iM85922b - this.f189343a[i5].m85922b();
                i5++;
            }
            m73012n(this.f189373u1, zArr2);
            m73001g0(yhd0Var3);
            i2 = i;
            m73030w(true);
            if (this.f189354f1.f11136e != i2) {
                m72967F();
                m72976J0();
                this.f189355g.m56392j(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX INFO: renamed from: R */
    public final void m72986R(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        qp71 jtp0Var;
        List list;
        this.f189355g.m56391i(2);
        this.f189348c1 = false;
        if (this.f189350d1 != null) {
            this.f189356g1.m64650e(1);
            this.f189350d1 = null;
        }
        this.f189377y1 = null;
        m72980L0(false, true);
        vpp vppVar = this.f189341Z;
        vppVar.f243738b = false;
        fi41 fi41Var = (fi41) vppVar.f243739c;
        if (fi41Var.f69777b) {
            fi41Var.m41692a(fi41Var.mo41696q());
            fi41Var.f69777b = false;
        }
        this.f189373u1 = 1000000000000L;
        for (int i = 0; i < this.f189343a.length; i++) {
            try {
                m73006k(i);
            } catch (ExoPlaybackException e) {
                e = e;
                yif1.m93810s("Disable failed.", e);
            } catch (RuntimeException e2) {
                e = e2;
                yif1.m93810s("Disable failed.", e);
            }
        }
        this.f189322B1 = -9223372036854775807L;
        if (z) {
            for (vkw0 vkw0Var : this.f189343a) {
                try {
                    vkw0Var.m85932m();
                } catch (RuntimeException e3) {
                    yif1.m93810s("Reset failed.", e3);
                }
            }
        }
        this.f189370s1 = 0;
        a0p0 a0p0Var = this.f189354f1;
        vsd0 vsd0Var = a0p0Var.f11133b;
        long j4 = a0p0Var.f11150s;
        if (this.f189354f1.f11133b.m86309c()) {
            j = this.f189354f1.f11134c;
        } else {
            a0p0 a0p0Var2 = this.f189354f1;
            bp71 bp71Var = this.f189337X;
            vsd0 vsd0Var2 = a0p0Var2.f11133b;
            qp71 qp71Var = a0p0Var2.f11132a;
            if (qp71Var.m73436p() || qp71Var.mo46978g(vsd0Var2.f244408a, bp71Var).f29348f) {
                j = this.f189354f1.f11134c;
            } else {
                j = this.f189354f1.f11150s;
            }
        }
        if (z2) {
            this.f189372t1 = null;
            Pair pairM73016p = m73016p(this.f189354f1.f11132a);
            vsd0Var = (vsd0) pairM73016p.first;
            long jLongValue = ((Long) pairM73016p.second).longValue();
            z5 = vsd0Var.equals(this.f189354f1.f11133b) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            long j5 = j;
            j2 = j4;
            j3 = j5;
            z5 = false;
        }
        this.f189328O0.m26073b();
        this.f189364m1 = false;
        qp71 qp71Var2 = this.f189354f1.f11132a;
        if (z3 && (qp71Var2 instanceof jtp0)) {
            jtp0 jtp0Var2 = (jtp0) qp71Var2;
            qv11 qv11Var = this.f189329P0.f147055k;
            qp71[] qp71VarArr = jtp0Var2.f115944k;
            qp71[] qp71VarArr2 = new qp71[qp71VarArr.length];
            for (int i2 = 0; i2 < qp71VarArr.length; i2++) {
                qp71VarArr2[i2] = new itp0(qp71VarArr[i2]);
            }
            jtp0Var = new jtp0(qp71VarArr2, jtp0Var2.f115945l, qv11Var);
            if (vsd0Var.f244409b != -1) {
                jtp0Var.mo46978g(vsd0Var.f244408a, this.f189337X);
                int i3 = this.f189337X.f29345c;
                mp71 mp71Var = this.f189371t;
                jtp0Var.mo26654n(i3, mp71Var, 0L);
                if (mp71Var.m62446c()) {
                    vsd0Var = new vsd0(vsd0Var.f244411d, vsd0Var.f244408a);
                }
            }
        } else {
            jtp0Var = qp71Var2;
        }
        a0p0 a0p0Var3 = this.f189354f1;
        int i4 = a0p0Var3.f11136e;
        ExoPlaybackException exoPlaybackException = z4 ? null : a0p0Var3.f11137f;
        lf81 lf81Var = z5 ? lf81.f132851d : a0p0Var3.f11139h;
        hr81 hr81Var = z5 ? this.f189351e : a0p0Var3.f11140i;
        if (z5) {
            kf40 kf40Var = pf40.f176960b;
            list = wsv0.f254763e;
        } else {
            list = a0p0Var3.f11141j;
        }
        this.f189354f1 = new a0p0(jtp0Var, vsd0Var, j3, j2, i4, exoPlaybackException, false, lf81Var, hr81Var, list, vsd0Var, a0p0Var3.f11143l, a0p0Var3.f11144m, a0p0Var3.f11145n, a0p0Var3.f11146o, j2, 0L, j2, 0L, false);
        if (z3) {
            aid0 aid0Var = this.f189328O0;
            if (!aid0Var.f15966q.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < aid0Var.f15966q.size(); i5++) {
                    ((yhd0) aid0Var.f15966q.get(i5)).m93648k();
                }
                aid0Var.f15966q = arrayList;
                aid0Var.f15962m = null;
                aid0Var.m26088r();
            }
            mtd0 mtd0Var = this.f189329P0;
            HashMap map = mtd0Var.f147051g;
            for (ktd0 ktd0Var : map.values()) {
                try {
                    ktd0Var.f126242a.m89413w(ktd0Var.f126243b);
                } catch (RuntimeException e4) {
                    yif1.m93810s("Failed to release child source.", e4);
                }
                wz8 wz8Var = ktd0Var.f126242a;
                jtd0 jtd0Var = ktd0Var.f126244c;
                wz8Var.m89415z(jtd0Var);
                ktd0Var.f126242a.m89414y(jtd0Var);
            }
            map.clear();
            mtd0Var.f147052h.clear();
            mtd0Var.f147056l = false;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m72987S() {
        yhd0 yhd0Var = this.f189328O0.f15958i;
        this.f189361j1 = yhd0Var != null && yhd0Var.f272827g.f282890h && this.f189360i1;
    }

    /* JADX INFO: renamed from: T */
    public final void m72988T(long j, boolean z) {
        yhd0 yhd0Var = this.f189328O0.f15958i;
        long j2 = j + (yhd0Var == null ? 1000000000000L : yhd0Var.f272836p);
        this.f189373u1 = j2;
        ((fi41) this.f189341Z.f243739c).m41692a(j2);
        for (vkw0 vkw0Var : this.f189343a) {
            long j3 = this.f189373u1;
            o09 o09VarM85923c = vkw0Var.m85923c(yhd0Var);
            if (o09VarM85923c != null) {
                o09VarM85923c.m65991L(j3, z);
            }
        }
        for (yhd0 yhd0Var2 = r0.f15958i; yhd0Var2 != null; yhd0Var2 = yhd0Var2.f272833m) {
            for (xjx xjxVar : (xjx[]) yhd0Var2.f272835o.f94377d) {
                if (xjxVar != null) {
                    xjxVar.mo47781k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m72989W(qp71 qp71Var, qp71 qp71Var2) {
        if (qp71Var.m73436p() && qp71Var2.m73436p()) {
            return;
        }
        ArrayList arrayList = this.f189325L0;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            qp71 qp71Var3 = qp71Var;
            qp71 qp71Var4 = qp71Var2;
            if (!m72954V((mjx) arrayList.get(size), qp71Var3, qp71Var4, this.f189365n1, this.f189366o1, this.f189371t, this.f189337X)) {
                ((mjx) arrayList.get(size)).f144410a.m52847a(false);
                arrayList.remove(size);
            }
            size--;
            qp71Var = qp71Var3;
            qp71Var2 = qp71Var4;
        }
        Collections.sort(arrayList);
    }

    /* JADX INFO: renamed from: Z */
    public final void m72990Z(long j) {
        boolean z = this.f189333T0;
        long jMin = 1000;
        long j2 = f189320E1;
        if (z || (this.f189346b1 && this.f189344a1.f135577d)) {
            jMin = this.f189354f1.f11136e != 3 ? j2 : 1000L;
            for (vkw0 vkw0Var : this.f189343a) {
                long j3 = this.f189373u1;
                long j4 = this.f189374v1;
                o09 o09Var = vkw0Var.f242302c;
                o09 o09Var2 = vkw0Var.f242300a;
                long jMo41777g = vkw0.m85919j(o09Var2) ? o09Var2.mo41777g(j3, j4) : Long.MAX_VALUE;
                if (o09Var != null && vkw0.m85919j(o09Var)) {
                    jMo41777g = Math.min(jMo41777g, o09Var.mo41777g(j3, j4));
                }
                jMin = Math.min(jMin, h0b1.m46326n0(jMo41777g));
            }
            if (this.f189354f1.m24384m()) {
                yhd0 yhd0Var = this.f189328O0.f15958i;
                yhd0 yhd0Var2 = yhd0Var != null ? yhd0Var.f272833m : null;
                if (yhd0Var2 != null) {
                    if ((h0b1.m46295W(jMin) * this.f189354f1.f11146o.f86674a) + this.f189373u1 >= yhd0Var2.m93644g()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (this.f189354f1.f11136e != 3 || m72959A0()) {
            jMin = j2;
        }
        this.f189355g.f122536a.sendEmptyMessageAtTime(2, j + jMin);
    }

    @Override // p204p.oxb1
    /* JADX INFO: renamed from: a */
    public final void mo33002a(long j, long j2, r300 r300Var, MediaFormat mediaFormat) {
        if (this.f189348c1) {
            this.f189355g.m56384a(37).m53364b();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m72991a0(boolean z) {
        vsd0 vsd0Var = this.f189328O0.f15958i.f272827g.f282883a;
        long jM72995c0 = m72995c0(vsd0Var, this.f189354f1.f11150s, true, false);
        if (jM72995c0 != this.f189354f1.f11150s) {
            a0p0 a0p0Var = this.f189354f1;
            this.f189354f1 = m72958A(vsd0Var, jM72995c0, a0p0Var.f11134c, a0p0Var.f11135d, z, 5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m72992b(kjx kjxVar, int i) throws Throwable {
        this.f189356g1.m64650e(1);
        mtd0 mtd0Var = this.f189329P0;
        if (i == -1) {
            i = mtd0Var.f147047c.size();
        }
        m73032x(mtd0Var.m62815a(i, kjxVar.f123433a, kjxVar.f123434b), false);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m72993b0(pjx pjxVar) throws Throwable {
        vsd0 vsd0VarM26092w;
        long j;
        long j2;
        boolean z;
        long jLongValue;
        boolean z2;
        long j3;
        long jMo26788u;
        a0p0 a0p0Var;
        int i;
        long j4;
        vsd0 vsd0Var;
        long j5;
        int i2;
        long j6;
        qjx qjxVar = this;
        if (qjxVar.f189348c1) {
            if (qjxVar.f189350d1 != null) {
                qjxVar.f189352e1++;
                qjxVar.f189356g1.m64650e(1);
            }
            qjxVar.f189350d1 = pjxVar;
            return;
        }
        qjxVar.f189356g1.m64650e(1);
        Pair pairM72955X = m72955X(qjxVar.f189354f1.f11132a, pjxVar, true, qjxVar.f189365n1, qjxVar.f189366o1, qjxVar.f189371t, qjxVar.f189337X);
        long j7 = -9223372036854775807L;
        if (pairM72955X == null) {
            Pair pairM73016p = qjxVar.m73016p(qjxVar.f189354f1.f11132a);
            vsd0VarM26092w = (vsd0) pairM73016p.first;
            jLongValue = ((Long) pairM73016p.second).longValue();
            z = !qjxVar.f189354f1.f11132a.m73436p();
            j = -9223372036854775807L;
            j2 = 0;
        } else {
            Object obj = pairM72955X.first;
            long jLongValue2 = ((Long) pairM72955X.second).longValue();
            long j8 = pjxVar.f178320c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            aid0 aid0Var = qjxVar.f189328O0;
            a0p0 a0p0Var2 = qjxVar.f189354f1;
            vsd0VarM26092w = aid0Var.m26092w(a0p0Var2, a0p0Var2.f11132a, obj, jLongValue2, true, false);
            if (vsd0VarM26092w.m86309c()) {
                qjxVar.f189354f1.f11132a.mo46978g(vsd0VarM26092w.f244408a, qjxVar.f189337X);
                long j9 = qjxVar.f189337X.m30109f(vsd0VarM26092w.f244409b) == vsd0VarM26092w.f244410c ? qjxVar.f189337X.f29349g.f126095b : 0L;
                ht0 ht0VarM57289a = qjxVar.f189337X.f29349g.m57289a(vsd0VarM26092w.f244409b);
                j2 = 0;
                j = -9223372036854775807L;
                long jMax = Math.max(j8, ht0VarM57289a.f94878a + ht0VarM57289a.f94887j);
                z = true;
                j7 = jMax;
                jLongValue = j9;
            } else {
                j = -9223372036854775807L;
                j2 = 0;
                z = pjxVar.f178320c == -9223372036854775807L;
                j7 = j8;
                jLongValue = jLongValue2;
            }
        }
        try {
            try {
                if (!qjxVar.f189354f1.f11132a.m73436p()) {
                    if (pairM72955X == null) {
                        if (qjxVar.f189354f1.f11136e != 1) {
                            qjxVar.m73031w0(4);
                        }
                        qjxVar.m72986R(false, true, false, true);
                    } else {
                        if (vsd0VarM26092w.equals(qjxVar.f189354f1.f11133b)) {
                            try {
                                yhd0 yhd0Var = qjxVar.f189328O0.f15958i;
                                if (yhd0Var == null || !yhd0Var.f272825e || jLongValue == j2) {
                                    jMo26788u = jLongValue;
                                } else {
                                    m1d0 m1d0Var = yhd0Var.f272821a;
                                    long j10 = qjxVar.f189371t.f145938m;
                                    if (qjxVar.f189346b1 && j10 != j) {
                                        qjxVar.f189344a1.getClass();
                                    }
                                    jMo26788u = m1d0Var.mo26788u(jLongValue, qjxVar.f189342Z0);
                                }
                                if (h0b1.m46326n0(jMo26788u) == h0b1.m46326n0(qjxVar.f189354f1.f11150s) && ((i = (a0p0Var = qjxVar.f189354f1).f11136e) == 2 || i == 3)) {
                                    j4 = a0p0Var.f11150s;
                                    z2 = z;
                                    vsd0Var = vsd0VarM26092w;
                                    j5 = j7;
                                    i2 = 2;
                                    j6 = j4;
                                }
                            } catch (Throwable th) {
                                th = th;
                                z2 = z;
                                j3 = jLongValue;
                                qjxVar.f189354f1 = qjxVar.m72958A(vsd0VarM26092w, j3, j7, j3, z2, 2);
                                throw th;
                            }
                        } else {
                            jMo26788u = jLongValue;
                        }
                        try {
                            try {
                                long jM72995c0 = qjxVar.m72995c0(vsd0VarM26092w, jMo26788u, qjxVar.m72961C(), qjxVar.f189354f1.f11136e == 4);
                                z2 = (jLongValue != jM72995c0) | z;
                                try {
                                    a0p0 a0p0Var3 = qjxVar.f189354f1;
                                    vsd0 vsd0Var2 = vsd0VarM26092w;
                                    try {
                                        qp71 qp71Var = a0p0Var3.f11132a;
                                        long j11 = j7;
                                        try {
                                            qjxVar.m72978K0(qp71Var, vsd0Var2, qp71Var, a0p0Var3.f11133b, j11, true);
                                            vsd0Var = vsd0Var2;
                                            j5 = j11;
                                            j4 = jM72995c0;
                                            i2 = 2;
                                            j6 = j4;
                                            qjxVar = this;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            vsd0VarM26092w = vsd0Var2;
                                            j7 = j11;
                                            j3 = jM72995c0;
                                            qjxVar.f189354f1 = qjxVar.m72958A(vsd0VarM26092w, j3, j7, j3, z2, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        vsd0VarM26092w = vsd0Var2;
                                        j7 = j7;
                                        j3 = jM72995c0;
                                        qjxVar.f189354f1 = qjxVar.m72958A(vsd0VarM26092w, j3, j7, j3, z2, 2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z2 = z;
                                j3 = jLongValue;
                                qjxVar.f189354f1 = qjxVar.m72958A(vsd0VarM26092w, j3, j7, j3, z2, 2);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    qjxVar.f189354f1 = qjxVar.m72958A(vsd0Var, j4, j5, j6, z2, i2);
                }
                qjxVar.f189372t1 = pjxVar;
                z2 = z;
                vsd0Var = vsd0VarM26092w;
                j5 = j7;
                j4 = jLongValue;
                i2 = 2;
                j6 = j4;
                qjxVar = this;
                qjxVar.f189354f1 = qjxVar.m72958A(vsd0Var, j4, j5, j6, z2, i2);
            } catch (Throwable th7) {
                th = th7;
                z2 = z;
            }
        } catch (Throwable th8) {
            th = th8;
            z = z;
            vsd0VarM26092w = vsd0VarM26092w;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m72994c() {
        for (vkw0 vkw0Var : this.f189343a) {
            loy0 loy0Var = this.f189346b1 ? this.f189344a1 : null;
            vkw0Var.f242300a.mo827c(18, loy0Var);
            o09 o09Var = vkw0Var.f242302c;
            if (o09Var != null) {
                o09Var.mo827c(18, loy0Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0121  */
    /* JADX INFO: renamed from: c0 */
    public final long m72995c0(vsd0 vsd0Var, long j, boolean z, boolean z2) {
        aid0 aid0Var;
        m72966E0();
        boolean z3 = true;
        m72980L0(false, true);
        if (z2 || this.f189354f1.f11136e == 3) {
            m73031w0(2);
        }
        yhd0 yhd0Var = this.f189328O0.f15958i;
        yhd0 yhd0Var2 = yhd0Var;
        while (yhd0Var2 != null && !vsd0Var.equals(yhd0Var2.f272827g.f282883a)) {
            yhd0Var2 = yhd0Var2.f272833m;
        }
        if (z || yhd0Var != yhd0Var2 || (yhd0Var2 != null && yhd0Var2.f272836p + j < 0)) {
            for (int i = 0; i < this.f189343a.length; i++) {
                m73006k(i);
            }
            this.f189322B1 = -9223372036854775807L;
            if (yhd0Var2 != null) {
                while (true) {
                    aid0Var = this.f189328O0;
                    if (aid0Var.f15958i == yhd0Var2) {
                        break;
                    }
                    aid0Var.m26072a();
                }
                aid0Var.m26091u(yhd0Var2);
                yhd0Var2.f272836p = 1000000000000L;
                c95.m31855u(!m72961C());
                m73012n(this.f189328O0.m26075d().m93644g(), new boolean[this.f189343a.length]);
                m73001g0(yhd0Var2);
            }
        }
        m73004j();
        if (this.f189346b1) {
            for (vkw0 vkw0Var : this.f189343a) {
                if (vkw0Var.m85929i()) {
                    o09 o09Var = vkw0Var.f242300a;
                    if (o09Var.f160288b == 2 || o09Var.f160288b == 4) {
                        this.f189348c1 = true;
                        break;
                    }
                }
            }
        }
        if (yhd0Var2 != null) {
            this.f189328O0.m26091u(yhd0Var2);
            if (!yhd0Var2.f272825e) {
                yhd0Var2.f272827g = yhd0Var2.f272827g.m96125b(j, -9223372036854775807L);
            } else if (yhd0Var2.f272826f) {
                if (this.f189346b1 && this.f189344a1.f135579f && !this.f189354f1.f11132a.m73436p() && yhd0Var2.f272827g.f282883a.equals(this.f189354f1.f11133b)) {
                    long j2 = yhd0Var2.f272836p + j;
                    boolean z4 = true;
                    for (vkw0 vkw0Var2 : this.f189343a) {
                        if (vkw0Var2.m85929i()) {
                            o09 o09VarM85923c = vkw0Var2.m85923c(yhd0Var2);
                            z4 &= o09VarM85923c != null && o09VarM85923c.mo820T(j2);
                        }
                    }
                    if (z4) {
                        m1d0 m1d0Var = yhd0Var2.f272821a;
                        long j3 = this.f189354f1.f11150s;
                        mdz0 mdz0Var = mdz0.f142538c;
                        if (m1d0Var.mo26788u(j3, mdz0Var) == yhd0Var2.f272821a.mo26788u(j, mdz0Var)) {
                            z3 = false;
                        } else {
                            j = yhd0Var2.f272821a.mo26777e(j);
                            yhd0Var2.f272821a.mo26787r(j - this.f189339Y);
                        }
                    } else {
                        j = yhd0Var2.f272821a.mo26777e(j);
                        yhd0Var2.f272821a.mo26787r(j - this.f189339Y);
                    }
                } else {
                    j = yhd0Var2.f272821a.mo26777e(j);
                    yhd0Var2.f272821a.mo26787r(j - this.f189339Y);
                }
            }
            m72988T(j, z3);
            m72967F();
        } else {
            this.f189328O0.m26073b();
            m72988T(j, true);
        }
        m73030w(false);
        this.f189355g.m56392j(2);
        return j;
    }

    @Override // p204p.ysz0
    /* JADX INFO: renamed from: d */
    public final void mo26776d(zsz0 zsz0Var) {
        this.f189355g.m56387d(9, (xhd0) zsz0Var).m53364b();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m72996d0(jap0 jap0Var) {
        if (jap0Var.f110511h == -9223372036854775807L) {
            m72998e0(jap0Var);
            return;
        }
        boolean zM73436p = this.f189354f1.f11132a.m73436p();
        ArrayList arrayList = this.f189325L0;
        if (zM73436p) {
            arrayList.add(new mjx(jap0Var));
            return;
        }
        mjx mjxVar = new mjx(jap0Var);
        qp71 qp71Var = this.f189354f1.f11132a;
        if (!m72954V(mjxVar, qp71Var, qp71Var, this.f189365n1, this.f189366o1, this.f189371t, this.f189337X)) {
            jap0Var.m52847a(false);
        } else {
            arrayList.add(mjxVar);
            Collections.sort(arrayList);
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m72997e() {
        if (!this.f189336W0) {
            return false;
        }
        for (vkw0 vkw0Var : this.f189343a) {
            if (vkw0Var.m85926f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m72998e0(jap0 jap0Var) {
        Looper looper = jap0Var.f110509f;
        Looper looper2 = this.f189359i;
        kh61 kh61Var = this.f189355g;
        if (looper != looper2) {
            kh61Var.m56387d(15, jap0Var).m53364b();
            return;
        }
        m72957h(jap0Var);
        int i = this.f189354f1.f11136e;
        if (i == 3 || i == 2) {
            kh61Var.m56392j(2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m72999f() {
        m72985Q();
        m72991a0(true);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m73000f0(jap0 jap0Var) {
        Looper looper = jap0Var.f110509f;
        if (looper.getThread().isAlive()) {
            this.f189326M0.m44723a(looper, null).m56388f(new kep(21, this, jap0Var));
        } else {
            yif1.m93819w0("Trying to send message on a dead thread.");
            jap0Var.m52847a(false);
        }
    }

    @Override // p204p.gr81
    /* JADX INFO: renamed from: g */
    public final void mo45474g(dr81 dr81Var) {
        this.f189355g.m56387d(10, dr81Var).m53364b();
    }

    /* JADX INFO: renamed from: g0 */
    public final void m73001g0(yhd0 yhd0Var) {
        for (int i = 0; i < this.f189343a.length; i++) {
            yhd0Var.f272828h[i] = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX INFO: renamed from: h0 */
    public final void m73002h0(xs6 xs6Var, boolean z) {
        int i;
        uw31 uw31Var;
        gr81 gr81Var;
        req reqVar = (req) this.f189349d;
        if (!reqVar.f198413j.equals(xs6Var)) {
            reqVar.f198413j = xs6Var;
            if (reqVar.f198410g.f142817A0 && Build.VERSION.SDK_INT >= 32 && (uw31Var = reqVar.f198412i) != null && uw31Var.f234561b && (gr81Var = reqVar.f38916a) != null) {
                gr81Var.mo45474g(null);
            }
        }
        if (!z) {
            xs6Var = null;
        }
        jx6 jx6Var = this.f189338X0;
        if (!Objects.equals(jx6Var.f116813d, xs6Var)) {
            jx6Var.f116813d = xs6Var;
            if (xs6Var != null) {
                int i2 = xs6Var.f265519c;
                i = 3;
                switch (i2) {
                    case 0:
                        yif1.m93819w0("Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i = 1;
                        break;
                    case 1:
                    case 14:
                        i = 1;
                        break;
                    case 2:
                    case 4:
                        i = 2;
                        break;
                    case 3:
                        i = 0;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        break;
                    case 11:
                        if (xs6Var.f265517a == 1) {
                            i = 2;
                        }
                        break;
                    case 15:
                    default:
                        ei6.m39077n(i2, "Unidentified audio usage: ");
                        i = 0;
                        break;
                    case 16:
                        i = 4;
                        break;
                }
            } else {
                i = 0;
            }
            jx6Var.f116815f = i;
            c95.m31844j(i == 1 || i == 0, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
        a0p0 a0p0Var = this.f189354f1;
        boolean z2 = a0p0Var.f11143l;
        m72974I0(jx6Var.m54500d(a0p0Var.f11136e, z2), a0p0Var.f11145n, a0p0Var.f11144m, z2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        vsd0 vsd0Var;
        int i2;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.f189356g1.m64650e(1);
                    m72974I0(this.f189338X0.m54500d(this.f189354f1.f11136e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    m73008l();
                    break;
                case 3:
                    m72993b0((pjx) message.obj);
                    break;
                case 4:
                    m73015o0((h1p0) message.obj);
                    break;
                case 5:
                    m73025t0((mdz0) message.obj);
                    break;
                case 6:
                    m72964D0(false, true);
                    break;
                case 7:
                    m72982N((fhi) message.obj);
                    return true;
                case 8:
                    m73034y((xhd0) message.obj);
                    break;
                case 9:
                    m73026u((xhd0) message.obj);
                    break;
                case 10:
                    dr81 dr81Var = (dr81) message.obj;
                    req reqVar = (req) this.f189349d;
                    reqVar.getClass();
                    if (dr81Var != null) {
                        if (dr81Var instanceof meq) {
                            reqVar.f198410g = (meq) dr81Var;
                        } else {
                            leq leqVar = new leq(reqVar.f198410g);
                            leqVar.m33728d(dr81Var);
                            reqVar.f198410g = new meq(leqVar);
                        }
                    }
                    m72985Q();
                    break;
                case 11:
                    m73019q0(message.arg1);
                    break;
                case 12:
                    m73027u0(message.arg1 != 0);
                    break;
                case 13:
                    m73007k0(message.arg1 != 0, (fhi) message.obj);
                    break;
                case 14:
                    m72996d0((jap0) message.obj);
                    break;
                case 15:
                    m73000f0((jap0) message.obj);
                    break;
                case 16:
                    h1p0 h1p0Var = (h1p0) message.obj;
                    m73036z(h1p0Var, h1p0Var.f86674a, true, false);
                    break;
                case 17:
                    m73011m0((kjx) message.obj);
                    break;
                case 18:
                    m72992b((kjx) message.obj, message.arg1);
                    break;
                case 19:
                    m72979L((ljx) message.obj);
                    break;
                case 20:
                    m72984P(message.arg1, message.arg2, (qv11) message.obj);
                    break;
                case 21:
                    m73029v0((qv11) message.obj);
                    break;
                case 22:
                    m72977K();
                    break;
                case 23:
                    m73013n0(message.arg1 != 0);
                    break;
                case 24:
                    m73005j0(message.arg1 != 0);
                    break;
                case 25:
                    m72999f();
                    break;
                case 26:
                    m72985Q();
                    m72991a0(true);
                    break;
                case 27:
                    m72972H0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    m73017p0((lix) message.obj);
                    break;
                case 29:
                    m72981M();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m73035y0(pair.first, (fhi) pair.second);
                    break;
                case 31:
                    m73002h0((xs6) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    m73037z0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    m73022s(message.arg1);
                    break;
                case 34:
                    m73024t();
                    break;
                case 35:
                    m73033x0((oxb1) message.obj);
                    break;
                case 36:
                    m73021r0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f189348c1 = false;
                    pjx pjxVar = this.f189350d1;
                    if (pjxVar != null) {
                        m72993b0(pjxVar);
                        this.f189350d1 = null;
                    }
                    break;
                case 38:
                    m73023s0((loy0) message.obj);
                    break;
                case 39:
                    m73009l0((ijx) message.obj);
                    break;
                case 40:
                    m73003i0(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (ParserException e) {
            boolean z2 = e.f957a;
            int i5 = e.f958b;
            if (i5 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i5 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                m73028v(i3, e);
            }
            i3 = i2;
            m73028v(i3, e);
        } catch (DataSourceException e2) {
            m73028v(e2.f971a, e2);
        } catch (ExoPlaybackException e3) {
            e = e3;
            int i6 = e.f983t;
            aid0 aid0Var = this.f189328O0;
            if (i6 == 1 && e.f978M0 == null) {
                vkw0 vkw0Var = this.f189343a[e.f981Y];
                yhd0 yhd0VarM26083l = aid0Var.m26083l();
                while (yhd0VarM26083l != null && !vkw0Var.m85928h(yhd0VarM26083l)) {
                    yhd0VarM26083l = yhd0VarM26083l.m93642e();
                }
                if (yhd0VarM26083l == null) {
                    yhd0VarM26083l = aid0Var.m26075d();
                }
                if (yhd0VarM26083l != null) {
                    e = e.m759b(yhd0VarM26083l.f272827g.f282883a);
                }
            }
            int i7 = e.f981Y;
            int i8 = e.f983t;
            kh61 kh61Var = this.f189355g;
            if (i8 == 1 && (vsd0Var = e.f978M0) != null && m72963D(i7, vsd0Var)) {
                this.f189323C1 = true;
                m73004j();
                yhd0 yhd0VarM26084m = aid0Var.m26084m(i7);
                yhd0 yhd0VarM26083l2 = aid0Var.m26083l();
                if (aid0Var.m26083l() != yhd0VarM26084m) {
                    while (yhd0VarM26083l2 != null && yhd0VarM26083l2.m93642e() != yhd0VarM26084m) {
                        yhd0VarM26083l2 = yhd0VarM26083l2.m93642e();
                    }
                }
                aid0Var.m26091u(yhd0VarM26083l2);
                if (this.f189354f1.f11136e != 4) {
                    m72967F();
                    kh61Var.m56392j(2);
                }
            } else {
                ExoPlaybackException exoPlaybackException = this.f189377y1;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f189377y1;
                }
                if (e.f983t == 1 && aid0Var.m26083l() != aid0Var.m26078g()) {
                    yhd0 yhd0VarM26083l3 = aid0Var.m26083l();
                    while (yhd0VarM26083l3 != null && !Objects.equals(yhd0VarM26083l3.f272827g.f282883a, e.f978M0)) {
                        yhd0VarM26083l3 = yhd0VarM26083l3.m93642e();
                    }
                    if (yhd0VarM26083l3 == null) {
                        yhd0VarM26083l3 = aid0Var.m26075d();
                    }
                    while (!Objects.equals(aid0Var.m26083l(), yhd0VarM26083l3)) {
                        aid0Var.m26072a();
                    }
                    yhd0 yhd0VarM26083l4 = aid0Var.m26083l();
                    c95.m31850p(yhd0VarM26083l4);
                    m72971H(message.what);
                    zhd0 zhd0Var = yhd0VarM26083l4.f272827g;
                    vsd0 vsd0Var2 = zhd0Var.f282883a;
                    long j = zhd0Var.f282884b;
                    this.f189354f1 = m72958A(vsd0Var2, j, zhd0Var.f282886d, j, true, 0);
                }
                if (e.f979N0 && (this.f189377y1 == null || (i = e.f965a) == 5004 || i == 5003)) {
                    yif1.m93821x0("Recoverable renderer error", e);
                    if (this.f189377y1 == null) {
                        this.f189377y1 = e;
                    }
                    jh61 jh61VarM56387d = kh61Var.m56387d(25, e);
                    Handler handler = kh61Var.f122536a;
                    Message message2 = jh61VarM56387d.f112345a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    jh61VarM56387d.m53363a();
                } else {
                    yif1.m93810s("Playback error", e);
                    m72964D0(true, false);
                    this.f189354f1 = this.f189354f1.m24378f(e);
                }
            }
        } catch (DrmSession$DrmSessionException e4) {
            m73028v(e4.f992a, e4);
        } catch (BehindLiveWindowException e5) {
            m73028v(1002, e5);
        } catch (IOException e6) {
            m73028v(AudioEpisode.SHOW_URI_FIELD_NUMBER, e6);
        } catch (RuntimeException e7) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            yif1.m93810s("Playback error", exoPlaybackException2);
            m72964D0(true, false);
            this.f189354f1 = this.f189354f1.m24378f(exoPlaybackException2);
        }
        m72971H(message.what);
        return true;
    }

    @Override // p204p.whd0
    /* JADX INFO: renamed from: i */
    public final void mo26781i(xhd0 xhd0Var) {
        this.f189355g.m56387d(8, xhd0Var).m53364b();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m73003i0(int i) {
        for (vkw0 vkw0Var : this.f189343a) {
            o09 o09Var = vkw0Var.f242300a;
            int i2 = o09Var.f160288b;
            if (i2 == 1 || i2 == 2) {
                o09Var.mo827c(10, Integer.valueOf(i));
                o09 o09Var2 = vkw0Var.f242302c;
                if (o09Var2 != null) {
                    o09Var2.mo827c(10, Integer.valueOf(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m73004j() {
        o09 o09Var;
        if (this.f189336W0 && m72997e()) {
            for (vkw0 vkw0Var : this.f189343a) {
                int iM85922b = vkw0Var.m85922b();
                vpp vppVar = this.f189341Z;
                if (vkw0Var.m85926f()) {
                    int i = vkw0Var.f242303d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        try {
                            o09Var = vkw0Var.f242300a;
                        } catch (RuntimeException e) {
                            yif1.m93810s("Disable prewarming failed.", e);
                        }
                    } else {
                        o09Var = vkw0Var.f242302c;
                        o09Var.getClass();
                    }
                    vkw0Var.m85921a(o09Var, vppVar);
                    try {
                        vkw0Var.m85930k(z);
                    } catch (RuntimeException e2) {
                        yif1.m93810s("Reset prewarming failed.", e2);
                    }
                    vkw0Var.f242303d = i2;
                }
                this.f189370s1 -= iM85922b - vkw0Var.m85922b();
            }
            this.f189322B1 = -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m73005j0(boolean z) {
        this.f189340Y0 = z;
    }

    /* JADX INFO: renamed from: k */
    public final void m73006k(int i) {
        vkw0[] vkw0VarArr = this.f189343a;
        int iM85922b = vkw0VarArr[i].m85922b();
        vkw0 vkw0Var = vkw0VarArr[i];
        o09 o09Var = vkw0Var.f242300a;
        vpp vppVar = this.f189341Z;
        vkw0Var.m85921a(o09Var, vppVar);
        o09 o09Var2 = vkw0Var.f242302c;
        if (o09Var2 != null) {
            boolean z = vkw0.m85919j(o09Var2) && vkw0Var.f242303d != 3;
            vkw0Var.m85921a(o09Var2, vppVar);
            vkw0Var.m85930k(false);
            if (z) {
                o09 o09Var3 = vkw0Var.f242300a;
                o09Var2.getClass();
                o09Var2.mo827c(17, o09Var3);
            }
        }
        vkw0Var.f242303d = 0;
        m72975J(i, false);
        this.f189370s1 -= iM85922b;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m73007k0(boolean z, fhi fhiVar) {
        if (this.f189367p1 != z) {
            this.f189367p1 = z;
            if (!z) {
                for (vkw0 vkw0Var : this.f189343a) {
                    vkw0Var.m85932m();
                }
            }
        }
        if (fhiVar != null) {
            fhiVar.m41672f();
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r25v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r25v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r25v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v14 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v31 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v32 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v33 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v34 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v29 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v33 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v34 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v38 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v10 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: l */
    public final void m73008l() {
        /*
            Method dump skipped, instruction units count: 2468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.qjx.m73008l():void");
    }

    /* JADX INFO: renamed from: l0 */
    public final void m73009l0(ijx ijxVar) {
        for (vkw0 vkw0Var : this.f189343a) {
            o09 o09Var = vkw0Var.f242300a;
            if (o09Var.f160288b == 4) {
                o09Var.mo827c(23, ijxVar);
                o09 o09Var2 = vkw0Var.f242302c;
                if (o09Var2 != null) {
                    o09Var2.mo827c(23, ijxVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m73010m(yhd0 yhd0Var, int i, boolean z, long j) {
        vkw0 vkw0Var = this.f189343a[i];
        if (vkw0Var.m85929i()) {
            return;
        }
        boolean z2 = yhd0Var == this.f189328O0.f15958i;
        hr81 hr81Var = yhd0Var.f272835o;
        qkw0 qkw0Var = ((qkw0[]) hr81Var.f94376c)[i];
        xjx xjxVar = ((xjx[]) hr81Var.f94377d)[i];
        boolean z3 = m72959A0() && this.f189354f1.f11136e == 3;
        boolean z4 = !z && z3;
        this.f189370s1++;
        p1y0 p1y0Var = yhd0Var.f272823c[i];
        long j2 = yhd0Var.f272836p;
        vsd0 vsd0Var = yhd0Var.f272827g.f282883a;
        o09 o09Var = vkw0Var.f242300a;
        o09 o09Var2 = vkw0Var.f242302c;
        int length = xjxVar != null ? xjxVar.length() : 0;
        r300[] r300VarArr = new r300[length];
        for (int i2 = 0; i2 < length; i2++) {
            xjxVar.getClass();
            r300VarArr[i2] = xjxVar.mo34613e(i2);
        }
        int i3 = vkw0Var.f242303d;
        vpp vppVar = this.f189341Z;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            vkw0Var.f242304e = true;
            o09Var.m66000e(qkw0Var, r300VarArr, p1y0Var, z4, z2, j, j2, vsd0Var);
            vppVar.m86168c(o09Var);
        } else {
            vkw0Var.f242305f = true;
            o09Var2.getClass();
            o09Var2.m66000e(qkw0Var, r300VarArr, p1y0Var, z4, z2, j, j2, vsd0Var);
            vppVar.m86168c(o09Var2);
        }
        jjx jjxVar = new jjx(this);
        o09 o09VarM85923c = vkw0Var.m85923c(yhd0Var);
        o09VarM85923c.getClass();
        o09VarM85923c.mo827c(11, jjxVar);
        if (z3 && z2) {
            vkw0Var.m85933o();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m73011m0(kjx kjxVar) throws Throwable {
        this.f189356g1.m64650e(1);
        int i = kjxVar.f123435c;
        qv11 qv11Var = kjxVar.f123434b;
        ArrayList arrayList = kjxVar.f123433a;
        if (i != -1) {
            this.f189372t1 = new pjx(new jtp0(arrayList, qv11Var), kjxVar.f123435c, kjxVar.f123436d);
        }
        mtd0 mtd0Var = this.f189329P0;
        ArrayList arrayList2 = mtd0Var.f147047c;
        mtd0Var.m62820f(0, arrayList2.size());
        m73032x(mtd0Var.m62815a(arrayList2.size(), arrayList, qv11Var), false);
    }

    /* JADX INFO: renamed from: n */
    public final void m73012n(long j, boolean[] zArr) {
        vkw0[] vkw0VarArr;
        long j2;
        c95.m31855u(!m72961C());
        yhd0 yhd0VarM26075d = this.f189328O0.m26075d();
        hr81 hr81Var = yhd0VarM26075d.f272835o;
        int i = 0;
        while (true) {
            vkw0VarArr = this.f189343a;
            if (i >= vkw0VarArr.length) {
                break;
            }
            if (!hr81Var.m48340p(i)) {
                vkw0VarArr[i].m85932m();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < vkw0VarArr.length) {
            if (!hr81Var.m48340p(i2) || vkw0VarArr[i2].m85928h(yhd0VarM26075d)) {
                j2 = j;
            } else {
                j2 = j;
                m73010m(yhd0VarM26075d, i2, zArr[i2], j2);
            }
            i2++;
            j = j2;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m73013n0(boolean z) {
        this.f189360i1 = z;
        m72987S();
        if (this.f189361j1 && m72961C()) {
            m72991a0(true);
            m73030w(false);
        }
    }

    /* JADX INFO: renamed from: o */
    public final long m73014o(qp71 qp71Var, Object obj, long j) {
        bp71 bp71Var = this.f189337X;
        int i = qp71Var.mo46978g(obj, bp71Var).f29345c;
        mp71 mp71Var = this.f189371t;
        qp71Var.m73435m(i, mp71Var);
        if (mp71Var.f145931f == -9223372036854775807L || !mp71Var.m62446c() || !mp71Var.f145934i) {
            return -9223372036854775807L;
        }
        long j2 = mp71Var.f145932g;
        return h0b1.m46295W((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - mp71Var.f145931f) - (j + bp71Var.f29347e);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m73015o0(h1p0 h1p0Var) {
        this.f189355g.m56391i(16);
        vpp vppVar = this.f189341Z;
        vppVar.mo41695l(h1p0Var);
        h1p0 h1p0VarMo41694j = vppVar.mo41694j();
        m73036z(h1p0VarMo41694j, h1p0VarMo41694j.f86674a, true, true);
    }

    /* JADX INFO: renamed from: p */
    public final Pair m73016p(qp71 qp71Var) {
        if (qp71Var.m73436p()) {
            return Pair.create(a0p0.f11131u, 0L);
        }
        Pair pairM73433i = qp71Var.m73433i(this.f189371t, this.f189337X, qp71Var.mo33542a(this.f189366o1), -9223372036854775807L);
        vsd0 vsd0VarM26092w = this.f189328O0.m26092w(this.f189354f1, qp71Var, pairM73433i.first, 0L, true, false);
        long jLongValue = ((Long) pairM73433i.second).longValue();
        if (vsd0VarM26092w.m86309c()) {
            Object obj = vsd0VarM26092w.f244408a;
            bp71 bp71Var = this.f189337X;
            qp71Var.mo46978g(obj, bp71Var);
            jLongValue = vsd0VarM26092w.f244410c == bp71Var.m30109f(vsd0VarM26092w.f244409b) ? bp71Var.f29349g.f126095b : 0L;
        }
        return Pair.create(vsd0VarM26092w, Long.valueOf(jLongValue));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m73017p0(lix lixVar) {
        this.f189321A1 = lixVar;
        qp71 qp71Var = this.f189354f1.f11132a;
        aid0 aid0Var = this.f189328O0;
        aid0Var.getClass();
        lixVar.getClass();
        if (aid0Var.f15966q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aid0Var.f15966q.size(); i++) {
            ((yhd0) aid0Var.f15966q.get(i)).m93648k();
        }
        aid0Var.f15966q = arrayList;
        aid0Var.f15962m = null;
        aid0Var.m26088r();
    }

    /* JADX INFO: renamed from: q */
    public final long m73018q(yhd0 yhd0Var, int i) {
        if (yhd0Var == null) {
            return 0L;
        }
        if (yhd0Var.f272825e) {
            vkw0[] vkw0VarArr = this.f189343a;
            if (vkw0VarArr[i].m85928h(yhd0Var)) {
                o09 o09VarM85923c = vkw0VarArr[i].m85923c(yhd0Var);
                Objects.requireNonNull(o09VarM85923c);
                return o09VarM85923c.f160286Z;
            }
        }
        return yhd0Var.f272836p;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m73019q0(int i) {
        this.f189365n1 = i;
        qp71 qp71Var = this.f189354f1.f11132a;
        aid0 aid0Var = this.f189328O0;
        aid0Var.f15956g = i;
        int iM26094y = aid0Var.m26094y(qp71Var);
        if ((iM26094y & 1) != 0) {
            m72991a0(true);
        } else if ((iM26094y & 2) != 0) {
            m73004j();
        }
        m73030w(false);
    }

    /* JADX INFO: renamed from: r */
    public final long m73020r(long j) {
        yhd0 yhd0Var = this.f189328O0.f15961l;
        if (yhd0Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.f189373u1 - yhd0Var.f272836p));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m73021r0(boolean z) throws Throwable {
        if (!z) {
            pjx pjxVar = this.f189350d1;
            kh61 kh61Var = this.f189355g;
            if (pjxVar != null && this.f189348c1 && !kh61Var.f122536a.hasMessages(37)) {
                this.f189352e1++;
            }
            int i = this.f189352e1;
            if (i > 0) {
                this.f189335V0.m56388f(new kep(this, i));
            }
            this.f189352e1 = 0;
            this.f189348c1 = false;
            kh61Var.m56391i(37);
            pjx pjxVar2 = this.f189350d1;
            if (pjxVar2 != null) {
                m72993b0(pjxVar2);
                this.f189350d1 = null;
                this.f189348c1 = false;
            }
        }
        this.f189346b1 = z;
        m72994c();
    }

    /* JADX INFO: renamed from: s */
    public final void m73022s(int i) {
        a0p0 a0p0Var = this.f189354f1;
        m72974I0(i, a0p0Var.f11145n, a0p0Var.f11144m, a0p0Var.f11143l);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m73023s0(loy0 loy0Var) {
        this.f189344a1 = loy0Var;
        m72994c();
    }

    /* JADX INFO: renamed from: t */
    public final void m73024t() {
        m73037z0(this.f189324D1);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m73025t0(mdz0 mdz0Var) {
        this.f189342Z0 = mdz0Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m73026u(xhd0 xhd0Var) {
        aid0 aid0Var = this.f189328O0;
        yhd0 yhd0Var = aid0Var.f15961l;
        if (yhd0Var != null && yhd0Var.f272821a == xhd0Var) {
            aid0Var.m26090t(this.f189373u1);
            m72967F();
            return;
        }
        yhd0 yhd0Var2 = aid0Var.f15962m;
        if (yhd0Var2 == null || yhd0Var2.f272821a != xhd0Var) {
            return;
        }
        m72969G();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m73027u0(boolean z) {
        this.f189366o1 = z;
        qp71 qp71Var = this.f189354f1.f11132a;
        aid0 aid0Var = this.f189328O0;
        aid0Var.f15957h = z;
        int iM26094y = aid0Var.m26094y(qp71Var);
        if ((iM26094y & 1) != 0) {
            m72991a0(true);
        } else if ((iM26094y & 2) != 0) {
            m73004j();
        }
        m73030w(false);
    }

    /* JADX INFO: renamed from: v */
    public final void m73028v(int i, IOException iOException) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        yhd0 yhd0Var = this.f189328O0.f15958i;
        if (yhd0Var != null) {
            exoPlaybackException = exoPlaybackException.m759b(yhd0Var.f272827g.f282883a);
        }
        yif1.m93810s("Playback error", exoPlaybackException);
        m72964D0(false, false);
        this.f189354f1 = this.f189354f1.m24378f(exoPlaybackException);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m73029v0(qv11 qv11Var) throws Throwable {
        this.f189356g1.m64650e(1);
        mtd0 mtd0Var = this.f189329P0;
        int size = mtd0Var.f147047c.size();
        if (qv11Var.f192856b.length != size) {
            qv11Var = qv11Var.m73958a().m73959b(0, size);
        }
        mtd0Var.f147055k = qv11Var;
        m73032x(mtd0Var.m62816b(), false);
    }

    /* JADX INFO: renamed from: w */
    public final void m73030w(boolean z) {
        yhd0 yhd0Var = this.f189328O0.f15961l;
        vsd0 vsd0Var = yhd0Var == null ? this.f189354f1.f11133b : yhd0Var.f272827g.f282883a;
        boolean zEquals = this.f189354f1.f11142k.equals(vsd0Var);
        if (!zEquals) {
            this.f189354f1 = this.f189354f1.m24375c(vsd0Var);
        }
        a0p0 a0p0Var = this.f189354f1;
        a0p0Var.f11148q = yhd0Var == null ? a0p0Var.f11150s : yhd0Var.m93641d();
        a0p0 a0p0Var2 = this.f189354f1;
        a0p0Var2.f11149r = m73020r(a0p0Var2.f11148q);
        if ((!zEquals || z) && yhd0Var != null && yhd0Var.f272825e) {
            m72970G0(yhd0Var.f272827g.f282883a, yhd0Var.f272834n, yhd0Var.f272835o);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m73031w0(int i) {
        a0p0 a0p0Var = this.f189354f1;
        if (a0p0Var.f11136e != i) {
            if (i != 2) {
                this.f189378z1 = -9223372036854775807L;
            }
            if (i != 3 && a0p0Var.f11147p) {
                this.f189354f1 = a0p0Var.m24381i(false);
            }
            this.f189354f1 = this.f189354f1.m24380h(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0260  */
    /* JADX WARN: Code duplicated, block: B:142:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:157:0x0308  */
    /* JADX WARN: Code duplicated, block: B:160:0x0315  */
    /* JADX WARN: Code duplicated, block: B:161:0x0317  */
    /* JADX WARN: Code duplicated, block: B:164:0x0324  */
    /* JADX WARN: Code duplicated, block: B:171:0x0345 A[PHI: r7
      0x0345: PHI (r7v15 ??) = (r7v38 ??), (r7v39 ??), (r7v40 ??) binds: [B:163:0x0322, B:165:0x0326, B:169:0x0340] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:173:0x0349 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x0364  */
    /* JADX WARN: Code duplicated, block: B:243:0x0440  */
    /* JADX WARN: Code duplicated, block: B:244:0x0442  */
    /* JADX WARN: Code duplicated, block: B:249:0x045b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0461  */
    /* JADX WARN: Code duplicated, block: B:252:0x0464  */
    /* JADX WARN: Code duplicated, block: B:256:0x048b  */
    /* JADX WARN: Code duplicated, block: B:261:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:262:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:267:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:269:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:270:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:274:0x04ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [p.qp71] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [p.qp71] */
    /* JADX WARN: Type inference failed for: r2v22, types: [p.a0p0] */
    /* JADX WARN: Type inference failed for: r44v0, types: [p.qjx] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: x */
    public final void m73032x(qp71 qp71Var, boolean z) throws Throwable {
        vsd0 vsd0Var;
        long j;
        qp71 qp71Var2;
        mp71 mp71Var;
        Object obj;
        int i;
        int iMo33542a;
        long jM46319k;
        boolean z2;
        boolean z3;
        boolean z4;
        int iMo33542a2;
        boolean z5;
        Object obj2;
        long jLongValue;
        int i2;
        qp71 qp71Var3;
        boolean z6;
        int i3;
        int i4;
        long jMin;
        long j2;
        boolean z7;
        int i5;
        Object obj3;
        boolean zEquals;
        ?? r7;
        int i6;
        ?? r8;
        boolean z8;
        ojx ojxVar;
        int i7;
        int i8;
        long jLongValue2;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        ?? r13;
        vsd0 vsd0Var2;
        ?? r14;
        long j3;
        vsd0 vsd0Var3;
        boolean z13;
        long j4;
        vkw0[] vkw0VarArr;
        long j5;
        vsd0 vsd0Var4;
        boolean z14;
        long j6;
        long j7;
        a0p0 a0p0Var = this.f189354f1;
        pjx pjxVar = this.f189372t1;
        aid0 aid0Var = this.f189328O0;
        int i9 = this.f189365n1;
        boolean z15 = this.f189366o1;
        mp71 mp71Var2 = this.f189371t;
        bp71 bp71Var = this.f189337X;
        boolean z16 = this.f189340Y0;
        if (qp71Var.m73436p()) {
            vsd0 vsd0Var5 = a0p0.f11131u;
            boolean z17 = (vsd0Var5.equals(a0p0Var.f11133b) && a0p0Var.f11150s == 0) ? false : true;
            qp71Var3 = qp71Var;
            ojxVar = new ojx(vsd0Var5, 0L, -9223372036854775807L, false, true, false, z17, z17 && z && !a0p0Var.f11132a.m73436p() && !a0p0Var.f11132a.mo46978g(a0p0Var.f11133b.f244408a, bp71Var).f29348f, 4);
        } else {
            vsd0 vsd0Var6 = a0p0Var.f11133b;
            Object obj4 = vsd0Var6.f244408a;
            qp71 qp71Var4 = a0p0Var.f11132a;
            boolean z18 = qp71Var4.m73436p() || qp71Var4.mo46978g(vsd0Var6.f244408a, bp71Var).f29348f;
            long j8 = (a0p0Var.f11133b.m86309c() || z18) ? a0p0Var.f11134c : a0p0Var.f11150s;
            if (pjxVar != null) {
                vsd0Var = vsd0Var6;
                j = 1;
                qp71Var2 = qp71Var;
                Pair pairM72955X = m72955X(qp71Var2, pjxVar, true, i9, z15, mp71Var2, bp71Var);
                if (pairM72955X == null) {
                    iMo33542a = qp71Var2.mo33542a(z15);
                    jLongValue2 = j8;
                    z12 = true;
                    z11 = false;
                    z10 = false;
                } else {
                    if (pjxVar.f178320c == -9223372036854775807L) {
                        iMo33542a = qp71Var2.mo46978g(pairM72955X.first, bp71Var).f29345c;
                        jLongValue2 = j8;
                        z9 = false;
                    } else {
                        obj4 = pairM72955X.first;
                        jLongValue2 = ((Long) pairM72955X.second).longValue();
                        iMo33542a = -1;
                        z9 = true;
                    }
                    z10 = a0p0Var.f11136e == 4;
                    z11 = z9;
                    z12 = false;
                }
                j8 = jLongValue2;
                z3 = z12;
                mp71Var = mp71Var2;
                z4 = z11;
                obj = obj4;
                z2 = z10;
                i = -1;
            } else {
                vsd0Var = vsd0Var6;
                j = 1;
                qp71Var2 = qp71Var;
                if (a0p0Var.f11132a.m73436p()) {
                    iMo33542a = qp71Var2.mo33542a(z15);
                    mp71Var = mp71Var2;
                    obj = obj4;
                } else if (qp71Var2.mo26650b(obj4) == -1) {
                    obj = obj4;
                    int iM72956Y = m72956Y(mp71Var2, bp71Var, i9, z15, obj, a0p0Var.f11132a, qp71Var2);
                    mp71Var = mp71Var2;
                    if (iM72956Y == -1) {
                        qp71Var2 = qp71Var2;
                        bp71Var = bp71Var;
                        iMo33542a2 = qp71Var2.mo33542a(z15);
                        z5 = true;
                    } else {
                        qp71Var2 = qp71Var2;
                        bp71Var = bp71Var;
                        iMo33542a2 = iM72956Y;
                        z5 = false;
                    }
                    z3 = z5;
                    iMo33542a = iMo33542a2;
                    j8 = j8;
                    i = -1;
                    z2 = false;
                    z4 = false;
                } else {
                    mp71Var = mp71Var2;
                    obj = obj4;
                    if (j8 == -9223372036854775807L) {
                        iMo33542a = qp71Var2.mo46978g(obj, bp71Var).f29345c;
                    } else if (z18) {
                        a0p0Var.f11132a.mo46978g(vsd0Var.f244408a, bp71Var);
                        if (a0p0Var.f11132a.mo26654n(bp71Var.f29345c, mp71Var, 0L).f145939n == a0p0Var.f11132a.mo26650b(vsd0Var.f244408a)) {
                            Pair pairM73433i = qp71Var2.m73433i(mp71Var, bp71Var, qp71Var2.mo46978g(obj, bp71Var).f29345c, j8 + bp71Var.f29347e);
                            obj = pairM73433i.first;
                            jM46319k = ((Long) pairM73433i.second).longValue();
                        } else {
                            jM46319k = qp71Var2.mo46978g(obj, bp71Var).f29346d != -9223372036854775807L ? h0b1.m46319k(j8, 0L, bp71Var.f29346d - 1) : j8;
                        }
                        j8 = jM46319k;
                        i = -1;
                        iMo33542a = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        i = -1;
                        iMo33542a = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                i = -1;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (iMo33542a != i) {
                Pair pairM73433i2 = qp71Var2.m73433i(mp71Var, bp71Var, iMo33542a, -9223372036854775807L);
                obj2 = pairM73433i2.first;
                i2 = i;
                jLongValue = ((Long) pairM73433i2.second).longValue();
                j8 = -9223372036854775807L;
            } else {
                obj2 = obj;
                jLongValue = j8;
                i2 = i;
            }
            vsd0 vsd0VarM26092w = aid0Var.m26092w(a0p0Var, qp71Var, obj2, jLongValue, z16, z18);
            qp71Var3 = qp71Var;
            long j9 = jLongValue;
            Object obj5 = obj2;
            int i10 = vsd0VarM26092w.f244412e;
            boolean z19 = i10 == i2 || ((i8 = vsd0Var.f244412e) != i2 && i10 >= i8);
            boolean zEquals2 = vsd0Var.f244408a.equals(obj5);
            boolean z20 = zEquals2 && !vsd0Var.m86309c() && !vsd0VarM26092w.m86309c() && z19;
            bp71 bp71VarMo46978g = qp71Var3.mo46978g(obj5, bp71Var);
            if (z18 || j8 != j8) {
                z6 = false;
            } else {
                Object obj6 = vsd0Var.f244408a;
                int i11 = vsd0Var.f244410c;
                int i12 = vsd0Var.f244409b;
                if (obj6.equals(vsd0VarM26092w.f244408a) && (!(vsd0Var.m86309c() && bp71VarMo46978g.m30111h(i12)) ? vsd0VarM26092w.m86309c() && bp71VarMo46978g.m30111h(vsd0VarM26092w.f244409b) : !(bp71VarMo46978g.m30108e(i12, i11) == 4 || bp71VarMo46978g.m30108e(i12, i11) == 2))) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            }
            if (z20 || z6) {
                vsd0VarM26092w = vsd0Var;
            }
            if (vsd0VarM26092w.m86309c()) {
                if (vsd0VarM26092w.equals(vsd0Var)) {
                    j9 = a0p0Var.f11150s;
                } else {
                    qp71Var3.mo46978g(vsd0VarM26092w.f244408a, bp71Var);
                    jMin = vsd0VarM26092w.f244410c == bp71Var.m30109f(vsd0VarM26092w.f244409b) ? bp71Var.f29349g.f126095b : 0L;
                }
                j2 = j8;
                if (vsd0VarM26092w.equals(a0p0Var.f11133b) || jMin != a0p0Var.f11150s) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (qp71Var3.mo26650b(a0p0Var.f11133b.f244408a) == -1) {
                    i5 = 4;
                } else {
                    i5 = 3;
                }
                Object obj7 = vsd0VarM26092w.f244408a;
                obj3 = a0p0Var.f11133b.f244408a;
                zEquals = obj7.equals(obj3);
                r7 = obj3;
                if (zEquals || vsd0VarM26092w.f244409b == -1) {
                    r7 = obj3;
                    r7 = i7;
                    r7 = obj3;
                    i6 = i5;
                    r8 = r7;
                } else {
                    ht0 ht0VarM57289a = qp71Var3.mo46978g(vsd0VarM26092w.f244408a, bp71Var).f29349g.m57289a(vsd0VarM26092w.f244409b);
                    i7 = vsd0VarM26092w.f244410c;
                    int[] iArr = ht0VarM57289a.f94883f;
                    if (i7 >= iArr.length || iArr[i7] != 2) {
                        r7 = obj3;
                        r7 = i7;
                        r7 = obj3;
                        i6 = 0;
                        r8 = i7;
                    } else {
                        r7 = obj3;
                        r7 = i7;
                        r7 = obj3;
                        i6 = i5;
                        r8 = r7;
                    }
                }
                if (z7 || !z || a0p0Var.f11132a.m73436p() || a0p0Var.f11132a.mo46978g(a0p0Var.f11133b.f244408a, bp71Var).f29348f) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                ojxVar = new ojx(vsd0VarM26092w, jMin, j2, z2, z3, z4, z7, z8, i6);
            } else if (zEquals2 && vsd0Var.m86309c()) {
                ht0 ht0VarM57289a2 = qp71Var3.mo46978g(obj5, bp71Var).f29349g.m57289a(vsd0Var.f244409b);
                long j10 = ht0VarM57289a2.f94887j;
                long j11 = a0p0Var.f11134c;
                if (j11 != -9223372036854775807L) {
                    long j12 = ht0VarM57289a2.f94878a;
                    if (j12 == Long.MIN_VALUE || j12 + j10 > j11) {
                        i3 = ht0VarM57289a2.f94879b;
                        i4 = vsd0Var.f244410c;
                        if (i3 <= i4 && ht0VarM57289a2.f94883f[i4] == 2) {
                            long j13 = qp71Var3.mo46978g(obj5, bp71Var).f29346d;
                            jMin = j13 != -9223372036854775807L ? Math.min(j13 - j, j9 + j10) : j9 + j10;
                            j2 = jMin;
                        }
                    }
                } else {
                    i3 = ht0VarM57289a2.f94879b;
                    i4 = vsd0Var.f244410c;
                    if (i3 <= i4) {
                    }
                }
                if (vsd0VarM26092w.equals(a0p0Var.f11133b)) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (qp71Var3.mo26650b(a0p0Var.f11133b.f244408a) == -1) {
                    i5 = 4;
                } else {
                    i5 = 3;
                }
                Object obj8 = vsd0VarM26092w.f244408a;
                obj3 = a0p0Var.f11133b.f244408a;
                zEquals = obj8.equals(obj3);
                r7 = obj3;
                if (zEquals) {
                    r7 = obj3;
                    r7 = i7;
                    r7 = obj3;
                    i6 = i5;
                    r8 = r7;
                } else {
                    r7 = obj3;
                    r7 = i7;
                    r7 = obj3;
                    i6 = i5;
                    r8 = r7;
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                ojxVar = new ojx(vsd0VarM26092w, jMin, j2, z2, z3, z4, z7, z8, i6);
            }
            jMin = j9;
            j2 = j8;
            if (vsd0VarM26092w.equals(a0p0Var.f11133b)) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (qp71Var3.mo26650b(a0p0Var.f11133b.f244408a) == -1) {
                i5 = 4;
            } else {
                i5 = 3;
            }
            Object obj9 = vsd0VarM26092w.f244408a;
            obj3 = a0p0Var.f11133b.f244408a;
            zEquals = obj9.equals(obj3);
            r7 = obj3;
            if (zEquals) {
                r7 = obj3;
                r7 = i7;
                r7 = obj3;
                i6 = i5;
                r8 = r7;
            } else {
                r7 = obj3;
                r7 = i7;
                r7 = obj3;
                i6 = i5;
                r8 = r7;
            }
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            ojxVar = new ojx(vsd0VarM26092w, jMin, j2, z2, z3, z4, z7, z8, i6);
        }
        vsd0 vsd0Var7 = ojxVar.f166155a;
        long jM72995c0 = ojxVar.f166156b;
        try {
            if (ojxVar.f166159e) {
                if (this.f189354f1.f11136e != 1) {
                    m73031w0(4);
                }
                m72986R(false, false, false, true);
            }
            for (vkw0 vkw0Var : this.f189343a) {
                vkw0Var.f242300a.m65993O(qp71Var3);
                o09 o09Var = vkw0Var.f242302c;
                if (o09Var != null) {
                    o09Var.m65993O(qp71Var3);
                }
            }
            try {
                if (ojxVar.f166161g) {
                    qp71 qp71Var5 = qp71Var3;
                    if (!qp71Var5.m73436p()) {
                        try {
                            for (yhd0 yhd0Var = this.f189328O0.f15958i; yhd0Var != null; yhd0Var = yhd0Var.f272833m) {
                                if (yhd0Var.f272827g.f282883a.equals(vsd0Var7)) {
                                    yhd0Var.f272827g = this.f189328O0.m26085n(qp71Var5, yhd0Var.f272827g);
                                }
                            }
                            vsd0Var2 = vsd0Var7;
                            try {
                                jM72995c0 = m72995c0(vsd0Var2, jM72995c0, m72961C(), ojxVar.f166158d);
                            } catch (Throwable th) {
                                th = th;
                                jM72995c0 = jM72995c0;
                                r14 = qp71Var5;
                                a0p0 a0p0Var2 = this.f189354f1;
                                qp71 qp71Var6 = a0p0Var2.f11132a;
                                vsd0 vsd0Var8 = a0p0Var2.f11133b;
                                if (ojxVar.f166160f) {
                                    j3 = jM72995c0;
                                } else {
                                    j3 = -9223372036854775807L;
                                }
                                vsd0Var3 = vsd0Var2;
                                m72978K0(r14, vsd0Var3, qp71Var6, vsd0Var8, j3, false);
                                if (ojxVar.f166161g) {
                                    long j14 = ojxVar.f166157c;
                                    z13 = ojxVar.f166162h;
                                    if (z13) {
                                        j4 = jM72995c0;
                                    } else {
                                        j4 = this.f189354f1.f11135d;
                                    }
                                    this.f189354f1 = m72958A(vsd0Var3, jM72995c0, j14, j4, z13, ojxVar.f166163i);
                                } else {
                                    long j15 = ojxVar.f166157c;
                                    z13 = ojxVar.f166162h;
                                    if (z13) {
                                        j4 = jM72995c0;
                                    } else {
                                        j4 = this.f189354f1.f11135d;
                                    }
                                    this.f189354f1 = m72958A(vsd0Var3, jM72995c0, j15, j4, z13, ojxVar.f166163i);
                                }
                                m72987S();
                                m72989W(r14, this.f189354f1.f11132a);
                                this.f189354f1 = this.f189354f1.m24382j(r14);
                                if (!r14.m73436p()) {
                                    this.f189372t1 = null;
                                }
                                m73030w(false);
                                this.f189355g.m56392j(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            vsd0Var2 = vsd0Var7;
                        }
                    }
                    a0p0 a0p0Var3 = this.f189354f1;
                    qp71 qp71Var7 = a0p0Var3.f11132a;
                    vsd0 vsd0Var9 = a0p0Var3.f11133b;
                    if (ojxVar.f166160f) {
                        j5 = jM72995c0;
                    } else {
                        j5 = -9223372036854775807L;
                    }
                    vsd0Var4 = vsd0Var2;
                    m72978K0(qp71Var, vsd0Var4, qp71Var7, vsd0Var9, j5, false);
                    if (ojxVar.f166161g || ojxVar.f166157c != this.f189354f1.f11134c) {
                        long j16 = ojxVar.f166157c;
                        z14 = ojxVar.f166162h;
                        if (z14) {
                            j7 = jM72995c0;
                            j6 = j7;
                        } else {
                            j6 = this.f189354f1.f11135d;
                            j7 = jM72995c0;
                        }
                        this.f189354f1 = m72958A(vsd0Var4, j7, j16, j6, z14, ojxVar.f166163i);
                    }
                    m72987S();
                    m72989W(qp71Var, this.f189354f1.f11132a);
                    this.f189354f1 = this.f189354f1.m24382j(qp71Var);
                    if (!qp71Var.m73436p()) {
                        this.f189372t1 = null;
                    }
                    m73030w(false);
                    this.f189355g.m56392j(2);
                }
                try {
                    long[] jArr = new long[this.f189343a.length];
                    int i13 = 0;
                    while (true) {
                        vkw0VarArr = this.f189343a;
                        if (i13 >= vkw0VarArr.length) {
                            break;
                        }
                        jArr[i13] = m73018q(this.f189328O0.f15959j[i13], i13);
                        i13++;
                    }
                    long[] jArr2 = new long[vkw0VarArr.length];
                    for (int i14 = 0; i14 < this.f189343a.length; i14++) {
                        jArr2[i14] = m73018q(this.f189328O0.f15960k[i14], i14);
                    }
                    int iM26095z = this.f189328O0.m26095z(qp71Var3, this.f189373u1, jArr, jArr2);
                    if ((iM26095z & 1) != 0) {
                        m72991a0(false);
                    } else if ((iM26095z & 2) != 0) {
                        m73004j();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r8 = qp71Var3;
                    r13 = r8;
                    vsd0Var2 = vsd0Var7;
                    r14 = r13;
                    a0p0 a0p0Var4 = this.f189354f1;
                    qp71 qp71Var8 = a0p0Var4.f11132a;
                    vsd0 vsd0Var10 = a0p0Var4.f11133b;
                    if (ojxVar.f166160f) {
                        j3 = jM72995c0;
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    vsd0Var3 = vsd0Var2;
                    m72978K0(r14, vsd0Var3, qp71Var8, vsd0Var10, j3, false);
                    if (ojxVar.f166161g || ojxVar.f166157c != this.f189354f1.f11134c) {
                        long j17 = ojxVar.f166157c;
                        z13 = ojxVar.f166162h;
                        if (z13) {
                            j4 = jM72995c0;
                        } else {
                            j4 = this.f189354f1.f11135d;
                        }
                        this.f189354f1 = m72958A(vsd0Var3, jM72995c0, j17, j4, z13, ojxVar.f166163i);
                    }
                    m72987S();
                    m72989W(r14, this.f189354f1.f11132a);
                    this.f189354f1 = this.f189354f1.m24382j(r14);
                    if (!r14.m73436p()) {
                        this.f189372t1 = null;
                    }
                    m73030w(false);
                    this.f189355g.m56392j(2);
                    throw th;
                }
                vsd0Var2 = vsd0Var7;
                a0p0 a0p0Var5 = this.f189354f1;
                qp71 qp71Var9 = a0p0Var5.f11132a;
                vsd0 vsd0Var11 = a0p0Var5.f11133b;
                if (ojxVar.f166160f) {
                    j5 = jM72995c0;
                } else {
                    j5 = -9223372036854775807L;
                }
                vsd0Var4 = vsd0Var2;
                m72978K0(qp71Var, vsd0Var4, qp71Var9, vsd0Var11, j5, false);
                if (ojxVar.f166161g) {
                    long j18 = ojxVar.f166157c;
                    z14 = ojxVar.f166162h;
                    if (z14) {
                        j7 = jM72995c0;
                        j6 = j7;
                    } else {
                        j6 = this.f189354f1.f11135d;
                        j7 = jM72995c0;
                    }
                    this.f189354f1 = m72958A(vsd0Var4, j7, j18, j6, z14, ojxVar.f166163i);
                } else {
                    long j19 = ojxVar.f166157c;
                    z14 = ojxVar.f166162h;
                    if (z14) {
                        j7 = jM72995c0;
                        j6 = j7;
                    } else {
                        j6 = this.f189354f1.f11135d;
                        j7 = jM72995c0;
                    }
                    this.f189354f1 = m72958A(vsd0Var4, j7, j19, j6, z14, ojxVar.f166163i);
                }
                m72987S();
                m72989W(qp71Var, this.f189354f1.f11132a);
                this.f189354f1 = this.f189354f1.m24382j(qp71Var);
                if (!qp71Var.m73436p()) {
                    this.f189372t1 = null;
                }
                m73030w(false);
                this.f189355g.m56392j(2);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            r13 = qp71Var3;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m73033x0(oxb1 oxb1Var) {
        for (vkw0 vkw0Var : this.f189343a) {
            o09 o09Var = vkw0Var.f242300a;
            int i = o09Var.f160288b;
            if (i == 2 || i == 4) {
                o09Var.mo827c(7, oxb1Var);
                o09 o09Var2 = vkw0Var.f242302c;
                if (o09Var2 != null) {
                    o09Var2.mo827c(7, oxb1Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m73034y(xhd0 xhd0Var) {
        yhd0 yhd0Var;
        aid0 aid0Var = this.f189328O0;
        yhd0 yhd0Var2 = aid0Var.f15961l;
        vpp vppVar = this.f189341Z;
        if (yhd0Var2 != null && yhd0Var2.f272821a == xhd0Var) {
            yhd0Var2.getClass();
            if (!yhd0Var2.f272825e) {
                float f = vppVar.mo41694j().f86674a;
                a0p0 a0p0Var = this.f189354f1;
                yhd0Var2.m93645h(f, a0p0Var.f11132a, a0p0Var.f11143l);
            }
            m72970G0(yhd0Var2.f272827g.f282883a, yhd0Var2.f272834n, yhd0Var2.f272835o);
            if (yhd0Var2 == aid0Var.f15958i) {
                m72988T(yhd0Var2.f272827g.f282884b, true);
                c95.m31855u(!m72961C());
                m73012n(aid0Var.m26075d().m93644g(), new boolean[this.f189343a.length]);
                m73001g0(yhd0Var2);
                a0p0 a0p0Var2 = this.f189354f1;
                vsd0 vsd0Var = a0p0Var2.f11133b;
                long j = yhd0Var2.f272827g.f282884b;
                this.f189354f1 = m72958A(vsd0Var, j, a0p0Var2.f11134c, j, false, 5);
            }
            m72967F();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= aid0Var.f15966q.size()) {
                yhd0Var = null;
                break;
            }
            yhd0Var = (yhd0) aid0Var.f15966q.get(i);
            if (yhd0Var.f272821a == xhd0Var) {
                break;
            } else {
                i++;
            }
        }
        if (yhd0Var != null) {
            c95.m31855u(true ^ yhd0Var.f272825e);
            float f2 = vppVar.mo41694j().f86674a;
            a0p0 a0p0Var3 = this.f189354f1;
            yhd0Var.m93645h(f2, a0p0Var3.f11132a, a0p0Var3.f11143l);
            yhd0 yhd0Var3 = aid0Var.f15962m;
            if (yhd0Var3 == null || yhd0Var3.f272821a != xhd0Var) {
                return;
            }
            m72969G();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m73035y0(Object obj, fhi fhiVar) {
        for (vkw0 vkw0Var : this.f189343a) {
            o09 o09Var = vkw0Var.f242300a;
            if (o09Var.f160288b == 2) {
                int i = vkw0Var.f242303d;
                if (i == 4 || i == 1) {
                    o09 o09Var2 = vkw0Var.f242302c;
                    o09Var2.getClass();
                    o09Var2.mo827c(1, obj);
                } else {
                    o09Var.mo827c(1, obj);
                }
            }
        }
        int i2 = this.f189354f1.f11136e;
        if (i2 == 3 || i2 == 2) {
            this.f189355g.m56392j(2);
        }
        if (fhiVar != null) {
            fhiVar.m41672f();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m73036z(h1p0 h1p0Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f189356g1.m64650e(1);
            }
            this.f189354f1 = this.f189354f1.m24379g(h1p0Var);
        }
        float f2 = h1p0Var.f86674a;
        yhd0 yhd0Var = this.f189328O0.f15958i;
        while (true) {
            i = 0;
            if (yhd0Var == null) {
                break;
            }
            xjx[] xjxVarArr = (xjx[]) yhd0Var.f272835o.f94377d;
            int length = xjxVarArr.length;
            while (i < length) {
                xjx xjxVar = xjxVarArr[i];
                if (xjxVar != null) {
                    xjxVar.mo34616i(f2);
                }
                i++;
            }
            yhd0Var = yhd0Var.f272833m;
        }
        vkw0[] vkw0VarArr = this.f189343a;
        int length2 = vkw0VarArr.length;
        while (i < length2) {
            vkw0 vkw0Var = vkw0VarArr[i];
            float f3 = h1p0Var.f86674a;
            vkw0Var.f242300a.mo816N(f, f3);
            o09 o09Var = vkw0Var.f242302c;
            if (o09Var != null) {
                o09Var.mo816N(f, f3);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m73037z0(float f) {
        this.f189324D1 = f;
        float f2 = f * this.f189338X0.f116816g;
        for (vkw0 vkw0Var : this.f189343a) {
            o09 o09Var = vkw0Var.f242300a;
            if (o09Var.f160288b == 1) {
                o09Var.mo827c(2, Float.valueOf(f2));
                o09 o09Var2 = vkw0Var.f242302c;
                if (o09Var2 != null) {
                    o09Var2.mo827c(2, Float.valueOf(f2));
                }
            }
        }
    }
}
