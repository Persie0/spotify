package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class olw0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f166934a;

    /* JADX INFO: renamed from: b */
    public int f166935b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ulw0 f166936c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ tlw0 f166937d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ tlw0 f166938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ olw0(ulw0 ulw0Var, tlw0 tlw0Var, tlw0 tlw0Var2, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f166934a = i;
        this.f166936c = ulw0Var;
        this.f166937d = tlw0Var;
        this.f166938e = tlw0Var2;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f166934a) {
            case 0:
                return new olw0(this.f166936c, this.f166937d, this.f166938e, fbkVar, 0);
            default:
                return new olw0(this.f166936c, this.f166937d, this.f166938e, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f166934a) {
            case 0:
                break;
        }
        return ((olw0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f166934a) {
            case 0:
                int i = this.f166935b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f166935b = 1;
                    Object objM83406b = ulw0.m83406b(this.f166936c, this.f166937d, this.f166938e, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM83406b == yukVar) {
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
                int i2 = this.f166935b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f166935b = 1;
                    Object objM83406b2 = ulw0.m83406b(this.f166936c, this.f166937d, this.f166938e, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM83406b2 == yukVar2) {
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
