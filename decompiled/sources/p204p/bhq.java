package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bhq implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f27226b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dzc1 f27227c;

    public /* synthetic */ bhq(niz nizVar, dzc1 dzc1Var, int i) {
        this.f27225a = i;
        this.f27226b = nizVar;
        this.f27227c = dzc1Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        ahq ahqVar;
        chq chqVar;
        switch (this.f27225a) {
            case 0:
                if (fbkVar instanceof ahq) {
                    ahqVar = (ahq) fbkVar;
                    int i = ahqVar.f15753b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ahqVar.f15753b = i - Integer.MIN_VALUE;
                    } else {
                        ahqVar = new ahq(this, fbkVar);
                    }
                } else {
                    ahqVar = new ahq(this, fbkVar);
                }
                Object obj2 = ahqVar.f15752a;
                int i2 = ahqVar.f15753b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    float fDoubleValue = (float) (((Number) obj).doubleValue() * ((double) 100));
                    dzc1 dzc1Var = this.f27227c;
                    ezc1 ezc1Var = new ezc1(fDoubleValue, dzc1Var.f54621b, dzc1Var.f54623d, dzc1Var.f54625f, false, false, 48);
                    ahqVar.f15753b = 1;
                    Object objEmit = this.f27226b.emit(ezc1Var, ahqVar);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof chq) {
                    chqVar = (chq) fbkVar;
                    int i3 = chqVar.f38063b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        chqVar.f38063b = i3 - Integer.MIN_VALUE;
                    } else {
                        chqVar = new chq(this, fbkVar);
                    }
                } else {
                    chqVar = new chq(this, fbkVar);
                }
                Object obj3 = chqVar.f38062a;
                int i4 = chqVar.f38063b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    float fFloatValue = ((Number) obj).floatValue();
                    dzc1 dzc1Var2 = this.f27227c;
                    ezc1 ezc1Var2 = new ezc1(fFloatValue, dzc1Var2.f54621b, dzc1Var2.f54623d, dzc1Var2.f54625f, false, false, 48);
                    chqVar.f38063b = 1;
                    Object objEmit2 = this.f27226b.emit(ezc1Var2, chqVar);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
