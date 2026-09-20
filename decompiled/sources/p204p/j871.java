package p204p;

import android.content.ClipDescription;
import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final class j871 {

    /* JADX INFO: renamed from: A */
    public boolean f109835A;

    /* JADX INFO: renamed from: a */
    public final m1a1 f109836a;

    /* JADX INFO: renamed from: d */
    public n480 f109839d;

    /* JADX INFO: renamed from: f */
    public eh00 f109841f;

    /* JADX INFO: renamed from: g */
    public qoe f109842g;

    /* JADX INFO: renamed from: h */
    public xuk f109843h;

    /* JADX INFO: renamed from: i */
    public qdo0 f109844i;

    /* JADX INFO: renamed from: j */
    public jc20 f109845j;

    /* JADX INFO: renamed from: k */
    public aqz f109846k;

    /* JADX INFO: renamed from: l */
    public final yum0 f109847l;

    /* JADX INFO: renamed from: m */
    public final yum0 f109848m;

    /* JADX INFO: renamed from: n */
    public long f109849n;

    /* JADX INFO: renamed from: o */
    public ic71 f109850o;

    /* JADX INFO: renamed from: p */
    public long f109851p;

    /* JADX INFO: renamed from: q */
    public final yum0 f109852q;

    /* JADX INFO: renamed from: r */
    public final yum0 f109853r;

    /* JADX INFO: renamed from: s */
    public int f109854s;

    /* JADX INFO: renamed from: t */
    public o971 f109855t;

    /* JADX INFO: renamed from: u */
    public fmd0 f109856u;

    /* JADX INFO: renamed from: v */
    public ic71 f109857v;

    /* JADX INFO: renamed from: w */
    public final yum0 f109858w;

    /* JADX INFO: renamed from: x */
    public final e281 f109859x;

    /* JADX INFO: renamed from: y */
    public final h871 f109860y;

    /* JADX INFO: renamed from: z */
    public final fmd0 f109861z;

    /* JADX INFO: renamed from: b */
    public g4l0 f109837b = ceg1.f37123a;

    /* JADX INFO: renamed from: c */
    public gh00 f109838c = new f150(14);

    /* JADX INFO: renamed from: e */
    public final yum0 f109840e = sam.m77645B(new o971(0, 7, (String) null));

    public j871(m1a1 m1a1Var) {
        this.f109836a = m1a1Var;
        Boolean bool = Boolean.TRUE;
        this.f109847l = sam.m77645B(bool);
        this.f109848m = sam.m77645B(bool);
        this.f109849n = 0L;
        this.f109851p = 0L;
        this.f109852q = sam.m77645B(null);
        this.f109853r = sam.m77645B(null);
        this.f109854s = -1;
        this.f109855t = new o971(0L, 7, (String) null);
        this.f109858w = sam.m77645B(Boolean.FALSE);
        this.f109859x = new e281();
        this.f109860y = new h871(this);
        this.f109861z = new fmd0(this);
    }

    /* JADX INFO: renamed from: a */
    public static final pqm0 m52677a(j871 j871Var) {
        String str;
        ic71 ic71Var;
        j15 j15VarM52689m = j871Var.m52689m();
        if (j15VarM52689m == null || (str = j15VarM52689m.f107641b) == null || (ic71Var = j871Var.f109857v) == null) {
            return null;
        }
        long j = ic71Var.f100752a;
        return new pqm0(str, new ic71(dvg1.m37112n(j871Var.f109837b.mo43539l((int) (j >> 32)), j871Var.f109837b.mo43539l((int) (j & 4294967295L)))));
    }

    /* JADX INFO: renamed from: b */
    public static final void m52678b(j871 j871Var, ic71 ic71Var) {
        j15 j15VarM52689m;
        String str;
        xuk xukVar;
        if (ic71Var == null) {
            return;
        }
        long j = ic71Var.f100752a;
        qdo0 qdo0Var = j871Var.f109844i;
        if (qdo0Var == null || (j15VarM52689m = j871Var.m52689m()) == null || (str = j15VarM52689m.f107641b) == null) {
            return;
        }
        g4l0 g4l0Var = j871Var.f109837b;
        long jM37112n = dvg1.m37112n(g4l0Var.mo43539l((int) (j >> 32)), g4l0Var.mo43539l((int) (j & 4294967295L)));
        if (str.length() <= 0 || ic71.m50236d(jM37112n) || (xukVar = j871Var.f109843h) == null) {
            return;
        }
        x0h1.m89578u(xukVar, null, 0, new q43(qdo0Var, str, jM37112n, ic71Var, j871Var, g4l0Var, (fbk) null), 3);
    }

    /* JADX INFO: renamed from: c */
    public static final long m52679c(j871 j871Var, o971 o971Var, long j, boolean z, boolean z2, x4t0 x4t0Var, boolean z3, mc20 mc20Var) {
        eb71 eb71VarM63660d;
        char c;
        jc20 jc20Var;
        n480 n480Var = j871Var.f109839d;
        if (n480Var == null || (eb71VarM63660d = n480Var.m63660d()) == null) {
            return ic71.f100750b;
        }
        g4l0 g4l0Var = j871Var.f109837b;
        long j2 = o971Var.f162954b;
        j15 j15Var = o971Var.f162953a;
        int i = ic71.f100751c;
        long jM37112n = dvg1.m37112n(g4l0Var.mo43539l((int) (j2 >> 32)), j871Var.f109837b.mo43539l((int) (j2 & 4294967295L)));
        boolean z4 = false;
        int iM38356b = eb71VarM63660d.m38356b(j, false);
        int i2 = (z2 || z) ? iM38356b : (int) (jM37112n >> 32);
        int i3 = (!z2 || z) ? iM38356b : (int) (jM37112n & 4294967295L);
        fmd0 fmd0Var = j871Var.f109856u;
        int i4 = -1;
        if (z || fmd0Var == null) {
            c = ' ';
        } else {
            c = ' ';
            int i5 = j871Var.f109854s;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        fmd0 fmd0VarM47530i = hhg1.m47530i(eb71VarM63660d.f57846a, i2, i3, i4, jM37112n, z, z2);
        if (fmd0VarM47530i.m42105z(fmd0Var)) {
            j871Var.f109856u = fmd0VarM47530i;
            j871Var.f109854s = iM38356b;
            blz0 blz0VarM89906b = x4t0Var.m89906b(fmd0VarM47530i);
            long jM37112n2 = dvg1.m37112n(j871Var.f109837b.mo43538h(blz0VarM89906b.f28309a.f283872b), j871Var.f109837b.mo43538h(blz0VarM89906b.f28310b.f283872b));
            if (!ic71.m50235c(jM37112n2, j2)) {
                boolean z5 = ic71.m50240h(jM37112n2) != ic71.m50240h(j2) && ic71.m50235c(dvg1.m37112n((int) (4294967295L & jM37112n2), (int) (jM37112n2 >> c)), j2);
                boolean z6 = ic71.m50236d(jM37112n2) && ic71.m50236d(j2);
                if (z3 && j15Var.f107641b.length() > 0 && !z5 && !z6 && mc20Var != null && (jc20Var = j871Var.f109845j) != null) {
                    ((ado0) jc20Var).m25615a(mc20Var.f142017a);
                }
                j871Var.f109838c.invoke(m52680e(j15Var, jM37112n2));
                j871Var.f109857v = new ic71(jM37112n2);
                if (!z3) {
                    j871Var.m52696t(!ic71.m50236d(jM37112n2));
                }
                n480 n480Var2 = j871Var.f109839d;
                if (n480Var2 != null) {
                    n480Var2.f150248q.setValue(Boolean.valueOf(z3));
                }
                n480 n480Var3 = j871Var.f109839d;
                if (n480Var3 != null) {
                    n480Var3.f150244m.setValue(Boolean.valueOf(!ic71.m50236d(jM37112n2) && ttg1.m81518m(j871Var, true)));
                }
                n480 n480Var4 = j871Var.f109839d;
                if (n480Var4 != null) {
                    n480Var4.f150245n.setValue(Boolean.valueOf(!ic71.m50236d(jM37112n2) && ttg1.m81518m(j871Var, false)));
                }
                n480 n480Var5 = j871Var.f109839d;
                if (n480Var5 != null) {
                    if (ic71.m50236d(jM37112n2) && ttg1.m81518m(j871Var, true)) {
                        z4 = true;
                    }
                    n480Var5.f150246o.setValue(Boolean.valueOf(z4));
                }
                return jM37112n2;
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: e */
    public static o971 m52680e(j15 j15Var, long j) {
        return new o971(j15Var, j, (ic71) null);
    }

    /* JADX INFO: renamed from: d */
    public final di41 m52681d(boolean z) {
        xuk xukVar = this.f109843h;
        fbk fbkVar = null;
        if (xukVar != null) {
            return x0h1.m89578u(xukVar, null, 4, new go3(this, z, fbkVar, 17), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m52682f() {
        xuk xukVar = this.f109843h;
        if (xukVar != null) {
            x0h1.m89578u(xukVar, null, 4, new f871(this, null, 0), 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m52683g(Offset offset) {
        if (!ic71.m50236d(m52690n().f162954b)) {
            n480 n480Var = this.f109839d;
            eb71 eb71VarM63660d = n480Var != null ? n480Var.m63660d() : null;
            int iM50238f = (offset == null || eb71VarM63660d == null) ? ic71.m50238f(m52690n().f162954b) : this.f109837b.mo43538h(eb71VarM63660d.m38356b(offset.f493a, true));
            o971 o971VarM66454b = o971.m66454b(m52690n(), null, dvg1.m37112n(iM50238f, iM50238f), 5);
            this.f109838c.invoke(o971VarM66454b);
            this.f109857v = new ic71(o971VarM66454b.f162954b);
        }
        m52693q((offset == null || m52690n().f162953a.f107641b.length() <= 0) ? pb20.f175694a : pb20.f175696c);
        m52696t(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m52684h(boolean z) {
        aqz aqzVar;
        n480 n480Var = this.f109839d;
        if (n480Var != null && !n480Var.m63658b() && (aqzVar = this.f109846k) != null) {
            aqz.m26907b(aqzVar);
        }
        this.f109855t = m52690n();
        m52696t(z);
        m52693q(pb20.f175695b);
    }

    /* JADX INFO: renamed from: i */
    public final Offset m52685i() {
        return (Offset) this.f109853r.getValue();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m52686j() {
        return ((Boolean) this.f109847l.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m52687k() {
        return ((Boolean) this.f109848m.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final long m52688l(boolean z) {
        eb71 eb71VarM63660d;
        long j;
        n480 n480Var = this.f109839d;
        if (n480Var == null || (eb71VarM63660d = n480Var.m63660d()) == null) {
            return 9205357640488583168L;
        }
        db71 db71Var = eb71VarM63660d.f57846a;
        j15 j15VarM52689m = m52689m();
        if (j15VarM52689m == null) {
            return 9205357640488583168L;
        }
        if (!wj50.m88271j(j15VarM52689m.f107641b, db71Var.f47230a.f36033a.f107641b)) {
            return 9205357640488583168L;
        }
        o971 o971VarM52690n = m52690n();
        if (z) {
            long j2 = o971VarM52690n.f162954b;
            int i = ic71.f100751c;
            j = j2 >> 32;
        } else {
            long j3 = o971VarM52690n.f162954b;
            int i2 = ic71.f100751c;
            j = j3 & 4294967295L;
        }
        return svg1.m79447A(db71Var, this.f109837b.mo43539l((int) j), z, ic71.m50240h(m52690n().f162954b));
    }

    /* JADX INFO: renamed from: m */
    public final j15 m52689m() {
        j571 j571Var;
        n480 n480Var = this.f109839d;
        if (n480Var == null || (j571Var = n480Var.f150232a) == null) {
            return null;
        }
        return j571Var.f108896a;
    }

    /* JADX INFO: renamed from: n */
    public final o971 m52690n() {
        return (o971) this.f109840e.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final void m52691o() {
        this.f109859x.m37594a();
    }

    /* JADX INFO: renamed from: p */
    public final void m52692p() {
        xuk xukVar = this.f109843h;
        if (xukVar != null) {
            x0h1.m89578u(xukVar, null, 4, new f871(this, null, 1), 1);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m52693q(pb20 pb20Var) {
        n480 n480Var = this.f109839d;
        if (n480Var != null) {
            if (n480Var.m63657a() == pb20Var) {
                n480Var = null;
            }
            if (n480Var != null) {
                n480Var.f150242k.setValue(pb20Var);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m52694r() {
        n480 n480Var;
        oa31 oa31VarM58610i = lb5.m58610i();
        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
        try {
            if (!m52687k() || ((n480Var = this.f109839d) != null && !((Boolean) n480Var.f150248q.getValue()).booleanValue())) {
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            } else {
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                this.f109859x.m37595b();
            }
        } catch (Throwable th) {
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m52695s(ibk ibkVar) {
        i871 i871Var;
        j871 j871Var;
        if (ibkVar instanceof i871) {
            i871Var = (i871) ibkVar;
            int i = i871Var.f99730d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i871Var.f99730d = i - Integer.MIN_VALUE;
            } else {
                i871Var = new i871(this, ibkVar);
            }
        } else {
            i871Var = new i871(this, ibkVar);
        }
        Object objValueOf = i871Var.f99728b;
        int i2 = i871Var.f99730d;
        if (i2 == 0) {
            bga.m29073P(objValueOf);
            qoe qoeVar = this.f109842g;
            if (qoeVar != null) {
                i871Var.f99727a = this;
                i871Var.f99730d = 1;
                ClipDescription primaryClipDescription = ((uy3) qoeVar).f235125a.m86703a().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                Object obj = yuk.f276404a;
                if (objValueOf == obj) {
                    return obj;
                }
                j871Var = this;
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j871Var = i871Var.f99727a;
        bga.m29073P(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        j871Var.f109858w.setValue(bool);
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: t */
    public final void m52696t(boolean z) {
        n480 n480Var = this.f109839d;
        if (n480Var != null) {
            n480Var.f150243l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            m52694r();
        } else {
            m52691o();
        }
    }
}
