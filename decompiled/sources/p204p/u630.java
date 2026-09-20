package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class u630 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f227209a;

    /* JADX INFO: renamed from: b */
    public int f227210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ g4s0 f227211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u630(g4s0 g4s0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f227209a = i;
        this.f227211c = g4s0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f227209a) {
            case 0:
                return new u630(this.f227211c, fbkVar, 0);
            default:
                return new u630(this.f227211c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f227209a) {
            case 0:
                break;
        }
        return ((u630) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f227209a) {
            case 0:
                int i = this.f227210b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f227210b = 1;
                    Object objM43558a = this.f227211c.m43558a(c4s0.f34003a, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM43558a == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i2 = this.f227210b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f227210b = 1;
                    Object objM43558a2 = this.f227211c.m43558a(c4s0.f34003a, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM43558a2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
