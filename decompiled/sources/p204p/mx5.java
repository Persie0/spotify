package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mx5 implements f7p0 {

    /* JADX INFO: renamed from: a */
    public final u190 f147955a;

    /* JADX INFO: renamed from: b */
    public final u190 f147956b;

    /* JADX INFO: renamed from: c */
    public final gcu0 f147957c;

    /* JADX INFO: renamed from: d */
    public final fiz f147958d;

    /* JADX INFO: renamed from: e */
    public final fiz f147959e;

    /* JADX INFO: renamed from: f */
    public final fiz f147960f;

    public mx5(u190 u190Var, u190 u190Var2, gcu0 gcu0Var) {
        this.f147955a = u190Var;
        this.f147956b = u190Var2;
        this.f147957c = gcu0Var;
        int i = 3;
        fbk fbkVar = null;
        this.f147958d = mvl0.m62953p(new zux(new pv4(u190Var.m82196b(), 2), new pv4(u190Var2.m82196b(), 3), new p82(i, 2, fbkVar), 1));
        this.f147959e = mvl0.m62953p(new zux(u190Var.m82196b(), u190Var2.m82196b(), new C2278q2(i, 9, fbkVar), 1));
        int i2 = 5;
        this.f147960f = mvl0.m62953p(g0g1.m43301f(new pv4(u190Var.m82196b(), 4), new pv4(u190Var2.m82196b(), i2), u190Var.f225727h, u190Var2.f225727h, new lx5(i2, 0, fbkVar)));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b A[PHI: r1 r12 r13
      0x009b: PHI (r1v7 boolean) = (r1v5 boolean), (r1v8 boolean) binds: [B:29:0x0099, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r12v6 p.d850) = (r12v2 p.d850), (r12v9 p.d850) binds: [B:29:0x0099, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r13v14 boolean) = (r13v11 boolean), (r13v19 boolean) binds: [B:29:0x0099, B:39:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.f7p0
    /* JADX INFO: renamed from: a */
    public final Object mo40981a(d850 d850Var, fbk fbkVar) {
        kx5 kx5Var;
        boolean z;
        boolean zBooleanValue;
        Object objM86755t;
        d850 d850Var2;
        boolean z2;
        Object objM82200f;
        if (fbkVar instanceof kx5) {
            kx5Var = (kx5) fbkVar;
            int i = kx5Var.f127334f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kx5Var.f127334f = i - Integer.MIN_VALUE;
            } else {
                kx5Var = new kx5(this, (ibk) fbkVar);
            }
        } else {
            kx5Var = new kx5(this, (ibk) fbkVar);
        }
        Object objM86755t2 = kx5Var.f127332d;
        int i2 = kx5Var.f127334f;
        u190 u190Var = this.f147956b;
        u190 u190Var2 = this.f147955a;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM86755t2);
            pv4 pv4Var = new pv4(u190Var2.m82196b(), 6);
            kx5Var.f127329a = d850Var;
            kx5Var.f127334f = 1;
            objM86755t2 = vyf1.m86755t(pv4Var, kx5Var);
            if (objM86755t2 != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            d850Var = kx5Var.f127329a;
            bga.m29073P(objM86755t2);
        } else {
            if (i2 == 2) {
                boolean z3 = kx5Var.f127330b;
                d850 d850Var3 = kx5Var.f127329a;
                bga.m29073P(objM86755t2);
                z = z3;
                d850Var = d850Var3;
                zBooleanValue = ((Boolean) objM86755t2).booleanValue();
                if (z) {
                    if (zBooleanValue) {
                        fiz fizVarM44321c = this.f147957c.m44321c();
                        kx5Var.f127329a = d850Var;
                        kx5Var.f127330b = z;
                        kx5Var.f127331c = zBooleanValue;
                        kx5Var.f127334f = 3;
                        objM86755t = vyf1.m86755t(fizVarM44321c, kx5Var);
                        if (objM86755t != yukVar) {
                            d850Var2 = d850Var;
                            z2 = zBooleanValue;
                            objM86755t2 = objM86755t;
                        }
                    }
                    return yukVar;
                }
                u190Var = u190Var2;
                kx5Var.f127329a = null;
                kx5Var.f127330b = z;
                kx5Var.f127331c = zBooleanValue;
                kx5Var.f127334f = 4;
                objM82200f = u190Var.m82200f(d850Var, kx5Var);
                if (objM82200f != yukVar) {
                    return yukVar;
                }
                return objM82200f;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86755t2);
                return objM86755t2;
            }
            z2 = kx5Var.f127331c;
            z = kx5Var.f127330b;
            d850Var2 = kx5Var.f127329a;
            bga.m29073P(objM86755t2);
        }
        if (((Boolean) objM86755t2).booleanValue()) {
            zBooleanValue = z2;
            d850Var = d850Var2;
            u190Var = u190Var2;
        } else {
            zBooleanValue = z2;
            d850Var = d850Var2;
        }
        kx5Var.f127329a = null;
        kx5Var.f127330b = z;
        kx5Var.f127331c = zBooleanValue;
        kx5Var.f127334f = 4;
        objM82200f = u190Var.m82200f(d850Var, kx5Var);
        if (objM82200f != yukVar) {
            return yukVar;
        }
        return objM82200f;
        boolean zBooleanValue2 = ((Boolean) objM86755t2).booleanValue();
        pv4 pv4Var2 = new pv4(u190Var.m82196b(), 7);
        kx5Var.f127329a = d850Var;
        kx5Var.f127330b = zBooleanValue2;
        kx5Var.f127334f = 2;
        Object objM86755t3 = vyf1.m86755t(pv4Var2, kx5Var);
        if (objM86755t3 != yukVar) {
            z = zBooleanValue2;
            objM86755t2 = objM86755t3;
            zBooleanValue = ((Boolean) objM86755t2).booleanValue();
            if (z) {
                u190Var = u190Var2;
            } else if (zBooleanValue) {
                fiz fizVarM44321c2 = this.f147957c.m44321c();
                kx5Var.f127329a = d850Var;
                kx5Var.f127330b = z;
                kx5Var.f127331c = zBooleanValue;
                kx5Var.f127334f = 3;
                objM86755t = vyf1.m86755t(fizVarM44321c2, kx5Var);
                if (objM86755t != yukVar) {
                    d850Var2 = d850Var;
                    z2 = zBooleanValue;
                    objM86755t2 = objM86755t;
                    if (((Boolean) objM86755t2).booleanValue()) {
                        zBooleanValue = z2;
                        d850Var = d850Var2;
                        u190Var = u190Var2;
                    } else {
                        zBooleanValue = z2;
                        d850Var = d850Var2;
                    }
                }
            }
            kx5Var.f127329a = null;
            kx5Var.f127330b = z;
            kx5Var.f127331c = zBooleanValue;
            kx5Var.f127334f = 4;
            objM82200f = u190Var.m82200f(d850Var, kx5Var);
            if (objM82200f != yukVar) {
                return objM82200f;
            }
        }
        return yukVar;
    }

    @Override // p204p.f7p0
    /* JADX INFO: renamed from: b */
    public final fiz mo40982b() {
        return this.f147960f;
    }

    @Override // p204p.f7p0
    /* JADX INFO: renamed from: i */
    public final fiz mo40983i() {
        return this.f147959e;
    }

    @Override // p204p.f7p0
    public final fiz isActive() {
        return this.f147958d;
    }
}
