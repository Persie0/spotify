package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class any0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17522a;

    /* JADX INFO: renamed from: b */
    public int f17523b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cny0 f17524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ any0(cny0 cny0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f17522a = i;
        this.f17524c = cny0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f17522a) {
            case 0:
                return new any0(this.f17524c, fbkVar, 0);
            default:
                return new any0(this.f17524c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f17522a) {
            case 0:
                break;
        }
        return ((any0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f17522a) {
            case 0:
                int i = this.f17523b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f17523b = 1;
                    Object objM33473a = cny0.m33473a(this.f17524c, this);
                    yuk yukVar = yuk.f276404a;
                    if (objM33473a == yukVar) {
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
                int i2 = this.f17523b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f17523b = 1;
                    Object objM33475c = this.f17524c.m33475c(this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM33475c == yukVar2) {
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
