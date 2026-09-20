package p204p;

import android.content.ClipData;
import androidx.compose.p002ui.geometry.Offset;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class d971 {

    /* JADX INFO: renamed from: a */
    public final w591 f46714a;

    /* JADX INFO: renamed from: b */
    public final fb71 f46715b;

    /* JADX INFO: renamed from: c */
    public yqq f46716c;

    /* JADX INFO: renamed from: d */
    public boolean f46717d;

    /* JADX INFO: renamed from: e */
    public final e281 f46718e;

    /* JADX INFO: renamed from: f */
    public final xuk f46719f;

    /* JADX INFO: renamed from: g */
    public final qdo0 f46720g;

    /* JADX INFO: renamed from: h */
    public qoe f46721h;

    /* JADX INFO: renamed from: i */
    public boolean f46722i;

    /* JADX INFO: renamed from: j */
    public boolean f46723j;

    /* JADX INFO: renamed from: k */
    public jc20 f46724k;

    /* JADX INFO: renamed from: m */
    public eh00 f46726m;

    /* JADX INFO: renamed from: n */
    public eh00 f46727n;

    /* JADX INFO: renamed from: s */
    public final yum0 f46732s;

    /* JADX INFO: renamed from: t */
    public final yum0 f46733t;

    /* JADX INFO: renamed from: u */
    public final yum0 f46734u;

    /* JADX INFO: renamed from: v */
    public fmd0 f46735v;

    /* JADX INFO: renamed from: w */
    public int f46736w;

    /* JADX INFO: renamed from: x */
    public m3r0 f46737x;

    /* JADX INFO: renamed from: y */
    public final rtq f46738y;

    /* JADX INFO: renamed from: z */
    public final zmn0 f46739z;

    /* JADX INFO: renamed from: l */
    public final yum0 f46725l = sam.m77645B(Boolean.TRUE);

    /* JADX INFO: renamed from: o */
    public final yum0 f46728o = sam.m77645B(new Offset(9205357640488583168L));

    /* JADX INFO: renamed from: p */
    public final yum0 f46729p = sam.m77645B(new Offset(9205357640488583168L));

    /* JADX INFO: renamed from: q */
    public final yum0 f46730q = sam.m77645B(null);

    /* JADX INFO: renamed from: r */
    public final yum0 f46731r = sam.m77645B(s871.f206595a);

    public d971(w591 w591Var, fb71 fb71Var, yqq yqqVar, boolean z, boolean z2, boolean z3, e281 e281Var, xuk xukVar, qdo0 qdo0Var, qoe qoeVar) {
        this.f46714a = w591Var;
        this.f46715b = fb71Var;
        this.f46716c = yqqVar;
        this.f46717d = z3;
        this.f46718e = e281Var;
        this.f46719f = xukVar;
        this.f46720g = qdo0Var;
        this.f46721h = qoeVar;
        this.f46722i = z;
        this.f46723j = z2;
        Boolean bool = Boolean.FALSE;
        this.f46732s = sam.m77645B(bool);
        this.f46733t = sam.m77645B(of71.f164661a);
        this.f46734u = sam.m77645B(bool);
        this.f46736w = -1;
        this.f46738y = sam.m77674m(new y29(this, 3));
        this.f46739z = new zmn0(this.f46721h, 12);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: a */
    public static final Object m35321a(d971 d971Var, o6q0 o6q0Var, ibk ibkVar) throws Throwable {
        v871 v871Var;
        qlv0 qlv0Var;
        Throwable th;
        qlv0 qlv0Var2;
        d971Var.getClass();
        if (ibkVar instanceof v871) {
            v871Var = (v871) ibkVar;
            int i = v871Var.f238427e;
            if ((i & Integer.MIN_VALUE) != 0) {
                v871Var.f238427e = i - Integer.MIN_VALUE;
            } else {
                v871Var = new v871(d971Var, ibkVar);
            }
        } else {
            v871Var = new v871(d971Var, ibkVar);
        }
        v871 v871Var2 = v871Var;
        Object obj = v871Var2.f238425c;
        int i2 = v871Var2.f238427e;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qlv0Var2 = v871Var2.f238424b;
            qlv0Var = v871Var2.f238423a;
            try {
                bga.m29073P(obj);
                m35323g(qlv0Var, qlv0Var2, d971Var);
                return w2a1.f247311a;
            } catch (Throwable th2) {
                th = th2;
                m35323g(qlv0Var, qlv0Var2, d971Var);
                throw th;
            }
        }
        bga.m29073P(obj);
        qlv0 qlv0Var3 = new qlv0();
        qlv0Var3.f189932a = 9205357640488583168L;
        qlv0 qlv0Var4 = new qlv0();
        qlv0Var4.f189932a = 9205357640488583168L;
        try {
            C2611yf c2611yf = new C2611yf(qlv0Var3, d971Var, qlv0Var4, 24);
            q871 q871Var = new q871(qlv0Var3, qlv0Var4, d971Var, 2);
            q871 q871Var2 = new q871(qlv0Var3, qlv0Var4, d971Var, 3);
            C2493vf c2493vf = new C2493vf(qlv0Var4, d971Var, qlv0Var3, 9);
            v871Var2.f238423a = qlv0Var3;
            v871Var2.f238424b = qlv0Var4;
            v871Var2.f238427e = 1;
            Object objM66765h = ods.m66765h(v871Var2, q871Var, q871Var2, c2611yf, c2493vf, o6q0Var);
            yuk yukVar = yuk.f276404a;
            if (objM66765h == yukVar) {
                return yukVar;
            }
            qlv0Var = qlv0Var3;
            qlv0Var2 = qlv0Var4;
            m35323g(qlv0Var, qlv0Var2, d971Var);
            return w2a1.f247311a;
        } catch (Throwable th3) {
            qlv0Var = qlv0Var3;
            th = th3;
            qlv0Var2 = qlv0Var4;
            m35323g(qlv0Var, qlv0Var2, d971Var);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public static final Object m35322b(final d971 d971Var, o6q0 o6q0Var, final boolean z, ibk ibkVar) throws Throwable {
        w871 w871Var;
        d971 d971Var2;
        gb20 gb20Var;
        qlv0 qlv0Var;
        qlv0 qlv0Var2;
        Throwable th;
        gb20 gb20Var2;
        qlv0 qlv0Var3;
        qlv0 qlv0Var4;
        if (ibkVar instanceof w871) {
            w871Var = (w871) ibkVar;
            int i = w871Var.f248875f;
            if ((i & Integer.MIN_VALUE) != 0) {
                w871Var.f248875f = i - Integer.MIN_VALUE;
            } else {
                w871Var = new w871(d971Var, ibkVar);
            }
        } else {
            w871Var = new w871(d971Var, ibkVar);
        }
        w871 w871Var2 = w871Var;
        Object obj = w871Var2.f248873d;
        int i2 = w871Var2.f248875f;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gb20Var2 = w871Var2.f248872c;
            qlv0Var3 = w871Var2.f248871b;
            qlv0Var4 = w871Var2.f248870a;
            try {
                bga.m29073P(obj);
                d971Var2 = d971Var;
                if (d971Var2.m35334l() == gb20Var2) {
                    m35324h(qlv0Var4, qlv0Var3, d971Var2);
                }
                return w2a1.f247311a;
            } catch (Throwable th2) {
                th = th2;
                d971Var2 = d971Var;
                if (d971Var2.m35334l() != gb20Var2) {
                    throw th;
                }
                m35324h(qlv0Var4, qlv0Var3, d971Var2);
                throw th;
            }
        }
        bga.m29073P(obj);
        final qlv0 qlv0Var5 = new qlv0();
        qlv0Var5.f189932a = 9205357640488583168L;
        final qlv0 qlv0Var6 = new qlv0();
        qlv0Var6.f189932a = 0L;
        final gb20 gb20Var3 = z ? gb20.f78174b : gb20.f78175c;
        try {
            try {
                rhe0 rhe0Var = new rhe0(gb20Var3, qlv0Var5, qlv0Var6, d971Var, z);
                q871 q871Var = new q871(qlv0Var5, d971Var, qlv0Var6, 0);
                q871 q871Var2 = new q871(qlv0Var5, d971Var, qlv0Var6, 1);
                try {
                    th00 th00Var = new th00() { // from class: p.r871
                        @Override // p204p.th00
                        public final Object invoke(Object obj2, Object obj3) {
                            int iM95500g;
                            int iM95500g2;
                            qlv0 qlv0Var7 = qlv0Var6;
                            qlv0Var7.f189932a = Offset.m257g(qlv0Var7.f189932a, ((Offset) obj3).f493a);
                            d971 d971Var3 = d971Var;
                            fb71 fb71Var = d971Var3.f46715b;
                            w591 w591Var = d971Var3.f46714a;
                            db71 db71VarM41219c = fb71Var.m41219c();
                            if (db71VarM41219c != null) {
                                z6i0 z6i0Var = db71VarM41219c.f47231b;
                                d971Var3.m35325A(gb20Var3, Offset.m257g(qlv0Var5.f189932a, qlv0Var7.f189932a));
                                boolean z2 = z;
                                if (z2) {
                                    iM95500g = z6i0Var.m95500g(d971Var3.m35336n());
                                } else {
                                    long j = w591Var.m87235g().f226936d;
                                    int i3 = ic71.f100751c;
                                    iM95500g = (int) (j >> 32);
                                }
                                int i4 = iM95500g;
                                if (z2) {
                                    long j2 = w591Var.m87235g().f226936d;
                                    int i5 = ic71.f100751c;
                                    iM95500g2 = (int) (j2 & 4294967295L);
                                } else {
                                    iM95500g2 = z6i0Var.m95500g(d971Var3.m35336n());
                                }
                                int i6 = iM95500g2;
                                long j3 = w591Var.m87235g().f226936d;
                                long jM35326B = d971Var3.m35326B(w591Var.m87235g(), i4, i6, z2, loq0.f135504M0, false, false, new mc20(9));
                                if (ic71.m50236d(j3) || !ic71.m50236d(jM35326B)) {
                                    w591Var.m87240n(jM35326B);
                                }
                            }
                            return w2a1.f247311a;
                        }
                    };
                    qlv0Var2 = qlv0Var6;
                    qlv0Var = qlv0Var5;
                    d971Var2 = d971Var;
                    gb20Var = gb20Var3;
                    try {
                        w871Var2.f248870a = qlv0Var;
                        w871Var2.f248871b = qlv0Var2;
                        w871Var2.f248872c = gb20Var;
                        w871Var2.f248875f = 1;
                        Object objM66765h = ods.m66765h(w871Var2, q871Var, q871Var2, rhe0Var, th00Var, o6q0Var);
                        yuk yukVar = yuk.f276404a;
                        if (objM66765h == yukVar) {
                            return yukVar;
                        }
                        gb20Var2 = gb20Var;
                        qlv0Var3 = qlv0Var2;
                        qlv0Var4 = qlv0Var;
                        if (d971Var2.m35334l() == gb20Var2) {
                            m35324h(qlv0Var4, qlv0Var3, d971Var2);
                        }
                        return w2a1.f247311a;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        gb20Var2 = gb20Var;
                        qlv0Var3 = qlv0Var2;
                        qlv0Var4 = qlv0Var;
                        if (d971Var2.m35334l() != gb20Var2) {
                            throw th;
                        }
                        m35324h(qlv0Var4, qlv0Var3, d971Var2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    qlv0Var2 = qlv0Var6;
                    qlv0Var = qlv0Var5;
                    d971Var2 = d971Var;
                    gb20Var = gb20Var3;
                    th = th;
                    gb20Var2 = gb20Var;
                    qlv0Var3 = qlv0Var2;
                    qlv0Var4 = qlv0Var;
                    if (d971Var2.m35334l() != gb20Var2) {
                        throw th;
                    }
                    m35324h(qlv0Var4, qlv0Var3, d971Var2);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                qlv0Var = qlv0Var5;
                qlv0Var2 = qlv0Var6;
            }
        } catch (Throwable th6) {
            th = th6;
            d971Var2 = d971Var;
            gb20Var = gb20Var3;
            qlv0Var = qlv0Var5;
            qlv0Var2 = qlv0Var6;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m35323g(qlv0 qlv0Var, qlv0 qlv0Var2, d971 d971Var) {
        if ((qlv0Var.f189932a & 9223372034707292159L) != 9205357640488583168L) {
            qlv0Var.f189932a = 9205357640488583168L;
            qlv0Var2.f189932a = 9205357640488583168L;
            d971Var.m35328d();
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m35324h(qlv0 qlv0Var, qlv0 qlv0Var2, d971 d971Var) {
        if ((qlv0Var.f189932a & 9223372034707292159L) != 9205357640488583168L) {
            d971Var.m35328d();
            qlv0Var.f189932a = 9205357640488583168L;
            qlv0Var2.f189932a = 0L;
            d971Var.f46736w = -1;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m35325A(gb20 gb20Var, long j) {
        this.f46730q.setValue(gb20Var);
        this.f46729p.setValue(new Offset(j));
    }

    /* JADX INFO: renamed from: B */
    public final long m35326B(u571 u571Var, int i, int i2, boolean z, x4t0 x4t0Var, boolean z2, boolean z3, mc20 mc20Var) {
        long jM37112n;
        jc20 jc20Var;
        long j = u571Var.f226936d;
        ic71 ic71Var = new ic71(j);
        if (z3 || (!z2 && ic71.m50236d(j))) {
            ic71Var = null;
        }
        db71 db71VarM41219c = this.f46715b.m41219c();
        if (db71VarM41219c == null) {
            jM37112n = bvg1.m30601B();
        } else if (ic71Var == null && wj50.m88271j(x4t0Var, loq0.f135517Y)) {
            jM37112n = dvg1.m37112n(i, i2);
        } else {
            fmd0 fmd0VarM47530i = hhg1.m47530i(db71VarM41219c, i, i2, this.f46736w, ic71Var != null ? ic71Var.f100752a : bvg1.m30601B(), ic71Var == null, z);
            if (ic71Var == null || fmd0VarM47530i.m42105z(this.f46735v)) {
                long jM29789b = x4t0Var.m89906b(fmd0VarM47530i).m29789b();
                this.f46735v = fmd0VarM47530i;
                if (!z) {
                    i = i2;
                }
                this.f46736w = i;
                jM37112n = jM29789b;
            } else {
                jM37112n = ic71Var.f100752a;
            }
        }
        if (mc20Var != null && ((ic71.m50239g(jM37112n) != ic71.m50239g(j) || ic71.m50238f(jM37112n) != ic71.m50238f(j)) && (jc20Var = this.f46724k) != null)) {
            ((ado0) jc20Var).m25615a(mc20Var.m61436b());
        }
        return jM37112n;
    }

    /* JADX INFO: renamed from: c */
    public final tiv0 m35327c(db71 db71Var, u571 u571Var) {
        float f;
        if (!ic71.m50236d(u571Var.f226936d)) {
            return tiv0.f220750e;
        }
        tiv0 tiv0VarM35532c = db71Var.m35532c((int) (u571Var.f226936d >> 32));
        float fFloor = (float) Math.floor(this.f46716c.mo35989Z0(a671.f12708a));
        if (fFloor < 1.0f) {
            fFloor = 1.0f;
        }
        if (db71Var.f47230a.f36040h == ko70.f124556a) {
            f = (fFloor / 2) + tiv0VarM35532c.f220751a;
        } else {
            f = tiv0VarM35532c.f220753c - (fFloor / 2);
        }
        float f2 = fFloor / 2;
        float f3 = ((int) (db71Var.f47232c >> 32)) - f2;
        if (f > f3) {
            f = f3;
        }
        if (f < f2) {
            f = f2;
        }
        float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
        return new tiv0(fFloor2 - f2, tiv0VarM35532c.f220752b, fFloor2 + f2, tiv0VarM35532c.f220754d);
    }

    /* JADX INFO: renamed from: d */
    public final void m35328d() {
        this.f46730q.setValue(null);
        this.f46729p.setValue(new Offset(9205357640488583168L));
        this.f46728o.setValue(new Offset(9205357640488583168L));
    }

    /* JADX INFO: renamed from: e */
    public final w2a1 m35329e(boolean z, mb61 mb61Var) {
        j15 j15Var;
        w591 w591Var = this.f46714a;
        if (ic71.m50236d(w591Var.m87235g().f226936d)) {
            j15Var = null;
        } else {
            j15Var = new j15(psg1.m70854z(w591Var.m87235g()).toString());
            if (z) {
                w591Var.m87229a();
            }
        }
        w2a1 w2a1Var = w2a1.f247311a;
        if (j15Var == null) {
            return w2a1Var;
        }
        ((uy3) this.f46721h).m84188a(pag1.m69490z(j15Var));
        return w2a1Var;
    }

    /* JADX INFO: renamed from: f */
    public final w2a1 m35330f(mb61 mb61Var) {
        j15 j15Var;
        w591 w591Var = this.f46714a;
        if (ic71.m50236d(w591Var.m87235g().f226936d) || !m35335m()) {
            j15Var = null;
        } else {
            j15Var = new j15(psg1.m70854z(w591Var.m87235g()).toString());
            w591Var.m87231c();
        }
        w2a1 w2a1Var = w2a1.f247311a;
        if (j15Var == null) {
            return w2a1Var;
        }
        ((uy3) this.f46721h).m84188a(pag1.m69490z(j15Var));
        return w2a1Var;
    }

    /* JADX INFO: renamed from: i */
    public final Object m35331i(o6q0 o6q0Var, mb61 mb61Var) {
        Object objM82714H1 = ((ub61) o6q0Var).m82714H1(new t24(this, null, 7), mb61Var);
        return objM82714H1 == yuk.f276404a ? objM82714H1 : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX INFO: renamed from: j */
    public final s671 m35332j(boolean z) {
        u571 u571VarM87235g = this.f46714a.m87235g();
        boolean zBooleanValue = ((Boolean) this.f46732s.getValue()).booleanValue();
        boolean z2 = true;
        boolean z3 = ((s871) this.f46731r.getValue()) == s871.f206595a;
        gb20 gb20VarM35334l = m35334l();
        if (!zBooleanValue || !z3 || !ic71.m50236d(u571VarM87235g.f226936d) || u571VarM87235g.f226938f != null || u571VarM87235g.f226935c.length() <= 0) {
            z2 = false;
        } else if (gb20VarM35334l != gb20.f78173a) {
            oa31 oa31VarM58610i = lb5.m58610i();
            gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
            oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
            try {
                long jM80931c = m35333k().m80931c();
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                jo70 jo70VarM35339q = m35339q();
                if (!(jo70VarM35339q != null ? nhg1.m64496p(jM80931c, nhg1.m64506z(jo70VarM35339q)) : false)) {
                    z2 = false;
                }
            } catch (Throwable th) {
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                throw th;
            }
        }
        if (z2) {
            return new s671(true, z ? m35333k().m80931c() : 9205357640488583168L, 0.0f, 1, false);
        }
        return s671.f206019f;
    }

    /* JADX INFO: renamed from: k */
    public final tiv0 m35333k() {
        db71 db71VarM41219c = this.f46715b.m41219c();
        return db71VarM41219c == null ? tiv0.f220750e : m35327c(db71VarM41219c, this.f46714a.m87235g());
    }

    /* JADX INFO: renamed from: l */
    public final gb20 m35334l() {
        return (gb20) this.f46730q.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final boolean m35335m() {
        return this.f46722i && !this.f46723j;
    }

    /* JADX INFO: renamed from: n */
    public final long m35336n() {
        yum0 yum0Var = this.f46729p;
        if ((((Offset) yum0Var.getValue()).f493a & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        yum0 yum0Var2 = this.f46728o;
        if ((((Offset) yum0Var2.getValue()).f493a & 9223372034707292159L) == 9205357640488583168L) {
            return lug1.m59985B(this.f46715b, ((Offset) yum0Var.getValue()).f493a);
        }
        long j = ((Offset) yum0Var.getValue()).f493a;
        long j2 = ((Offset) yum0Var2.getValue()).f493a;
        jo70 jo70VarM35339q = m35339q();
        return Offset.m257g(j, Offset.m256f(j2, jo70VarM35339q != null ? pwg1.m71289x(jo70VarM35339q) : 9205357640488583168L));
    }

    /* JADX INFO: renamed from: o */
    public final long m35337o(boolean z) {
        long j;
        db71 db71VarM41219c = this.f46715b.m41219c();
        if (db71VarM41219c == null) {
            return 0L;
        }
        long j2 = this.f46714a.m87235g().f226936d;
        if (z) {
            int i = ic71.f100751c;
            j = j2 >> 32;
        } else {
            int i2 = ic71.f100751c;
            j = 4294967295L & j2;
        }
        return svg1.m79447A(db71VarM41219c, (int) j, z, ic71.m50240h(j2));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX INFO: renamed from: p */
    public final s671 m35338p(boolean z, boolean z2) {
        boolean z3;
        gb20 gb20Var = z ? gb20.f78174b : gb20.f78175c;
        db71 db71VarM41219c = this.f46715b.m41219c();
        if (db71VarM41219c != null) {
            w591 w591Var = this.f46714a;
            long j = w591Var.m87235g().f226936d;
            if (!ic71.m50236d(j)) {
                long jM35337o = m35337o(z);
                if (((s871) this.f46731r.getValue()) != s871.f206595a) {
                    z3 = false;
                } else {
                    if (m35334l() != gb20Var) {
                        jo70 jo70VarM35339q = m35339q();
                        if (!(jo70VarM35339q != null ? nhg1.m64496p(jM35337o, nhg1.m64506z(jo70VarM35339q)) : false)) {
                            z3 = false;
                        }
                    }
                    z3 = true;
                }
                if (z3) {
                    if (w591Var.m87235g().f226938f == null) {
                        int iM35530a = db71VarM41219c.m35530a(z ? (int) (j >> 32) : Math.max(((int) (j & 4294967295L)) - 1, 0));
                        boolean zM50240h = ic71.m50240h(j);
                        if (z2) {
                            jo70 jo70VarM35339q2 = m35339q();
                            if (jo70VarM35339q2 != null) {
                                jM35337o = lug1.m60015y(jM35337o, nhg1.m64506z(jo70VarM35339q2));
                            }
                        } else {
                            jM35337o = 9205357640488583168L;
                        }
                        return new s671(true, jM35337o, iug1.m51692u(db71VarM41219c, (int) (z ? j >> 32 : j & 4294967295L)), iM35530a, zM50240h);
                    }
                }
            }
        }
        return s671.f206019f;
    }

    /* JADX INFO: renamed from: q */
    public final jo70 m35339q() {
        jo70 jo70VarM41221e = this.f46715b.m41221e();
        if (jo70VarM41221e == null || !jo70VarM41221e.mo30016a()) {
            return null;
        }
        return jo70VarM41221e;
    }

    /* JADX INFO: renamed from: r */
    public final void m35340r() {
        qdo0 qdo0Var = this.f46720g;
        if (qdo0Var != null) {
            w591 w591Var = this.f46714a;
            CharSequence charSequence = w591Var.m87235g().f226935c;
            long j = w591Var.m87235g().f226936d;
            if (charSequence.length() > 0 && !ic71.m50236d(j)) {
                x0h1.m89578u(this.f46719f, null, 4, new C2004j6(qdo0Var, charSequence, j, this, (fbk) null), 1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m35341s(ibk ibkVar) {
        z871 z871Var;
        if (ibkVar instanceof z871) {
            z871Var = (z871) ibkVar;
            int i = z871Var.f280399c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z871Var.f280399c = i - Integer.MIN_VALUE;
            } else {
                z871Var = new z871(this, ibkVar);
            }
        } else {
            z871Var = new z871(this, ibkVar);
        }
        Object obj = z871Var.f280397a;
        int i2 = z871Var.f280399c;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            eh00 eh00Var = this.f46727n;
            if (eh00Var != null) {
                ikc0.m50942n(eh00Var.invoke());
            }
            z871Var.f280399c = 1;
            if (m35342t(z871Var) == obj2) {
                return obj2;
            }
            return w2a1Var;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
            return w2a1Var;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return w2a1Var;
        }
        bga.m29073P(obj);
        gne gneVar = (gne) obj;
        if (gneVar != null) {
            gneVar.m45302b();
            throw null;
        }
        z871Var.f280399c = 3;
        if (m35342t(z871Var) == obj2) {
            return obj2;
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r7 == r5) goto L26;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m35342t(ibk ibkVar) {
        a971 a971Var;
        if (ibkVar instanceof a971) {
            a971Var = (a971) ibkVar;
            int i = a971Var.f13507c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a971Var.f13507c = i - Integer.MIN_VALUE;
            } else {
                a971Var = new a971(this, ibkVar);
            }
        } else {
            a971Var = new a971(this, ibkVar);
        }
        Object gneVar = a971Var.f13505a;
        int i2 = a971Var.f13507c;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(gneVar);
            qoe qoeVar = this.f46721h;
            a971Var.f13507c = 1;
            ClipData primaryClip = ((uy3) qoeVar).f235125a.m86703a().getPrimaryClip();
            gneVar = primaryClip != null ? new gne(primaryClip) : null;
            if (gneVar != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            bga.m29073P(gneVar);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(gneVar);
        }
        String str = (String) gneVar;
        if (str != null) {
            w591.m87227l(this.f46714a, str, false, 10);
        }
        return w2a1Var;
        gne gneVar2 = (gne) gneVar;
        if (gneVar2 != null) {
            a971Var.f13507c = 2;
            gneVar = pag1.m69489y(gneVar2);
        }
        return w2a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX INFO: renamed from: u */
    public final boolean m35343u(long j) {
        int iM95500g;
        int i;
        char c;
        long j2;
        long jM37111m;
        db71 db71VarM41219c = this.f46715b.m41219c();
        if (db71VarM41219c == null || (iM95500g = db71VarM41219c.f47231b.m95500g(j)) == -1) {
            return false;
        }
        w591 w591Var = this.f46714a;
        long jM87236h = w591Var.m87236h(iM95500g);
        long jM87238j = w591Var.m87238j(jM87236h);
        if (ic71.m50236d(jM87236h) && ic71.m50236d(jM87238j)) {
            i = 1;
        } else if (ic71.m50236d(jM87236h) || ic71.m50236d(jM87238j)) {
            i = (!ic71.m50236d(jM87236h) || ic71.m50236d(jM87238j)) ? 4 : 2;
        } else {
            i = 3;
        }
        int iM38547C = edb.m38547C(i);
        foz0 foz0Var = null;
        if (iM38547C != 0) {
            if (iM38547C != 1) {
                if (iM38547C != 2) {
                    if (iM38547C != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (dug1.m36958n(j, db71VarM41219c.m35532c((int) (jM87238j >> 32)), db71VarM41219c.m35532c((int) (jM87238j & 4294967295L))) >= 0) {
                    j2 = jM87236h & 4294967295L;
                }
                j2 = jM87236h >> 32;
            } else {
                c = ' ';
                foz0Var = dug1.m36958n(j, db71VarM41219c.m35532c((int) (jM87238j >> 32)), db71VarM41219c.m35532c((int) (jM87238j & 4294967295L))) < 0 ? new foz0(1) : new foz0(2);
            }
            jM37111m = dvg1.m37111m((int) j2);
            if (!ic71.m50235c(jM37111m, w591Var.m87234f().f226936d) && (foz0Var == null || foz0Var.equals(w591Var.m87233e()))) {
                return false;
            }
            w591Var.m87241o(jM37111m);
            if (foz0Var != null) {
                w591Var.m87242p(foz0Var);
            }
            return true;
        }
        c = ' ';
        j2 = jM87236h >> c;
        jM37111m = dvg1.m37111m((int) j2);
        if (!ic71.m50235c(jM37111m, w591Var.m87234f().f226936d)) {
        }
        w591Var.m87241o(jM37111m);
        if (foz0Var != null) {
            w591Var.m87242p(foz0Var);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m35344v(boolean z) {
        this.f46725l.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: w */
    public final void m35345w(boolean z) {
        this.f46732s.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: x */
    public final void m35346x(of71 of71Var) {
        this.f46733t.setValue(of71Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y */
    public final Object m35347y(ibk ibkVar) {
        c971 c971Var;
        if (ibkVar instanceof c971) {
            c971Var = (c971) ibkVar;
            int i = c971Var.f35417c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c971Var.f35417c = i - Integer.MIN_VALUE;
            } else {
                c971Var = new c971(this, ibkVar);
            }
        } else {
            c971Var = new c971(this, ibkVar);
        }
        Object objM56684z = c971Var.f35415a;
        int i2 = c971Var.f35417c;
        e281 e281Var = this.f46718e;
        yum0 yum0Var = this.f46733t;
        of71 of71Var = of71.f164661a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM56684z);
                gm11 gm11Var = new gm11(this, null, 23);
                c971Var.f35417c = 1;
                objM56684z = kk40.m56684z(gm11Var, c971Var);
                yuk yukVar = yuk.f276404a;
                if (objM56684z == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56684z);
            }
            m35345w(false);
            if (((of71) yum0Var.getValue()) != of71Var) {
                e281Var.m37594a();
            }
            return w2a1.f247311a;
        } catch (Throwable th) {
            m35345w(false);
            if (((of71) yum0Var.getValue()) != of71Var) {
                e281Var.m37594a();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: z */
    public final w2a1 m35348z() {
        this.f46739z.m96473H();
        return w2a1.f247311a;
    }
}
