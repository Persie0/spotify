package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n510 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150449a;

    /* JADX INFO: renamed from: b */
    public int f150450b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ur70 f150451c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n510(ur70 ur70Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f150449a = i;
        this.f150451c = ur70Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f150449a) {
            case 0:
                return new n510(this.f150451c, fbkVar, 0);
            default:
                return new n510(this.f150451c, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f150449a) {
            case 0:
                break;
        }
        return ((n510) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f150449a) {
            case 0:
                int i = this.f150450b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f150450b = 1;
                    Object objM83844i = this.f150451c.m83844i(this);
                    yuk yukVar = yuk.f276404a;
                    if (objM83844i == yukVar) {
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
                int i2 = this.f150450b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f150450b = 1;
                    Object objM83844i2 = this.f150451c.m83844i(this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM83844i2 == yukVar2) {
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
