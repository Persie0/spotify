package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class aw60 implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rv60 f20408a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f20409b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f20410c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f20411d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ im91 f20412e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ pg41 f20413f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ kqi0 f20414g;

    public aw60(rv60 rv60Var, float f, float f2, float f3, im91 im91Var, pg41 pg41Var, kqi0 kqi0Var) {
        this.f20408a = rv60Var;
        this.f20409b = f;
        this.f20410c = f2;
        this.f20411d = f3;
        this.f20412e = im91Var;
        this.f20413f = pg41Var;
        this.f20414g = kqi0Var;
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: P */
    public final long mo25861P(int i, long j) {
        float fM84031v;
        if (i != 1) {
            return 0L;
        }
        rv60 rv60Var = this.f20408a;
        if (!rv60Var.m76467a()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) == 0.0f) {
            return 0L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        uum0 uum0Var = rv60Var.f203005a;
        if (rv60Var.f203010f) {
            fM84031v = 0.0f;
        } else {
            float fM84031v2 = uum0Var.m84031v();
            rv60Var.m76468b(lrg1.m59811k(uum0Var.m84031v() + fIntBitsToFloat, this.f20409b));
            fM84031v = uum0Var.m84031v() - fM84031v2;
        }
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fM84031v)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) throws Throwable {
        yv60 yv60Var;
        if (fbkVar instanceof yv60) {
            yv60Var = (yv60) fbkVar;
            int i = yv60Var.f276583d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yv60Var.f276583d = i - Integer.MIN_VALUE;
            } else {
                yv60Var = new yv60(this, (ibk) fbkVar);
            }
        } else {
            yv60Var = new yv60(this, (ibk) fbkVar);
        }
        yv60 yv60Var2 = yv60Var;
        Object obj = yv60Var2.f276581b;
        int i2 = yv60Var2.f276583d;
        if (i2 == 0) {
            bga.m29073P(obj);
            rv60 rv60Var = this.f20408a;
            if (!rv60Var.m76467a() && rv60Var.f203005a.m84031v() == 0.0f) {
                return new m5b1(0L);
            }
            float fM60855e = m5b1.m60855e(j2);
            eh00 eh00Var = (eh00) this.f20414g.getValue();
            yv60Var2.f276580a = j2;
            yv60Var2.f276583d = 1;
            Object objM76469c = rv60Var.m76469c(fM60855e, this.f20410c, this.f20411d, this.f20412e, this.f20413f, eh00Var, yv60Var2);
            yuk yukVar = yuk.f276404a;
            if (objM76469c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = yv60Var2.f276580a;
            bga.m29073P(obj);
        }
        return new m5b1(j2);
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: k0 */
    public final long mo25863k0(int i, long j, long j2) {
        float fM84031v;
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == 0.0f) {
            return 0L;
        }
        rv60 rv60Var = this.f20408a;
        if (!rv60Var.m76467a() && !rv60Var.f203010f) {
            tf60 tf60Var = rv60Var.f203009e;
            if (tf60Var != null) {
                tf60Var.mo26601e(null);
            }
            rv60Var.f203009e = null;
            rv60Var.f203006b.setValue(Boolean.TRUE);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i2);
        uum0 uum0Var = rv60Var.f203005a;
        if (rv60Var.f203010f) {
            fM84031v = 0.0f;
        } else {
            float fM84031v2 = uum0Var.m84031v();
            rv60Var.m76468b(lrg1.m59811k(uum0Var.m84031v() + fIntBitsToFloat, this.f20409b));
            fM84031v = uum0Var.m84031v() - fM84031v2;
        }
        return (4294967295L & ((long) Float.floatToRawIntBits(fM84031v))) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: m0 */
    public final Object mo25864m0(long j, fbk fbkVar) throws Throwable {
        zv60 zv60Var;
        if (fbkVar instanceof zv60) {
            zv60Var = (zv60) fbkVar;
            int i = zv60Var.f286630d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zv60Var.f286630d = i - Integer.MIN_VALUE;
            } else {
                zv60Var = new zv60(this, (ibk) fbkVar);
            }
        } else {
            zv60Var = new zv60(this, (ibk) fbkVar);
        }
        zv60 zv60Var2 = zv60Var;
        Object obj = zv60Var2.f286628b;
        int i2 = zv60Var2.f286630d;
        if (i2 == 0) {
            bga.m29073P(obj);
            rv60 rv60Var = this.f20408a;
            if (!rv60Var.m76467a() && rv60Var.f203005a.m84031v() == 0.0f) {
                return new m5b1(0L);
            }
            float fM60855e = m5b1.m60855e(j);
            eh00 eh00Var = (eh00) this.f20414g.getValue();
            zv60Var2.f286627a = j;
            zv60Var2.f286630d = 1;
            Object objM76469c = rv60Var.m76469c(fM60855e, this.f20410c, this.f20411d, this.f20412e, this.f20413f, eh00Var, zv60Var2);
            yuk yukVar = yuk.f276404a;
            if (objM76469c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = zv60Var2.f286627a;
            bga.m29073P(obj);
        }
        return new m5b1(j);
    }
}
