package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rm91 implements vfj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qe70 f200482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f200483b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qly0 f200484c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qe70 f200485d;

    /* JADX WARN: Multi-variable type inference failed */
    public rm91(eh00 eh00Var, eh00 eh00Var2, qly0 qly0Var, eh00 eh00Var3) {
        this.f200482a = (qe70) eh00Var;
        this.f200483b = (qe70) eh00Var2;
        this.f200484c = qly0Var;
        this.f200485d = (qe70) eh00Var3;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r6v5, types: [p.eh00, p.qe70] */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: P */
    public final long mo25861P(int i, long j) {
        if (!((Boolean) this.f200482a.invoke()).booleanValue()) {
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
        }
        int iIntValue = ((Number) this.f200483b.invoke()).intValue();
        if (iIntValue <= 0) {
            return 0L;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f) {
            return 0L;
        }
        float fM86437v = iIntValue - this.f200484c.f189941a.m86437v();
        if (fM86437v <= 0.0f) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        if ((-fIntBitsToFloat) <= fM86437v) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat + fM86437v)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [p.eh00, p.qe70] */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) {
        qm91 qm91Var;
        if (fbkVar instanceof qm91) {
            qm91Var = (qm91) fbkVar;
            int i = qm91Var.f190168c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qm91Var.f190168c = i - Integer.MIN_VALUE;
            } else {
                qm91Var = new qm91(this, (ibk) fbkVar);
            }
        } else {
            qm91Var = new qm91(this, (ibk) fbkVar);
        }
        Object obj = qm91Var.f190166a;
        int i2 = qm91Var.f190168c;
        if (i2 == 0) {
            bga.m29073P(obj);
            int iIntValue = ((Number) this.f200485d.invoke()).intValue();
            qly0 qly0Var = this.f200484c;
            int iM86437v = qly0Var.f189941a.m86437v();
            if (iIntValue > 0 && iM86437v > 0 && iM86437v < iIntValue) {
                if (iM86437v <= iIntValue / 2) {
                    iIntValue = 0;
                }
                pg41 pg41VarM53286y = jg31.m53286y(0.8f, 400.0f, null, 4);
                qm91Var.f190168c = 1;
                Object objM73259f = qly0Var.m73259f(iIntValue, pg41VarM53286y, qm91Var);
                yuk yukVar = yuk.f276404a;
                if (objM73259f == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return new m5b1(0L);
    }
}
