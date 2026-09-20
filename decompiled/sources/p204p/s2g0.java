package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s2g0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f205004a;

    /* JADX INFO: renamed from: b */
    public int f205005b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qly0 f205006c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f205007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s2g0(qly0 qly0Var, int i, fbk fbkVar, int i2) {
        super(2, fbkVar);
        this.f205004a = i2;
        this.f205006c = qly0Var;
        this.f205007d = i;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f205004a) {
            case 0:
                return new s2g0(this.f205006c, this.f205007d, fbkVar, 0);
            default:
                return new s2g0(this.f205006c, this.f205007d, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f205004a) {
            case 0:
                break;
        }
        return ((s2g0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f205004a) {
            case 0:
                int i = this.f205005b;
                if (i == 0) {
                    bga.m29073P(obj);
                    this.f205005b = 1;
                    Object objM73259f = this.f205006c.m73259f(this.f205007d, new pg41(null, 7), this);
                    yuk yukVar = yuk.f276404a;
                    if (objM73259f == yukVar) {
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
                int i2 = this.f205005b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    this.f205005b = 1;
                    Object objM73259f2 = this.f205006c.m73259f(this.f205007d, new pg41(null, 7), this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM73259f2 == yukVar2) {
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
