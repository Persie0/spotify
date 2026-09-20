package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class fnz implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ niz f71383a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ljx0 f71384b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f71385c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f71386d;

    public fnz(niz nizVar, ljx0 ljx0Var, boolean z, gh00 gh00Var) {
        this.f71383a = nizVar;
        this.f71384b = ljx0Var;
        this.f71385c = z;
        this.f71386d = gh00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r7.emit(r8, r0) == r4) goto L21;
     */
    @Override // p204p.niz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, fbk fbkVar) {
        enz enzVar;
        niz nizVar;
        if (fbkVar instanceof enz) {
            enzVar = (enz) fbkVar;
            int i = enzVar.f61257b;
            if ((i & Integer.MIN_VALUE) != 0) {
                enzVar.f61257b = i - Integer.MIN_VALUE;
            } else {
                enzVar = new enz(this, fbkVar);
            }
        } else {
            enzVar = new enz(this, fbkVar);
        }
        Object objM65530p = enzVar.f61256a;
        int i2 = enzVar.f61257b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                nizVar = enzVar.f61258c;
                bga.m29073P(objM65530p);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM65530p);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM65530p);
        nizVar = this.f71383a;
        enzVar.f61258c = nizVar;
        enzVar.f61257b = 1;
        objM65530p = nsf1.m65530p(enzVar, this.f71386d, this.f71384b, true, this.f71385c);
        if (objM65530p != yukVar) {
        }
        return yukVar;
        enzVar.f61258c = null;
        enzVar.f61257b = 2;
    }
}
