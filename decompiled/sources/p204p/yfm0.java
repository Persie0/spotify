package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yfm0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f272286a;

    /* JADX INFO: renamed from: b */
    public int f272287b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f272288c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dii0 f272289d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f272290e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f272291f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yfm0(dii0 dii0Var, long j, boolean z, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f272286a = i;
        this.f272289d = dii0Var;
        this.f272290e = j;
        this.f272291f = z;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f272286a) {
            case 0:
                yfm0 yfm0Var = new yfm0(this.f272289d, this.f272290e, this.f272291f, fbkVar, 0);
                yfm0Var.f272288c = obj;
                return yfm0Var;
            default:
                yfm0 yfm0Var2 = new yfm0(this.f272289d, this.f272290e, this.f272291f, fbkVar, 1);
                yfm0Var2.f272288c = obj;
                return yfm0Var2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        pqm0 pqm0Var = (pqm0) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f272286a) {
            case 0:
                break;
        }
        return ((yfm0) create(pqm0Var, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f272286a) {
            case 0:
                pqm0 pqm0Var = (pqm0) this.f272288c;
                int i = this.f272287b;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                ufm0 ufm0Var = ((vfm0) pqm0Var.f180350a).f241001a;
                this.f272288c = null;
                this.f272287b = 1;
                Object objM36085k = dii0.m36085k(this.f272289d, ufm0Var, this.f272290e, this.f272291f, this);
                yuk yukVar = yuk.f276404a;
                return objM36085k == yukVar ? yukVar : objM36085k;
            default:
                pqm0 pqm0Var2 = (pqm0) this.f272288c;
                int i2 = this.f272287b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                    return obj;
                }
                bga.m29073P(obj);
                ufm0 ufm0Var2 = (ufm0) pqm0Var2.f180350a;
                this.f272288c = null;
                this.f272287b = 1;
                Object objM36085k2 = dii0.m36085k(this.f272289d, ufm0Var2, this.f272290e, this.f272291f, this);
                yuk yukVar2 = yuk.f276404a;
                return objM36085k2 == yukVar2 ? yukVar2 : objM36085k2;
        }
    }
}
