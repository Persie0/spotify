package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ua31 {

    /* JADX INFO: renamed from: a */
    public static final u9y0 f228349a = new u9y0(11);

    /* JADX INFO: renamed from: b */
    public static final ay21 f228350b = new ay21(3, (byte) 0);

    /* JADX INFO: renamed from: c */
    public static final Object f228351c = new Object();

    /* JADX INFO: renamed from: d */
    public static sa31 f228352d;

    /* JADX INFO: renamed from: e */
    public static long f228353e;

    /* JADX INFO: renamed from: f */
    public static final C2449ud f228354f;

    /* JADX INFO: renamed from: g */
    public static final ob31 f228355g;

    /* JADX INFO: renamed from: h */
    public static Object f228356h;

    /* JADX INFO: renamed from: i */
    public static Object f228357i;

    /* JADX INFO: renamed from: j */
    public static final sg10 f228358j;

    /* JADX INFO: renamed from: k */
    public static final bo6 f228359k;

    static {
        sa31 sa31Var = sa31.f207125e;
        f228352d = sa31Var;
        long j = 1;
        f228353e = j + j;
        f228354f = new C2449ud();
        f228355g = new ob31(0, false);
        lau lauVar = lau.f131415a;
        f228356h = lauVar;
        f228357i = lauVar;
        long j2 = f228353e;
        f228353e = j + j2;
        sg10 sg10Var = new sg10(j2, sa31Var, null, new C2126mg(26));
        f228352d = f228352d.m77609f(sg10Var.f163202b);
        f228358j = sg10Var;
        f228359k = new bo6(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m82665a() {
        m82669e(f228349a);
    }

    /* JADX INFO: renamed from: b */
    public static final HashMap m82666b(long j, iqi0 iqi0Var, sa31 sa31Var) {
        long[] jArr;
        sa31 sa31Var2;
        long[] jArr2;
        int i;
        int i2;
        ax41 ax41VarM82683s;
        dqi0 dqi0VarMo28830x = iqi0Var.mo28830x();
        if (dqi0VarMo28830x != null) {
            long jMo28818g = iqi0Var.mo28818g();
            sa31 sa31VarM77608e = iqi0Var.mo28815d().m77609f(jMo28818g).m77608e(iqi0Var.f104792j);
            Object[] objArr = dqi0VarMo28830x.f52019b;
            long[] jArr3 = dqi0VarMo28830x.f52018a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                vw41 vw41Var = (vw41) objArr[(i3 << 3) + i6];
                                ax41 ax41VarMo44200j = vw41Var.mo44200j();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                ax41 ax41VarM82683s2 = m82683s(ax41VarMo44200j, j, sa31Var);
                                if (ax41VarM82683s2 != null && (ax41VarM82683s = m82683s(ax41VarMo44200j, jMo28818g, sa31VarM77608e)) != null && !ax41VarM82683s2.equals(ax41VarM82683s)) {
                                    ax41 ax41VarM82683s3 = m82683s(ax41VarMo44200j, jMo28818g, iqi0Var.mo28815d());
                                    if (ax41VarM82683s3 == null) {
                                        m82682r();
                                        throw null;
                                    }
                                    ax41 ax41VarMo63800u = vw41Var.mo63800u(ax41VarM82683s, ax41VarM82683s2, ax41VarM82683s3);
                                    if (ax41VarMo63800u == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(ax41VarM82683s2, ax41VarMo63800u);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            sa31VarM77608e = sa31VarM77608e;
                        }
                        jArr = jArr3;
                        sa31Var2 = sa31VarM77608e;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        sa31Var2 = sa31VarM77608e;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    jArr3 = jArr;
                    sa31VarM77608e = sa31Var2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m82667c(oa31 oa31Var) {
        long jM82818e;
        if (f228352d.m77607d(oa31Var.mo28818g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(oa31Var.mo28818g());
        sb.append(", disposed=");
        sb.append(oa31Var.f163203c);
        sb.append(", applied=");
        iqi0 iqi0Var = oa31Var instanceof iqi0 ? (iqi0) oa31Var : null;
        sb.append(iqi0Var != null ? Boolean.valueOf(iqi0Var.f104795m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f228351c) {
            jM82818e = f228354f.m82818e(-1L);
        }
        sb.append(jM82818e);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: d */
    public static final sa31 m82668d(sa31 sa31Var, long j, long j2) {
        while (wj50.m88283v(j, j2) < 0) {
            sa31Var = sa31Var.m77609f(j);
            j += (long) 1;
        }
        return sa31Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x008f A[LOOP:1: B:30:0x0055->B:43:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0092 A[EDGE_INSN: B:58:0x0092->B:44:0x0092 BREAK  A[LOOP:1: B:30:0x0055->B:43:0x008f], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: e */
    public static final Object m82669e(gh00 gh00Var) {
        dqi0 dqi0Var;
        Object objM82685u;
        sg10 sg10Var = f228358j;
        synchronized (f228351c) {
            try {
                dqi0Var = sg10Var.f104790h;
                if (dqi0Var != null) {
                    f228359k.addAndGet(1);
                }
                objM82685u = m82685u(sg10Var, gh00Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dqi0Var != null) {
            try {
                ?? r4 = f228356h;
                tdy0 tdy0VarM62930p = mvf1.m62930p(dqi0Var);
                int size = r4.size();
                for (int i = 0; i < size; i++) {
                    ((th00) r4.get(i)).invoke(tdy0VarM62930p, sg10Var);
                }
                f228359k.addAndGet(-1);
            } catch (Throwable th2) {
                f228359k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (f228351c) {
            m82670f();
            if (dqi0Var != null) {
                Object[] objArr = dqi0Var.f52019b;
                long[] jArr = dqi0Var.f52018a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    m82681q((vw41) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                            if (i2 != length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return objM82685u;
    }

    /* JADX INFO: renamed from: f */
    public static final void m82670f() {
        ob31 ob31Var = f228355g;
        int iM66606f = ob31Var.m66606f();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iM66606f) {
                break;
            }
            zjd1 zjd1Var = ob31Var.m66607g()[i];
            Object obj = zjd1Var != null ? zjd1Var.get() : null;
            if (obj != null && m82680p((vw41) obj)) {
                if (i2 != i) {
                    ob31Var.m66607g()[i2] = zjd1Var;
                    ob31Var.m66605e()[i2] = ob31Var.m66605e()[i];
                }
                i2++;
            }
            i++;
        }
        for (int i3 = i2; i3 < iM66606f; i3++) {
            ob31Var.m66607g()[i3] = null;
            ob31Var.m66605e()[i3] = 0;
        }
        if (i2 != iM66606f) {
            ob31Var.m66608h(i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final oa31 m82671g(oa31 oa31Var, gh00 gh00Var, boolean z) {
        boolean z2 = oa31Var instanceof iqi0;
        if (z2 || oa31Var == null) {
            return new bd91(z2 ? (iqi0) oa31Var : null, gh00Var, null, false, z);
        }
        return new cd91(oa31Var, gh00Var, false, z);
    }

    /* JADX INFO: renamed from: h */
    public static final ax41 m82672h(ax41 ax41Var) {
        ax41 ax41VarM82683s;
        oa31 oa31VarM58609h = lb5.m58609h();
        ax41 ax41VarM82683s2 = m82683s(ax41Var, oa31VarM58609h.mo28818g(), oa31VarM58609h.mo28815d());
        if (ax41VarM82683s2 != null) {
            return ax41VarM82683s2;
        }
        synchronized (f228351c) {
            oa31 oa31VarM58609h2 = lb5.m58609h();
            ax41VarM82683s = m82683s(ax41Var, oa31VarM58609h2.mo28818g(), oa31VarM58609h2.mo28815d());
        }
        if (ax41VarM82683s != null) {
            return ax41VarM82683s;
        }
        m82682r();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static final ax41 m82673i(ax41 ax41Var, oa31 oa31Var) {
        ax41 ax41VarM82683s;
        ax41 ax41VarM82683s2 = m82683s(ax41Var, oa31Var.mo28818g(), oa31Var.mo28815d());
        if (ax41VarM82683s2 != null) {
            return ax41VarM82683s2;
        }
        synchronized (f228351c) {
            ax41VarM82683s = m82683s(ax41Var, oa31Var.mo28818g(), oa31Var.mo28815d());
        }
        if (ax41VarM82683s != null) {
            return ax41VarM82683s;
        }
        m82682r();
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static final oa31 m82674j() {
        oa31 oa31Var = (oa31) f228350b.m27471g();
        return oa31Var == null ? f228358j : oa31Var;
    }

    /* JADX INFO: renamed from: k */
    public static final gh00 m82675k(gh00 gh00Var, gh00 gh00Var2, boolean z) {
        if (!z) {
            gh00Var2 = null;
        }
        if (gh00Var == null || gh00Var2 == null || gh00Var == gh00Var2) {
            return gh00Var == null ? gh00Var2 : gh00Var;
        }
        return new ta31(0, gh00Var, gh00Var2);
    }

    /* JADX INFO: renamed from: l */
    public static final gh00 m82676l(gh00 gh00Var, gh00 gh00Var2) {
        if (gh00Var == null || gh00Var2 == null || gh00Var == gh00Var2) {
            return gh00Var == null ? gh00Var2 : gh00Var;
        }
        return new ta31(1, gh00Var, gh00Var2);
    }

    /* JADX INFO: renamed from: m */
    public static final ax41 m82677m(ax41 ax41Var, vw41 vw41Var) {
        long jM82818e = f228354f.m82818e(f228353e) - ((long) 1);
        ax41 ax41Var2 = null;
        ax41 ax41Var3 = null;
        for (ax41 ax41VarMo44200j = vw41Var.mo44200j(); ax41VarMo44200j != null; ax41VarMo44200j = ax41VarMo44200j.f20764b) {
            long j = ax41VarMo44200j.f20763a;
            if (j != 0) {
                if (j != 0 && wj50.m88283v(j, jM82818e) <= 0 && !sa31.f207125e.m77607d(j)) {
                    if (ax41Var3 != null) {
                        if (wj50.m88283v(ax41VarMo44200j.f20763a, ax41Var3.f20763a) >= 0) {
                            ax41Var2 = ax41Var3;
                            break;
                        }
                        break;
                    }
                    ax41Var3 = ax41VarMo44200j;
                }
            }
            ax41Var2 = ax41VarMo44200j;
            break;
        }
        if (ax41Var2 != null) {
            ax41Var2.f20763a = Long.MAX_VALUE;
            return ax41Var2;
        }
        ax41 ax41VarMo27361c = ax41Var.mo27361c(Long.MAX_VALUE);
        ax41VarMo27361c.f20764b = vw41Var.mo44200j();
        vw41Var.mo44202q(ax41VarMo27361c);
        return ax41VarMo27361c;
    }

    /* JADX INFO: renamed from: n */
    public static final void m82678n(oa31 oa31Var, vw41 vw41Var) {
        oa31Var.mo28827t(oa31Var.mo28819h() + 1);
        gh00 gh00VarMo28820i = oa31Var.mo28820i();
        if (gh00VarMo28820i != null) {
            gh00VarMo28820i.invoke(vw41Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final ax41 m82679o(ax41 ax41Var, ww41 ww41Var, oa31 oa31Var, ax41 ax41Var2) {
        ax41 ax41VarM82677m;
        if (oa31Var.mo28817f()) {
            oa31Var.mo28824n(ww41Var);
        }
        long jMo28818g = oa31Var.mo28818g();
        if (ax41Var2.f20763a == jMo28818g) {
            return ax41Var2;
        }
        synchronized (f228351c) {
            ax41VarM82677m = m82677m(ax41Var, ww41Var);
        }
        ax41VarM82677m.f20763a = jMo28818g;
        if (ax41Var2.f20763a != 1) {
            oa31Var.mo28824n(ww41Var);
        }
        return ax41VarM82677m;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m82680p(vw41 vw41Var) {
        ax41 ax41Var;
        long jM82818e = f228354f.m82818e(f228353e);
        ax41 ax41Var2 = null;
        ax41 ax41VarMo44200j = null;
        int i = 0;
        for (ax41 ax41VarMo44200j2 = vw41Var.mo44200j(); ax41VarMo44200j2 != null; ax41VarMo44200j2 = ax41VarMo44200j2.f20764b) {
            long j = ax41VarMo44200j2.f20763a;
            if (j != 0) {
                if (wj50.m88283v(j, jM82818e) >= 0) {
                    i++;
                } else if (ax41Var2 == null) {
                    i++;
                    ax41Var2 = ax41VarMo44200j2;
                } else {
                    if (wj50.m88283v(ax41VarMo44200j2.f20763a, ax41Var2.f20763a) < 0) {
                        ax41Var = ax41Var2;
                        ax41Var2 = ax41VarMo44200j2;
                    } else {
                        ax41Var = ax41VarMo44200j2;
                    }
                    if (ax41VarMo44200j == null) {
                        ax41VarMo44200j = vw41Var.mo44200j();
                        ax41 ax41Var3 = ax41VarMo44200j;
                        while (true) {
                            if (ax41VarMo44200j == null) {
                                ax41VarMo44200j = ax41Var3;
                                break;
                            }
                            if (wj50.m88283v(ax41VarMo44200j.f20763a, jM82818e) >= 0) {
                                break;
                            }
                            if (wj50.m88283v(ax41Var3.f20763a, ax41VarMo44200j.f20763a) < 0) {
                                ax41Var3 = ax41VarMo44200j;
                            }
                            ax41VarMo44200j = ax41VarMo44200j.f20764b;
                        }
                    }
                    ax41Var2.f20763a = 0L;
                    ax41Var2.mo27359a(ax41VarMo44200j);
                    ax41Var2 = ax41Var;
                }
            }
        }
        return i > 1;
    }

    /* JADX INFO: renamed from: q */
    public static final void m82681q(vw41 vw41Var) {
        if (m82680p(vw41Var)) {
            f228355g.m66603c(vw41Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m82682r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: renamed from: s */
    public static final ax41 m82683s(ax41 ax41Var, long j, sa31 sa31Var) {
        ax41 ax41Var2 = null;
        while (ax41Var != null) {
            long j2 = ax41Var.f20763a;
            if (j2 != 0 && wj50.m88283v(j2, j) <= 0 && !sa31Var.m77607d(j2) && (ax41Var2 == null || wj50.m88283v(ax41Var2.f20763a, ax41Var.f20763a) < 0)) {
                ax41Var2 = ax41Var;
            }
            ax41Var = ax41Var.f20764b;
        }
        if (ax41Var2 != null) {
            return ax41Var2;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final ax41 m82684t(ax41 ax41Var, vw41 vw41Var) {
        ax41 ax41VarM82683s;
        oa31 oa31VarM58609h = lb5.m58609h();
        gh00 gh00VarMo28816e = oa31VarM58609h.mo28816e();
        if (gh00VarMo28816e != null) {
            gh00VarMo28816e.invoke(vw41Var);
        }
        ax41 ax41VarM82683s2 = m82683s(ax41Var, oa31VarM58609h.mo28818g(), oa31VarM58609h.mo28815d());
        if (ax41VarM82683s2 != null) {
            return ax41VarM82683s2;
        }
        synchronized (f228351c) {
            oa31 oa31VarM58609h2 = lb5.m58609h();
            ax41VarM82683s = m82683s(vw41Var.mo44200j(), oa31VarM58609h2.mo28818g(), oa31VarM58609h2.mo28815d());
            if (ax41VarM82683s == null) {
                m82682r();
                throw null;
            }
        }
        return ax41VarM82683s;
    }

    /* JADX INFO: renamed from: u */
    public static final Object m82685u(sg10 sg10Var, gh00 gh00Var) {
        long j = sg10Var.f163202b;
        Object objInvoke = gh00Var.invoke(f228352d.m77606b(j));
        long j2 = f228353e;
        f228353e = ((long) 1) + j2;
        sa31 sa31VarM77606b = f228352d.m77606b(j);
        f228352d = sa31VarM77606b;
        sg10Var.f163202b = j2;
        sg10Var.f163201a = sa31VarM77606b;
        sg10Var.f104789g = 0;
        sg10Var.f104790h = null;
        sg10Var.m66516o();
        f228352d = f228352d.m77609f(j2);
        return objInvoke;
    }

    /* JADX INFO: renamed from: v */
    public static final ax41 m82686v(ax41 ax41Var, vw41 vw41Var, oa31 oa31Var) {
        ax41 ax41VarM82683s;
        if (oa31Var.mo28817f()) {
            oa31Var.mo28824n(vw41Var);
        }
        long jMo28818g = oa31Var.mo28818g();
        ax41 ax41VarM82683s2 = m82683s(ax41Var, jMo28818g, oa31Var.mo28815d());
        if (ax41VarM82683s2 == null) {
            m82682r();
            throw null;
        }
        if (ax41VarM82683s2.f20763a == oa31Var.mo28818g()) {
            return ax41VarM82683s2;
        }
        synchronized (f228351c) {
            ax41VarM82683s = m82683s(vw41Var.mo44200j(), jMo28818g, oa31Var.mo28815d());
            if (ax41VarM82683s == null) {
                m82682r();
                throw null;
            }
            if (ax41VarM82683s.f20763a != jMo28818g) {
                ax41 ax41VarM82677m = m82677m(ax41VarM82683s, vw41Var);
                ax41VarM82677m.mo27359a(ax41VarM82683s);
                ax41VarM82677m.f20763a = oa31Var.mo28818g();
                ax41VarM82683s = ax41VarM82677m;
            }
        }
        if (ax41VarM82683s2.f20763a != 1) {
            oa31Var.mo28824n(vw41Var);
        }
        return ax41VarM82683s;
    }
}
