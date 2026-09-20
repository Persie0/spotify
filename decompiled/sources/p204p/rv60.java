package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rv60 {

    /* JADX INFO: renamed from: a */
    public final uum0 f203005a = new uum0(0.0f);

    /* JADX INFO: renamed from: b */
    public final yum0 f203006b = sam.m77645B(Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public final uum0 f203007c = new uum0(0.0f);

    /* JADX INFO: renamed from: d */
    public final gw4 f203008d = s95.m77551a(0.0f);

    /* JADX INFO: renamed from: e */
    public tf60 f203009e;

    /* JADX INFO: renamed from: f */
    public boolean f203010f;

    /* JADX INFO: renamed from: a */
    public final boolean m76467a() {
        return ((Boolean) this.f203006b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m76468b(float f) {
        this.f203005a.m84032w(f);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010b, code lost:
    
        if (p204p.gw4.m45909c(r6, r8, r4, null, r9, r22, 4) == r14) goto L70;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m76469c(float f, float f2, float f3, n05 n05Var, pg41 pg41Var, eh00 eh00Var, ibk ibkVar) throws Throwable {
        pv60 pv60Var;
        float fMax;
        eh00 eh00Var2;
        n05 n05Var2;
        pg41 pg41Var2;
        Float f4;
        qv60 qv60Var;
        eh00 eh00Var3;
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        if (ibkVar instanceof pv60) {
            pv60Var = (pv60) ibkVar;
            int i = pv60Var.f181613t;
            if ((i & Integer.MIN_VALUE) != 0) {
                pv60Var.f181613t = i - Integer.MIN_VALUE;
            } else {
                pv60Var = new pv60(this, ibkVar);
            }
        } else {
            pv60Var = new pv60(this, ibkVar);
        }
        Object obj = pv60Var.f181611h;
        int i2 = pv60Var.f181613t;
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    float f8 = pv60Var.f181607d;
                    float f9 = pv60Var.f181606c;
                    float f10 = pv60Var.f181605b;
                    float f11 = pv60Var.f181604a;
                    eh00Var2 = pv60Var.f181610g;
                    n05Var2 = pv60Var.f181608e;
                    bga.m29073P(obj);
                    f7 = f9;
                    f6 = f10;
                    fMax = f8;
                    f5 = f11;
                    f4 = new Float(fMax);
                    qv60Var = new qv60(this, 0);
                    pv60Var.f181608e = null;
                    pv60Var.f181609f = null;
                    pv60Var.f181610g = eh00Var2;
                    pv60Var.f181604a = f5;
                    pv60Var.f181605b = f6;
                    pv60Var.f181606c = f7;
                    pv60Var.f181607d = fMax;
                    pv60Var.f181613t = 2;
                    if (gw4.m45909c(this.f203008d, f4, n05Var2, null, qv60Var, pv60Var, 4) != yukVar) {
                        eh00Var3 = eh00Var2;
                    }
                    return yukVar;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        float f12 = pv60Var.f181606c;
                        f6 = pv60Var.f181605b;
                        float f13 = pv60Var.f181604a;
                        pg41 pg41Var3 = pv60Var.f181609f;
                        bga.m29073P(obj);
                        f7 = f12;
                        f5 = f13;
                        pg41Var2 = pg41Var3;
                        gw4 gw4Var = this.f203008d;
                        Float f14 = new Float(0.0f);
                        qv60 qv60Var2 = new qv60(this, 1);
                        pv60Var.f181608e = null;
                        pv60Var.f181609f = null;
                        pv60Var.f181610g = null;
                        pv60Var.f181604a = f5;
                        pv60Var.f181605b = f6;
                        pv60Var.f181606c = f7;
                        pv60Var.f181613t = 4;
                        pv60 pv60Var2 = pv60Var;
                        try {
                        } catch (Throwable th) {
                            th = th;
                            pv60Var = pv60Var2;
                            if (this.f203009e == qlg1.m73186B(pv60Var.getContext())) {
                                this.f203009e = null;
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    m76468b(0.0f);
                    if (this.f203009e == qlg1.m73186B(pv60Var.getContext())) {
                        this.f203009e = null;
                    }
                } else {
                    eh00Var3 = pv60Var.f181610g;
                    bga.m29073P(obj);
                }
                eh00Var3.invoke();
                return w2a1Var;
            }
            bga.m29073P(obj);
            if (!this.f203010f) {
                boolean zM76467a = m76467a();
                uum0 uum0Var = this.f203005a;
                if (zM76467a || uum0Var.m84031v() != 0.0f) {
                    this.f203006b.setValue(Boolean.FALSE);
                    float fM84031v = uum0Var.m84031v();
                    gw4 gw4Var2 = this.f203008d;
                    if (fM84031v > f6 || f5 > f7) {
                        this.f203010f = true;
                        tf60 tf60Var = this.f203009e;
                        if (tf60Var != null) {
                            tf60Var.mo26601e(null);
                        }
                        this.f203009e = null;
                        fMax = Math.max(this.f203007c.m84031v(), uum0Var.m84031v());
                        Float f15 = new Float(uum0Var.m84031v());
                        pv60Var.f181608e = n05Var;
                        pv60Var.f181609f = null;
                        pv60Var.f181610g = eh00Var;
                        pv60Var.f181604a = f5;
                        pv60Var.f181605b = f6;
                        pv60Var.f181606c = f7;
                        pv60Var.f181607d = fMax;
                        pv60Var.f181613t = 1;
                        if (gw4Var2.m45914g(f15, pv60Var) != yukVar) {
                            eh00Var2 = eh00Var;
                            n05Var2 = n05Var;
                            f4 = new Float(fMax);
                            qv60Var = new qv60(this, 0);
                            pv60Var.f181608e = null;
                            pv60Var.f181609f = null;
                            pv60Var.f181610g = eh00Var2;
                            pv60Var.f181604a = f5;
                            pv60Var.f181605b = f6;
                            pv60Var.f181606c = f7;
                            pv60Var.f181607d = fMax;
                            pv60Var.f181613t = 2;
                            if (gw4.m45909c(this.f203008d, f4, n05Var2, null, qv60Var, pv60Var, 4) != yukVar) {
                                eh00Var3 = eh00Var2;
                                eh00Var3.invoke();
                                return w2a1Var;
                            }
                        }
                    } else {
                        tf60 tf60Var2 = this.f203009e;
                        if (tf60Var2 != null) {
                            tf60Var2.mo26601e(null);
                        }
                        this.f203009e = qlg1.m73186B(pv60Var.getContext());
                        Float f16 = new Float(uum0Var.m84031v());
                        pv60Var.f181608e = null;
                        pg41Var2 = pg41Var;
                        pv60Var.f181609f = pg41Var2;
                        pv60Var.f181610g = null;
                        pv60Var.f181604a = f5;
                        pv60Var.f181605b = f6;
                        pv60Var.f181606c = f7;
                        pv60Var.f181613t = 3;
                        if (gw4Var2.m45914g(f16, pv60Var) != yukVar) {
                            gw4 gw4Var3 = this.f203008d;
                            Float f17 = new Float(0.0f);
                            qv60 qv60Var3 = new qv60(this, 1);
                            pv60Var.f181608e = null;
                            pv60Var.f181609f = null;
                            pv60Var.f181610g = null;
                            pv60Var.f181604a = f5;
                            pv60Var.f181605b = f6;
                            pv60Var.f181606c = f7;
                            pv60Var.f181613t = 4;
                            pv60 pv60Var3 = pv60Var;
                        }
                    }
                    return yukVar;
                }
            }
            return w2a1Var;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
