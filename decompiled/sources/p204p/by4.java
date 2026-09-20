package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class by4 extends exh0 implements nfs, dp70 {

    /* JADX INFO: renamed from: M0 */
    public final voi0 f32058M0;

    /* JADX INFO: renamed from: N0 */
    public final gw4 f32059N0 = s95.m77551a(1.0f);

    /* JADX INFO: renamed from: O0 */
    public final gw4 f32060O0 = s95.m77551a(1.0f);

    public by4(voi0 voi0Var) {
        this.f32058M0 = voi0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (p204p.gw4.m45909c(r11.f32060O0, r2, null, null, null, r6, 14) == r10) goto L22;
     */
    /* JADX INFO: renamed from: H1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30865H1(fbk fbkVar) {
        zx4 zx4Var;
        if (fbkVar instanceof zx4) {
            zx4Var = (zx4) fbkVar;
            int i = zx4Var.f287202c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zx4Var.f287202c = i - Integer.MIN_VALUE;
            } else {
                zx4Var = new zx4(this, fbkVar);
            }
        } else {
            zx4Var = new zx4(this, fbkVar);
        }
        zx4 zx4Var2 = zx4Var;
        Object obj = zx4Var2.f287200a;
        int i2 = zx4Var2.f287202c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            Float fM74179I = qyg1.m74179I(1.0f);
            zx4Var2.f287202c = 1;
            if (gw4.m45909c(this.f32059N0, fM74179I, null, null, null, zx4Var2, 14) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
        Float fM74179I2 = qyg1.m74179I(1.0f);
        zx4Var2.f287202c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (p204p.gw4.m45909c(r10.f32060O0, r2, null, null, null, r6, 14) == r9) goto L22;
     */
    /* JADX INFO: renamed from: I1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m30866I1(fbk fbkVar) {
        ay4 ay4Var;
        if (fbkVar instanceof ay4) {
            ay4Var = (ay4) fbkVar;
            int i = ay4Var.f21093c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ay4Var.f21093c = i - Integer.MIN_VALUE;
            } else {
                ay4Var = new ay4(this, fbkVar);
            }
        } else {
            ay4Var = new ay4(this, fbkVar);
        }
        ay4 ay4Var2 = ay4Var;
        Object obj = ay4Var2.f21091a;
        int i2 = ay4Var2.f21093c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            Float fM74179I = qyg1.m74179I(0.97f);
            ay4Var2.f21093c = 1;
            if (gw4.m45909c(this.f32059N0, fM74179I, null, null, null, ay4Var2, 14) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bga.m29073P(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
        Float fM74179I2 = qyg1.m74179I(0.8f);
        ay4Var2.f21093c = 2;
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(j);
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new n62(23, t5o0VarMo39619B, this));
    }

    @Override // p204p.nfs
    /* JADX INFO: renamed from: v0 */
    public final void mo25073v0(tgj tgjVar) {
        float fFloatValue = ((Number) this.f32059N0.m45912e()).floatValue();
        long jMo294i1 = tgjVar.mo294i1();
        c06 c06VarMo291d1 = tgjVar.mo291d1();
        long jM31085B = c06VarMo291d1.m31085B();
        c06VarMo291d1.m31107v().mo25287p();
        try {
            c06VarMo291d1.m31086C().m56033p(fFloatValue, fFloatValue, jMo294i1);
            tgjVar.mo50174s1();
        } finally {
            stz0.m79358l(c06VarMo291d1, jM31085B);
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        x0h1.m89578u(m40262v1(), null, 0, new joz(this, (fbk) null, 27), 3);
    }
}
