package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class pjx0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f178321a;

    /* JADX INFO: renamed from: b */
    public int f178322b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ djx0 f178323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pjx0(djx0 djx0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f178321a = i;
        this.f178323c = djx0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f178321a) {
            case 0:
                return new pjx0(this.f178323c, fbkVar, 0);
            default:
                return new pjx0(this.f178323c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f178321a) {
            case 0:
                break;
        }
        return ((pjx0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f178321a) {
            case 0:
                int i = this.f178322b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f178322b = 1;
                    Object objM36238n = djx0.m36238n(this.f178323c, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM36238n == yukVar) {
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
                int i2 = this.f178322b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f178322b = 1;
                    Object objM36238n2 = djx0.m36238n(this.f178323c, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM36238n2 == yukVar2) {
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
