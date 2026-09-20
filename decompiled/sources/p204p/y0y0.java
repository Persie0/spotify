package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y0y0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f268103a;

    /* JADX INFO: renamed from: b */
    public int f268104b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f268105c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sir0 f268106d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0y0(sir0 sir0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f268103a = i;
        this.f268106d = sir0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f268103a) {
            case 0:
                y0y0 y0y0Var = new y0y0(this.f268106d, fbkVar, 0);
                y0y0Var.f268105c = obj;
                return y0y0Var;
            default:
                y0y0 y0y0Var2 = new y0y0(this.f268106d, fbkVar, 1);
                y0y0Var2.f268105c = obj;
                return y0y0Var2;
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        qho qhoVar = (qho) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f268103a) {
            case 0:
                break;
        }
        return ((y0y0) create(qhoVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f268103a) {
            case 0:
                qho qhoVar = (qho) this.f268105c;
                int i = this.f268104b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f268105c = null;
                    this.f268104b = 1;
                    Object objMo30229d = this.f268106d.mo30229d(qhoVar, this);
                    yuk yukVar = yuk.f276404a;
                    if (objMo30229d == yukVar) {
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
                qho qhoVar2 = (qho) this.f268105c;
                int i2 = this.f268104b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f268105c = null;
                    this.f268104b = 1;
                    Object objMo30229d2 = this.f268106d.mo30229d(qhoVar2, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objMo30229d2 == yukVar2) {
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
