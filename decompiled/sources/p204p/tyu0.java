package p204p;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class tyu0 {

    /* JADX INFO: renamed from: a */
    public final b141 f225043a;

    /* JADX INFO: renamed from: b */
    public final xre f225044b;

    /* JADX INFO: renamed from: c */
    public final luk f225045c;

    /* JADX INFO: renamed from: d */
    public final fus0 f225046d;

    /* JADX INFO: renamed from: g */
    public oe41 f225049g;

    /* JADX INFO: renamed from: h */
    public volatile int f225050h;

    /* JADX INFO: renamed from: i */
    public volatile long f225051i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f225052j;

    /* JADX INFO: renamed from: k */
    public volatile azu0 f225053k;

    /* JADX INFO: renamed from: m */
    public di41 f225055m;

    /* JADX INFO: renamed from: n */
    public final String f225056n;

    /* JADX INFO: renamed from: e */
    public final hb11 f225047e = j0g1.m52092t(1, 0, 0, 6);

    /* JADX INFO: renamed from: f */
    public final bqa f225048f = xtm0.m92080a(-1, 0, 6);

    /* JADX INFO: renamed from: l */
    public final lsi0 f225054l = msi0.m62770a();

    public tyu0(b141 b141Var, xre xreVar, luk lukVar, fus0 fus0Var) {
        this.f225043a = b141Var;
        this.f225044b = xreVar;
        this.f225045c = lukVar;
        this.f225046d = fus0Var;
        this.f225056n = b141Var.m27881n();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0084 -> B:19:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final void m82006a(p204p.tyu0 r11, p204p.ibk r12) {
        /*
            p.yuk r0 = p204p.yuk.f276404a
            boolean r1 = r12 instanceof p204p.syu0
            if (r1 == 0) goto L15
            r1 = r12
            p.syu0 r1 = (p204p.syu0) r1
            int r2 = r1.f215341d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f215341d = r2
            goto L1a
        L15:
            p.syu0 r1 = new p.syu0
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.f215339b
            int r2 = r1.f215341d
            r3 = 3
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r3) goto L2f
            long r6 = r1.f215338a
            p204p.bga.m29073P(r12)
            goto L51
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            long r6 = r1.f215338a
            p204p.bga.m29073P(r12)
            goto L6b
        L3d:
            long r6 = r1.f215338a
            p204p.bga.m29073P(r12)
            goto L5c
        L43:
            p204p.bga.m29073P(r12)
            p.xre r12 = r11.f225044b
            p.wy3 r12 = (p204p.wy3) r12
            r12.getClass()
            long r6 = java.lang.System.currentTimeMillis()
        L51:
            r1.f215338a = r6
            r1.f215341d = r4
            java.lang.Object r12 = r11.m82011f(r1)
            if (r12 != r0) goto L5c
            goto L86
        L5c:
            p.oe41 r12 = r11.f225049g
            if (r12 == 0) goto L6b
            r1.f215338a = r6
            r1.f215341d = r5
            java.lang.Object r12 = r11.m82008c(r12, r6, r1)
            if (r12 != r0) goto L6b
            goto L86
        L6b:
            int r12 = r11.f225050h
            if (r12 <= r5) goto L72
            r8 = 20000(0x4e20, double:9.8813E-320)
            goto L74
        L72:
            r8 = 3000(0xbb8, double:1.482E-320)
        L74:
            p.cj40 r12 = new p.cj40
            r2 = 20
            r10 = 0
            r12.<init>(r11, r10, r2)
            r1.f215338a = r6
            r1.f215341d = r3
            java.lang.Object r12 = p204p.s1h1.m76980u(r8, r12, r1)
            if (r12 != r0) goto L51
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.tyu0.m82006a(p.tyu0, p.ibk):void");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m82007b(ibk ibkVar) {
        lyu0 lyu0Var;
        if (ibkVar instanceof lyu0) {
            lyu0Var = (lyu0) ibkVar;
            int i = lyu0Var.f138118c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lyu0Var.f138118c = i - Integer.MIN_VALUE;
            } else {
                lyu0Var = new lyu0(this, ibkVar);
            }
        } else {
            lyu0Var = new lyu0(this, ibkVar);
        }
        Object objM27878k = lyu0Var.f138116a;
        yuk yukVar = yuk.f276404a;
        int i2 = lyu0Var.f138118c;
        if (i2 == 0) {
            bga.m29073P(objM27878k);
            b141 b141Var = this.f225043a;
            lyu0Var.f138118c = 1;
            objM27878k = b141Var.m27878k(lyu0Var);
            if (objM27878k == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM27878k);
        }
        kd41 kd41Var = (kd41) objM27878k;
        if (kd41Var instanceof jd41) {
            return ((jd41) kd41Var).f111235a;
        }
        if (!(kd41Var instanceof id41)) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.f225052j) {
            return null;
        }
        azu0 azu0Var = this.f225053k;
        if (azu0Var == null) {
            wj50.m88260d0("recaptchaTracker");
            throw null;
        }
        azu0Var.m27688v(((id41) kd41Var).m50274a());
        this.f225052j = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public final Object m82008c(oe41 oe41Var, long j, ibk ibkVar) {
        oyu0 oyu0Var;
        long j2;
        long jM42463g;
        azu0 azu0Var;
        w2a1 w2a1Var = w2a1.f247311a;
        if (ibkVar instanceof oyu0) {
            oyu0Var = (oyu0) ibkVar;
            int i = oyu0Var.f171905d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oyu0Var.f171905d = i - Integer.MIN_VALUE;
            } else {
                oyu0Var = new oyu0(this, ibkVar);
            }
        } else {
            oyu0Var = new oyu0(this, ibkVar);
        }
        Object objM84027u = oyu0Var.f171903b;
        yuk yukVar = yuk.f276404a;
        int i2 = oyu0Var.f171905d;
        if (i2 == 0) {
            bga.m29073P(objM84027u);
            oyu0Var.f171902a = j;
            oyu0Var.f171905d = 1;
            objM84027u = uug1.m84027u(3, new pyu0(this, oe41Var, null), oyu0Var);
            if (objM84027u != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            j = oyu0Var.f171902a;
            bga.m29073P(objM84027u);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = oyu0Var.f171902a;
            bga.m29073P(objM84027u);
        }
        if (this.f225050h <= 1) {
            jM42463g = fr0.m42463g((wy3) this.f225044b, j2);
            azu0Var = this.f225053k;
            if (azu0Var != null) {
                azu0Var.m27690x(jM42463g);
                return w2a1Var;
            }
            wj50.m88260d0("recaptchaTracker");
            throw null;
        }
        return w2a1Var;
        String str = (String) objM84027u;
        if (str != null) {
            this.f225050h++;
            ((wy3) this.f225044b).getClass();
            this.f225051i = System.currentTimeMillis();
            hb11 hb11Var = this.f225047e;
            oyu0Var.f171902a = j;
            oyu0Var.f171905d = 2;
            if (hb11Var.emit(str, oyu0Var) != yukVar) {
                j2 = j;
                if (this.f225050h <= 1) {
                    jM42463g = fr0.m42463g((wy3) this.f225044b, j2);
                    azu0Var = this.f225053k;
                    if (azu0Var != null) {
                        azu0Var.m27690x(jM42463g);
                        return w2a1Var;
                    }
                    wj50.m88260d0("recaptchaTracker");
                    throw null;
                }
            }
            return yukVar;
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: d */
    public final String m82009d(String str, String str2) throws Throwable {
        ((wy3) this.f225044b).getClass();
        if (System.currentTimeMillis() - this.f225051i > 85000) {
            azu0 azu0Var = this.f225053k;
            if (azu0Var != null) {
                azu0Var.m27684r(str, str2, false);
                return null;
            }
            wj50.m88260d0("recaptchaTracker");
            throw null;
        }
        String str3 = (String) g6f.m43745s0(this.f225047e.mo27502c());
        if (str3 != null) {
            this.f225047e.mo46963e();
            this.f225048f.mo30231j(w2a1.f247311a);
        }
        azu0 azu0Var2 = this.f225053k;
        if (azu0Var2 != null) {
            azu0Var2.m27684r(str, str2, str3 != null);
            return str3;
        }
        wj50.m88260d0("recaptchaTracker");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c1 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:30:0x008b, B:32:0x0093, B:33:0x009d, B:44:0x00bd, B:46:0x00c1, B:53:0x00e1, B:54:0x00e4), top: B:61:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002e, B:30:0x008b, B:32:0x0093, B:33:0x009d, B:44:0x00bd, B:46:0x00c1, B:53:0x00e1, B:54:0x00e4), top: B:61:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, p.yuk] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX INFO: renamed from: e */
    public final Object m82010e(long j, boolean z, ibk ibkVar) throws Throwable {
        qyu0 qyu0Var;
        long j2;
        boolean z2;
        azu0 azu0Var;
        c6x0 c6x0Var;
        azu0 azu0Var2;
        w2a1 w2a1Var = w2a1.f247311a;
        if (ibkVar instanceof qyu0) {
            qyu0Var = (qyu0) ibkVar;
            int i = qyu0Var.f194046e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qyu0Var.f194046e = i - Integer.MIN_VALUE;
            } else {
                qyu0Var = new qyu0(this, ibkVar);
            }
        } else {
            qyu0Var = new qyu0(this, ibkVar);
        }
        Object objM76978s = qyu0Var.f194044c;
        long j3 = yuk.f276404a;
        int i2 = qyu0Var.f194046e;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76978s);
                ((wy3) this.f225044b).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    ((wy3) this.f225044b).getClass();
                    if (System.currentTimeMillis() - this.f225051i > 85000) {
                        this.f225047e.mo46963e();
                        this.f225048f.mo30231j(w2a1Var);
                    }
                    myu0 myu0Var = new myu0(this, fbkVar, 1);
                    qyu0Var.f194043b = z;
                    qyu0Var.f194042a = jCurrentTimeMillis;
                    qyu0Var.f194046e = 1;
                    objM76978s = s1h1.m76978s(j, myu0Var, qyu0Var);
                    if (objM76978s == j3) {
                        return j3;
                    }
                    z2 = z;
                    j2 = jCurrentTimeMillis;
                } catch (TimeoutCancellationException e) {
                    e = e;
                    j2 = jCurrentTimeMillis;
                    azu0Var = this.f225053k;
                    if (azu0Var != null) {
                        wj50.m88260d0("recaptchaTracker");
                        throw null;
                    }
                    azu0Var.m27685s();
                    c6x0Var = new c6x0(e);
                    azu0Var2 = this.f225053k;
                    if (azu0Var2 != null) {
                        wj50.m88260d0("recaptchaTracker");
                        throw null;
                    }
                    ((wy3) this.f225044b).getClass();
                    azu0Var2.m27686t(System.currentTimeMillis() - j2);
                    return c6x0Var;
                } catch (Throwable th) {
                    th = th;
                    j3 = jCurrentTimeMillis;
                    azu0 azu0Var3 = this.f225053k;
                    if (azu0Var3 == null) {
                        wj50.m88260d0("recaptchaTracker");
                        throw null;
                    }
                    ((wy3) this.f225044b).getClass();
                    azu0Var3.m27686t(System.currentTimeMillis() - j3);
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = qyu0Var.f194042a;
                z2 = qyu0Var.f194043b;
                try {
                    bga.m29073P(objM76978s);
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                    azu0Var = this.f225053k;
                    if (azu0Var != null) {
                        wj50.m88260d0("recaptchaTracker");
                        throw null;
                    }
                    azu0Var.m27685s();
                    c6x0Var = new c6x0(e);
                    azu0Var2 = this.f225053k;
                    if (azu0Var2 != null) {
                        wj50.m88260d0("recaptchaTracker");
                        throw null;
                    }
                    ((wy3) this.f225044b).getClass();
                    azu0Var2.m27686t(System.currentTimeMillis() - j2);
                    return c6x0Var;
                }
            }
            ((s6x0) objM76978s).getClass();
            if (z2) {
                this.f225047e.mo46963e();
                this.f225048f.mo30231j(w2a1Var);
            }
            Object obj = ((s6x0) objM76978s).f206218a;
            azu0 azu0Var4 = this.f225053k;
            if (azu0Var4 == null) {
                wj50.m88260d0("recaptchaTracker");
                throw null;
            }
            ((wy3) this.f225044b).getClass();
            azu0Var4.m27686t(System.currentTimeMillis() - j2);
            return obj;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: f */
    public final Object m82011f(ibk ibkVar) {
        ryu0 ryu0Var;
        tyu0 tyu0Var;
        long j;
        w2a1 w2a1Var = w2a1.f247311a;
        if (ibkVar instanceof ryu0) {
            ryu0Var = (ryu0) ibkVar;
            int i = ryu0Var.f203972e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ryu0Var.f203972e = i - Integer.MIN_VALUE;
            } else {
                ryu0Var = new ryu0(this, ibkVar);
            }
        } else {
            ryu0Var = new ryu0(this, ibkVar);
        }
        Object objM82007b = ryu0Var.f203970c;
        yuk yukVar = yuk.f276404a;
        int i2 = ryu0Var.f203972e;
        if (i2 == 0) {
            bga.m29073P(objM82007b);
            if (this.f225049g == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                ryu0Var.f203969b = this;
                ryu0Var.f203968a = jCurrentTimeMillis;
                ryu0Var.f203972e = 1;
                objM82007b = m82007b(ryu0Var);
                if (objM82007b == yukVar) {
                    return yukVar;
                }
                tyu0Var = this;
                j = jCurrentTimeMillis;
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = ryu0Var.f203968a;
        tyu0Var = ryu0Var.f203969b;
        bga.m29073P(objM82007b);
        tyu0Var.f225049g = (oe41) objM82007b;
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        if (this.f225049g != null) {
            azu0 azu0Var = this.f225053k;
            if (azu0Var != null) {
                azu0Var.m27687u(jCurrentTimeMillis2);
                return w2a1Var;
            }
            wj50.m88260d0("recaptchaTracker");
            throw null;
        }
        return w2a1Var;
    }
}
