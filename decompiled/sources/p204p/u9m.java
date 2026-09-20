package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class u9m {

    /* JADX INFO: renamed from: l */
    public static final pg41 f228223l = jg31.m53286y(0.0f, 400.0f, null, 5);

    /* JADX INFO: renamed from: m */
    public static final t9y0 f228224m = new t9y0(j3m.f108417M0, bxl.f31892P0);

    /* JADX INFO: renamed from: a */
    public final uum0 f228225a = new uum0(0.0f);

    /* JADX INFO: renamed from: b */
    public final yum0 f228226b;

    /* JADX INFO: renamed from: c */
    public final yum0 f228227c;

    /* JADX INFO: renamed from: d */
    public final yum0 f228228d;

    /* JADX INFO: renamed from: e */
    public final yum0 f228229e;

    /* JADX INFO: renamed from: f */
    public final yum0 f228230f;

    /* JADX INFO: renamed from: g */
    public final yum0 f228231g;

    /* JADX INFO: renamed from: h */
    public final yum0 f228232h;

    /* JADX INFO: renamed from: i */
    public xf11 f228233i;

    /* JADX INFO: renamed from: j */
    public int f228234j;

    /* JADX INFO: renamed from: k */
    public Float f228235k;

    public u9m(xf11 xf11Var) {
        Boolean bool = Boolean.FALSE;
        this.f228226b = sam.m77645B(bool);
        this.f228227c = sam.m77645B(0);
        this.f228228d = sam.m77645B(0);
        this.f228229e = sam.m77645B(0);
        this.f228230f = sam.m77645B(xf11Var);
        this.f228231g = sam.m77645B(bool);
        this.f228232h = sam.m77645B(null);
        this.f228233i = xf11Var;
    }

    /* JADX INFO: renamed from: e */
    public static Object m82643e(u9m u9mVar, mb61 mb61Var) throws Throwable {
        xf11 xf11Var = xf11.f260814c;
        u9mVar.m82648f(xf11Var);
        Object objM82644a = u9mVar.m82644a(u9mVar.m82650h(xf11Var), f228223l, mb61Var);
        return objM82644a == yuk.f276404a ? objM82644a : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m82644a(float f, n05 n05Var, fbk fbkVar) throws Throwable {
        s9m s9mVar;
        Throwable th;
        int i;
        if (fbkVar instanceof s9m) {
            s9mVar = (s9m) fbkVar;
            int i2 = s9mVar.f206982d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s9mVar.f206982d = i2 - Integer.MIN_VALUE;
            } else {
                s9mVar = new s9m(this, fbkVar);
            }
        } else {
            s9mVar = new s9m(this, fbkVar);
        }
        s9m s9mVar2 = s9mVar;
        Object obj = s9mVar2.f206980b;
        int i3 = s9mVar2.f206982d;
        yum0 yum0Var = this.f228226b;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = s9mVar2.f206979a;
            try {
                bga.m29073P(obj);
                if (this.f228234j == i) {
                    yum0Var.setValue(Boolean.FALSE);
                    this.f228235k = null;
                }
                return w2a1.f247311a;
            } catch (Throwable th2) {
                th = th2;
                if (this.f228234j == i) {
                    throw th;
                }
                yum0Var.setValue(Boolean.FALSE);
                this.f228235k = null;
                throw th;
            }
        }
        bga.m29073P(obj);
        int i4 = this.f228234j + 1;
        this.f228234j = i4;
        yum0Var.setValue(Boolean.TRUE);
        this.f228235k = new Float(f);
        try {
            float fM84031v = this.f228225a.m84031v();
            try {
                zuh zuhVar = new zuh(this, i4, 12);
                s9mVar2.f206979a = i4;
                s9mVar2.f206982d = 1;
                Object objM62151m = mkg1.m62151m(fM84031v, f, n05Var, zuhVar, s9mVar2, 4);
                yuk yukVar = yuk.f276404a;
                if (objM62151m == yukVar) {
                    return yukVar;
                }
                i = i4;
                if (this.f228234j == i) {
                    yum0Var.setValue(Boolean.FALSE);
                    this.f228235k = null;
                }
                return w2a1.f247311a;
            } catch (Throwable th3) {
                th = th3;
                i = i4;
                if (this.f228234j == i) {
                    throw th;
                }
                yum0Var.setValue(Boolean.FALSE);
                this.f228235k = null;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m82645b(float f) {
        uum0 uum0Var = this.f228225a;
        float fM84031v = uum0Var.m84031v();
        float fM63436m = n0e1.m63436m(f + fM84031v, 0.0f, m82650h(xf11.f260814c));
        uum0Var.m84032w(fM63436m);
        return fM63436m - fM84031v;
    }

    /* JADX INFO: renamed from: c */
    public final xf11 m82646c() {
        return (xf11) this.f228230f.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final int m82647d() {
        return ((Number) this.f228227c.getValue()).intValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m82648f(xf11 xf11Var) {
        this.f228230f.setValue(xf11Var);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Enum m82649g(float f, float f2, ibk ibkVar) throws Throwable {
        t9m t9mVar;
        if (ibkVar instanceof t9m) {
            t9mVar = (t9m) ibkVar;
            int i = t9mVar.f218332d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t9mVar.f218332d = i - Integer.MIN_VALUE;
            } else {
                t9mVar = new t9m(this, ibkVar);
            }
        } else {
            t9mVar = new t9m(this, ibkVar);
        }
        Object obj = t9mVar.f218330b;
        int i2 = t9mVar.f218332d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xf11 xf11Var = t9mVar.f218329a;
            bga.m29073P(obj);
            return xf11Var;
        }
        bga.m29073P(obj);
        float fAbs = Math.abs(f);
        xf11 xf11Var2 = xf11.f260813b;
        xf11 xf11Var3 = xf11.f260814c;
        if (fAbs < f2) {
            float fM82650h = m82650h(xf11Var2);
            xf11 xf11Var4 = xf11.f260812a;
            float fM82650h2 = m82650h(xf11Var4);
            float fM82650h3 = m82650h(xf11Var3);
            float fM84031v = this.f228225a.m84031v();
            if (fM82650h2 != fM82650h) {
                int iOrdinal = this.f228233i.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (fM84031v <= edb.m38555d(fM82650h3, fM82650h, 0.5f, fM82650h)) {
                        if (fM84031v > edb.m38555d(fM82650h2, fM82650h, 0.5f, fM82650h)) {
                            xf11Var2 = xf11Var4;
                        }
                    }
                    xf11Var2 = xf11Var3;
                } else if (fM84031v > edb.m38555d(fM82650h3, fM82650h2, 0.5f, fM82650h2)) {
                    xf11Var2 = xf11Var3;
                } else if (fM84031v >= fM82650h2 - ((fM82650h2 - fM82650h) * 0.5f)) {
                    xf11Var2 = xf11Var4;
                }
            } else if (fM84031v > edb.m38555d(fM82650h3, fM82650h, 0.5f, fM82650h)) {
                xf11Var2 = xf11Var3;
            }
        } else if (f > 0.0f) {
            xf11Var2 = xf11Var3;
        }
        m82648f(xf11Var2);
        float fM82650h4 = m82650h(xf11Var2);
        t9mVar.f218329a = xf11Var2;
        t9mVar.f218332d = 1;
        Object objM82644a = m82644a(fM82650h4, f228223l, t9mVar);
        yuk yukVar = yuk.f276404a;
        return objM82644a == yukVar ? yukVar : xf11Var2;
    }

    /* JADX INFO: renamed from: h */
    public final float m82650h(xf11 xf11Var) {
        int iOrdinal = xf11Var.ordinal();
        if (iOrdinal == 0) {
            int iM82647d = m82647d() - ((Number) this.f228228d.getValue()).intValue();
            if (iM82647d < 0) {
                iM82647d = 0;
            }
            return iM82647d;
        }
        if (iOrdinal == 1) {
            return 0.0f;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return ((Number) this.f228229e.getValue()).intValue() + m82647d();
    }
}
