package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class jcd0 {

    /* JADX INFO: renamed from: A */
    public SurfaceHolder f111071A;

    /* JADX INFO: renamed from: C */
    public jv30 f111073C;

    /* JADX INFO: renamed from: D */
    public MediaController f111074D;

    /* JADX INFO: renamed from: E */
    public long f111075E;

    /* JADX INFO: renamed from: F */
    public long f111076F;

    /* JADX INFO: renamed from: G */
    public cap0 f111077G;

    /* JADX INFO: renamed from: H */
    public Bundle f111078H;

    /* JADX INFO: renamed from: a */
    public final lbd0 f111079a;

    /* JADX INFO: renamed from: b */
    public final mqi0 f111080b;

    /* JADX INFO: renamed from: c */
    public final pcd0 f111081c;

    /* JADX INFO: renamed from: d */
    public final Context f111082d;

    /* JADX INFO: renamed from: e */
    public final n301 f111083e;

    /* JADX INFO: renamed from: f */
    public final Bundle f111084f;

    /* JADX INFO: renamed from: g */
    public final ybd0 f111085g;

    /* JADX INFO: renamed from: h */
    public final icd0 f111086h;

    /* JADX INFO: renamed from: i */
    public final n890 f111087i;

    /* JADX INFO: renamed from: j */
    public final xh70 f111088j;

    /* JADX INFO: renamed from: k */
    public final zj5 f111089k;

    /* JADX INFO: renamed from: l */
    public final SparseArray f111090l;

    /* JADX INFO: renamed from: m */
    public final Handler f111091m;

    /* JADX INFO: renamed from: n */
    public n301 f111092n;

    /* JADX INFO: renamed from: o */
    public boolean f111093o;

    /* JADX INFO: renamed from: q */
    public PendingIntent f111095q;

    /* JADX INFO: renamed from: r */
    public pf40 f111096r;

    /* JADX INFO: renamed from: s */
    public pf40 f111097s;

    /* JADX INFO: renamed from: t */
    public wsv0 f111098t;

    /* JADX INFO: renamed from: u */
    public wsv0 f111099u;

    /* JADX INFO: renamed from: w */
    public b7p0 f111101w;

    /* JADX INFO: renamed from: x */
    public b7p0 f111102x;

    /* JADX INFO: renamed from: y */
    public b7p0 f111103y;

    /* JADX INFO: renamed from: z */
    public Surface f111104z;

    /* JADX INFO: renamed from: p */
    public cap0 f111094p = cap0.f35848H;

    /* JADX INFO: renamed from: B */
    public di21 f111072B = di21.f49218c;

    /* JADX INFO: renamed from: v */
    public nxz0 f111100v = nxz0.f159651b;

    public jcd0(Context context, lbd0 lbd0Var, n301 n301Var, Bundle bundle, Looper looper) {
        wsv0 wsv0Var = wsv0.f254763e;
        this.f111096r = wsv0Var;
        this.f111097s = wsv0Var;
        this.f111098t = wsv0Var;
        this.f111099u = wsv0Var;
        b7p0 b7p0Var = b7p0.f24366b;
        this.f111101w = b7p0Var;
        this.f111102x = b7p0Var;
        this.f111103y = m52947c(b7p0Var, b7p0Var);
        this.f111087i = new n890(looper, gh61.f79843a, new xba0(this, 18));
        this.f111091m = new Handler(looper);
        this.f111079a = lbd0Var;
        c95.m31848n(context, "context must not be null");
        c95.m31848n(n301Var, "token must not be null");
        this.f111082d = context;
        this.f111080b = new mqi0();
        this.f111081c = new pcd0(this);
        this.f111089k = new zj5(0);
        this.f111083e = n301Var;
        this.f111084f = bundle;
        this.f111085g = new ybd0(this, 0);
        this.f111086h = new icd0(this);
        this.f111078H = Bundle.EMPTY;
        n301Var.f149897a.getClass();
        this.f111088j = new xh70(this, looper);
        this.f111075E = -9223372036854775807L;
        this.f111076F = -9223372036854775807L;
        this.f111090l = new SparseArray();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX INFO: renamed from: D */
    public static wsv0 m52926D(List list, List list2, Bundle bundle, nxz0 nxz0Var, b7p0 b7p0Var, int i) {
        boolean z;
        if (!list2.isEmpty()) {
            return bcf.m28702g(list2, nxz0Var, b7p0Var);
        }
        boolean z2 = false;
        if (bundle.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_PREV)) {
            z = false;
        } else {
            if (b7p0Var.f24368a.m56305a(6, 7)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!bundle.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_NEXT)) {
            if (!b7p0Var.f24368a.m56305a(8, 9)) {
                z2 = true;
            }
        }
        return bcf.m28704j(list, z, z2, i);
    }

    /* JADX INFO: renamed from: E */
    public static wsv0 m52927E(List list, List list2, nxz0 nxz0Var, b7p0 b7p0Var, Bundle bundle) {
        if (list.isEmpty()) {
            String str = bcf.f25856k;
            if (list2.isEmpty()) {
                kf40 kf40Var = pf40.f176960b;
                list = wsv0.f254763e;
            } else {
                boolean zM56305a = b7p0Var.f24368a.m56305a(7, 6);
                boolean zM56305a2 = b7p0Var.f24368a.m56305a(9, 8);
                boolean z = bundle.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_PREV, false);
                boolean z2 = bundle.getBoolean(MediaConstants.SESSION_EXTRAS_KEY_SLOT_RESERVATION_SKIP_TO_NEXT, false);
                int i = (zM56305a || z) ? -1 : 0;
                int i2 = (zM56305a2 || z2) ? -1 : i == 0 ? 1 : 0;
                jf40 jf40VarM69788m = pf40.m69788m();
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    bcf bcfVar = (bcf) list2.get(i3);
                    if (i3 == i) {
                        if (i2 == -1) {
                            jf40VarM69788m.m28985c(bcfVar.m28710f(if40.m50414c(2, 6)));
                        } else {
                            jf40VarM69788m.m28985c(bcfVar.m28710f(new if40(new int[]{2, 3, 6}, 3)));
                        }
                    } else if (i3 == i2) {
                        jf40VarM69788m.m28985c(bcfVar.m28710f(if40.m50414c(3, 6)));
                    } else {
                        jf40VarM69788m.m28985c(bcfVar.m28710f(new if40(new int[]{6}, 1)));
                    }
                }
                list = jf40VarM69788m.m53150g();
            }
        }
        return bcf.m28702g(list, nxz0Var, b7p0Var);
    }

    /* JADX INFO: renamed from: d */
    public static cp71 m52928d(ArrayList arrayList, ArrayList arrayList2) {
        jf40 jf40Var = new jf40(4);
        jf40Var.m28987e(arrayList);
        wsv0 wsv0VarM53150g = jf40Var.m53150g();
        jf40 jf40Var2 = new jf40(4);
        jf40Var2.m28987e(arrayList2);
        wsv0 wsv0VarM53150g2 = jf40Var2.m53150g();
        int size = arrayList.size();
        MediaBrowserServiceCompat.BrowserRoot browserRoot = dzd0.f54633a;
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = i;
        }
        return new cp71(wsv0VarM53150g, wsv0VarM53150g2, iArr);
    }

    /* JADX INFO: renamed from: j */
    public static int m52929j(cap0 cap0Var) {
        return cap0Var.f35892c.f149589a.f56979b;
    }

    /* JADX INFO: renamed from: r */
    public static cap0 m52930r(cap0 cap0Var, int i, List list, long j, long j2) {
        int size;
        qp71 qp71Var = cap0Var.f35899j;
        n201 n201Var = cap0Var.f35892c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size2 = 0;
        for (int i2 = 0; i2 < qp71Var.mo26655o(); i2++) {
            arrayList.add(qp71Var.mo26654n(i2, new mp71(), 0L));
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ufd0 ufd0Var = (ufd0) list.get(i3);
            mp71 mp71Var = new mp71();
            mp71Var.m62447d(0, ufd0Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, -1, -1, 0L);
            arrayList.add(i3 + i, mp71Var);
        }
        m52934z(qp71Var, arrayList, arrayList2);
        cp71 cp71VarM52928d = m52928d(arrayList, arrayList2);
        if (cap0Var.f35899j.m73436p()) {
            size = 0;
        } else {
            int i4 = n201Var.f149589a.f56979b;
            size2 = i4 >= i ? list.size() + i4 : i4;
            int i5 = n201Var.f149589a.f56982e;
            size = i5 >= i ? list.size() + i5 : i5;
        }
        return m52932t(cap0Var, cp71VarM52928d, size2, size, j, j2, 5);
    }

    /* JADX INFO: renamed from: s */
    public static cap0 m52931s(cap0 cap0Var, int i, int i2, boolean z, long j, long j2) {
        int i3;
        int iMo33542a;
        int i4;
        cap0 cap0VarM52932t;
        qp71 qp71Var = cap0Var.f35899j;
        boolean z2 = cap0Var.f35898i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        for (int i6 = 0; i6 < qp71Var.mo26655o(); i6++) {
            if (i6 < i || i6 >= i2) {
                arrayList.add(qp71Var.mo26654n(i6, new mp71(), 0L));
            }
        }
        m52934z(qp71Var, arrayList, arrayList2);
        cp71 cp71VarM52928d = m52928d(arrayList, arrayList2);
        e7p0 e7p0Var = cap0Var.f35892c.f149589a;
        int i7 = e7p0Var.f56979b;
        int i8 = e7p0Var.f56982e;
        mp71 mp71Var = new mp71();
        boolean z3 = i7 >= i && i7 < i2;
        if (cp71VarM52928d.m73436p()) {
            i8 = 0;
            iMo33542a = -1;
            i3 = 1;
        } else {
            if (z3) {
                int i9 = cap0Var.f35897h;
                int iMo26655o = qp71Var.mo26655o();
                iMo33542a = i7;
                i3 = 1;
                while (true) {
                    if (i5 < iMo26655o) {
                        iMo33542a = qp71Var.mo33544e(iMo33542a, i9, z2);
                        if (iMo33542a != -1) {
                            if (iMo33542a < i || iMo33542a >= i2) {
                                break;
                            }
                            i5++;
                        }
                    }
                    iMo33542a = -1;
                    break;
                }
                if (iMo33542a == -1) {
                    iMo33542a = cp71VarM52928d.mo33542a(z2);
                } else if (iMo33542a >= i2) {
                    iMo33542a -= i2 - i;
                }
                cp71VarM52928d.mo26654n(iMo33542a, mp71Var, 0L);
                i4 = mp71Var.f145939n;
            } else {
                i3 = 1;
                if (i7 >= i2) {
                    iMo33542a = i7 - (i2 - i);
                    if (i8 != -1) {
                        for (int i10 = i; i10 < i2; i10++) {
                            mp71 mp71Var2 = new mp71();
                            qp71Var.m73435m(i10, mp71Var2);
                            i8 -= (mp71Var2.f145940o - mp71Var2.f145939n) + 1;
                        }
                    }
                    i4 = i8;
                } else {
                    iMo33542a = i7;
                }
            }
            i8 = i4;
        }
        if (!z3) {
            cap0VarM52932t = m52932t(cap0Var, cp71VarM52928d, iMo33542a, i8, j, j2, 4);
        } else if (iMo33542a == -1) {
            cap0VarM52932t = m52933u(cap0Var, cp71VarM52928d, n201.f149577k, n201.f149578l, 4);
        } else if (z) {
            cap0VarM52932t = m52932t(cap0Var, cp71VarM52928d, iMo33542a, i8, j, j2, 4);
        } else {
            int i11 = iMo33542a;
            mp71 mp71Var3 = new mp71();
            cp71VarM52928d.mo26654n(i11, mp71Var3, 0L);
            long jM46326n0 = h0b1.m46326n0(mp71Var3.f145937l);
            long jM46326n1 = h0b1.m46326n0(mp71Var3.f145938m);
            e7p0 e7p0Var2 = new e7p0(null, i11, mp71Var3.f145928c, null, i8, jM46326n0, jM46326n0, -1, -1);
            cap0VarM52932t = m52933u(cap0Var, cp71VarM52928d, e7p0Var2, new n201(e7p0Var2, false, SystemClock.elapsedRealtime(), jM46326n1, jM46326n0, dzd0.m37447b(jM46326n0, jM46326n1), 0L, -9223372036854775807L, jM46326n1, jM46326n0), 4);
        }
        int i12 = cap0VarM52932t.f35883A;
        return (i12 == i3 || i12 == 4 || i >= i2 || i2 != qp71Var.mo26655o() || i7 < i) ? cap0VarM52932t : cap0VarM52932t.m32071f(4, null);
    }

    /* JADX INFO: renamed from: t */
    public static cap0 m52932t(cap0 cap0Var, cp71 cp71Var, int i, int i2, long j, long j2, int i3) {
        mp71 mp71Var = new mp71();
        cp71Var.mo26654n(i, mp71Var, 0L);
        ufd0 ufd0Var = mp71Var.f145928c;
        e7p0 e7p0Var = cap0Var.f35892c.f149589a;
        e7p0 e7p0Var2 = new e7p0(null, i, ufd0Var, null, i2, j, j2, e7p0Var.f56985h, e7p0Var.f56986i);
        n201 n201Var = cap0Var.f35892c;
        return m52933u(cap0Var, cp71Var, e7p0Var2, new n201(e7p0Var2, n201Var.f149590b, SystemClock.elapsedRealtime(), n201Var.f149592d, n201Var.f149593e, n201Var.f149594f, n201Var.f149595g, n201Var.f149596h, n201Var.f149597i, n201Var.f149598j), i3);
    }

    /* JADX INFO: renamed from: u */
    public static cap0 m52933u(cap0 cap0Var, qp71 qp71Var, e7p0 e7p0Var, n201 n201Var, int i) {
        n201 n201Var2;
        dr81 dr81Var;
        tt81 tt81Var;
        boolean z;
        PlaybackException playbackException = cap0Var.f35890a;
        int i2 = cap0Var.f35891b;
        n201 n201Var3 = cap0Var.f35892c;
        h1p0 h1p0Var = cap0Var.f35896g;
        int i3 = cap0Var.f35897h;
        boolean z2 = cap0Var.f35898i;
        int i4 = cap0Var.f35900k;
        k9c1 k9c1Var = cap0Var.f35901l;
        phd0 phd0Var = cap0Var.f35902m;
        float f = cap0Var.f35903n;
        float f2 = cap0Var.f35904o;
        int i5 = cap0Var.f35905p;
        xs6 xs6Var = cap0Var.f35906q;
        o0m o0mVar = cap0Var.f35907r;
        x6r x6rVar = cap0Var.f35908s;
        int i6 = cap0Var.f35909t;
        boolean z3 = cap0Var.f35910u;
        boolean z4 = cap0Var.f35911v;
        int i7 = cap0Var.f35912w;
        boolean z5 = cap0Var.f35913x;
        boolean z6 = cap0Var.f35914y;
        int i8 = cap0Var.f35915z;
        int i9 = cap0Var.f35883A;
        phd0 phd0Var2 = cap0Var.f35884B;
        long j = cap0Var.f35885C;
        long j2 = cap0Var.f35886D;
        long j3 = cap0Var.f35887E;
        tt81 tt81Var2 = cap0Var.f35888F;
        dr81 dr81Var2 = cap0Var.f35889G;
        e7p0 e7p0Var2 = n201Var3.f149589a;
        if (!qp71Var.m73436p()) {
            n201Var2 = n201Var;
            dr81Var = dr81Var2;
            tt81Var = tt81Var2;
            if (n201Var2.f149589a.f56979b >= qp71Var.mo26655o()) {
                z = false;
            }
            c95.m31855u(z);
            return new cap0(playbackException, i2, n201Var2, e7p0Var2, e7p0Var, i, h1p0Var, i3, z2, k9c1Var, qp71Var, i4, phd0Var, f, f2, xs6Var, i5, o0mVar, x6rVar, i6, z3, z4, i7, i8, i9, z5, z6, phd0Var2, j, j2, j3, tt81Var, dr81Var);
        }
        n201Var2 = n201Var;
        dr81Var = dr81Var2;
        tt81Var = tt81Var2;
        z = true;
        c95.m31855u(z);
        return new cap0(playbackException, i2, n201Var2, e7p0Var2, e7p0Var, i, h1p0Var, i3, z2, k9c1Var, qp71Var, i4, phd0Var, f, f2, xs6Var, i5, o0mVar, x6rVar, i6, z3, z4, i7, i8, i9, z5, z6, phd0Var2, j, j2, j3, tt81Var, dr81Var);
    }

    /* JADX INFO: renamed from: z */
    public static void m52934z(qp71 qp71Var, ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            mp71 mp71Var = (mp71) arrayList.get(i);
            int i2 = mp71Var.f145939n;
            int i3 = mp71Var.f145940o;
            if (i2 == -1 || i3 == -1) {
                mp71Var.f145939n = arrayList2.size();
                mp71Var.f145940o = arrayList2.size();
                bp71 bp71Var = new bp71();
                bp71Var.m30112i(null, null, i, -9223372036854775807L, 0L, kt0.f126088f, true);
                arrayList2.add(bp71Var);
            } else {
                mp71Var.f145939n = arrayList2.size();
                mp71Var.f145940o = (i3 - i2) + arrayList2.size();
                while (i2 <= i3) {
                    bp71 bp71Var2 = new bp71();
                    qp71Var.mo26651f(i2, bp71Var2, false);
                    bp71Var2.f29345c = i;
                    arrayList2.add(bp71Var2);
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m52935A() {
        jv30 jv30Var = this.f111073C;
        if (this.f111093o) {
            return;
        }
        this.f111093o = true;
        this.f111092n = null;
        this.f111091m.removeCallbacksAndMessages(null);
        m52946b();
        xh70 xh70Var = this.f111088j;
        Handler handler = (Handler) xh70Var.f261460b;
        if (handler.hasMessages(1)) {
            xh70Var.m90958o();
        }
        handler.removeCallbacksAndMessages(null);
        this.f111073C = null;
        if (jv30Var != null && jv30Var.asBinder().isBinderAlive()) {
            int iM62565e = this.f111080b.m62565e();
            try {
                jv30Var.asBinder().unlinkToDeath(this.f111085g, 0);
                jv30Var.mo45838p(this.f111081c, iM62565e);
            } catch (RemoteException unused) {
            }
        }
        this.f111087i.m63835f();
        mqi0 mqi0Var = this.f111080b;
        gcd0 gcd0Var = new gcd0(this, 0);
        synchronized (mqi0Var.f146298c) {
            try {
                Handler handlerM46330r = h0b1.m46330r(null);
                mqi0Var.f146301f = handlerM46330r;
                mqi0Var.f146300e = gcd0Var;
                if (((uj5) mqi0Var.f146299d).isEmpty()) {
                    mqi0Var.m62569i();
                } else {
                    handlerM46330r.postDelayed(new rsz0(mqi0Var, 2), 30000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m52936B(int i, int i2) {
        int iMo26655o = this.f111094p.f35899j.mo26655o();
        int iMin = Math.min(i2, iMo26655o);
        if (i >= iMo26655o || i == iMin || iMo26655o == 0) {
            return;
        }
        boolean z = m52929j(this.f111094p) >= i && m52929j(this.f111094p) < iMin;
        cap0 cap0VarM52931s = m52931s(this.f111094p, i, iMin, false, m52953k(), m52952i());
        int i3 = this.f111094p.f35892c.f149589a.f56979b;
        m52944L(cap0VarM52931s, 0, null, z ? 4 : null, i3 >= i && i3 < iMin ? 3 : null);
    }

    /* JADX INFO: renamed from: C */
    public final void m52937C(int i, int i2, List list) {
        int iMo26655o = this.f111094p.f35899j.mo26655o();
        if (i > iMo26655o) {
            return;
        }
        if (this.f111094p.f35899j.m73436p()) {
            m52941I(list, -1, -9223372036854775807L, false);
            return;
        }
        int iMin = Math.min(i2, iMo26655o);
        cap0 cap0VarM52931s = m52931s(m52930r(this.f111094p, iMin, list, m52953k(), m52952i()), i, iMin, true, m52953k(), m52952i());
        int i3 = this.f111094p.f35892c.f149589a.f56979b;
        boolean z = i3 >= i && i3 < iMin;
        m52944L(cap0VarM52931s, 0, null, z ? 4 : null, z ? 3 : null);
    }

    /* JADX INFO: renamed from: F */
    public final void m52938F(int i, long j) {
        int i2;
        int i3;
        cap0 cap0VarM52933u;
        qp71 qp71Var = this.f111094p.f35899j;
        if (qp71Var.m73436p() || i < qp71Var.mo26655o()) {
            cap0 cap0Var = this.f111094p;
            if (cap0Var.f35892c.f149590b) {
                return;
            }
            cap0 cap0VarM32071f = cap0Var.m32071f(cap0Var.f35883A == 1 ? 1 : 2, cap0Var.f35890a);
            zkq zkqVarM52955m = m52955m(qp71Var, i, j);
            if (zkqVarM52955m == null) {
                long j2 = 0;
                long j3 = j != -9223372036854775807L ? j : 0L;
                if (j != -9223372036854775807L) {
                    j2 = j;
                }
                i2 = 1;
                i3 = 2;
                e7p0 e7p0Var = new e7p0(null, i, null, null, i, j3, j2, -1, -1);
                cap0 cap0Var2 = this.f111094p;
                qp71 qp71Var2 = cap0Var2.f35899j;
                boolean z = this.f111094p.f35892c.f149590b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                n201 n201Var = this.f111094p.f35892c;
                cap0VarM52933u = m52933u(cap0Var2, qp71Var2, e7p0Var, new n201(e7p0Var, z, jElapsedRealtime, n201Var.f149592d, j == -9223372036854775807L ? 0L : j, 0, 0L, n201Var.f149596h, n201Var.f149597i, j == -9223372036854775807L ? 0L : j), 1);
            } else {
                i2 = 1;
                i3 = 2;
                n201 n201Var2 = cap0VarM32071f.f35892c;
                e7p0 e7p0Var2 = n201Var2.f149589a;
                e7p0 e7p0Var3 = n201Var2.f149589a;
                int i4 = e7p0Var2.f56982e;
                int i5 = zkqVarM52955m.f283803a;
                bp71 bp71Var = new bp71();
                qp71Var.mo26651f(i4, bp71Var, false);
                bp71 bp71Var2 = new bp71();
                qp71Var.mo26651f(i5, bp71Var2, false);
                boolean z2 = i4 != i5;
                long j4 = zkqVarM52955m.f283804b;
                long jM46295W = h0b1.m46295W(m52953k()) - bp71Var.f29347e;
                if (z2 || j4 != jM46295W) {
                    c95.m31855u(e7p0Var3.f56985h == -1);
                    e7p0 e7p0Var4 = new e7p0(null, bp71Var.f29345c, e7p0Var3.f56980c, null, i4, h0b1.m46326n0(bp71Var.f29347e + jM46295W), h0b1.m46326n0(bp71Var.f29347e + jM46295W), -1, -1);
                    qp71Var.mo26651f(i5, bp71Var2, false);
                    mp71 mp71Var = new mp71();
                    qp71Var.m73435m(bp71Var2.f29345c, mp71Var);
                    long jM46326n0 = h0b1.m46326n0(bp71Var2.f29347e + j4);
                    e7p0 e7p0Var5 = new e7p0(null, bp71Var2.f29345c, mp71Var.f145928c, null, i5, jM46326n0, jM46326n0, -1, -1);
                    cap0 cap0VarM32073h = cap0VarM32071f.m32073h(e7p0Var4, e7p0Var5, 1);
                    if (z2 || j4 < jM46295W) {
                        cap0VarM32071f = cap0VarM32073h.m32075j(new n201(e7p0Var5, false, SystemClock.elapsedRealtime(), h0b1.m46326n0(mp71Var.f145938m), jM46326n0, dzd0.m37447b(jM46326n0, h0b1.m46326n0(mp71Var.f145938m)), 0L, -9223372036854775807L, -9223372036854775807L, jM46326n0));
                    } else {
                        long jMax = Math.max(0L, h0b1.m46295W(cap0VarM32073h.f35892c.f149595g) - (j4 - jM46295W));
                        long jM46326n1 = h0b1.m46326n0(bp71Var2.f29347e + j4 + jMax);
                        cap0VarM32071f = cap0VarM32073h.m32075j(new n201(e7p0Var5, false, SystemClock.elapsedRealtime(), h0b1.m46326n0(mp71Var.f145938m), jM46326n1, dzd0.m37447b(jM46326n1, h0b1.m46326n0(mp71Var.f145938m)), h0b1.m46326n0(jMax), -9223372036854775807L, -9223372036854775807L, jM46326n1));
                    }
                }
                cap0VarM52933u = cap0VarM32071f;
            }
            n201 n201Var3 = cap0VarM52933u.f35892c;
            int i6 = (this.f111094p.f35899j.m73436p() || n201Var3.f149589a.f56979b == this.f111094p.f35892c.f149589a.f56979b) ? 0 : i2;
            if (i6 == 0 && n201Var3.f149589a.f56983f == this.f111094p.f35892c.f149589a.f56983f) {
                return;
            }
            m52944L(cap0VarM52933u, null, null, Integer.valueOf(i2), i6 != 0 ? Integer.valueOf(i3) : null);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m52939G(long j) {
        long jM52953k = m52953k() + j;
        long j2 = this.f111094p.f35892c.f149592d;
        if (j2 != -9223372036854775807L) {
            jM52953k = Math.min(jM52953k, j2);
        }
        m52938F(m52929j(this.f111094p), Math.max(jM52953k, 0L));
    }

    /* JADX INFO: renamed from: H */
    public final u790 m52940H(final mxz0 mxz0Var, final Bundle bundle) {
        if (m52957o() < 7) {
            final int i = 0;
            return m52951h(mxz0Var, new hcd0(this) { // from class: p.vbd0

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ jcd0 f239478b;

                {
                    this.f239478b = this;
                }

                @Override // p204p.hcd0
                /* JADX INFO: renamed from: d */
                public final void mo25456d(jv30 jv30Var, int i2) {
                    switch (i) {
                        case 0:
                            jv30Var.mo45814Q0(this.f239478b.f111081c, i2, mxz0Var.m63118b(), bundle);
                            break;
                        default:
                            jv30Var.mo45813O1(this.f239478b.f111081c, i2, mxz0Var.m63118b(), bundle, false);
                            break;
                    }
                }
            });
        }
        if (m52957o() < 7) {
            return m52940H(mxz0Var, bundle);
        }
        final int i2 = 1;
        return m52951h(mxz0Var, new hcd0(this) { // from class: p.vbd0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ jcd0 f239478b;

            {
                this.f239478b = this;
            }

            @Override // p204p.hcd0
            /* JADX INFO: renamed from: d */
            public final void mo25456d(jv30 jv30Var, int i3) {
                switch (i2) {
                    case 0:
                        jv30Var.mo45814Q0(this.f239478b.f111081c, i3, mxz0Var.m63118b(), bundle);
                        break;
                    default:
                        jv30Var.mo45813O1(this.f239478b.f111081c, i3, mxz0Var.m63118b(), bundle, false);
                        break;
                }
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final void m52941I(List list, int i, long j, boolean z) {
        int iMo33542a;
        boolean z2;
        long j2;
        e7p0 e7p0Var;
        n201 n201Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (i2 < list.size()) {
            ufd0 ufd0Var = (ufd0) list.get(i2);
            int i3 = x280.f257392a;
            mp71 mp71Var = new mp71();
            int i4 = i2;
            mp71Var.m62447d(0, ufd0Var, null, 0L, 0L, 0L, true, false, null, 0L, -9223372036854775807L, i4, i4, 0L);
            arrayList.add(mp71Var);
            bp71 bp71Var = new bp71();
            bp71Var.m30112i(null, null, i4, -9223372036854775807L, 0L, kt0.f126088f, true);
            arrayList2.add(bp71Var);
            i2 = i4 + 1;
        }
        cp71 cp71VarM52928d = m52928d(arrayList, arrayList2);
        wsv0 wsv0Var = cp71VarM52928d.f40484e;
        if (!cp71VarM52928d.m73436p() && i >= wsv0Var.f254765d) {
            throw new IllegalSeekPositionException();
        }
        if (z) {
            iMo33542a = cp71VarM52928d.m73436p() ? 0 : cp71VarM52928d.mo33542a(this.f111094p.f35898i);
            z2 = false;
            j2 = -9223372036854775807L;
        } else if (i == -1) {
            e7p0 e7p0Var2 = this.f111094p.f35892c.f149589a;
            int i5 = e7p0Var2.f56979b;
            long j3 = e7p0Var2.f56983f;
            if (cp71VarM52928d.m73436p() || i5 < wsv0Var.f254765d) {
                z2 = false;
                j2 = j3;
                iMo33542a = i5;
            } else {
                iMo33542a = cp71VarM52928d.mo33542a(this.f111094p.f35898i);
                j2 = -9223372036854775807L;
                z2 = true;
            }
        } else {
            iMo33542a = i;
            z2 = false;
            j2 = j;
        }
        zkq zkqVarM52955m = m52955m(cp71VarM52928d, iMo33542a, j2);
        if (zkqVarM52955m == null) {
            e7p0Var = new e7p0(null, iMo33542a, null, null, iMo33542a, j2 == -9223372036854775807L ? 0L : j2, j2 == -9223372036854775807L ? 0L : j2, -1, -1);
            n201Var = new n201(e7p0Var, false, SystemClock.elapsedRealtime(), -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2, 0, 0L, -9223372036854775807L, -9223372036854775807L, j2 == -9223372036854775807L ? 0L : j2);
        } else {
            long j4 = zkqVarM52955m.f283804b;
            e7p0Var = new e7p0(null, iMo33542a, (ufd0) list.get(iMo33542a), null, zkqVarM52955m.f283803a, h0b1.m46326n0(j4), h0b1.m46326n0(j4), -1, -1);
            n201Var = new n201(e7p0Var, false, SystemClock.elapsedRealtime(), -9223372036854775807L, h0b1.m46326n0(j4), 0, 0L, -9223372036854775807L, -9223372036854775807L, h0b1.m46326n0(j4));
        }
        cap0 cap0VarM52933u = m52933u(this.f111094p, cp71VarM52928d, e7p0Var, n201Var, 4);
        int i6 = cap0VarM52933u.f35883A;
        if (iMo33542a != -1 && i6 != 1) {
            i6 = (cp71VarM52928d.m73436p() || z2) ? 4 : 2;
        }
        cap0 cap0VarM32071f = cap0VarM52933u.m32071f(i6, this.f111094p.f35890a);
        m52944L(cap0VarM32071f, 0, null, !this.f111094p.f35899j.m73436p() ? 4 : null, (this.f111094p.f35899j.m73436p() && cap0VarM32071f.f35899j.m73436p()) ? null : 3);
    }

    /* JADX INFO: renamed from: J */
    public final void m52942J(boolean z) {
        cap0 cap0Var = this.f111094p;
        int i = cap0Var.f35915z;
        int i2 = i == 1 ? 0 : i;
        if (cap0Var.f35911v == z && i == i2) {
            return;
        }
        this.f111075E = dzd0.m37448c(cap0Var, this.f111075E, this.f111076F, this.f111079a.f131638f);
        this.f111076F = SystemClock.elapsedRealtime();
        m52944L(this.f111094p.m32069d(1, i2, z), null, 1, null, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m52943K(Surface surface, int i, int i2) {
        if (m52958p()) {
            if (m52957o() >= 8) {
                m52950g(new pbd0(this, surface, i, i2, 1));
            } else {
                m52950g(new us30(5, this, surface));
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m52944L(cap0 cap0Var, Integer num, Integer num2, Integer num3, Integer num4) {
        cap0 cap0Var2 = this.f111094p;
        this.f111094p = cap0Var;
        m52961w(cap0Var2, cap0Var, num, num2, num3, num4);
    }

    /* JADX INFO: renamed from: a */
    public final void m52945a(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f111094p.f35899j.m73436p()) {
            m52941I(list, -1, -9223372036854775807L, false);
        } else {
            m52944L(m52930r(this.f111094p, Math.min(i, this.f111094p.f35899j.mo26655o()), list, m52953k(), m52952i()), 0, null, null, this.f111094p.f35899j.m73436p() ? 3 : null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m52946b() {
        SurfaceHolder surfaceHolder = this.f111071A;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f111086h);
            this.f111071A = null;
        }
        if (this.f111104z != null) {
            this.f111104z = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r8.f24368a.m56305a(25, 33, 26, 34) == false) goto L11;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b7p0 m52947c(b7p0 b7p0Var, b7p0 b7p0Var2) {
        b7p0 b7p0VarM37449d = dzd0.m37449d(b7p0Var, b7p0Var2);
        boolean z = this.f111094p.f35908s.f258729a == 0;
        if (b7p0VarM37449d.m28393a(32)) {
            if (z) {
            }
            return b7p0VarM37449d;
        }
        a7p0 a7p0Var = new a7p0(b7p0VarM37449d);
        a7p0Var.f13116a.m96474f(32);
        a7p0Var.m24991e(25, z);
        a7p0Var.m24991e(33, z);
        a7p0Var.m24991e(26, z);
        a7p0Var.m24991e(34, z);
        return a7p0Var.m24990d();
    }

    /* JADX INFO: renamed from: e */
    public final u790 m52948e(jv30 jv30Var, hcd0 hcd0Var, boolean z) {
        MediaController mediaController;
        if (jv30Var == null) {
            return vgg1.m85445A(new r201(-4));
        }
        if (Build.VERSION.SDK_INT >= 31 && (mediaController = this.f111074D) != null) {
            mediaController.getTransportControls().sendCustomAction("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST", (Bundle) null);
        }
        r201 r201Var = new r201(1);
        mqi0 mqi0Var = this.f111080b;
        atz0 atz0VarM62564c = mqi0Var.m62564c(r201Var);
        int i = atz0VarM62564c.f19770e;
        zj5 zj5Var = this.f111089k;
        if (z) {
            if (zj5Var.isEmpty()) {
                this.f111077G = this.f111094p;
            }
            zj5Var.add(Integer.valueOf(i));
        }
        try {
            hcd0Var.mo25456d(jv30Var, i);
            return atz0VarM62564c;
        } catch (RemoteException e) {
            yif1.m93821x0("Cannot connect to the service or the session is gone", e);
            zj5Var.remove(Integer.valueOf(i));
            mqi0Var.m62572l(i, new r201(-100));
            return atz0VarM62564c;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m52949f(hcd0 hcd0Var) {
        xh70 xh70Var = this.f111088j;
        Handler handler = (Handler) xh70Var.f261460b;
        if (((jcd0) xh70Var.f261461c).f111073C != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        m52948e(this.f111073C, hcd0Var, true);
    }

    /* JADX INFO: renamed from: g */
    public final void m52950g(hcd0 hcd0Var) {
        xh70 xh70Var = this.f111088j;
        Handler handler = (Handler) xh70Var.f261460b;
        if (((jcd0) xh70Var.f261461c).f111073C != null && !handler.hasMessages(1)) {
            handler.sendEmptyMessage(1);
        }
        u790 u790VarM52948e = m52948e(this.f111073C, hcd0Var, true);
        try {
            x280.m89727i(u790VarM52948e);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e);
        } catch (TimeoutException e2) {
            if (u790VarM52948e instanceof atz0) {
                int i = ((atz0) u790VarM52948e).f19770e;
                this.f111089k.remove(Integer.valueOf(i));
                this.f111080b.m62572l(i, new r201(-1));
            }
            yif1.m93821x0("Synchronous command takes too long on the session side.", e2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final u790 m52951h(mxz0 mxz0Var, hcd0 hcd0Var) {
        jv30 jv30Var;
        int i = mxz0Var.f148233a;
        String str = mxz0Var.f148234b;
        c95.m31843i(i == 0);
        if (this.f111100v.f159653a.contains(mxz0Var) || bcf.m28707m(str)) {
            jv30Var = this.f111073C;
        } else {
            yif1.m93819w0("Controller isn't allowed to call custom session command:".concat(str));
            jv30Var = null;
        }
        return m52948e(jv30Var, hcd0Var, false);
    }

    /* JADX INFO: renamed from: i */
    public final long m52952i() {
        n201 n201Var = this.f111094p.f35892c;
        return !n201Var.f149590b ? m52953k() : n201Var.f149589a.f56984g;
    }

    /* JADX INFO: renamed from: k */
    public final long m52953k() {
        long jM37448c = dzd0.m37448c(this.f111094p, this.f111075E, this.f111076F, this.f111079a.f131638f);
        this.f111075E = jM37448c;
        return jM37448c;
    }

    /* JADX INFO: renamed from: l */
    public final int m52954l() {
        if (this.f111094p.f35899j.m73436p()) {
            return -1;
        }
        cap0 cap0Var = this.f111094p;
        qp71 qp71Var = cap0Var.f35899j;
        int iM52929j = m52929j(cap0Var);
        cap0 cap0Var2 = this.f111094p;
        int i = cap0Var2.f35897h;
        if (i == 1) {
            i = 0;
        }
        return qp71Var.mo33544e(iM52929j, i, cap0Var2.f35898i);
    }

    /* JADX INFO: renamed from: m */
    public final zkq m52955m(qp71 qp71Var, int i, long j) {
        if (qp71Var.m73436p()) {
            return null;
        }
        mp71 mp71Var = new mp71();
        bp71 bp71Var = new bp71();
        if (i == -1 || i >= qp71Var.mo26655o()) {
            i = qp71Var.mo33542a(this.f111094p.f35898i);
            j = h0b1.m46326n0(qp71Var.mo26654n(i, mp71Var, 0L).f145937l);
        }
        long jM46295W = h0b1.m46295W(j);
        c95.m31847m(i, qp71Var.mo26655o());
        qp71Var.m73435m(i, mp71Var);
        if (jM46295W == -9223372036854775807L) {
            jM46295W = mp71Var.f145937l;
            if (jM46295W == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = mp71Var.f145939n;
        qp71Var.mo26651f(i2, bp71Var, false);
        while (i2 < mp71Var.f145940o && bp71Var.f29347e != jM46295W) {
            int i3 = i2 + 1;
            if (qp71Var.mo26651f(i3, bp71Var, false).f29347e > jM46295W) {
                break;
            }
            i2 = i3;
        }
        qp71Var.mo26651f(i2, bp71Var, false);
        return new zkq(jM46295W - bp71Var.f29347e, false, i2);
    }

    /* JADX INFO: renamed from: n */
    public final int m52956n() {
        if (this.f111094p.f35899j.m73436p()) {
            return -1;
        }
        cap0 cap0Var = this.f111094p;
        qp71 qp71Var = cap0Var.f35899j;
        int iM52929j = m52929j(cap0Var);
        cap0 cap0Var2 = this.f111094p;
        int i = cap0Var2.f35897h;
        if (i == 1) {
            i = 0;
        }
        return qp71Var.mo33545k(iM52929j, i, cap0Var2.f35898i);
    }

    /* JADX INFO: renamed from: o */
    public final int m52957o() {
        n301 n301Var = this.f111092n;
        n301Var.getClass();
        return n301Var.f149897a.f161204c;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m52958p() {
        return this.f111073C != null;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m52959q(int i) {
        if (this.f111103y.m28393a(i)) {
            return true;
        }
        ei6.m39077n(i, "Controller isn't allowed to call command= ");
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final void m52960v(int i, int i2, int i3) {
        int i4;
        int i5;
        qp71 qp71Var = this.f111094p.f35899j;
        int iMo26655o = qp71Var.mo26655o();
        int iMin = Math.min(i2, iMo26655o);
        int i6 = iMin - i;
        int iMin2 = Math.min(i3, iMo26655o - i6);
        if (i >= iMo26655o || i == iMin || i == iMin2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < iMo26655o; i7++) {
            arrayList.add(qp71Var.mo26654n(i7, new mp71(), 0L));
        }
        h0b1.m46294V(i, iMin, iMin2, arrayList);
        m52934z(qp71Var, arrayList, arrayList2);
        cp71 cp71VarM52928d = m52928d(arrayList, arrayList2);
        if (cp71VarM52928d.m73436p()) {
            return;
        }
        int iM52929j = m52929j(this.f111094p);
        if (iM52929j >= i && iM52929j < iMin) {
            i5 = (iM52929j - i) + iMin2;
        } else {
            if (iMin > iM52929j || iMin2 <= iM52929j) {
                if (iMin <= iM52929j || iMin2 > iM52929j) {
                    i4 = iM52929j;
                } else {
                    i5 = iM52929j + i6;
                }
                mp71 mp71Var = new mp71();
                int i8 = this.f111094p.f35892c.f149589a.f56982e - qp71Var.mo26654n(iM52929j, mp71Var, 0L).f145939n;
                cp71VarM52928d.mo26654n(i4, mp71Var, 0L);
                m52944L(m52932t(this.f111094p, cp71VarM52928d, i4, mp71Var.f145939n + i8, m52953k(), m52952i(), 5), 0, null, null, null);
            }
            i5 = iM52929j - i6;
        }
        i4 = i5;
        mp71 mp71Var2 = new mp71();
        int i9 = this.f111094p.f35892c.f149589a.f56982e - qp71Var.mo26654n(iM52929j, mp71Var2, 0L).f145939n;
        cp71VarM52928d.mo26654n(i4, mp71Var2, 0L);
        m52944L(m52932t(this.f111094p, cp71VarM52928d, i4, mp71Var2.f145939n + i9, m52953k(), m52952i(), 5), 0, null, null, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m52961w(cap0 cap0Var, final cap0 cap0Var2, final Integer num, final Integer num2, final Integer num3, Integer num4) {
        n890 n890Var = this.f111087i;
        if (num != null) {
            final int i = 0;
            n890Var.m63834e(0, new k890() { // from class: p.wbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i) {
                        case 0:
                            d7p0Var.mo34782x0(cap0Var2.f35899j, num.intValue());
                            break;
                        case 1:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo34768f0(cap0Var3.f35893d, cap0Var3.f35894e, num.intValue());
                            break;
                        default:
                            d7p0Var.mo34765c0(num.intValue(), cap0Var2.f35911v);
                            break;
                    }
                }
            });
        }
        if (num3 != null) {
            final int i2 = 1;
            n890Var.m63834e(11, new k890() { // from class: p.wbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i2) {
                        case 0:
                            d7p0Var.mo34782x0(cap0Var2.f35899j, num3.intValue());
                            break;
                        case 1:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo34768f0(cap0Var3.f35893d, cap0Var3.f35894e, num3.intValue());
                            break;
                        default:
                            d7p0Var.mo34765c0(num3.intValue(), cap0Var2.f35911v);
                            break;
                    }
                }
            });
        }
        ufd0 ufd0VarM32082r = cap0Var2.m32082r();
        if (num4 != null) {
            n890Var.m63834e(1, new us30(6, ufd0VarM32082r, num4));
        }
        PlaybackException playbackException = cap0Var.f35890a;
        PlaybackException playbackException2 = cap0Var2.f35890a;
        if (playbackException != playbackException2 && (playbackException == null || !playbackException.mo756a(playbackException2))) {
            n890Var.m63834e(10, new rwo(1, playbackException2));
            if (playbackException2 != null) {
                n890Var.m63834e(10, new rwo(2, playbackException2));
            }
        }
        if (!cap0Var.f35888F.equals(cap0Var2.f35888F)) {
            final int i3 = 18;
            n890Var.m63834e(2, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i3) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (!cap0Var.f35884B.equals(cap0Var2.f35884B)) {
            final int i4 = 19;
            n890Var.m63834e(14, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i4) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35914y != cap0Var2.f35914y) {
            final int i5 = 20;
            n890Var.m63834e(3, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i5) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35883A != cap0Var2.f35883A) {
            final int i6 = 21;
            n890Var.m63834e(4, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i6) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (num2 != null) {
            final int i7 = 2;
            n890Var.m63834e(5, new k890() { // from class: p.wbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i7) {
                        case 0:
                            d7p0Var.mo34782x0(cap0Var2.f35899j, num2.intValue());
                            break;
                        case 1:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo34768f0(cap0Var3.f35893d, cap0Var3.f35894e, num2.intValue());
                            break;
                        default:
                            d7p0Var.mo34765c0(num2.intValue(), cap0Var2.f35911v);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35915z != cap0Var2.f35915z) {
            final int i8 = 0;
            n890Var.m63834e(6, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i8) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35913x != cap0Var2.f35913x) {
            final int i9 = 1;
            n890Var.m63834e(7, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i9) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (!cap0Var.f35896g.equals(cap0Var2.f35896g)) {
            final int i10 = 2;
            n890Var.m63834e(12, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i10) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35897h != cap0Var2.f35897h) {
            final int i11 = 3;
            n890Var.m63834e(8, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i11) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35898i != cap0Var2.f35898i) {
            final int i12 = 4;
            n890Var.m63834e(9, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i12) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (!cap0Var.f35902m.equals(cap0Var2.f35902m)) {
            final int i13 = 5;
            n890Var.m63834e(15, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i13) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35903n != cap0Var2.f35903n) {
            final int i14 = 6;
            n890Var.m63834e(22, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i14) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (!cap0Var.f35906q.equals(cap0Var2.f35906q)) {
            final int i15 = 7;
            n890Var.m63834e(20, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i15) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35905p != cap0Var2.f35905p) {
            final int i16 = 8;
            n890Var.m63834e(21, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i16) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        wsv0 wsv0Var = cap0Var.f35907r.f160426a;
        wsv0 wsv0Var2 = cap0Var2.f35907r.f160426a;
        wsv0Var.getClass();
        if (!pmf0.m70330p(wsv0Var, wsv0Var2)) {
            final int i17 = 9;
            n890Var.m63834e(27, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i17) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
            final int i18 = 10;
            n890Var.m63834e(27, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i18) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (!cap0Var.f35908s.equals(cap0Var2.f35908s)) {
            final int i19 = 11;
            n890Var.m63834e(29, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i19) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35909t != cap0Var2.f35909t || cap0Var.f35910u != cap0Var2.f35910u) {
            final int i20 = 12;
            n890Var.m63834e(30, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i20) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (!cap0Var.f35901l.equals(cap0Var2.f35901l)) {
            final int i21 = 13;
            n890Var.m63834e(25, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i21) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35885C != cap0Var2.f35885C) {
            final int i22 = 14;
            n890Var.m63834e(16, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i22) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35886D != cap0Var2.f35886D) {
            final int i23 = 15;
            n890Var.m63834e(17, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i23) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (cap0Var.f35887E != cap0Var2.f35887E) {
            final int i24 = 16;
            n890Var.m63834e(18, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i24) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        if (!cap0Var.f35889G.equals(cap0Var2.f35889G)) {
            final int i25 = 17;
            n890Var.m63834e(19, new k890() { // from class: p.xbd0
                @Override // p204p.k890
                public final void invoke(Object obj) {
                    d7p0 d7p0Var = (d7p0) obj;
                    switch (i25) {
                        case 0:
                            d7p0Var.mo35227v(cap0Var2.f35915z);
                            break;
                        case 1:
                            d7p0Var.mo34783y0(cap0Var2.f35913x);
                            break;
                        case 2:
                            d7p0Var.mo35220m0(cap0Var2.f35896g);
                            break;
                        case 3:
                            d7p0Var.onRepeatModeChanged(cap0Var2.f35897h);
                            break;
                        case 4:
                            d7p0Var.mo35207I(cap0Var2.f35898i);
                            break;
                        case 5:
                            d7p0Var.mo35229y(cap0Var2.f35902m);
                            break;
                        case 6:
                            d7p0Var.mo34766d0(cap0Var2.f35903n);
                            break;
                        case 7:
                            d7p0Var.mo35211U(cap0Var2.f35906q);
                            break;
                        case 8:
                            d7p0Var.mo35214g(cap0Var2.f35905p);
                            break;
                        case 9:
                            d7p0Var.mo35217j(cap0Var2.f35907r.f160426a);
                            break;
                        case 10:
                            d7p0Var.mo34773l(cap0Var2.f35907r);
                            break;
                        case 11:
                            d7p0Var.mo35219l0(cap0Var2.f35908s);
                            break;
                        case 12:
                            cap0 cap0Var3 = cap0Var2;
                            d7p0Var.mo35208K(cap0Var3.f35909t, cap0Var3.f35910u);
                            break;
                        case 13:
                            d7p0Var.mo29553b(cap0Var2.f35901l);
                            break;
                        case 14:
                            d7p0Var.mo35209L(cap0Var2.f35885C);
                            break;
                        case 15:
                            d7p0Var.mo35221o0(cap0Var2.f35886D);
                            break;
                        case 16:
                            d7p0Var.mo35226t0(cap0Var2.f35887E);
                            break;
                        case 17:
                            d7p0Var.mo35230z(cap0Var2.f35889G);
                            break;
                        case 18:
                            d7p0Var.mo34730A(cap0Var2.f35888F);
                            break;
                        case 19:
                            d7p0Var.mo35216i0(cap0Var2.f35884B);
                            break;
                        case 20:
                            d7p0Var.mo35213a0(cap0Var2.f35914y);
                            break;
                        default:
                            d7p0Var.mo34736F(cap0Var2.f35883A);
                            break;
                    }
                }
            });
        }
        n890Var.m63832c();
    }

    /* JADX INFO: renamed from: x */
    public final void m52962x(cap0 cap0Var, x9p0 x9p0Var) {
        cap0 cap0Var2;
        x9p0 x9p0Var2;
        if (m52958p()) {
            boolean z = m52957o() < 6;
            cap0 cap0Var3 = this.f111077G;
            if (cap0Var3 != null) {
                b7p0 b7p0Var = this.f111103y;
                n301 n301Var = this.f111092n;
                n301Var.getClass();
                this.f111077G = dzd0.m37450e(cap0Var3, cap0Var, x9p0Var, b7p0Var, z, n301Var);
                if (!this.f111089k.isEmpty()) {
                    return;
                }
                cap0 cap0Var4 = this.f111077G;
                x9p0 x9p0Var3 = x9p0.f259415c;
                this.f111077G = null;
                cap0Var2 = cap0Var4;
                x9p0Var2 = x9p0Var3;
            } else {
                cap0Var2 = cap0Var;
                x9p0Var2 = x9p0Var;
            }
            cap0 cap0Var5 = this.f111094p;
            b7p0 b7p0Var2 = this.f111103y;
            n301 n301Var2 = this.f111092n;
            n301Var2.getClass();
            cap0 cap0VarM37450e = dzd0.m37450e(cap0Var5, cap0Var2, x9p0Var2, b7p0Var2, z, n301Var2);
            this.f111094p = cap0VarM37450e;
            int i = cap0VarM37450e.f35895f;
            qp71 qp71Var = cap0VarM37450e.f35899j;
            e7p0 e7p0Var = cap0VarM37450e.f35894e;
            Integer numValueOf = ((i == 1 || !(cap0Var5.f35899j.m73436p() || qp71Var.m73436p())) && !(cap0Var5.f35893d.equals(cap0VarM37450e.f35893d) && cap0Var5.f35894e.equals(e7p0Var))) ? Integer.valueOf(cap0VarM37450e.f35895f) : null;
            boolean zEquals = Objects.equals(cap0Var5.m32082r(), cap0VarM37450e.m32082r());
            Integer numValueOf2 = !zEquals ? Integer.valueOf(cap0VarM37450e.f35891b) : null;
            if (zEquals && numValueOf != null && (numValueOf.intValue() == 0 || numValueOf.intValue() == 1)) {
                if (cap0Var5.f35894e.f56979b != e7p0Var.f56979b) {
                    numValueOf2 = Integer.valueOf(numValueOf.intValue() != 0 ? 2 : 1);
                } else if (cap0Var5.f35897h != 0 && numValueOf.intValue() == 0 && cap0Var5.f35893d.f56985h == -1 && e7p0Var.f56985h == -1) {
                    numValueOf2 = 0;
                }
            }
            Integer numValueOf3 = !cap0Var5.f35899j.equals(qp71Var) ? Integer.valueOf(cap0VarM37450e.f35900k) : null;
            int i2 = cap0Var5.f35912w;
            int i3 = cap0VarM37450e.f35912w;
            m52961w(cap0Var5, cap0VarM37450e, numValueOf3, (i2 == i3 && cap0Var5.f35911v == cap0VarM37450e.f35911v) ? null : Integer.valueOf(i3), numValueOf, numValueOf2);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m52963y(int i, int i2) {
        di21 di21Var = this.f111072B;
        if (di21Var.f49219a == i && di21Var.f49220b == i2) {
            return;
        }
        this.f111072B = new di21(i, i2);
        this.f111087i.m63839j(24, new uix(i, i2, 1));
    }
}
