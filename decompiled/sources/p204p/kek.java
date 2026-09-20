package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kek extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f121900a;

    /* JADX INFO: renamed from: b */
    public int f121901b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gw4 f121902c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f121903d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gw4 f121904e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kek(gw4 gw4Var, long j, gw4 gw4Var2, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f121900a = i;
        this.f121902c = gw4Var;
        this.f121903d = j;
        this.f121904e = gw4Var2;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f121900a) {
            case 0:
                return new kek(this.f121902c, this.f121903d, this.f121904e, fbkVar, 0);
            case 1:
                return new kek(this.f121902c, this.f121903d, this.f121904e, fbkVar, 1);
            default:
                return new kek(this.f121902c, this.f121903d, this.f121904e, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f121900a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((kek) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f121900a) {
            case 0:
                int i = this.f121901b;
                if (i == 0) {
                    bga.m29073P(obj);
                    gw4 gw4Var = this.f121902c;
                    float fFloatValue = ((Number) gw4Var.m45912e()).floatValue();
                    long j = this.f121903d;
                    int i2 = (int) (j >> 32);
                    float fAbs = Math.abs(Float.intBitsToFloat(i2) + fFloatValue);
                    gw4 gw4Var2 = this.f121904e;
                    int i3 = (int) (j & 4294967295L);
                    float fAbs2 = Math.abs(Float.intBitsToFloat(i3) + ((Number) gw4Var2.m45912e()).floatValue());
                    yuk yukVar = yuk.f276404a;
                    if (fAbs > fAbs2) {
                        Float f = new Float(Float.intBitsToFloat(i2) + ((Number) gw4Var.m45912e()).floatValue());
                        this.f121901b = 1;
                        if (gw4Var.m45914g(f, this) == yukVar) {
                            return yukVar;
                        }
                    } else {
                        Float f2 = new Float(Float.intBitsToFloat(i3) + ((Number) gw4Var2.m45912e()).floatValue());
                        this.f121901b = 2;
                        if (gw4Var2.m45914g(f2, this) == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            case 1:
                int i4 = this.f121901b;
                long j2 = this.f121903d;
                yuk yukVar2 = yuk.f276404a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        bga.m29073P(obj);
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                gw4 gw4Var3 = this.f121902c;
                Float f3 = new Float(Float.intBitsToFloat((int) (j2 >> 32)) + ((Number) gw4Var3.m45912e()).floatValue());
                this.f121901b = 1;
                if (gw4Var3.m45914g(f3, this) == yukVar2) {
                    return yukVar2;
                }
                gw4 gw4Var4 = this.f121904e;
                Float f4 = new Float(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((Number) gw4Var4.m45912e()).floatValue());
                this.f121901b = 2;
                if (gw4Var4.m45914g(f4, this) == yukVar2) {
                    return yukVar2;
                }
                return w2a1.f247311a;
            default:
                int i5 = this.f121901b;
                if (i5 == 0) {
                    bga.m29073P(obj);
                    gw4 gw4Var5 = this.f121902c;
                    float fFloatValue2 = ((Number) gw4Var5.m45912e()).floatValue();
                    long j3 = this.f121903d;
                    int i6 = (int) (j3 >> 32);
                    float fAbs3 = Math.abs(Float.intBitsToFloat(i6) + fFloatValue2);
                    gw4 gw4Var6 = this.f121904e;
                    int i7 = (int) (j3 & 4294967295L);
                    float fAbs4 = Math.abs(Float.intBitsToFloat(i7) + ((Number) gw4Var6.m45912e()).floatValue());
                    yuk yukVar3 = yuk.f276404a;
                    if (fAbs3 > fAbs4) {
                        Float f5 = new Float(Float.intBitsToFloat(i6) + ((Number) gw4Var5.m45912e()).floatValue());
                        this.f121901b = 1;
                        if (gw4Var5.m45914g(f5, this) == yukVar3) {
                            return yukVar3;
                        }
                    } else {
                        Float f6 = new Float(Float.intBitsToFloat(i7) + ((Number) gw4Var6.m45912e()).floatValue());
                        this.f121901b = 2;
                        if (gw4Var6.m45914g(f6, this) == yukVar3) {
                            return yukVar3;
                        }
                    }
                } else {
                    if (i5 != 1 && i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
