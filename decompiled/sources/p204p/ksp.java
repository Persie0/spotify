package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ksp implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125986a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f125987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nsp f125988c;

    public /* synthetic */ ksp(niz nizVar, nsp nspVar, int i) {
        this.f125986a = i;
        this.f125987b = nizVar;
        this.f125988c = nspVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        jsp jspVar;
        msp mspVar;
        switch (this.f125986a) {
            case 0:
                if (fbkVar instanceof jsp) {
                    jspVar = (jsp) fbkVar;
                    int i = jspVar.f115528b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jspVar.f115528b = i - Integer.MIN_VALUE;
                    } else {
                        jspVar = new jsp(this, fbkVar);
                    }
                } else {
                    jspVar = new jsp(this, fbkVar);
                }
                Object obj2 = jspVar.f115527a;
                int i2 = jspVar.f115528b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    b8g0 b8g0Var = new b8g0(nsp.m65583d(this.f125988c, (rm10) obj), e261.f55371b);
                    jspVar.f115528b = 1;
                    Object objEmit = this.f125987b.emit(b8g0Var, jspVar);
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
                if (fbkVar instanceof msp) {
                    mspVar = (msp) fbkVar;
                    int i3 = mspVar.f146840b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        mspVar.f146840b = i3 - Integer.MIN_VALUE;
                    } else {
                        mspVar = new msp(this, fbkVar);
                    }
                } else {
                    mspVar = new msp(this, fbkVar);
                }
                Object obj3 = mspVar.f146839a;
                int i4 = mspVar.f146840b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    b8g0 b8g0Var2 = new b8g0(nsp.m65584e(this.f125988c, (srd1) obj), e261.f55370a);
                    mspVar.f146840b = 1;
                    Object objEmit2 = this.f125987b.emit(b8g0Var2, mspVar);
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
