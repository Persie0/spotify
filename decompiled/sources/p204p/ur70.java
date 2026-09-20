package p204p;

import androidx.compose.p002ui.geometry.Size;

/* JADX INFO: loaded from: classes10.dex */
public final class ur70 {

    /* JADX INFO: renamed from: a */
    public final float f233250a;

    /* JADX INFO: renamed from: b */
    public final float f233251b;

    /* JADX INFO: renamed from: c */
    public final yum0 f233252c;

    /* JADX INFO: renamed from: d */
    public final rtq f233253d = sam.m77674m(new ag70(this, 8));

    /* JADX INFO: renamed from: e */
    public final bri0 f233254e = new bri0();

    /* JADX INFO: renamed from: f */
    public final yum0 f233255f = sam.m77645B(Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public gw4 f233256g = s95.m77551a(0.0f);

    /* JADX INFO: renamed from: h */
    public gw4 f233257h = s95.m77551a(0.0f);

    /* JADX INFO: renamed from: i */
    public ko70 f233258i = ko70.f124556a;

    /* JADX INFO: renamed from: j */
    public final yum0 f233259j = sam.m77645B(new Size(0));

    /* JADX INFO: renamed from: k */
    public final uum0 f233260k = new uum0(1.0f);

    public ur70(int i, float f, float f2) {
        this.f233250a = f;
        this.f233251b = f2;
        this.f233252c = sam.m77645B(new fqz(i));
    }

    /* JADX INFO: renamed from: j */
    public static tiv0 m83835j(tiv0 tiv0Var, long j, float f) {
        float f2 = tiv0Var.f220751a;
        float f3 = tiv0Var.f220752b;
        float fIntBitsToFloat = tiv0Var.f220753c - (Float.intBitsToFloat((int) (j >> 32)) / f);
        float fIntBitsToFloat2 = tiv0Var.f220754d - (Float.intBitsToFloat((int) (j & 4294967295L)) / f);
        float f4 = f2 > fIntBitsToFloat ? fIntBitsToFloat : f2;
        float f5 = f3 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f3;
        if (fIntBitsToFloat >= f2) {
            f2 = fIntBitsToFloat;
        }
        if (fIntBitsToFloat2 >= f3) {
            f3 = fIntBitsToFloat2;
        }
        return new tiv0(f4, f5, f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public final long m83836a(int i, z9f z9fVar) {
        tiv0 tiv0Var = (tiv0) z9fVar.f280763c.get(i);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m83838c() >> 32));
        uum0 uum0Var = this.f233260k;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(((fIntBitsToFloat / uum0Var.m84031v()) - 0.0f) - 0.0f)) << 32) | (((long) Float.floatToRawIntBits(((Float.intBitsToFloat((int) (m83838c() & 4294967295L)) / uum0Var.m84031v()) - 0.0f) - 0.0f)) & 4294967295L);
        float f = tiv0Var.f220753c;
        float f2 = tiv0Var.f220751a;
        float f3 = tiv0Var.f220754d;
        float f4 = tiv0Var.f220752b;
        long j = (((long) ((int) (f - f2))) << 32) | (((long) ((int) (f3 - f4))) & 4294967295L);
        long jIntBitsToFloat = (((long) ((int) Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))) << 32);
        float f5 = (((int) (jIntBitsToFloat >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f6 = (((int) (jIntBitsToFloat & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        float f7 = 1;
        long jRound = (((long) Math.round((f7 + 0.0f) * f6)) & 4294967295L) | (((long) Math.round(((this.f233258i == ko70.f124556a ? 0.0f : (-1) * 0.0f) + f7) * f5)) << 32);
        return (((long) Float.floatToRawIntBits(f2 - ((int) (jRound >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f4 - ((int) (jRound & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public final ppc1 m83837b() {
        return m83840e() ? new ppc1(((Number) this.f233256g.m45912e()).floatValue(), ((Number) this.f233257h.m45912e()).floatValue(), this.f233260k.m84031v(), m83838c()) : new ppc1(0.0f, 0.0f, 1.0f, 0L);
    }

    /* JADX INFO: renamed from: c */
    public final long m83838c() {
        return ((Size) this.f233259j.getValue()).f494a;
    }

    /* JADX INFO: renamed from: d */
    public final ppc1 m83839d() {
        return (ppc1) this.f233253d.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m83840e() {
        return ((Boolean) this.f233255f.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m83841f(iqz iqzVar) {
        this.f233252c.setValue(iqzVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r8.m45914g(r1, r0) == r4) goto L21;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83842g(float f, float f2, ibk ibkVar) {
        qr70 qr70Var;
        if (ibkVar instanceof qr70) {
            qr70Var = (qr70) ibkVar;
            int i = qr70Var.f191757e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qr70Var.f191757e = i - Integer.MIN_VALUE;
            } else {
                qr70Var = new qr70(this, ibkVar);
            }
        } else {
            qr70Var = new qr70(this, ibkVar);
        }
        Object obj = qr70Var.f191755c;
        int i2 = qr70Var.f191757e;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                f2 = qr70Var.f191754b;
                f = qr70Var.f191753a;
                bga.m29073P(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj);
        gw4 gw4Var = this.f233256g;
        Float f3 = new Float(f);
        qr70Var.f191753a = f;
        qr70Var.f191754b = f2;
        qr70Var.f191757e = 1;
        if (gw4Var.m45914g(f3, qr70Var) != yukVar) {
        }
        return yukVar;
        gw4 gw4Var2 = this.f233257h;
        Float f4 = new Float(f2);
        qr70Var.f191753a = f;
        qr70Var.f191754b = f2;
        qr70Var.f191757e = 2;
    }

    /* JADX INFO: renamed from: h */
    public final Object m83843h(int i, z9f z9fVar, ibk ibkVar) {
        m83841f(new fqz(i));
        long jM83836a = m83836a(i, z9fVar);
        Object objM83842g = m83842g(Float.intBitsToFloat((int) (jM83836a >> 32)), Float.intBitsToFloat((int) (jM83836a & 4294967295L)), ibkVar);
        return objM83842g == yuk.f276404a ? objM83842g : w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (r6.m45915h(r0) == r4) goto L21;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83844i(ibk ibkVar) {
        sr70 sr70Var;
        if (ibkVar instanceof sr70) {
            sr70Var = (sr70) ibkVar;
            int i = sr70Var.f213253c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sr70Var.f213253c = i - Integer.MIN_VALUE;
            } else {
                sr70Var = new sr70(this, ibkVar);
            }
        } else {
            sr70Var = new sr70(this, ibkVar);
        }
        Object obj = sr70Var.f213251a;
        int i2 = sr70Var.f213253c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj);
            gw4 gw4Var = this.f233256g;
            sr70Var.f213253c = 1;
            if (gw4Var.m45915h(sr70Var) != yukVar) {
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
        gw4 gw4Var2 = this.f233257h;
        sr70Var.f213253c = 2;
    }
}
