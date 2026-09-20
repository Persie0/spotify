package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jmp implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113920a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f113921b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ whp f113922c;

    public /* synthetic */ jmp(niz nizVar, whp whpVar, int i) {
        this.f113920a = i;
        this.f113921b = nizVar;
        this.f113922c = whpVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        imp impVar;
        mmp mmpVar;
        switch (this.f113920a) {
            case 0:
                if (fbkVar instanceof imp) {
                    impVar = (imp) fbkVar;
                    int i = impVar.f103762b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        impVar.f103762b = i - Integer.MIN_VALUE;
                    } else {
                        impVar = new imp(this, fbkVar);
                    }
                } else {
                    impVar = new imp(this, fbkVar);
                }
                Object obj2 = impVar.f103761a;
                int i2 = impVar.f103762b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    ((wy3) ((xre) this.f113922c.f251419b)).getClass();
                    Long l = new Long(System.currentTimeMillis());
                    impVar.f103762b = 1;
                    Object objEmit = this.f113921b.emit(l, impVar);
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
                if (fbkVar instanceof mmp) {
                    mmpVar = (mmp) fbkVar;
                    int i3 = mmpVar.f145195b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        mmpVar.f145195b = i3 - Integer.MIN_VALUE;
                    } else {
                        mmpVar = new mmp(this, fbkVar);
                    }
                } else {
                    mmpVar = new mmp(this, fbkVar);
                }
                Object obj3 = mmpVar.f145194a;
                int i4 = mmpVar.f145195b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    ((wy3) ((xre) this.f113922c.f251419b)).getClass();
                    Long l2 = new Long(System.currentTimeMillis());
                    mmpVar.f145195b = 1;
                    Object objEmit2 = this.f113921b.emit(l2, mmpVar);
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
