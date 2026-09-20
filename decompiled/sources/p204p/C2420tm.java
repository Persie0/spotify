package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p.tm */
/* JADX INFO: loaded from: classes11.dex */
public final class C2420tm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221554a;

    /* JADX INFO: renamed from: b */
    public final ef10 f221555b;

    /* JADX INFO: renamed from: c */
    public final gcu0 f221556c;

    /* JADX INFO: renamed from: d */
    public final r5n0 f221557d;

    /* JADX INFO: renamed from: e */
    public final yf10 f221558e;

    /* JADX INFO: renamed from: f */
    public final jz6 f221559f;

    public /* synthetic */ C2420tm(ef10 ef10Var, gcu0 gcu0Var, r5n0 r5n0Var, yf10 yf10Var, jz6 jz6Var, int i) {
        this.f221554a = i;
        this.f221555b = ef10Var;
        this.f221556c = gcu0Var;
        this.f221557d = r5n0Var;
        this.f221558e = yf10Var;
        this.f221559f = jz6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m81081a(C2420tm c2420tm, ibk ibkVar) {
        C2219om c2219om;
        if (ibkVar instanceof C2219om) {
            c2219om = (C2219om) ibkVar;
            int i = c2219om.f166949c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2219om.f166949c = i - Integer.MIN_VALUE;
            } else {
                c2219om = new C2219om(c2420tm, ibkVar);
            }
        } else {
            c2219om = new C2219om(c2420tm, ibkVar);
        }
        Object objM81083c = c2219om.f166947a;
        int i2 = c2219om.f166949c;
        boolean z = true;
        if (i2 == 0) {
            bga.m29073P(objM81083c);
            c2219om.f166949c = 1;
            objM81083c = c2420tm.m81083c(c2219om);
            Object obj = yuk.f276404a;
            if (objM81083c == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM81083c);
        }
        nil0 nil0Var = (nil0) objM81083c;
        if (!(nil0Var instanceof lil0)) {
            if (!(nil0Var instanceof mil0)) {
                throw new NoWhenBranchMatchedException();
            }
            c2420tm.f221559f.m54840c(1, 2, ((mil0) nil0Var).f144044a);
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m81082b(C2420tm c2420tm, ibk ibkVar) {
        jf10 jf10Var;
        if (ibkVar instanceof jf10) {
            jf10Var = (jf10) ibkVar;
            int i = jf10Var.f111789c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jf10Var.f111789c = i - Integer.MIN_VALUE;
            } else {
                jf10Var = new jf10(c2420tm, ibkVar);
            }
        } else {
            jf10Var = new jf10(c2420tm, ibkVar);
        }
        Object objM81083c = jf10Var.f111787a;
        int i2 = jf10Var.f111789c;
        boolean z = true;
        if (i2 == 0) {
            bga.m29073P(objM81083c);
            jf10Var.f111789c = 1;
            objM81083c = c2420tm.m81083c(jf10Var);
            Object obj = yuk.f276404a;
            if (objM81083c == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM81083c);
        }
        nil0 nil0Var = (nil0) objM81083c;
        if (!(nil0Var instanceof lil0)) {
            if (!(nil0Var instanceof mil0)) {
                throw new NoWhenBranchMatchedException();
            }
            c2420tm.f221559f.m54840c(2, 2, ((mil0) nil0Var).f144044a);
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x011c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x012d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: c */
    public final Object m81083c(ibk ibkVar) {
        C2261pm c2261pm;
        p5n0 p5n0Var;
        kf10 kf10Var;
        p5n0 p5n0Var2;
        switch (this.f221554a) {
            case 0:
                if (ibkVar instanceof C2261pm) {
                    c2261pm = (C2261pm) ibkVar;
                    int i = c2261pm.f178844c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c2261pm.f178844c = i - Integer.MIN_VALUE;
                    } else {
                        c2261pm = new C2261pm(this, ibkVar);
                    }
                } else {
                    c2261pm = new C2261pm(this, ibkVar);
                }
                Object objM86755t = c2261pm.f178842a;
                int i2 = c2261pm.f178844c;
                yuk yukVar = yuk.f276404a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        bga.m29073P(objM86755t);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM86755t);
                    }
                    p5n0Var = (p5n0) objM86755t;
                    if (p5n0Var instanceof n5n0) {
                        return lil0.f133819a;
                    }
                    if (p5n0Var instanceof m5n0) {
                        return new mil0(3);
                    }
                    if (wj50.m88271j(p5n0Var, o5n0.f162040a)) {
                        return new mil0(6);
                    }
                    if (p5n0Var == null) {
                        return new mil0(5);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                bga.m29073P(objM86755t);
                c2261pm.f178844c = 1;
                objM86755t = vyf1.m86755t(this.f221556c.m44321c(), c2261pm);
                if (objM86755t == yukVar) {
                    return yukVar;
                }
                if (!((Boolean) objM86755t).booleanValue()) {
                    return new mil0(2);
                }
                C1819em c1819em = new C1819em(this, null, 1);
                c2261pm.f178844c = 2;
                objM86755t = s1h1.m76980u(5000L, c1819em, c2261pm);
                if (objM86755t == yukVar) {
                    return yukVar;
                }
                p5n0Var = (p5n0) objM86755t;
                if (p5n0Var instanceof n5n0) {
                    return lil0.f133819a;
                }
                if (p5n0Var instanceof m5n0) {
                    return new mil0(3);
                }
                if (wj50.m88271j(p5n0Var, o5n0.f162040a)) {
                    return new mil0(6);
                }
                if (p5n0Var == null) {
                    return new mil0(5);
                }
                throw new NoWhenBranchMatchedException();
            default:
                if (ibkVar instanceof kf10) {
                    kf10Var = (kf10) ibkVar;
                    int i3 = kf10Var.f122037c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kf10Var.f122037c = i3 - Integer.MIN_VALUE;
                    } else {
                        kf10Var = new kf10(this, ibkVar);
                    }
                } else {
                    kf10Var = new kf10(this, ibkVar);
                }
                Object objM86755t2 = kf10Var.f122035a;
                int i4 = kf10Var.f122037c;
                yuk yukVar2 = yuk.f276404a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        bga.m29073P(objM86755t2);
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM86755t2);
                    }
                    p5n0Var2 = (p5n0) objM86755t2;
                    if (p5n0Var2 instanceof m5n0) {
                        return lil0.f133819a;
                    }
                    if (p5n0Var2 instanceof n5n0) {
                        return new mil0(4);
                    }
                    if (wj50.m88271j(p5n0Var2, o5n0.f162040a)) {
                        return new mil0(6);
                    }
                    if (p5n0Var2 == null) {
                        return new mil0(5);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                bga.m29073P(objM86755t2);
                kf10Var.f122037c = 1;
                objM86755t2 = vyf1.m86755t(this.f221556c.m44321c(), kf10Var);
                if (objM86755t2 == yukVar2) {
                    return yukVar2;
                }
                if (!((Boolean) objM86755t2).booleanValue()) {
                    return new mil0(2);
                }
                joz jozVar = new joz(this, (fbk) null, 14);
                kf10Var.f122037c = 2;
                objM86755t2 = s1h1.m76980u(5000L, jozVar, kf10Var);
                if (objM86755t2 == yukVar2) {
                    return yukVar2;
                }
                p5n0Var2 = (p5n0) objM86755t2;
                if (p5n0Var2 instanceof m5n0) {
                    return lil0.f133819a;
                }
                if (p5n0Var2 instanceof n5n0) {
                    return new mil0(4);
                }
                if (wj50.m88271j(p5n0Var2, o5n0.f162040a)) {
                    return new mil0(6);
                }
                if (p5n0Var2 == null) {
                    return new mil0(5);
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
